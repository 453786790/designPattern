package structural.flyweight;

public class Client {

    public static void main(String[] args) {
        // cache域的范围是-128～127
        Long number1 = Number.valueOf(1L);
        Long number2 = Number.valueOf(1L);
        System.out.println(number1 == number2);
        Long number3 = Number.valueOf(128L);
        Long number4 = Number.valueOf(128L);
        System.out.println(number3 == number4);
    }
}
