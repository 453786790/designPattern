package creational.factory.abstractal;

import creational.factory.abstractal.engines.EngineFactory;
import creational.factory.abstractal.factories.AbstractFactory;
import creational.factory.abstractal.tires.TireFactory;

public class Engineer {

    private EngineFactory ef;
    private TireFactory tf;

    public void produce(AbstractFactory af) {
        prepare(af);
    }

    /**
     * 客户端从具体的实现中解耦，他只知道如何使用，不知道具体怎么实现 
     */
    private void prepare(AbstractFactory af) {
        this.ef = af.createEngine();
        this.ef.checkIsOk();
        this.tf = af.createTire();
        this.tf.checkIsOk();
    }
}
