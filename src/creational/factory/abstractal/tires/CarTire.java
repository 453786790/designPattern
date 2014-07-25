package creational.factory.abstractal.tires;

public class CarTire implements TireFactory {

    @Override
    public void checkIsOk() {
        System.out.println("We must check whether the tires for car is ok!!!");
    }

}
