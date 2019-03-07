package com.gupaoedu.yangzk.factory.abstractFactory;

/**
 * 小轿车维修
 */
public class MotorcycleMaintenance implements  Maintenance{
    /**
     * 维修
     */
    public void repair() {
        System.out.println("轿车维修");
    }
}
