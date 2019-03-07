package com.gupaoedu.yangzk.factory.abstractFactory;

public class MotorbikeFactory implements CarFactory {
    /**
     * 生产摩托车
     */
    public void carete() {
        System.out.println("摩托车");
    }

}
