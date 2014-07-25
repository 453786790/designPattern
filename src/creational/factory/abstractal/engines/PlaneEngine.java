package creational.factory.abstractal.engines;

public class PlaneEngine implements EngineFactory {

    @Override
    public void checkIsOk() {
        System.out.println("We must check whether the engine for plane is ok!!!");
    }

}
