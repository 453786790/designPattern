package creational.prototype.shallow;

public class Main {

    public static void main(String[] args) {
        Prototype adminA = new Prototype();
        adminA.setName("admin");
        Prototype adminB = adminA.clone();
        System.out.println(adminB.getName());
        System.out.println(adminA == adminB);
    }
}
