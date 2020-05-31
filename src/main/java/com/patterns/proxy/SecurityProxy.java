package com.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.reflect.Proxy.newProxyInstance;

public class SecurityProxy implements InvocationHandler {

    private final Object obj;

    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if (method.getName().equalsIgnoreCase("postToTimeline")) {
                throw new IllegalAccessException("Post are currently not allowed");
            } else {
                result = method.invoke(obj, args);
            }
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }

}
