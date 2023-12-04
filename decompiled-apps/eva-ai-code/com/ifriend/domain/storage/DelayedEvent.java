package com.ifriend.domain.storage;

import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: EventDelayStorage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/storage/DelayedEvent;", "", "type", "Lcom/ifriend/domain/storage/DelayedEventType;", "until", "", "(Lcom/ifriend/domain/storage/DelayedEventType;J)V", "getType", "()Lcom/ifriend/domain/storage/DelayedEventType;", "getUntil", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelayedEvent {
    private final DelayedEventType type;
    private final long until;

    public static /* synthetic */ DelayedEvent copy$default(DelayedEvent delayedEvent, DelayedEventType delayedEventType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            delayedEventType = delayedEvent.type;
        }
        if ((i & 2) != 0) {
            j = delayedEvent.until;
        }
        return delayedEvent.copy(delayedEventType, j);
    }

    public final DelayedEventType component1() {
        return this.type;
    }

    public final long component2() {
        return this.until;
    }

    public final DelayedEvent copy(DelayedEventType type, long j) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new DelayedEvent(type, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DelayedEvent) {
            DelayedEvent delayedEvent = (DelayedEvent) obj;
            return this.type == delayedEvent.type && this.until == delayedEvent.until;
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.until);
    }

    public String toString() {
        DelayedEventType delayedEventType = this.type;
        long j = this.until;
        return "DelayedEvent(type=" + delayedEventType + ", until=" + j + ")";
    }

    public DelayedEvent(DelayedEventType type, long j) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.until = j;
    }

    public final DelayedEventType getType() {
        return this.type;
    }

    public final long getUntil() {
        return this.until;
    }
}
