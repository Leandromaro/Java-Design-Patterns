package Singleton;

//Lazy instantiation using double locking mechanism.
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {
        System.out.println("Singleton(): Initializing Instance");
    }

    public static ThreadSafeSingleton getInstance()
    {
        //double locking mechanism
        if (instance == null)
        {
            synchronized(ThreadSafeSingleton.class)
            {
                if (instance == null)
                {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething()
    {
        System.out.println("doSomething(): Singleton does something!");
    }
}
