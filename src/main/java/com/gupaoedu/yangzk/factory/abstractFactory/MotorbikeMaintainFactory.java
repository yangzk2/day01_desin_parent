package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 摩托车工程
 */
public class MotorbikeMaintainFactory implements MaintainFactory {
    /**
     * 生产摩托车
     * @return
     */
    public CarFactory careteCar() {
        return new MotorbikeFactory();
    }

    /**
     * 摩托车维修
     * @return
     */
    public Maintenance repairCar() {
        return new MotorbikeMaintenance();
    }
}
