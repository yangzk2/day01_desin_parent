package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 汽车工程
 */
public class MotorcycleMaintainFactory implements MaintainFactory {
    /**
     * 生产小轿车
     * @return
     */
    public CarFactory careteCar() {
        return new MotorcycleFactory();
    }

    /**
     * 小轿车维修
     * @return
     */
    public Maintenance repairCar() {
        return new MotorcycleMaintenance();
    }
}
