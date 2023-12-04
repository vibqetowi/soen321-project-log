package com.ifriend.core.remote.datasources.calls.models.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatStartCallRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/models/response/ChatStartCallRemote;", "", "callId", "", "startMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getStartMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStartCallRemote {
    @SerializedName("callId")
    private final String callId;
    @SerializedName("startMessage")
    private final String startMessage;

    public static /* synthetic */ ChatStartCallRemote copy$default(ChatStartCallRemote chatStartCallRemote, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatStartCallRemote.callId;
        }
        if ((i & 2) != 0) {
            str2 = chatStartCallRemote.startMessage;
        }
        return chatStartCallRemote.copy(str, str2);
    }

    public final String component1() {
        return this.callId;
    }

    public final String component2() {
        return this.startMessage;
    }

    public final ChatStartCallRemote copy(String callId, String str) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        return new ChatStartCallRemote(callId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatStartCallRemote) {
            ChatStartCallRemote chatStartCallRemote = (ChatStartCallRemote) obj;
            return Intrinsics.areEqual(this.callId, chatStartCallRemote.callId) && Intrinsics.areEqual(this.startMessage, chatStartCallRemote.startMessage);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.callId.hashCode() * 31;
        String str = this.startMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.startMessage;
        return "ChatStartCallRemote(callId=" + str + ", startMessage=" + str2 + ")";
    }

    public ChatStartCallRemote(String callId, String str) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.callId = callId;
        this.startMessage = str;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getStartMessage() {
        return this.startMessage;
    }
}
