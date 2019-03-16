package com.gupaoedu.yangzk.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * 微信支付
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    public BigDecimal queryBalance(Integer id) {
        return new BigDecimal(5000);
    }
}
