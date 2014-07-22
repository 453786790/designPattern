package structural.proxy.examples;

import java.lang.reflect.Method;

public interface Advice {

    public void beforeMethod(Object proxy, Method method, Object[] args);

    public void afterMethod(Object proxy, Method method, Object[] args);
}
