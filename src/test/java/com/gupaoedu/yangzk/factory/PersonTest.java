package com.gupaoedu.yangzk.factory;

import com.gupaoedu.yangzk.factory.Motorbike;
import com.gupaoedu.yangzk.factory.Person;
import com.gupaoedu.yangzk.factory.SedanCar;
import com.gupaoedu.yangzk.factory.abstractFactory.MotorbikeMaintainFactory;
import com.gupaoedu.yangzk.factory.abstractFactory.TrainFactory;
import com.gupaoedu.yangzk.factory.methodFactory.CarMethodFactory;
import com.gupaoedu.yangzk.factory.methodFactory.MotorbikeFactory;
import com.gupaoedu.yangzk.factory.methodFactory.SedanCarFactory;
import com.gupaoedu.yangzk.factory.simple.CarSimpleFactory;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        SedanCar sedanCar = new SedanCar();
        person.bayCars(sedanCar.careatArctic());
        /**
         * 简单工厂
         */
        CarSimpleFactory carSimpleFactory = new CarSimpleFactory();
      /*  SedanCar sedanCar1 = (SedanCar)carSimpleFactory.create("com.gupaoedu.yangzk.factory.SedanCar");
        String careatArctic = sedanCar1.careatArctic();
        person.bayCars(careatArctic);  */
        Motorbike motorbike = (Motorbike)carSimpleFactory.create(Motorbike.class);
        String careatArctic = motorbike.careatArctic();
        person.bayCars(careatArctic);
        /**
         * 方法工厂
         */
        CarMethodFactory motorbikedFactory= new MotorbikeFactory();
        CarMethodFactory sedanCarFactory= new SedanCarFactory();
        String mb = motorbikedFactory.create();
        String sd = sedanCarFactory.create();
        person.bayCars(mb);
        person.bayCars(sd);
        TrainFactory trainFactory = new TrainFactory();
        trainFactory.carete();

        MotorbikeMaintainFactory motorbikeMaintainFactory = new MotorbikeMaintainFactory();
        motorbikeMaintainFactory.careteCar().carete();
        motorbikeMaintainFactory.repairCar().repair();


    }
}
