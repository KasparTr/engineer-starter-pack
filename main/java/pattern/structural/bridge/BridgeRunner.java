package pattern.structural.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
    }
}
