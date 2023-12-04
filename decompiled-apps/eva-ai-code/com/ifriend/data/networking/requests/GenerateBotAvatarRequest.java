package com.ifriend.data.networking.requests;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenerateBotAvatarRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/requests/GenerateBotAvatarRequest;", "", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarRequest {
    @SerializedName("Description")
    private final String description;

    public static /* synthetic */ GenerateBotAvatarRequest copy$default(GenerateBotAvatarRequest generateBotAvatarRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateBotAvatarRequest.description;
        }
        return generateBotAvatarRequest.copy(str);
    }

    public final String component1() {
        return this.description;
    }

    public final GenerateBotAvatarRequest copy(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new GenerateBotAvatarRequest(description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenerateBotAvatarRequest) && Intrinsics.areEqual(this.description, ((GenerateBotAvatarRequest) obj).description);
    }

    public int hashCode() {
        return this.description.hashCode();
    }

    public String toString() {
        String str = this.description;
        return "GenerateBotAvatarRequest(description=" + str + ")";
    }

    public GenerateBotAvatarRequest(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
    }

    public final String getDescription() {
        return this.description;
    }
}
