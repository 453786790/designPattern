package structural.adapter.clazz;

import structural.adapter.Adaptee;
import structural.adapter.Targetable;


/**
 * adapter的出现，是为了让之前就有的功能(Adaptee)可以在经过调整后满足现在(Targetable)的需要
 * note：尽可能的将方法切分为小的结构，以实现复用
 */
class ClassAdapter extends Adaptee implements Targetable {

    @Override
    public void newMethod1() {
        System.out.println("I adjust something to adapt current requirement.");
        method1();
    }

    @Override
    public void newMethod2() {
        System.out.println("I adjust something to adapt current requirement.");
        method2();
    }
}


public class ClassAdapterClient {
    public static void main(String[] args) {
        Targetable target = new ClassAdapter();
        target.newMethod1();
        target.newMethod2();
    }
}
