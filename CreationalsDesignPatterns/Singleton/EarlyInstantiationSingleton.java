package Singleton;

//Early instantiation using implementation with static field.
class EarlyInstantiationSingleton
{
    /**
     * In the following implementattion the singleton object is instantiated when the class is loaded
     * and not when it is first used, due to the fact that the instance member is declared static.
     * This is why in we don't need to synchronize any portion of the code in this case.
     * The class is loaded once this guarantee the uniquity of the object.
     */
    private static EarlyInstantiationSingleton instance = new EarlyInstantiationSingleton();

    private EarlyInstantiationSingleton()
    {
        System.out.println("EarlyInstantiationSingleton(): Initializing Instance");
    }

    public static EarlyInstantiationSingleton getInstance()
    {
        return instance;
    }

    public void doSomething()
    {
        System.out.println("doSomething(): EarlyInstantiationSingleton does something!");
    }
}
