package com.gupaoedu.yangzk.singleton.hungry;

/**
 * 饿汉式-单例设计模式
 */
public class HungrySingleton {
    //在类初始化的时候加载进入 使用final是为了防止被修改
    private final static HungrySingleton hungryMan=new HungrySingleton();
    //构造方法私有化 默认懒加载模式   只有在被调用的时候才会进行初始化加载
    private HungrySingleton(){}
    //全局的访问点 返回一个实例
    public static HungrySingleton getHungrySingleton(){
        return hungryMan;
    }
}
