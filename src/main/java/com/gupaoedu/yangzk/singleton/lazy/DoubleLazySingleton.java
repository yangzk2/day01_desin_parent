package com.gupaoedu.yangzk.singleton.lazy;

/**
 * 单例设计模式-懒汉式双重锁
 */
public class DoubleLazySingleton {
    // volatile 防止指令冲排序
    private volatile static DoubleLazySingleton doubleLazySingleton = null;
    //构造器私有化
    private DoubleLazySingleton(){

    }
    //1.synchronized方法->性能问题
    //2.synchronization块
    public static DoubleLazySingleton get(){
        if(null == doubleLazySingleton){
            synchronized (DoubleLazySingleton.class){
                if(null == doubleLazySingleton){
                    doubleLazySingleton=new DoubleLazySingleton();
                    /**
                     * 对象初始化过程
                     * 1.分配对象内存
                     * 2.初始化对象
                     * 3.初始化好的对象与内存地址建立关联(赋值)
                     * 4.用户初次访问
                     */
                }
            }
        }
        return doubleLazySingleton;
    }

}
