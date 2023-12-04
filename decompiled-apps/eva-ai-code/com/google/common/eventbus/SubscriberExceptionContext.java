package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public class SubscriberExceptionContext {
    private final Object event;
    private final EventBus eventBus;
    private final Object subscriber;
    private final Method subscriberMethod;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.eventBus = (EventBus) Preconditions.checkNotNull(eventBus);
        this.event = Preconditions.checkNotNull(obj);
        this.subscriber = Preconditions.checkNotNull(obj2);
        this.subscriberMethod = (Method) Preconditions.checkNotNull(method);
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public Object getEvent() {
        return this.event;
    }

    public Object getSubscriber() {
        return this.subscriber;
    }

    public Method getSubscriberMethod() {
        return this.subscriberMethod;
    }
}
