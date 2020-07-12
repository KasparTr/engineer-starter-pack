package pattern.structural.composite;

/**
 * Base component of the composite pattern
 * Composite pattern base component defines the common methods for leaf and composites. We can create a class Shape with a method draw(String fillColor) to draw the shape with given color.
 * Source: https://www.journaldev.com/1535/composite-design-pattern-in-java
 */
public interface Shape {
    public void draw(String fillColor);
}
