package com.ifriend.domain.newChat.chat.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessage.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "Lcom/ifriend/common_entities_engine/Component;", "info", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;Lcom/ifriend/domain/newChat/chat/models/MessageContent;)V", "getContent", "()Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "getInfo", "()Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessage implements Component {
    private final MessageContent content;
    private final MessageInfo info;

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, MessageInfo messageInfo, MessageContent messageContent, int i, Object obj) {
        if ((i & 1) != 0) {
            messageInfo = chatMessage.info;
        }
        if ((i & 2) != 0) {
            messageContent = chatMessage.content;
        }
        return chatMessage.copy(messageInfo, messageContent);
    }

    public final MessageInfo component1() {
        return this.info;
    }

    public final MessageContent component2() {
        return this.content;
    }

    public final ChatMessage copy(MessageInfo info, MessageContent content) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ChatMessage(info, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage) obj;
            return Intrinsics.areEqual(this.info, chatMessage.info) && Intrinsics.areEqual(this.content, chatMessage.content);
        }
        return false;
    }

    public int hashCode() {
        return (this.info.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        MessageInfo messageInfo = this.info;
        MessageContent messageContent = this.content;
        return "ChatMessage(info=" + messageInfo + ", content=" + messageContent + ")";
    }

    public ChatMessage(MessageInfo info, MessageContent content) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(content, "content");
        this.info = info;
        this.content = content;
    }

    public final MessageInfo getInfo() {
        return this.info;
    }

    public final MessageContent getContent() {
        return this.content;
    }
}
