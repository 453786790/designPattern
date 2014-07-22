package creational.singleton.lazy;

public class Singleton3 {

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return Holder.uniqueInstance;
    }

    private static class Holder {
        public static Singleton3 uniqueInstance = new Singleton3();
    }
}
