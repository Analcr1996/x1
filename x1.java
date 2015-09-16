//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

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
  //// SCENE:  sky, sun, tree, house, etc.
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

  fill(0);
  text( "My name is Annie", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,0,0); rect( x,y, 30,50 );        /* REPLACE THIS WITH YOUR OWN CODE! */

  text( "Tim", x,y );

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
    exit();    // press 'q' key to QUIT.
      
  }
}
   
   

   

