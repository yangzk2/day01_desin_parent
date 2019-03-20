package com.gupaoedu.yangzk.decorator.battercake;

import java.math.BigDecimal;

/**
 * 扩展业务
 */
public class BatrercakeAndHam extends BattercakeDecorator {

    public BatrercakeAndHam(Batrercake batrercake) {
        super(batrercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加一个火腿";
    }

    @Override
    protected BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }
}
