package structural.proxy.dynamical;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author reedmi
 *
 * JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理;
 * cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，
 * 但因为采用的是继承，所以不能对final修饰的类进行代理。
 * 
 * cglib创建的动态代理对象性能比JDK创建性能高很多，但是cglib在创建代理对象的时候所花费时间却是比jdk多的多；
 * 所以对于单例的对象，其不需要频繁的创建对象，用cglib更合适，反之，用jdk更好。
 */

class Basic {
    public void hello(){
        System.out.println("Hello");
    }
    public String world(){
        return "World";
    }
}

class LogInterceptor implements MethodInterceptor {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    private Enhancer enhancer=new Enhancer();

    /**
     * 通过扩展父类的class来创建代理对象
     * @param clazz
     * @return
     */
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();//通过字节码技术动态创建子类实例
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy mp) throws Throwable {
        log("method starts..." + method);
        Object result = mp.invokeSuper(obj, args);
        log("method ends..." + method);
        return result;
    }

    private void log(String message) {
        logger.log(Level.INFO, message);
    }
}

public class CglibProxyDemo {
    public static void main(String[] args) {
        LogInterceptor logInterceptor = new LogInterceptor();
        Basic basic = (Basic)logInterceptor.getProxy(Basic.class);
        basic.hello();
        System.out.println(basic.world());
    }
}
