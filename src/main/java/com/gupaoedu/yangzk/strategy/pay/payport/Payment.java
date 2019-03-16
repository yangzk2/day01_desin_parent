package com.gupaoedu.yangzk.strategy.pay.payport;

import com.gupaoedu.yangzk.strategy.pay.MsgResult;

import java.math.BigDecimal;

/**
 * 支付渠道
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();
    //查询渠道
    public abstract BigDecimal queryBalance(Integer id);

    //扣款支付
    public MsgResult pay(Integer id,BigDecimal amount){
        if(queryBalance(id).compareTo(amount) < 0){
            return new MsgResult("500","支付失败,","余额不足!!");
        }
        return new MsgResult("200","支付成功,","支付金额:"+amount);
    }

}
