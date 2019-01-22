package suplierFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {
    final static Map<String, Supplier<Shape>> map = new HashMap<>();
    static {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
    }
    public Shape getShape(String shapeType){
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
