package creational.factory.mehod;

public abstract class CurrencyCreator {

    /**
     * 到底使用哪一个，由具体的子类负责实现。控制反转：将控制权交给了继承他的子类
     * 
     * @return
     */
    protected abstract Currency createCurrency();

    public void trade() {
        Currency currency = createCurrency();
        currency.produce();
        System.out.println("Then we can use " + currency.getName() + " to trade.");
    }
}
