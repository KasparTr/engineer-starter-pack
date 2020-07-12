package pattern.structural.bridge;

/**
 * Notice how Shape is not an interface anymore, but an abstract class that has a Color interface.
 * This allows us to avoid coupling interface from implementation and Shape is no an interface anymore
 */
public abstract class Shape {
    //Bridge between Shape and Color
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}