package CreationalsDesignPatterns.Singleton.src.SerializedSingleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    // The problem with serialized singleton class is that whenever we deserialize it
    // it will create a new instance of the class
    // So it destroys the singleton pattern
    // to overcome this scenario all we need to do it provide the implementation of readResolve() method.

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    // Adding this you will notice that hashCode of both the instances is same in the CreationalsDesignPatterns program.
    protected Object readResolve() {
        return getInstance();
    }

}