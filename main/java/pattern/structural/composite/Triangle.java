package pattern.structural.composite;

/**
 * Leaf component of the composite pattern
 * Composite design pattern leaf implements base component and these are the building block for the composite.
 * We can create multiple leaf objects.
 * Source: https://www.journaldev.com/1535/composite-design-pattern-in-java
 */
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }

}