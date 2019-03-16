package com.gupaoedu.yangzk.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * 京东白条支付
 */
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public BigDecimal queryBalance(Integer id) {
        return new BigDecimal(3000);
    }
}
