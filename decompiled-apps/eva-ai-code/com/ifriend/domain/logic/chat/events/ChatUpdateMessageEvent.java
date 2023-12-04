package com.ifriend.domain.logic.chat.events;

import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSocketEvents.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/logic/chat/events/ChatUpdateMessageEvent;", "Lcom/ifriend/common_entities_engine/Event;", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;)V", "getChatMessage", "()Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatUpdateMessageEvent implements Event {
    private final ChatMessage chatMessage;

    public static /* synthetic */ ChatUpdateMessageEvent copy$default(ChatUpdateMessageEvent chatUpdateMessageEvent, ChatMessage chatMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            chatMessage = chatUpdateMessageEvent.chatMessage;
        }
        return chatUpdateMessageEvent.copy(chatMessage);
    }

    public final ChatMessage component1() {
        return this.chatMessage;
    }

    public final ChatUpdateMessageEvent copy(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        return new ChatUpdateMessageEvent(chatMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatUpdateMessageEvent) && Intrinsics.areEqual(this.chatMessage, ((ChatUpdateMessageEvent) obj).chatMessage);
    }

    public int hashCode() {
        return this.chatMessage.hashCode();
    }

    public String toString() {
        ChatMessage chatMessage = this.chatMessage;
        return "ChatUpdateMessageEvent(chatMessage=" + chatMessage + ")";
    }

    public ChatUpdateMessageEvent(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        this.chatMessage = chatMessage;
    }

    public final ChatMessage getChatMessage() {
        return this.chatMessage;
    }
}
