package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 保养Factory
 */
public interface MaintainFactory {
    /**
     * 车辆生产
     * @return
     */
    CarFactory careteCar();

    /**
     * 车辆维修
     * @return
     */
    Maintenance repairCar();
}
