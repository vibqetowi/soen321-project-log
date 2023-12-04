package com.ifriend.domain.newChat.chat.systems.dateSeparator;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DateSeparatorComponent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/dateSeparator/DateSeparatorComponent;", "Lcom/ifriend/common_entities_engine/Component;", AnalyticsConstants.TIMESTAMP, "", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateSeparatorComponent implements Component {
    private final long timestamp;

    public static /* synthetic */ DateSeparatorComponent copy$default(DateSeparatorComponent dateSeparatorComponent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dateSeparatorComponent.timestamp;
        }
        return dateSeparatorComponent.copy(j);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final DateSeparatorComponent copy(long j) {
        return new DateSeparatorComponent(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateSeparatorComponent) && this.timestamp == ((DateSeparatorComponent) obj).timestamp;
    }

    public int hashCode() {
        return AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp);
    }

    public String toString() {
        long j = this.timestamp;
        return "DateSeparatorComponent(timestamp=" + j + ")";
    }

    public DateSeparatorComponent(long j) {
        this.timestamp = j;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
