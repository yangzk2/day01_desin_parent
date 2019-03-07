package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 火车工程
 */
public class TrainMotorbikeFactory implements MaintainFactory {
    /**
     * 生产火车
     * @return
     */
    public CarFactory careteCar() {
        return null;
    }

    /**
     * 火车维修
     * @return
     */
    public Maintenance repairCar() {
        return null;
    }
}
