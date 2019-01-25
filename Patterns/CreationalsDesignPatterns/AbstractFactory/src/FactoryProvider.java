package CreationalsDesignPatterns.AbstractFactory.src;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        // off course the if could be replaced with maps and suppliers like the others factory
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
