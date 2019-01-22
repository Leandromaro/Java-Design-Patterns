package Singleton;

//Lazy instantiation using double locking mechanism.
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("Singleton(): Initializing Instance");
    }

    public static ThreadSafeSingleton getInstance() {
        // Uses a monitor to lock the object creation
        // The monitor object will enforce mutual exclusion
        // So only one thread may be performing any action on the object at a given time
        if (instance == null) { // double locking mechanism
            synchronized(ThreadSafeSingleton.class){ // ThreadSafeSingleton.class it's the locker
                if (instance == null) {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    /*
    // Another way of implement
        public static synchronized ThreadSafeSingleton getInstance(){
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    */
    public void doSomething() {
        System.out.println("doSomething(): Singleton does something!");
    }
}
