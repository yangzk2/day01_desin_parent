package com.gupaoedu.yangzk.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 被观察者
 */

public class GuavaQuestion {

    EventBus eventBus;

    public GuavaQuestion(EventBus eventBus)
    {
        this.eventBus = eventBus;
    }

    public void sendQuestion(String question)
    {
        System.out.println("发送消息 :"+question);

        NotifyEvent event = new NotifyEvent(question);

        eventBus.post(event);
    }


}
