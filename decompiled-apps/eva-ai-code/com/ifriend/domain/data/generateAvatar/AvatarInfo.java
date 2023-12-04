package com.ifriend.domain.data.generateAvatar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarInfoStorage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/AvatarInfo;", "", "imageId", "", "animationId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnimationId", "()Ljava/lang/String;", "getImageId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarInfo {
    private final String animationId;
    private final String imageId;

    public static /* synthetic */ AvatarInfo copy$default(AvatarInfo avatarInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarInfo.imageId;
        }
        if ((i & 2) != 0) {
            str2 = avatarInfo.animationId;
        }
        return avatarInfo.copy(str, str2);
    }

    public final String component1() {
        return this.imageId;
    }

    public final String component2() {
        return this.animationId;
    }

    public final AvatarInfo copy(String str, String str2) {
        return new AvatarInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarInfo) {
            AvatarInfo avatarInfo = (AvatarInfo) obj;
            return Intrinsics.areEqual(this.imageId, avatarInfo.imageId) && Intrinsics.areEqual(this.animationId, avatarInfo.animationId);
        }
        return false;
    }

    public int hashCode() {
        String str = this.imageId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.animationId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageId;
        String str2 = this.animationId;
        return "AvatarInfo(imageId=" + str + ", animationId=" + str2 + ")";
    }

    public AvatarInfo(String str, String str2) {
        this.imageId = str;
        this.animationId = str2;
    }

    public final String getAnimationId() {
        return this.animationId;
    }

    public final String getImageId() {
        return this.imageId;
    }
}
