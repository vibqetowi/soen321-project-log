package com.ifriend.data.networking.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AvatarInfoResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/ifriend/data/networking/responses/AvatarInfoResponse;", "", "id", "", ClientCookie.PATH_ATTR, "animationId", "animationPath", "animationBaseName", "animationStatus", "Lcom/ifriend/data/networking/responses/AvatarInfoStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/responses/AvatarInfoStatus;)V", "getAnimationBaseName", "()Ljava/lang/String;", "getAnimationId", "getAnimationPath", "getAnimationStatus", "()Lcom/ifriend/data/networking/responses/AvatarInfoStatus;", "getId", "getPath", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarInfoResponse {
    private final String animationBaseName;
    private final String animationId;
    private final String animationPath;
    private final AvatarInfoStatus animationStatus;
    private final String id;
    private final String path;

    public static /* synthetic */ AvatarInfoResponse copy$default(AvatarInfoResponse avatarInfoResponse, String str, String str2, String str3, String str4, String str5, AvatarInfoStatus avatarInfoStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarInfoResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = avatarInfoResponse.path;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = avatarInfoResponse.animationId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = avatarInfoResponse.animationPath;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = avatarInfoResponse.animationBaseName;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            avatarInfoStatus = avatarInfoResponse.animationStatus;
        }
        return avatarInfoResponse.copy(str, str6, str7, str8, str9, avatarInfoStatus);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.animationId;
    }

    public final String component4() {
        return this.animationPath;
    }

    public final String component5() {
        return this.animationBaseName;
    }

    public final AvatarInfoStatus component6() {
        return this.animationStatus;
    }

    public final AvatarInfoResponse copy(String id, String path, String animationId, String str, String animationBaseName, AvatarInfoStatus avatarInfoStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(animationId, "animationId");
        Intrinsics.checkNotNullParameter(animationBaseName, "animationBaseName");
        return new AvatarInfoResponse(id, path, animationId, str, animationBaseName, avatarInfoStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarInfoResponse) {
            AvatarInfoResponse avatarInfoResponse = (AvatarInfoResponse) obj;
            return Intrinsics.areEqual(this.id, avatarInfoResponse.id) && Intrinsics.areEqual(this.path, avatarInfoResponse.path) && Intrinsics.areEqual(this.animationId, avatarInfoResponse.animationId) && Intrinsics.areEqual(this.animationPath, avatarInfoResponse.animationPath) && Intrinsics.areEqual(this.animationBaseName, avatarInfoResponse.animationBaseName) && this.animationStatus == avatarInfoResponse.animationStatus;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.path.hashCode()) * 31) + this.animationId.hashCode()) * 31;
        String str = this.animationPath;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.animationBaseName.hashCode()) * 31;
        AvatarInfoStatus avatarInfoStatus = this.animationStatus;
        return hashCode2 + (avatarInfoStatus != null ? avatarInfoStatus.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.path;
        String str3 = this.animationId;
        String str4 = this.animationPath;
        String str5 = this.animationBaseName;
        AvatarInfoStatus avatarInfoStatus = this.animationStatus;
        return "AvatarInfoResponse(id=" + str + ", path=" + str2 + ", animationId=" + str3 + ", animationPath=" + str4 + ", animationBaseName=" + str5 + ", animationStatus=" + avatarInfoStatus + ")";
    }

    public AvatarInfoResponse(String id, String path, String animationId, String str, String animationBaseName, AvatarInfoStatus avatarInfoStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(animationId, "animationId");
        Intrinsics.checkNotNullParameter(animationBaseName, "animationBaseName");
        this.id = id;
        this.path = path;
        this.animationId = animationId;
        this.animationPath = str;
        this.animationBaseName = animationBaseName;
        this.animationStatus = avatarInfoStatus;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getAnimationId() {
        return this.animationId;
    }

    public final String getAnimationPath() {
        return this.animationPath;
    }

    public final String getAnimationBaseName() {
        return this.animationBaseName;
    }

    public final AvatarInfoStatus getAnimationStatus() {
        return this.animationStatus;
    }
}
