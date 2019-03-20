package com.gupaoedu.yangzk.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 通过guava API 实现GPer社区调用
 *
 * 观察者模式
 */
public class GPerNotify {

    @Subscribe
    public void recordCustomerChange(NotifyEvent e) {

        System.out.println("得到消息通知:" + e);

    }



}
