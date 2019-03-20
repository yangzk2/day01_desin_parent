package com.gupaoedu.yangzk.decorator.battercake;

import java.math.BigDecimal;

/**
 * 扩展业务 煎饼加蛋
 */
public class BatrercakeAndAgg extends BattercakeDecorator{

    public BatrercakeAndAgg(Batrercake batrercake) {
        super(batrercake);
    }


    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }

    @Override
    protected BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1));
    }
}
