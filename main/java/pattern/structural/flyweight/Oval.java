package pattern.structural.flyweight;
import java.awt.Graphics;
import java.awt.Color;

public class Oval implements Shape {

    //intrinsic property
    private boolean fill;

    public Oval(boolean f){ //with instrinct property
        this.fill=f;
        System.out.println("Creating Oval object with fill="+f);
        //adding time delay to simulate time and memory intensive object creation.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height,
                     Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if(fill){
            circle.fillOval(x, y, width, height);
        }
    }

}