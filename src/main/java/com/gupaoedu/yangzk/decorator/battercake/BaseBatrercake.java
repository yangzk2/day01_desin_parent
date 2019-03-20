package com.gupaoedu.yangzk.decorator.battercake;

import java.math.BigDecimal;

/**
 * 设计模式-装饰者模式
 *以煎饼为例
 *      首先我们先定义抽象的煎饼
 *
 */
public class BaseBatrercake  extends Batrercake{
    /**
     * 定义一个标准的煎饼方法
     * @return
     */
    @Override
    protected String getMsg(){
        return "煎饼";
    }
    /**
     * 标准价格 5元 加东西另算
     * @return
     */
    @Override
    protected BigDecimal getPrice() {
        return new BigDecimal(5);
    }

}
