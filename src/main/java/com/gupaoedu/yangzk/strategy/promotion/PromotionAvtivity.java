package com.gupaoedu.yangzk.strategy.promotion;

/**
 *
 */
public class PromotionAvtivity {
private PromotionStrategy promotionStrategy;

    public PromotionAvtivity(PromotionStrategy promotionStrategy) {

        this.promotionStrategy = promotionStrategy;
    }

    public  void execute(){

        this.promotionStrategy.doPromotion();
    }
}
