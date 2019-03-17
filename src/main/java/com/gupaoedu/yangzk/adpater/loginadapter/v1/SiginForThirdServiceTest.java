package com.gupaoedu.yangzk.adpater.loginadapter.v1;

import com.gupaoedu.yangzk.adpater.loginadapter.v1.service.SinginForThirdService;

/**
 * 适配器登陆验证
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
