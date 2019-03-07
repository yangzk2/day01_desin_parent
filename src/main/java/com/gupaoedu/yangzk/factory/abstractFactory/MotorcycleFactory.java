package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 小轿车工厂
 */
public class MotorcycleFactory implements CarFactory{
    /**
     * 生产小轿车
     */
    public void carete() {

        System.out.println("小轿车");
    }
}
