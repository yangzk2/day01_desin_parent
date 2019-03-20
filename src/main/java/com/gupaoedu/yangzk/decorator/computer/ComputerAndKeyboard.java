package com.gupaoedu.yangzk.decorator.computer;

import java.math.BigDecimal;

/**
 * 扩展业务加一个键盘
 */
public class ComputerAndKeyboard extends ComputerDecorator {


    public ComputerAndKeyboard(Computer computer) {
        super(computer);
    }

    @Override
    String getMsg() {
        return super.getMsg()+"加一个键盘";
    }

    @Override
    BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(500));
    }
}
