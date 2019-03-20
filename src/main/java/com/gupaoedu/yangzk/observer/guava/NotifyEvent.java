package com.gupaoedu.yangzk.observer.guava;

import java.util.EventObject;

public class NotifyEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public NotifyEvent(Object source) {
        super(source);
    }
}
