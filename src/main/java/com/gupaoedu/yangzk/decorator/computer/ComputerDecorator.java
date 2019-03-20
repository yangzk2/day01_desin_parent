package com.gupaoedu.yangzk.decorator.computer;

import java.math.BigDecimal;

/**
 * 定义一个买电脑的扩展业务类
 */
public abstract class ComputerDecorator extends Computer{
    private  Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    String getMsg() {
        return this.computer.getMsg();
    }

    @Override
    BigDecimal getPrice() {
        return this.computer.getPrice();
    }
}
