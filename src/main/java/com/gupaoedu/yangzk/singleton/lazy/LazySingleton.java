package com.gupaoedu.yangzk.singleton.lazy;

/**
 * 单例设计模式之懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazyMan = null;
    //构造方法私有化
    private LazySingleton(){

    }
    //全局的访问点
    public synchronized static LazySingleton getLazySingleton(){
        if(null == lazyMan) {
            lazyMan = new LazySingleton();
        }
        return lazyMan;
    }

}
