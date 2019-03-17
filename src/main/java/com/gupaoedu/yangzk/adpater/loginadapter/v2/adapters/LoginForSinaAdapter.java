package com.gupaoedu.yangzk.adpater.loginadapter.v2.adapters;

import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 * 新浪微博登陆
 */
public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
