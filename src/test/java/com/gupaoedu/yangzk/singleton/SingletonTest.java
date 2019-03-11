package com.gupaoedu.yangzk.singleton;


import com.gupaoedu.yangzk.singleton.hungry.HungrySingleton;
import com.gupaoedu.yangzk.singleton.hungry.HungryStaticSingleton;
import com.gupaoedu.yangzk.singleton.lazy.DoubleLazySingleton;
import com.gupaoedu.yangzk.singleton.lazy.LazySingleton;
import com.gupaoedu.yangzk.singleton.threadLocal.ExectorThread;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void hungrySingletonStaticTest(){
        HungryStaticSingleton instance = HungryStaticSingleton.getInstance();
        HungryStaticSingleton instance2 = HungryStaticSingleton.getInstance();
        System.out.println(instance==instance2);

    }
    @Test
    public void hungrySingletonTest(){
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        HungrySingleton hungrySingleton2 = HungrySingleton.getHungrySingleton();
        System.out.println(hungrySingleton==hungrySingleton2);

    }

    @Test
    public void lazySingletonTest(){
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton==lazySingleton2);
    }
    @Test
    public void lazySimpleSingletonTest(){
        Thread thread = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread.start();
        thread2.start();
        System.out.println("Exector End");
    }
    @Test
    public void DoubleLazySingletonTest(){
        DoubleLazySingleton doubleLazySingleton = DoubleLazySingleton.get();
        System.out.println(doubleLazySingleton);
    }
}
