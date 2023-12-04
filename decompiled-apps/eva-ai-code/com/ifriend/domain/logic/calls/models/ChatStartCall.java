package com.ifriend.domain.logic.calls.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatStartCall.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/calls/models/ChatStartCall;", "", "callId", "", "startMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getStartMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStartCall {
    private final String callId;
    private final String startMessage;

    public static /* synthetic */ ChatStartCall copy$default(ChatStartCall chatStartCall, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatStartCall.callId;
        }
        if ((i & 2) != 0) {
            str2 = chatStartCall.startMessage;
        }
        return chatStartCall.copy(str, str2);
    }

    public final String component1() {
        return this.callId;
    }

    public final String component2() {
        return this.startMessage;
    }

    public final ChatStartCall copy(String callId, String startMessage) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(startMessage, "startMessage");
        return new ChatStartCall(callId, startMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatStartCall) {
            ChatStartCall chatStartCall = (ChatStartCall) obj;
            return Intrinsics.areEqual(this.callId, chatStartCall.callId) && Intrinsics.areEqual(this.startMessage, chatStartCall.startMessage);
        }
        return false;
    }

    public int hashCode() {
        return (this.callId.hashCode() * 31) + this.startMessage.hashCode();
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.startMessage;
        return "ChatStartCall(callId=" + str + ", startMessage=" + str2 + ")";
    }

    public ChatStartCall(String callId, String startMessage) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(startMessage, "startMessage");
        this.callId = callId;
        this.startMessage = startMessage;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getStartMessage() {
        return this.startMessage;
    }
}
