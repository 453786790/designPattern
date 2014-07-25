package creational.factory.common;

/**
 * @author reedmi
 * 硬币
 */
public class Coin implements Currency {

    @Override
    public void buy() {
        System.out.println("You can buy something with coins.");
    }

}
