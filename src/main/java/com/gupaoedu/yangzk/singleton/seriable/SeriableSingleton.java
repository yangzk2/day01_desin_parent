package com.gupaoedu.yangzk.singleton.seriable;

import java.io.Serializable;

/**
 * 序列化-反序列化破坏单例
 */
public class SeriableSingleton implements Serializable {

    public final static  SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}

  public static  SeriableSingleton getInstance(){
        return INSTANCE;
  }
    //解决方法 重写readResolve
    private Object readResolve(){
        return INSTANCE;
    }

}
