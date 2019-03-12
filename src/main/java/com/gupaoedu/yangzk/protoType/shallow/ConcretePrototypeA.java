package com.gupaoedu.yangzk.protoType.shallow;

import java.util.Date;
import java.util.List;

public class ConcretePrototypeA implements Prototype {

    private String name;
    private int age;
    private Date birthday;
    private List hobbies;
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

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setBirthday(this.birthday);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
