package com.gupaoedu.yangzk.prototype;

import com.gupaoedu.yangzk.protoType.deep.QiTianDaSheng;
import com.gupaoedu.yangzk.protoType.shallow.Client;
import com.gupaoedu.yangzk.protoType.shallow.ConcretePrototypeA;
import com.gupaoedu.yangzk.protoType.shallow.Prototype;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class prototypeTest {
    @Test
    public void simpleTest(){
        //创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        //填充属性
        concretePrototypeA.setName("浅克隆");
        concretePrototypeA.setAge(18);
        concretePrototypeA.setBirthday(new Date());
        List<String> list = new ArrayList<>();
        concretePrototypeA.setHobbies(list);
        //输出原属性
        System.out.println(concretePrototypeA);
        //创建Client对象 准备开始克隆
        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA cloneConcretePrototypeA = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(cloneConcretePrototypeA);
        System.out.println("克隆对象中的引用类型地址值"+cloneConcretePrototypeA.getHobbies());
        System.out.println("克隆对象中的日期对象类型地址值：" + cloneConcretePrototypeA.getBirthday());
        System.out.println("原对象中的引用类型地址值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较："+(cloneConcretePrototypeA.getHobbies() == concretePrototypeA.getHobbies()));
        System.out.println("对象日期地址比较："+(cloneConcretePrototypeA.getBirthday() == concretePrototypeA.getBirthday()));
    }
    @Test
    public void deepTest(){
        QiTianDaSheng  qiTianDaSheng= new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
        System.out.println("深克隆"+(qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆："+(q.getJinGuBang() == n.getJinGuBang()));


    }
}
