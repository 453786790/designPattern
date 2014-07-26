package structural.adapter.interfaced;

interface Sourceable {
    public void method1();

    public void method2();
}

/**
 * 利用抽象类实现接口中的方法，减少子类的负担
 */
abstract class Wrapper implements Sourceable {

    public void method1() {
        System.out.println("Abstract class has implemented Sourceable.method1()");
    }

    public void method2() {
        System.out.println("Abstract class has implemented Sourceable.method2()");
    }
}


class InterfaceAdapter extends Wrapper {

    @Override
    public void method1() {
        System.out.println("I need to implement method1() by myself.");
    }
    
    //etc...
}


public class InterfaceAdapterClient {

    public static void main(String[] args) {
        Sourceable source = new InterfaceAdapter();
        source.method1();
        source.method2();
    }
}
