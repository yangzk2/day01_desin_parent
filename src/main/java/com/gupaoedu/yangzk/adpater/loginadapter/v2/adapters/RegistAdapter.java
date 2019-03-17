package com.gupaoedu.yangzk.adpater.loginadapter.v2.adapters;

import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 *  注册接口
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
