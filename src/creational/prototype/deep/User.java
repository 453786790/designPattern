package creational.prototype.deep;


public class User implements Cloneable {

    private String name;
    private Book book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            // 深度克隆需要关联的对象book也实现Cloneable接口，并提供clone()
            user.setBook((Book)this.book.clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
