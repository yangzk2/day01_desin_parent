package com.gupaoedu.yangzk.singleton.threadLocal;
/**
 * 伪线程安全
 * 统一线程内单例
 *
 * 使用ThreadLocal实现多数据源动态切换
 *
 * ThreadLocal#set()
 *  ThreadLocalMap
 *      key:线程
 *      value:自己设的东西
 */

/**
 * 伪线程安全  统一线程内单例
 *
 * 使用ThreadLocal实现多数据源动态切换
 *
 * ThreadLocal#set()
 *      key：线程
 *      value:自己设的东西
 */
public class ThreadLocalSingleton {
    //统一线程内部创建对象
    private static  final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    //私有化构造器
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton get(){
        return threadLocalSingleton.get();
    }
}
