package com.gupaoedu.yangzk.adpater.loginadapter.v2.adapters;

import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 * QQ登陆
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
