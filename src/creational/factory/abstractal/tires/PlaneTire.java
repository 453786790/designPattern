package creational.factory.abstractal.tires;

public class PlaneTire implements TireFactory {

    @Override
    public void checkIsOk() {
        System.out.println("We must check whether the tires for plane is ok!!!");
    }

}
