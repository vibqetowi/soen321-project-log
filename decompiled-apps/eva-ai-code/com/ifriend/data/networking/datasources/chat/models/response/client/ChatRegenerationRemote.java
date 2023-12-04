package com.ifriend.data.networking.datasources.chat.models.response.client;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessageRemote.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;", "", "isAllowed", "", "oldMessageId", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOldMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ifriend/data/networking/datasources/chat/models/response/client/ChatRegenerationRemote;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRegenerationRemote {
    @SerializedName(alternate = {"isAllowed"}, value = "IsAllowed")
    private final Boolean isAllowed;
    @SerializedName(alternate = {"OldMessageId"}, value = "oldMessageId")
    private final String oldMessageId;

    public static /* synthetic */ ChatRegenerationRemote copy$default(ChatRegenerationRemote chatRegenerationRemote, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = chatRegenerationRemote.isAllowed;
        }
        if ((i & 2) != 0) {
            str = chatRegenerationRemote.oldMessageId;
        }
        return chatRegenerationRemote.copy(bool, str);
    }

    public final Boolean component1() {
        return this.isAllowed;
    }

    public final String component2() {
        return this.oldMessageId;
    }

    public final ChatRegenerationRemote copy(Boolean bool, String str) {
        return new ChatRegenerationRemote(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatRegenerationRemote) {
            ChatRegenerationRemote chatRegenerationRemote = (ChatRegenerationRemote) obj;
            return Intrinsics.areEqual(this.isAllowed, chatRegenerationRemote.isAllowed) && Intrinsics.areEqual(this.oldMessageId, chatRegenerationRemote.oldMessageId);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.isAllowed;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.oldMessageId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.isAllowed;
        String str = this.oldMessageId;
        return "ChatRegenerationRemote(isAllowed=" + bool + ", oldMessageId=" + str + ")";
    }

    public ChatRegenerationRemote(Boolean bool, String str) {
        this.isAllowed = bool;
        this.oldMessageId = str;
    }

    public final Boolean isAllowed() {
        return this.isAllowed;
    }

    public final String getOldMessageId() {
        return this.oldMessageId;
    }
}
