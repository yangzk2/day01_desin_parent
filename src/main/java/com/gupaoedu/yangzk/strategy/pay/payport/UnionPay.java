package com.gupaoedu.yangzk.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * 银联卡支付
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联卡";
    }

    @Override
    public BigDecimal queryBalance(Integer id) {
        return new BigDecimal(2000);
    }
}
