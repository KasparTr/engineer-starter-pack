package pattern.structural.adapter;

// Part of Extra-Geometric-Shape API that's similar to Shape but not fully compatible with that interface.
public interface GeometricShape {
    double area();
    double perimeter();
    void drawShape();
}