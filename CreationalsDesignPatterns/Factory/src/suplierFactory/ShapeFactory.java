package Factory.src.suplierFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {
    // The Supplier functional interface is yet another Function specialization that does not take any arguments.
    // It is typically used for lazy generation of values
    // We made the map with a Supplier as a key
    // so, que can pass a new element in the put method every time we want
    final static Map<String, Supplier<Shape>> map = new HashMap<>();
    static {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
    }
    Shape getShape(String shapeType){
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
