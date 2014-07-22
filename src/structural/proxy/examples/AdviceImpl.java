package structural.proxy.examples;

import java.lang.reflect.Method;

public class AdviceImpl implements Advice {

    @Override
    public void beforeMethod(Object proxy, Method method, Object[] args) {
        System.out.println(method.getName() + " is starting...");
    }

    @Override
    public void afterMethod(Object proxy, Method method, Object[] args) {
        System.out.println(method.getName() + " has ended.");
    }

}
