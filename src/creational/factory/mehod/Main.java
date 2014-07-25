package creational.factory.mehod;

public class Main {

    public static void main(String[] args) {
        CurrencyCreator currencyCreator = new RMBCreator();
        currencyCreator.trade();
        currencyCreator = new DollarCreator();
        currencyCreator.trade();
    }
}
