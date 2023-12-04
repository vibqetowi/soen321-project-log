package com.ifriend.domain.storage;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: EventDelayStorage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/storage/EventDelayStorage;", "", "addEventDelay", "", "delayedEvent", "Lcom/ifriend/domain/storage/DelayedEvent;", "clearEventDelay", "delayedEventType", "Lcom/ifriend/domain/storage/DelayedEventType;", "getEventDelayUntil", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EventDelayStorage {
    void addEventDelay(DelayedEvent delayedEvent);

    void clearEventDelay(DelayedEventType delayedEventType);

    long getEventDelayUntil(DelayedEventType delayedEventType);
}
