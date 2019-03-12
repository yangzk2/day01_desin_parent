package com.gupaoedu.yangzk.proxy.dynamicproxy.staticProxy;

import com.gupaoedu.yangzk.proxy.Person;

public class Father implements Person {
    private  Son person;

    public Father(Son person){
        this.person =person;
    }
    public int findLove(){
        System.out.println("父亲物色对象");
        person.findLove();
        System.out.println("双方父母同意，确立关系");
        return 0;
    }
}
