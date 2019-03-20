package com.gupaoedu.yangzk.decorator.computer;

import java.math.BigDecimal;

/**
 * 装饰者模式
 *  电脑
 */
public abstract class Computer {
    abstract String getMsg();

    abstract BigDecimal getPrice();
}
