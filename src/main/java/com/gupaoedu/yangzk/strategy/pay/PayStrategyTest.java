package com.gupaoedu.yangzk.strategy.pay;


import java.math.BigDecimal;

/**
 * 测试策略模式
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        Order order = new Order(1, "1234567890", new BigDecimal(100000));
        MsgResult pay = order.pay(Context.ALI_PAY);

        System.out.println(pay);


    }

}
