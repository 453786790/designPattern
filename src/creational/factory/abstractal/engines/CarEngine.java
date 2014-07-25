package creational.factory.abstractal.engines;

public class CarEngine implements EngineFactory {

    @Override
    public void checkIsOk() {
        System.out.println("We must check whether the engine for car is ok!!!");
    }

}
