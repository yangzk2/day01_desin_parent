package com.gupaoedu.yangzk.strategy.pay;

/**
 * 支付状态
 */
public class MsgResult {
    //支付状态码
    private String code;
    //支付返回结果
    private String msg;
    //支付信息
    private Object data;

    public MsgResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return ("支付状态:[" + code + "]" + msg + "订单详情：" + data);
    }
}
