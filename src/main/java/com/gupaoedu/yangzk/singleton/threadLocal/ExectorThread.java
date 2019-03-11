package com.gupaoedu.yangzk.singleton.threadLocal;

import com.gupaoedu.yangzk.singleton.lazy.LazySingleton;

/**
 * 多线程单例调试
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
