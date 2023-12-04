package com.ifriend.domain.newChat.chat.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageIds.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "Ljava/io/Serializable;", "messageId", "", "senderId", "recipientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getRecipientId", "getSenderId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageIds implements Serializable {
    private final String messageId;
    private final String recipientId;
    private final String senderId;

    public static /* synthetic */ MessageIds copy$default(MessageIds messageIds, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageIds.messageId;
        }
        if ((i & 2) != 0) {
            str2 = messageIds.senderId;
        }
        if ((i & 4) != 0) {
            str3 = messageIds.recipientId;
        }
        return messageIds.copy(str, str2, str3);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.senderId;
    }

    public final String component3() {
        return this.recipientId;
    }

    public final MessageIds copy(String messageId, String senderId, String recipientId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        return new MessageIds(messageId, senderId, recipientId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageIds) {
            MessageIds messageIds = (MessageIds) obj;
            return Intrinsics.areEqual(this.messageId, messageIds.messageId) && Intrinsics.areEqual(this.senderId, messageIds.senderId) && Intrinsics.areEqual(this.recipientId, messageIds.recipientId);
        }
        return false;
    }

    public int hashCode() {
        return (((this.messageId.hashCode() * 31) + this.senderId.hashCode()) * 31) + this.recipientId.hashCode();
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.senderId;
        String str3 = this.recipientId;
        return "MessageIds(messageId=" + str + ", senderId=" + str2 + ", recipientId=" + str3 + ")";
    }

    public MessageIds(String messageId, String senderId, String recipientId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        this.messageId = messageId;
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getRecipientId() {
        return this.recipientId;
    }
}
