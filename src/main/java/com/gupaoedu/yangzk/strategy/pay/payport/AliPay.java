package com.gupaoedu.yangzk.strategy.pay.payport;

import java.math.BigDecimal;

/**
 * 支付宝支付
 */
public class AliPay extends Payment{

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public BigDecimal queryBalance(Integer id) {

        return new BigDecimal(10000);
    }


}
