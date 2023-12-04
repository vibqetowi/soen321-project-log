package com.ifriend.data.networking.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AvatarGenerationResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ifriend/data/networking/api/AvatarGenerationResponse;", "", "status", "Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "avatarIds", "", "", "isActive", "", "id", "description", "(Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getAvatarIds", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getId", "()Z", "getStatus", "()Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationResponse {
    @SerializedName("AvatarIds")
    private final List<String> avatarIds;
    @SerializedName("Description")
    private final String description;
    @SerializedName("Id")
    private final String id;
    @SerializedName("IsActive")
    private final boolean isActive;
    @SerializedName("Status")
    private final AvatarGenerationStatusResponse status;

    public static /* synthetic */ AvatarGenerationResponse copy$default(AvatarGenerationResponse avatarGenerationResponse, AvatarGenerationStatusResponse avatarGenerationStatusResponse, List list, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarGenerationStatusResponse = avatarGenerationResponse.status;
        }
        List<String> list2 = list;
        if ((i & 2) != 0) {
            list2 = avatarGenerationResponse.avatarIds;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            z = avatarGenerationResponse.isActive;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = avatarGenerationResponse.id;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = avatarGenerationResponse.description;
        }
        return avatarGenerationResponse.copy(avatarGenerationStatusResponse, list3, z2, str3, str2);
    }

    public final AvatarGenerationStatusResponse component1() {
        return this.status;
    }

    public final List<String> component2() {
        return this.avatarIds;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.description;
    }

    public final AvatarGenerationResponse copy(AvatarGenerationStatusResponse status, List<String> avatarIds, boolean z, String id, String description) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(avatarIds, "avatarIds");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AvatarGenerationResponse(status, avatarIds, z, id, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarGenerationResponse) {
            AvatarGenerationResponse avatarGenerationResponse = (AvatarGenerationResponse) obj;
            return this.status == avatarGenerationResponse.status && Intrinsics.areEqual(this.avatarIds, avatarGenerationResponse.avatarIds) && this.isActive == avatarGenerationResponse.isActive && Intrinsics.areEqual(this.id, avatarGenerationResponse.id) && Intrinsics.areEqual(this.description, avatarGenerationResponse.description);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.status.hashCode() * 31) + this.avatarIds.hashCode()) * 31;
        boolean z = this.isActive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.id.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        AvatarGenerationStatusResponse avatarGenerationStatusResponse = this.status;
        List<String> list = this.avatarIds;
        boolean z = this.isActive;
        String str = this.id;
        String str2 = this.description;
        return "AvatarGenerationResponse(status=" + avatarGenerationStatusResponse + ", avatarIds=" + list + ", isActive=" + z + ", id=" + str + ", description=" + str2 + ")";
    }

    public AvatarGenerationResponse(AvatarGenerationStatusResponse status, List<String> avatarIds, boolean z, String id, String description) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(avatarIds, "avatarIds");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        this.status = status;
        this.avatarIds = avatarIds;
        this.isActive = z;
        this.id = id;
        this.description = description;
    }

    public final AvatarGenerationStatusResponse getStatus() {
        return this.status;
    }

    public final List<String> getAvatarIds() {
        return this.avatarIds;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDescription() {
        return this.description;
    }
}
