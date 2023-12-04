package com.ifriend.data.networking.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SetBotPersonalityRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/requests/SetBotPersonalityRequest;", "", "personality", "", "(Ljava/lang/String;)V", "getPersonality", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetBotPersonalityRequest {
    private final String personality;

    public static /* synthetic */ SetBotPersonalityRequest copy$default(SetBotPersonalityRequest setBotPersonalityRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setBotPersonalityRequest.personality;
        }
        return setBotPersonalityRequest.copy(str);
    }

    public final String component1() {
        return this.personality;
    }

    public final SetBotPersonalityRequest copy(String personality) {
        Intrinsics.checkNotNullParameter(personality, "personality");
        return new SetBotPersonalityRequest(personality);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetBotPersonalityRequest) && Intrinsics.areEqual(this.personality, ((SetBotPersonalityRequest) obj).personality);
    }

    public int hashCode() {
        return this.personality.hashCode();
    }

    public String toString() {
        String str = this.personality;
        return "SetBotPersonalityRequest(personality=" + str + ")";
    }

    public SetBotPersonalityRequest(String personality) {
        Intrinsics.checkNotNullParameter(personality, "personality");
        this.personality = personality;
    }

    public final String getPersonality() {
        return this.personality;
    }
}
