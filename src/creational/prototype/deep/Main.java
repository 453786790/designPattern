package creational.prototype.deep;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        User up = new User();
        up.setName("user");
        Book book = new Book();
        book.setName("java编程思想");
        book.setPrice(23.5);
        up.setBook(book);

        User user = up.clone();
        System.out.println(user.getBook().getName());
        System.out.println(up == user);

        User user2 = null;
        try {
            user2 = (User)up.deepClone();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } 
        System.out.println(user2.getBook().getName());
    }
}
