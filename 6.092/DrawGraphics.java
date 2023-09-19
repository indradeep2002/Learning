import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    BouncingBox box4;
    ArrayList <BouncingBox> items = new ArrayList <BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.RED);
        box2 = new BouncingBox(30,20,Color.BLACK);
        box3 = new BouncingBox(50,180,Color.BLUE);
        box4 = new BouncingBox(180,210,Color.orange);

        items.add(box1);
        items.add(box2);
        items.add(box3);
        items.add(box4);

        box1.setMovementVector(1, 0);
        box2.setMovementVector(1, 0);
        box3.setMovementVector(1, 0);
        box4.setMovementVector(1, 0);
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        //surface.drawLine(50, 50, 250, 250);
        for (int i = 0; i < items.size() ; i++){
            items.get(i).draw(surface);
        }
        //box.draw(surface);
        surface.fillOval(30, 70, 29, 29);
        surface.fillArc(30, 230, 50, 50, 50, 180);
        surface.fillRoundRect(150, 230, 50, 50, 50, 180);

        

    }
}