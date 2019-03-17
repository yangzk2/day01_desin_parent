package com.gupaoedu.yangzk.adpater.loginadapter.v1.service;

import com.gupaoedu.yangzk.adpater.loginadapter.Member;
import com.gupaoedu.yangzk.adpater.loginadapter.ResultMsg;

/**
 * 老登陆service
 */
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }

}
