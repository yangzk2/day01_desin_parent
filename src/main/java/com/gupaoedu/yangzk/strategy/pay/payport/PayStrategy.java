package com.gupaoedu.yangzk.strategy.pay.payport;

import com.gupaoedu.yangzk.strategy.pay.Context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付策略
 */
public class PayStrategy {

    //定义一个线程安全的map
    private static Map<String,Payment> strategyMap = new ConcurrentHashMap<String,Payment>();

    static{
        strategyMap.put(Context.ALI_PAY,new AliPay());
        strategyMap.put(Context.JD_PAY,new JDPay());
        strategyMap.put(Context.WECHAT_PAY,new WechatPay());
        strategyMap.put(Context.UNION_PAY,new UnionPay());
    }
    //定义一个全局的访问点
    public static Payment pay(String payName){
        if(!strategyMap.containsKey(payName)){
            return strategyMap.get(Context.DEFAULT_PAY);
        }
        return strategyMap.get(payName);
    }
}
