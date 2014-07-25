package creational.factory.abstractal.factories;

import creational.factory.abstractal.engines.CarEngine;
import creational.factory.abstractal.engines.EngineFactory;
import creational.factory.abstractal.tires.CarTire;
import creational.factory.abstractal.tires.TireFactory;

/**
 * @author reedmi
 * 汽车的engine只能配对汽车的tire
 */
public class CarComponentPlant implements AbstractFactory {

    @Override
    public EngineFactory createEngine() {
        System.out.println("Create engine for car.");
        return new CarEngine();
    }

    @Override
    public TireFactory createTire() {
        System.out.println("Create tires for car.");
        return new CarTire();
    }

}
