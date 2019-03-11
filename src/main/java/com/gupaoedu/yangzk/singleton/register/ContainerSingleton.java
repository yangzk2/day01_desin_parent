package com.gupaoedu.yangzk.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例设计模式-注册式
 * 通过map注入的形式
 */
public class ContainerSingleton {

    private static final Map<String,Object> map = new HashMap<String,Object>();
    private ContainerSingleton(){}
    //全局访问点  传入className,反射做。
    public Object get(String beanName){
        Object bean = map.get(beanName);
        if(null != bean) {
            return bean;
        }
        synchronized (ContainerSingleton.class){
            bean = map.get(beanName);
            if(null == bean){
                map.put(beanName,new Object());
            }
        }
        return bean;
    }

}
