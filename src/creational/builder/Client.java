package creational.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        director.constructHouse("我的婚房");
    }
}
