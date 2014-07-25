package creational.factory.mehod;

public class Dollar implements Currency {

    @Override
    public void produce() {
        System.out.println("American bank can print dollars.");
    }

    @Override
    public String getName() {
        return "dollar";
    }

}
