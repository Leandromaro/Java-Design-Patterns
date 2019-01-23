package Singleton.src;
// To overcome this situation with Reflection,
// Joshua Bloch suggests the use of Enum to implement Singleton design pattern as Java ensures that
// any enum value is instantiated only once in a Java program.
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        //do something
    }
}