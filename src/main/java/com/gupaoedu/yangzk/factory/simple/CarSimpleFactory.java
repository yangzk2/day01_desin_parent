package com.gupaoedu.yangzk.factory.simple;

import com.gupaoedu.yangzk.factory.Motorbike;

/**
 * 简单工厂
 */
public class CarSimpleFactory {

    /*public Object create(String carName){
        Object obj =null;
        try {
            if(null!=carName && !(carName.equals(""))) {
                obj = Class.forName(carName).newInstance();
            }else {
                return null;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }*/
    public Object create(Class<?> clazz){
        Object obj = null;
        try {
            if(null != clazz) {
                obj = clazz.newInstance();
            }else{
                return null;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
