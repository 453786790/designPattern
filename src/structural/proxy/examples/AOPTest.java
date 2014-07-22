package structural.proxy.examples;

import java.io.InputStream;
import java.util.List;


public class AOPTest {

    public static void main(String[] args) {
        InputStream is = AOPTest.class.getResourceAsStream("config.properties");
        Object bean = new BeanFactory(is).getBean("demo");
        List list = (List)bean;
        list.add(1);
        System.out.println(list.size());
    }
}
