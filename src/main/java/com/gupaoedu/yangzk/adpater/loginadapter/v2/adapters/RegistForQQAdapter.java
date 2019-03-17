package com.gupaoedu.yangzk.adpater.loginadapter.v2.adapters;

import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 * 注册登陆
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
