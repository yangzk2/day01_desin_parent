package com.gupaoedu.yangzk.decorator.battercake;

import java.math.BigDecimal;

/**
 * 定义一个业务扩展的抽象类
 *   如果有需要扩展业务操作需要继承该抽象类并重写该类方法
 */
public abstract class BattercakeDecorator extends Batrercake {

    private Batrercake batrercake;//基础煎饼

    public BattercakeDecorator(Batrercake batrercake) {
        this.batrercake = batrercake;
    }

    @Override
    protected String getMsg() {
        return this.batrercake.getMsg();
    }

    @Override
    protected BigDecimal getPrice() {
        return this.batrercake.getPrice();
    }
}
