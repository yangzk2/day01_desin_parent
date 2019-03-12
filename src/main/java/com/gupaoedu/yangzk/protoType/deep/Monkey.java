package com.gupaoedu.yangzk.protoType.deep;

import java.io.Serializable;
import java.util.Date;

/**
 *原型模式-深克隆
 */
public class Monkey {
    //姓名
    private String name;
    //年龄
    private int age;
    //生日
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
