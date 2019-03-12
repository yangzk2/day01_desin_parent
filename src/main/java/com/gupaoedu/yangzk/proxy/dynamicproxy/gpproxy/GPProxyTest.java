package com.gupaoedu.yangzk.proxy.dynamicproxy.gpproxy;


import com.gupaoedu.yangzk.proxy.Person;
import com.gupaoedu.yangzk.proxy.dynamicproxy.jdkproxy.Girl;
import org.junit.jupiter.api.Test;


public class GPProxyTest {

    @Test
    public void GPProxytest(){
        try {
            //JDK动态代理的实现原理
            Person person = (Person) new GPMeipo().getInstance(new Girl());
            person.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
