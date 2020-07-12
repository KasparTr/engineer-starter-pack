package pattern.structural.flyweight;

import java.awt.Graphics;
import java.awt.Color;

public class Line implements Shape {

    public Line(){
        System.out.println("Creating Line object");
        //adding time delay to simulate time and memory intensive object creation.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2,
                     Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }

}