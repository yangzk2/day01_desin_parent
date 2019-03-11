package com.gupaoedu.yangzk.singleton.hungry;

/**
 * 懒汉式单例
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;
    //通过静态代码块进行实例化
    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    //构造方法私有化
    private HungryStaticSingleton(){

    }
    //全局的访问点
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
