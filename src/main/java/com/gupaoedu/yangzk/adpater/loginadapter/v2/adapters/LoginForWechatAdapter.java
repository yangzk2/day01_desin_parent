package com.gupaoedu.yangzk.adpater.loginadapter.v2.adapters;

import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 * 微信登陆
 */
public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
