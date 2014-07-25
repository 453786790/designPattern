package creational.prototype.deep;

public class Book implements Cloneable {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
