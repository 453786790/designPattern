package structural.proxy.dynamical;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

interface Service {
    public void hello();

    public String world();
}

class ServiceImpl implements Service {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public String world() {
        return "World";
    }
}

class LogHandler implements InvocationHandler {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private Object delegate;

    public Object bind(Object delegate) {
        this.delegate = delegate;
        // 局限性在于必须绑定接口，cglib解决了这一缺陷
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        try {
            log("method starts..." + method);// 在方法调用前后，插入日志记录功能
            result = method.invoke(delegate, args);
            log("method ends..." + method);
        } catch (Exception e) {
            log(e.toString());
        }
        return result;
    }

    private void log(String message) {
        logger.log(Level.INFO, message);
    }
}

public class JDKProxyDemo {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        Service serviceProxy = (Service) logHandler.bind(new ServiceImpl());
        serviceProxy.hello();
        System.out.println(serviceProxy.world());
    }

}
