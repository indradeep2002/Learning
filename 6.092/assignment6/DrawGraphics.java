package assignment6;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
Bouncer movingSprite;
Bouncer boxs;
StraightMover boxa;
StraightMover ovala;
 /** Initializes this class for drawing. */


//Bouncer obj1;
ArrayList <Bouncer> items = new ArrayList <Bouncer>();
ArrayList <StraightMover> movers = new ArrayList<StraightMover>();


 public DrawGraphics() {
 Rectangle box = new Rectangle(15, 20, Color.RED);
 Oval oval = new Oval(15, 20, Color.BLUE);

 Rectangle box1 = new Rectangle(20, 20, Color.GREEN);
 Oval oval1 = new Oval(20, 20, Color.GRAY);
 

 // straight movers 
 boxa = new StraightMover(70, 90, box1);
 ovala = new StraightMover(70, 150, oval1);


 // bouncers 
 boxs = new Bouncer(70, 170, oval);
 movingSprite = new Bouncer(50, 170, box);


 // straight movers add 
 movers.add(boxa);
 movers.add(ovala);
 
 // movements 
 boxs.setMovementVector(1,2);
 movingSprite.setMovementVector(1, 1);
 boxa.setMovementVector(1, 0);
 ovala.setMovementVector(1, 0);
 
 }


 /** Draw the contents of the window on surface. */
 public void draw(Graphics surface) { 
    movingSprite.draw(surface);
    boxs.draw(surface);

    for (StraightMover m: movers){
        m.draw(surface);
    }
 

    
 }
}