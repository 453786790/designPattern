package creational.factory.abstractal.factories;

import creational.factory.abstractal.engines.EngineFactory;
import creational.factory.abstractal.engines.PlaneEngine;
import creational.factory.abstractal.tires.PlaneTire;
import creational.factory.abstractal.tires.TireFactory;

/**
 * @author reedmi
 * 飞机的engine只能配对飞机的tire
 */
public class PlaneComponentPlant implements AbstractFactory {

    @Override
    public EngineFactory createEngine() {
        System.out.println("Create engines for plane.");
        return new PlaneEngine();
    }

    @Override
    public TireFactory createTire() {
        System.out.println("Create tires for plane.");
        return new PlaneTire();
    }

}
