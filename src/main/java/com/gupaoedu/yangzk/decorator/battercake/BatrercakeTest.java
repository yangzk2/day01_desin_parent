package com.gupaoedu.yangzk.decorator.battercake;

/**
 * 测试煎饼加蛋 业务逻辑
 */
public class BatrercakeTest {

    public static void main(String[] args) {
        //首先我先定义一个基础的煎饼
        Batrercake batrercake = new BaseBatrercake();
        System.out.println("我买一个"+batrercake.getMsg()+"价格："+batrercake.getPrice());
        //一个煎饼吃不饱我还要加格鸡蛋
        batrercake = new BatrercakeAndAgg(batrercake);
        System.out.println("我买一个"+batrercake.getMsg()+"价格："+batrercake.getPrice());
        batrercake = new BatrercakeAndHam(batrercake);
        System.out.println("我买一个"+batrercake.getMsg()+"价格："+batrercake.getPrice());
    }
}
