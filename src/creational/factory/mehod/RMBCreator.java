package creational.factory.mehod;

public class RMBCreator extends CurrencyCreator {

    @Override
    protected Currency createCurrency() {
        return new RMB();
    }

}
