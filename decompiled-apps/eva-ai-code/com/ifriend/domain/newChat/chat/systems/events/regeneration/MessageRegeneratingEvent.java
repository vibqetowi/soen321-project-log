package com.ifriend.domain.newChat.chat.systems.events.regeneration;

import com.ifriend.common_entities_engine.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageRegeneratingEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/events/regeneration/MessageRegeneratingEvent;", "Lcom/ifriend/common_entities_engine/Event;", "messageId", "", "isRegenerating", "", "(Ljava/lang/String;Z)V", "()Z", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageRegeneratingEvent implements Event {
    private final boolean isRegenerating;
    private final String messageId;

    public static /* synthetic */ MessageRegeneratingEvent copy$default(MessageRegeneratingEvent messageRegeneratingEvent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageRegeneratingEvent.messageId;
        }
        if ((i & 2) != 0) {
            z = messageRegeneratingEvent.isRegenerating;
        }
        return messageRegeneratingEvent.copy(str, z);
    }

    public final String component1() {
        return this.messageId;
    }

    public final boolean component2() {
        return this.isRegenerating;
    }

    public final MessageRegeneratingEvent copy(String messageId, boolean z) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new MessageRegeneratingEvent(messageId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageRegeneratingEvent) {
            MessageRegeneratingEvent messageRegeneratingEvent = (MessageRegeneratingEvent) obj;
            return Intrinsics.areEqual(this.messageId, messageRegeneratingEvent.messageId) && this.isRegenerating == messageRegeneratingEvent.isRegenerating;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.messageId.hashCode() * 31;
        boolean z = this.isRegenerating;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.messageId;
        boolean z = this.isRegenerating;
        return "MessageRegeneratingEvent(messageId=" + str + ", isRegenerating=" + z + ")";
    }

    public MessageRegeneratingEvent(String messageId, boolean z) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.isRegenerating = z;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean isRegenerating() {
        return this.isRegenerating;
    }
}
