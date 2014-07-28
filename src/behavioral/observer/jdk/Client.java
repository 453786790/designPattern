package behavioral.observer.jdk;

public class Client {

    public static void main(String[] args) {
        Dispatcher dp = new Dispatcher();

        Receiver rv1 = new Receiver();
        Receiver rv2 = new Receiver();
        Receiver rv3 = new Receiver();

        dp.addObserver(rv1);
        dp.addObserver(rv2);
        dp.addObserver(rv3);

        dp.setContent("hello,every one.");
    }
}
