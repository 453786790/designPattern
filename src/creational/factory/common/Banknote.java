package creational.factory.common;

/**
 * @author reedmi
 * 纸币
 */
public class Banknote implements Currency {

    @Override
    public void buy() {
        System.out.println("You can buy something with banknotes.");
    }

}
