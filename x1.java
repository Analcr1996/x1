//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Ana Collantes";
String title=  " Timmy being chased by a dog. ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
    size( 540,300);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  
  background( 100,200,260 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/3.2, height/23, 25, 25 );    // sun
  // Grass
  fill( 100,200,100 );
  rect(0,horizon, width/1,height*3/4 );      // grass.
  

  
  fill(127, 0, 0);
  rect( 25, 25, 19, 50);
  
  fill(100, 200, 100);
arc(35, 30, 60, 60, PI, TWO_PI);
 
 fill(209);
rect( 295, 35, 20, 40); 
rect(315, 35, 50, 40 );// house
rect(356, 35, 20, 40);
triangle(377, 35, 330, 8, 293, 35  );

fill(162);
rect( 330, 65, 10, 10);

fill(50, 150, 800);
rect( 301, 41, 9, 13);
rect( 362, 41, 9, 13);
rect( 322, 41, 26, 16);


fill(50);
rect(20,200,50,55);
fill(50, 150, 800);
rect(25,210, 13, 10);
rect(50, 210, 13,10);

fill(50);
triangle(18, 199, 45, 160, 73, 199);
fill(0);
rect(37, 236, 13, 20);

fill(50, 150, 800);
ellipse(44,186,14,14);

fill(127, 0, 0);
 rect( 81, 155, 100, 60);


fill(5,140,99);
arc(130, 190, 60, 60, PI, TWO_PI);
fill(0,99);
arc(130, 190, 50, 50, PI, TWO_PI);
fill(1,100);
arc(130, 190, 40, 40, PI, TWO_PI);
fill(2,101);
arc(130, 190, 30, 30, PI, TWO_PI);
fill(3, 102);
arc(130, 190, 20, 20, PI, TWO_PI);
fill(4,103);
arc(130, 190, 10, 10, PI, TWO_PI);


 /* INSERT YOUR CODE HERE! */    
  /* REPLACE THIS STUB! */  text( "Scene 1", 100, 100 );
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "[[[[ Nicky ]]]]", 200, 200 );
  rect( x,y, 50,80 );
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 118,112,73 );
  rect(dogX,dogY, 60,30 );
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}  

