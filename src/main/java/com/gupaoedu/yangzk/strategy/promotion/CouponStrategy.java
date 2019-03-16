package com.gupaoedu.yangzk.strategy.promotion;

/**
 * 优惠劵
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠劵，课程的价格直接减去优惠劵抵扣金额");
    }
}
