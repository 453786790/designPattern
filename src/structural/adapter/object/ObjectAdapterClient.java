package structural.adapter.object;

import structural.adapter.Adaptee;
import structural.adapter.Targetable;

class ObjectAdapter implements Targetable {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void newMethod1() {
        System.out.println("I adjust something to adapt current requirement.");
        adaptee.method1();
    }

    @Override
    public void newMethod2() {
        System.out.println("I adjust something to adapt current requirement.");
        adaptee.method2();
    }
}

public class ObjectAdapterClient {

    public static void main(String[] args) {
        Targetable target = new ObjectAdapter(new Adaptee());
        target.newMethod1();
        target.newMethod2();
    }
}
