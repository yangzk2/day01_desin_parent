package com.gupaoedu.yangzk.factory.methodFactory;

import com.gupaoedu.yangzk.factory.SedanCar;

public class SedanCarFactory implements CarMethodFactory {
    public String create() {
        return new SedanCar().careatArctic();
    }
}
