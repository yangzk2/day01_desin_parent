package com.gupaoedu.yangzk.observer.guava;

import com.google.common.eventbus.EventBus;

public class GperGuavaTest {
    public static void main(String[] args) {
        //创建gper社区
        GPerNotify gPerNotify = new GPerNotify();
        //被观察发送消息
        EventBus eventBus = new EventBus();
        //注册
        eventBus.register(gPerNotify);

        GuavaQuestion question = new GuavaQuestion(eventBus);
        question.sendQuestion("hello GuPao!!");
        eventBus.post("qq");
    }
}
