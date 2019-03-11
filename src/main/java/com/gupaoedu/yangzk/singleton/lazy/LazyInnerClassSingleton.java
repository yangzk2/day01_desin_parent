package com.gupaoedu.yangzk.singleton.lazy;

/**
 * 单例设计模式-懒汉式
 * 内部类形式
 *
 * 没有用到syn关键字 性能更好
 * 反射可以破坏单例  可以通过构造方法做判断控制
 * 序列化可以破坏
 *      ObjectInputStream
 *      ObjectOutputStream
 *      需要重构readReslove方法，只不过是覆盖了反序列化出来的对象
 *      还是创建了两次 发生在JVM层面，相对来说比较安全
 *      之前反序列化的对象被GC
 */
public class LazyInnerClassSingleton {

    //构造方法私有化
    private LazyInnerClassSingleton(){
        //私有化内部类可以通过反射暴力访问实例化
        //强制不可以使用反射实例化
        if(null != LazyHolder.LAZY){
            throw new RuntimeException("不能通过反射实例化");
        }
    }
    //全局访问点 实例化对象
    public static LazyInnerClassSingleton get(){
        return LazyHolder.LAZY;
    }

    //通过内部类创建对象 内部类私有化 懒加载 初始化时不加载 只有被调用的时候才会进行初始化
    //LazyHolder里面的逻辑需要等待外面方法调用时才执行
    //巧妙的利用了内部类特性
    private static class LazyHolder{
        private static final  LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
