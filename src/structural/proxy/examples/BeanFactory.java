package structural.proxy.examples;

import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

    Properties prop = new Properties();

    public BeanFactory(InputStream ins){
        try {
            prop.load(ins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String name){
        String className = prop.getProperty(name);
        Object bean = null;
        try {
            Class clazz = Class.forName(className);
            bean = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(bean instanceof ProxyBeanFactory){
            ProxyBeanFactory pbf = (ProxyBeanFactory)bean;
            try {
                Advice advice = (Advice) Class.forName(prop.getProperty(name + ".advice")).newInstance();
                Object target = Class.forName(prop.getProperty(name + ".target")).newInstance();
                pbf.setAdvice(advice);
                pbf.setTarget(target);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Object proxy = pbf.getProxy();
            return proxy;
        }
        return bean;
    }
}
