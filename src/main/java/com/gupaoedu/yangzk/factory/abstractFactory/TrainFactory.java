package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 火车工厂
 */
public class TrainFactory implements CarFactory {
    /**
     * 生产火车
     */
    public void carete() {
        System.out.println("火车");
    }

}
