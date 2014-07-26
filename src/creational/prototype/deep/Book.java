package creational.prototype.deep;

import java.io.Serializable;

public class Book implements Cloneable, Serializable { 

    private static final long serialVersionUID = 1L;

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
