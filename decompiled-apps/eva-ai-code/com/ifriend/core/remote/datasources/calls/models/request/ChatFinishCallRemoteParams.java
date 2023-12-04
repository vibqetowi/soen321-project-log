package com.ifriend.core.remote.datasources.calls.models.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CallRemoteParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/core/remote/datasources/calls/models/request/ChatFinishCallRemoteParams;", "", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFinishCallRemoteParams {
    @SerializedName("reason")
    private final String reason;

    public static /* synthetic */ ChatFinishCallRemoteParams copy$default(ChatFinishCallRemoteParams chatFinishCallRemoteParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatFinishCallRemoteParams.reason;
        }
        return chatFinishCallRemoteParams.copy(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final ChatFinishCallRemoteParams copy(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ChatFinishCallRemoteParams(reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatFinishCallRemoteParams) && Intrinsics.areEqual(this.reason, ((ChatFinishCallRemoteParams) obj).reason);
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        String str = this.reason;
        return "ChatFinishCallRemoteParams(reason=" + str + ")";
    }

    public ChatFinishCallRemoteParams(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    public final String getReason() {
        return this.reason;
    }
}
