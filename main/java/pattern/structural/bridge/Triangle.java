package pattern.structural.bridge;

public class Triangle extends Shape{
    // Notice how Triangle doesn't HAVE-A Color anymore but its moved to the absrtact Shape class.

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}
