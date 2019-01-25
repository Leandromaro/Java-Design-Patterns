package CreationalsDesignPatterns.AbstractFactory.src;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ColorFactory implements AbstractFactory {

    private static Map<String, Supplier<Color>> colorMap = new HashMap<>();
    static {
        colorMap.put("Red", Red::new);
        colorMap.put("Green", Green::new);
    }

    @Override
    public Color create(String colorType) {
        // indexing the map will return the supplier
        Supplier colorSupplier = colorMap.get(colorType);
        if(colorSupplier != null) {
            // doing get to the supplier we obtain the object created
            return (Color) colorSupplier.get();
        }
        throw new IllegalArgumentException("No such color " + colorType.toUpperCase());
    }
}
