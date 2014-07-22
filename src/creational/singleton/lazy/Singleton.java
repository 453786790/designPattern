package creational.singleton.lazy;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
