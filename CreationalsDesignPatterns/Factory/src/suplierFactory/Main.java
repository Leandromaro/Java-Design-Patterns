package suplierFactory;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<ShapeFactory> shapeFactory =  ShapeFactory::new;
        //call draw method of circle
        shapeFactory.get().getShape("circle").draw();
        //call draw method of suplierFactory.Rectangle
        shapeFactory.get().getShape("rectangle").draw();
    }
}
