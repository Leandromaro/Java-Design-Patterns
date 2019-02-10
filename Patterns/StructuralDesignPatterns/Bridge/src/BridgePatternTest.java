package StructuralDesignPatterns.Bridge.src;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();

        Shape square = new Square(new YellowColor());
        square.applyColor();
    }
}
