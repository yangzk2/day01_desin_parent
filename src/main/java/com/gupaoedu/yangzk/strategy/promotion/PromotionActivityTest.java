package com.gupaoedu.yangzk.strategy.promotion;



public class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionAvtivity avtivity618 = new PromotionAvtivity(new CouponStrategy());
        PromotionAvtivity avtivity1111 = new PromotionAvtivity(new CashbackStrategy());
        avtivity618.execute();
        avtivity1111.execute();

        String promotionKey = "COUPON";
        PromotionAvtivity promotionActivity = new PromotionAvtivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }


}
