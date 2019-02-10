package StructuralDesignPatterns.Bridge.src;

public class YellowColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("yellow.");
    }
}
