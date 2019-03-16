package com.gupaoedu.yangzk.strategy.pay;



import com.gupaoedu.yangzk.strategy.pay.payport.PayStrategy;
import com.gupaoedu.yangzk.strategy.pay.payport.Payment;

import java.math.BigDecimal;

/**
 * 创建订单信息
 */
public class Order {
    //订单id
    private Integer id;
    //订单信息
    private String orderId;
    //支付金额
    private BigDecimal amount;

    public Order(Integer id, String orderId, BigDecimal amount) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
    }
    //默认支付方式
    public MsgResult pay(){
        return pay(Context.DEFAULT_PAY);
    }
    //支付方式
    public MsgResult pay(String payName){
        Payment payment = PayStrategy.pay(payName);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        return payment.pay(id,amount);
    }
}
