package com.gupaoedu.yangzk.decorator.computer;

import java.math.BigDecimal;

/**
 * 定义一个标准Legion电脑
 */
public class BaseComputer extends Computer{
    @Override
    String getMsg() {
        return "电脑";
    }

    @Override
    BigDecimal getPrice() {
        return new BigDecimal(7000);
    }
}
