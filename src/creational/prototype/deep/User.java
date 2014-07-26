package creational.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class User implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

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

    /**
     * 利用jdk自带的clone实现：
     *  1.所有对象都需要实现Cloneable接口
     *  2.对于关联对象，就需要递归调用，需要每个都使用setter
     */
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            // 深度克隆需要关联的对象book也实现Cloneable接口，并提供clone()
            user.setBook((Book) this.book.clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 字节流的深复制：
     *  不用实现Cloneable，但必须实现Serializable，相对上者，这种方式更为简单
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);
  
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject(); 
    }
}
