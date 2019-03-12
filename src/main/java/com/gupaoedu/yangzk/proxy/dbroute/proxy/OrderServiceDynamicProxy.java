package com.gupaoedu.yangzk.proxy.dbroute.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    Object proxyObj;
    public Object getInstance(Object proxyObj){
        this.proxyObj=proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxy, args);
        after();
        return null;
    }

    //target 应该是订单对象
    public void before(Object target){
        //还原默认的数据源
    }
    public void after(){

    }
}
