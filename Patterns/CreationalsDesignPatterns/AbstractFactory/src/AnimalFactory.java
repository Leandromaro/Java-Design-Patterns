package CreationalsDesignPatterns.AbstractFactory.src;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalFactory implements AbstractFactory<Animal> {

    private static Map<String, Supplier<Animal>> animalMap = new HashMap<>();
    static {
        animalMap.put("Doc", Dog::new);
        animalMap.put("Duck", Duck::new);
    }

    @Override
    public Animal create(String animalType) {
        // indexing the map will return the supplier
        Supplier animalSupplier = animalMap.get(animalType);
        if(animalSupplier != null) {
            // doing get to the supplier we obtain the object created
            return (Animal) animalSupplier.get();
        }
        throw new IllegalArgumentException("No such animal " + animalType.toUpperCase());
    }
}
