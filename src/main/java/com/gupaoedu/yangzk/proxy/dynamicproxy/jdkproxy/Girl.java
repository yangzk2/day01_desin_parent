package com.gupaoedu.yangzk.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.yangzk.proxy.Person;

public class Girl implements Person {

    @Override
    public int findLove() {
        System.out.println("高富帅");
        System.out.println("身高175");
        System.out.println("8块腹肌");
        return 0;
    }
}
