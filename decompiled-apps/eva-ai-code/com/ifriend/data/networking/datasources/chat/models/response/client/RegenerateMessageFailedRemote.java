package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RegenerateMessageFailedRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/RegenerateMessageFailedRemote;", "", "messageId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getMessageId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegenerateMessageFailedRemote {
    @SerializedName("botId")
    private final String chatId;
    @SerializedName("messageId")
    private final String messageId;

    public static /* synthetic */ RegenerateMessageFailedRemote copy$default(RegenerateMessageFailedRemote regenerateMessageFailedRemote, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regenerateMessageFailedRemote.messageId;
        }
        if ((i & 2) != 0) {
            str2 = regenerateMessageFailedRemote.chatId;
        }
        return regenerateMessageFailedRemote.copy(str, str2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.chatId;
    }

    public final RegenerateMessageFailedRemote copy(String messageId, String chatId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new RegenerateMessageFailedRemote(messageId, chatId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegenerateMessageFailedRemote) {
            RegenerateMessageFailedRemote regenerateMessageFailedRemote = (RegenerateMessageFailedRemote) obj;
            return Intrinsics.areEqual(this.messageId, regenerateMessageFailedRemote.messageId) && Intrinsics.areEqual(this.chatId, regenerateMessageFailedRemote.chatId);
        }
        return false;
    }

    public int hashCode() {
        return (this.messageId.hashCode() * 31) + this.chatId.hashCode();
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.chatId;
        return "RegenerateMessageFailedRemote(messageId=" + str + ", chatId=" + str2 + ")";
    }

    public RegenerateMessageFailedRemote(String messageId, String chatId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.messageId = messageId;
        this.chatId = chatId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getChatId() {
        return this.chatId;
    }
}
