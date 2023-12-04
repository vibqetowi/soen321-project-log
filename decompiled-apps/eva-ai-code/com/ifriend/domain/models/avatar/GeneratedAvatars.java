package com.ifriend.domain.models.avatar;

import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GeneratedAvatars.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "", "avatarGenerationResultId", "", "userId", "status", "Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "description", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;Ljava/lang/String;)V", "getAvatarGenerationResultId", "()Ljava/lang/String;", "getDescription", "getStatus", "()Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratedAvatars {
    private final String avatarGenerationResultId;
    private final String description;
    private final AvatarGenerationStatus status;
    private final String userId;

    public static /* synthetic */ GeneratedAvatars copy$default(GeneratedAvatars generatedAvatars, String str, String str2, AvatarGenerationStatus avatarGenerationStatus, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generatedAvatars.avatarGenerationResultId;
        }
        if ((i & 2) != 0) {
            str2 = generatedAvatars.userId;
        }
        if ((i & 4) != 0) {
            avatarGenerationStatus = generatedAvatars.status;
        }
        if ((i & 8) != 0) {
            str3 = generatedAvatars.description;
        }
        return generatedAvatars.copy(str, str2, avatarGenerationStatus, str3);
    }

    public final String component1() {
        return this.avatarGenerationResultId;
    }

    public final String component2() {
        return this.userId;
    }

    public final AvatarGenerationStatus component3() {
        return this.status;
    }

    public final String component4() {
        return this.description;
    }

    public final GeneratedAvatars copy(String avatarGenerationResultId, String userId, AvatarGenerationStatus status, String description) {
        Intrinsics.checkNotNullParameter(avatarGenerationResultId, "avatarGenerationResultId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        return new GeneratedAvatars(avatarGenerationResultId, userId, status, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneratedAvatars) {
            GeneratedAvatars generatedAvatars = (GeneratedAvatars) obj;
            return Intrinsics.areEqual(this.avatarGenerationResultId, generatedAvatars.avatarGenerationResultId) && Intrinsics.areEqual(this.userId, generatedAvatars.userId) && this.status == generatedAvatars.status && Intrinsics.areEqual(this.description, generatedAvatars.description);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.avatarGenerationResultId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        String str = this.avatarGenerationResultId;
        String str2 = this.userId;
        AvatarGenerationStatus avatarGenerationStatus = this.status;
        String str3 = this.description;
        return "GeneratedAvatars(avatarGenerationResultId=" + str + ", userId=" + str2 + ", status=" + avatarGenerationStatus + ", description=" + str3 + ")";
    }

    public GeneratedAvatars(String avatarGenerationResultId, String userId, AvatarGenerationStatus status, String description) {
        Intrinsics.checkNotNullParameter(avatarGenerationResultId, "avatarGenerationResultId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        this.avatarGenerationResultId = avatarGenerationResultId;
        this.userId = userId;
        this.status = status;
        this.description = description;
    }

    public final String getAvatarGenerationResultId() {
        return this.avatarGenerationResultId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final AvatarGenerationStatus getStatus() {
        return this.status;
    }

    public final String getDescription() {
        return this.description;
    }
}
