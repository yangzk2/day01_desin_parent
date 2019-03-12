package com.gupaoedu.yangzk.proxy.dynamicproxy.staticProxy;


public class FatherProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();
    }

}
