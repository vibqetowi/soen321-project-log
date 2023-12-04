package com.ifriend.data.networking.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenerateBotAvatarResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/networking/api/GenerateBotAvatarResponse;", "", "generationId", "", "avatarGenerationStatusResponse", "Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "(Ljava/lang/String;Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;)V", "getAvatarGenerationStatusResponse", "()Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "getGenerationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarResponse {
    @SerializedName("Status")
    private final AvatarGenerationStatusResponse avatarGenerationStatusResponse;
    @SerializedName("Id")
    private final String generationId;

    public static /* synthetic */ GenerateBotAvatarResponse copy$default(GenerateBotAvatarResponse generateBotAvatarResponse, String str, AvatarGenerationStatusResponse avatarGenerationStatusResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateBotAvatarResponse.generationId;
        }
        if ((i & 2) != 0) {
            avatarGenerationStatusResponse = generateBotAvatarResponse.avatarGenerationStatusResponse;
        }
        return generateBotAvatarResponse.copy(str, avatarGenerationStatusResponse);
    }

    public final String component1() {
        return this.generationId;
    }

    public final AvatarGenerationStatusResponse component2() {
        return this.avatarGenerationStatusResponse;
    }

    public final GenerateBotAvatarResponse copy(String generationId, AvatarGenerationStatusResponse avatarGenerationStatusResponse) {
        Intrinsics.checkNotNullParameter(generationId, "generationId");
        Intrinsics.checkNotNullParameter(avatarGenerationStatusResponse, "avatarGenerationStatusResponse");
        return new GenerateBotAvatarResponse(generationId, avatarGenerationStatusResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenerateBotAvatarResponse) {
            GenerateBotAvatarResponse generateBotAvatarResponse = (GenerateBotAvatarResponse) obj;
            return Intrinsics.areEqual(this.generationId, generateBotAvatarResponse.generationId) && this.avatarGenerationStatusResponse == generateBotAvatarResponse.avatarGenerationStatusResponse;
        }
        return false;
    }

    public int hashCode() {
        return (this.generationId.hashCode() * 31) + this.avatarGenerationStatusResponse.hashCode();
    }

    public String toString() {
        String str = this.generationId;
        AvatarGenerationStatusResponse avatarGenerationStatusResponse = this.avatarGenerationStatusResponse;
        return "GenerateBotAvatarResponse(generationId=" + str + ", avatarGenerationStatusResponse=" + avatarGenerationStatusResponse + ")";
    }

    public GenerateBotAvatarResponse(String generationId, AvatarGenerationStatusResponse avatarGenerationStatusResponse) {
        Intrinsics.checkNotNullParameter(generationId, "generationId");
        Intrinsics.checkNotNullParameter(avatarGenerationStatusResponse, "avatarGenerationStatusResponse");
        this.generationId = generationId;
        this.avatarGenerationStatusResponse = avatarGenerationStatusResponse;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final AvatarGenerationStatusResponse getAvatarGenerationStatusResponse() {
        return this.avatarGenerationStatusResponse;
    }
}
