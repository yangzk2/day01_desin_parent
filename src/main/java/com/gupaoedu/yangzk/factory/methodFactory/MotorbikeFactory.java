package com.gupaoedu.yangzk.factory.methodFactory;

import com.gupaoedu.yangzk.factory.Motorbike;

/**
 * 方法工厂
 */
public class MotorbikeFactory implements CarMethodFactory {
    /**
     * 生产摩托车
     */
    public String create() {
        return new Motorbike().careatArctic();
    }
}
