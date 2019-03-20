package com.gupaoedu.yangzk.decorator.computer;

import java.math.BigDecimal;

/**
 * 扩展业务额外加一个耳机
 */
public class ComputerAndEarpiece extends ComputerDecorator {
    public ComputerAndEarpiece(Computer computer) {
        super(computer);
    }

    @Override
    String getMsg() {
        return super.getMsg()+"加一个耳机";
    }

    @Override
    BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(399));
    }
}
