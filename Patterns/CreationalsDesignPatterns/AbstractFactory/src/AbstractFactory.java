package CreationalsDesignPatterns.AbstractFactory.src;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
