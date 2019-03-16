package com.gupaoedu.yangzk.strategy.promotion;

/**
 * 返现
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {

        System.out.println("返现促销，返回的现金转到支付宝");
    }
}
