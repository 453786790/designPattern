package creational.factory.mehod;

public class DollarCreator extends CurrencyCreator {

    @Override
    protected Currency createCurrency() {
        return new Dollar();
    }

}
