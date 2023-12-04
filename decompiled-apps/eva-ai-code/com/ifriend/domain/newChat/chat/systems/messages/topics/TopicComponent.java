package com.ifriend.domain.newChat.chat.systems.messages.topics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TopicsSystem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicComponent;", "Lcom/ifriend/common_entities_engine/Component;", AnalyticsConstants.TIMESTAMP, "", "name", "", "(JLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicComponent implements Component {
    private final String name;
    private final long timestamp;

    public static /* synthetic */ TopicComponent copy$default(TopicComponent topicComponent, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = topicComponent.timestamp;
        }
        if ((i & 2) != 0) {
            str = topicComponent.name;
        }
        return topicComponent.copy(j, str);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.name;
    }

    public final TopicComponent copy(long j, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TopicComponent(j, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopicComponent) {
            TopicComponent topicComponent = (TopicComponent) obj;
            return this.timestamp == topicComponent.timestamp && Intrinsics.areEqual(this.name, topicComponent.name);
        }
        return false;
    }

    public int hashCode() {
        return (AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp) * 31) + this.name.hashCode();
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.name;
        return "TopicComponent(timestamp=" + j + ", name=" + str + ")";
    }

    public TopicComponent(long j, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.timestamp = j;
        this.name = name;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getName() {
        return this.name;
    }
}
