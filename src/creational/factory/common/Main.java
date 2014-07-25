package creational.factory.common;

import creational.factory.common.BankFactory.CurrencyType;

public class Main {

    public static void main(String[] args) {
        Currency currency = BankFactory.createCurrency(CurrencyType.COIN);
        currency.buy();
        currency = BankFactory.createCurrency(CurrencyType.BANKNOTE);
        currency.buy();
    }
}
