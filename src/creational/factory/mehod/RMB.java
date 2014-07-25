package creational.factory.mehod;

public class RMB implements Currency {

    @Override
    public void produce() {
        System.out.println("China bank can print RMB.");
    }

    @Override
    public String getName() {
        return "RMB";
    }

}
