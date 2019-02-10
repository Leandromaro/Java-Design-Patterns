package StructuralDesignPatterns.Bridge.src;

import StructuralDesignPatterns.Bridge.src.Color;
import StructuralDesignPatterns.Bridge.src.Shape;

public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}
