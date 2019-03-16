package com.gupaoedu.yangzk.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建优惠策略工厂
 */
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP=new HashMap<String,PromotionStrategy>();
    static {
        //优惠劵
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        //返现优惠
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackStrategy());
        //团购优惠
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());


    }
    private static final PromotionStrategy NON_PROMOTION= new EmptyStrategy();

    private PromotionStrategyFactory() {
    }
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ?NON_PROMOTION:promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
