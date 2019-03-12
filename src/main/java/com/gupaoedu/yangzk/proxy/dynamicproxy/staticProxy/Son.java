package com.gupaoedu.yangzk.proxy.dynamicproxy.staticProxy;

import com.gupaoedu.yangzk.proxy.Person;

public class Son implements Person {
    @Override
    public int findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
        return 0;
    }
}
