package creational.factory.abstractal.factories;

import creational.factory.abstractal.engines.EngineFactory;
import creational.factory.abstractal.tires.TireFactory;

/**
 * @author reedmi
 * There is a factory can produce engines and tires.
 *  抽象工厂的特点：
 *   1.只知道接口，不知道具体的实现
 *   2.所创造的对象之间有约束关系
 */
public interface AbstractFactory {
    EngineFactory createEngine();

    TireFactory createTire();
}
