package com.ifriend.data.networking.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SetBotVoiceRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/requests/SetBotVoiceRequest;", "", "aiSpeaker", "", "(Ljava/lang/String;)V", "getAiSpeaker", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetBotVoiceRequest {
    private final String aiSpeaker;

    public static /* synthetic */ SetBotVoiceRequest copy$default(SetBotVoiceRequest setBotVoiceRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setBotVoiceRequest.aiSpeaker;
        }
        return setBotVoiceRequest.copy(str);
    }

    public final String component1() {
        return this.aiSpeaker;
    }

    public final SetBotVoiceRequest copy(String aiSpeaker) {
        Intrinsics.checkNotNullParameter(aiSpeaker, "aiSpeaker");
        return new SetBotVoiceRequest(aiSpeaker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetBotVoiceRequest) && Intrinsics.areEqual(this.aiSpeaker, ((SetBotVoiceRequest) obj).aiSpeaker);
    }

    public int hashCode() {
        return this.aiSpeaker.hashCode();
    }

    public String toString() {
        String str = this.aiSpeaker;
        return "SetBotVoiceRequest(aiSpeaker=" + str + ")";
    }

    public SetBotVoiceRequest(String aiSpeaker) {
        Intrinsics.checkNotNullParameter(aiSpeaker, "aiSpeaker");
        this.aiSpeaker = aiSpeaker;
    }

    public final String getAiSpeaker() {
        return this.aiSpeaker;
    }
}
