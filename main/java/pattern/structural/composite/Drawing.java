package pattern.structural.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * Composite component of the composite pattern
 * A composite object contains group of leaf objects and we should provide some helper methods to add or delete leafs from the group.
 * We can also provide a method to remove all the elements from the group.
 *
 * Notice that composite also implements component and behaves similar to leaf except that it can contain group of leaf elements.
 * Source: https://www.journaldev.com/1535/composite-design-pattern-in-java
 */
public class Drawing implements Shape{

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes)
        {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s){
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s){
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}