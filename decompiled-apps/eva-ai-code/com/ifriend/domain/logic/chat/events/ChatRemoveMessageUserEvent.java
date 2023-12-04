package com.ifriend.domain.logic.chat.events;

import com.ifriend.common_entities_engine.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatUserEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/logic/chat/events/ChatRemoveMessageUserEvent;", "Lcom/ifriend/common_entities_engine/Event;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRemoveMessageUserEvent implements Event {
    private final String messageId;

    public static /* synthetic */ ChatRemoveMessageUserEvent copy$default(ChatRemoveMessageUserEvent chatRemoveMessageUserEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatRemoveMessageUserEvent.messageId;
        }
        return chatRemoveMessageUserEvent.copy(str);
    }

    public final String component1() {
        return this.messageId;
    }

    public final ChatRemoveMessageUserEvent copy(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new ChatRemoveMessageUserEvent(messageId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatRemoveMessageUserEvent) && Intrinsics.areEqual(this.messageId, ((ChatRemoveMessageUserEvent) obj).messageId);
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    public String toString() {
        String str = this.messageId;
        return "ChatRemoveMessageUserEvent(messageId=" + str + ")";
    }

    public ChatRemoveMessageUserEvent(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }
}
