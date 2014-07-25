package creational.factory.common;

public class BankFactory {

    static enum CurrencyType{COIN,BANKNOTE}

    public static Currency createCurrency(CurrencyType type){
        switch(type){
            case COIN:
                return new Coin();
            case BANKNOTE:
                return new Banknote();
            default :
                throw new RuntimeException();
        }
    }
}
