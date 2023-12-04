package com.ifriend.data.storages;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.storage.DelayedEvent;
import com.ifriend.domain.storage.DelayedEventType;
import com.ifriend.domain.storage.EventDelayStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EventDelayStorageImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/storages/EventDelayStorageImpl;", "Lcom/ifriend/domain/storage/EventDelayStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "addEventDelay", "", "delayedEvent", "Lcom/ifriend/domain/storage/DelayedEvent;", "clearEventDelay", "delayedEventType", "Lcom/ifriend/domain/storage/DelayedEventType;", "getEventDelayUntil", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EventDelayStorageImpl implements EventDelayStorage {
    private final Preferences preferences;

    public EventDelayStorageImpl(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.ifriend.domain.storage.EventDelayStorage
    public void addEventDelay(DelayedEvent delayedEvent) {
        Intrinsics.checkNotNullParameter(delayedEvent, "delayedEvent");
        this.preferences.saveLongWithKey(delayedEvent.getType().name(), Long.valueOf(delayedEvent.getUntil()));
    }

    @Override // com.ifriend.domain.storage.EventDelayStorage
    public long getEventDelayUntil(DelayedEventType delayedEventType) {
        Intrinsics.checkNotNullParameter(delayedEventType, "delayedEventType");
        return this.preferences.getLongWithKey(delayedEventType.name());
    }

    @Override // com.ifriend.domain.storage.EventDelayStorage
    public void clearEventDelay(DelayedEventType delayedEventType) {
        Intrinsics.checkNotNullParameter(delayedEventType, "delayedEventType");
        this.preferences.clearValue(delayedEventType.name());
    }
}
