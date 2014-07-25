package creational.factory.abstractal;

import creational.factory.abstractal.factories.CarComponentPlant;
import creational.factory.abstractal.factories.AbstractFactory;
import creational.factory.abstractal.factories.PlaneComponentPlant;

public class Main {

    public static void main(String[] args) {
        //find an engineer.
        Engineer engineer = new Engineer();
        //tell him which kind of product do you want?
        AbstractFactory carFactory = new CarComponentPlant();
        //engineer will produce what do you want.
        engineer.produce(carFactory);
        AbstractFactory planeFactory = new PlaneComponentPlant();
        engineer.produce(planeFactory);
    }
}
