package com.theinnerhour.b2b.components.libraryExperiment.model;

import com.appsflyer.R;
import com.google.firebase.database.PropertyName;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserLibraryItemAccessModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u008c\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001b\"\u0004\b\u001e\u0010\u001dR\u001e\u0010\u000f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015¨\u0006>"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/model/UserLibraryItemAccessModel;", "", "()V", "id", "", "itemType", "label", "startDate", "", "lastAccessedDate", "isFavourite", "", "isCompleted", "parentId", "parentType", "isFree", "bookmarkedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V", "getBookmarkedDate", "()Ljava/lang/Long;", "setBookmarkedDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setCompleted", "(Z)V", "setFavourite", "setFree", "getItemType", "setItemType", "getLabel", "setLabel", "getLastAccessedDate", "setLastAccessedDate", "getParentId", "setParentId", "getParentType", "setParentType", "getStartDate", "setStartDate", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)Lcom/theinnerhour/b2b/components/libraryExperiment/model/UserLibraryItemAccessModel;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserLibraryItemAccessModel {
    private Long bookmarkedDate;

    /* renamed from: id  reason: collision with root package name */
    private String f11300id;
    private boolean isCompleted;
    private boolean isFavourite;
    private boolean isFree;
    private String itemType;
    private String label;
    private Long lastAccessedDate;
    private String parentId;
    private String parentType;
    private Long startDate;

    public UserLibraryItemAccessModel(String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, Long l11) {
        this.f11300id = str;
        this.itemType = str2;
        this.label = str3;
        this.startDate = l2;
        this.lastAccessedDate = l10;
        this.isFavourite = z10;
        this.isCompleted = z11;
        this.parentId = str4;
        this.parentType = str5;
        this.isFree = z12;
        this.bookmarkedDate = l11;
    }

    public static /* synthetic */ UserLibraryItemAccessModel copy$default(UserLibraryItemAccessModel userLibraryItemAccessModel, String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, Long l11, int i6, Object obj) {
        String str6;
        String str7;
        String str8;
        Long l12;
        Long l13;
        boolean z13;
        boolean z14;
        String str9;
        String str10;
        boolean z15;
        Long l14;
        if ((i6 & 1) != 0) {
            str6 = userLibraryItemAccessModel.f11300id;
        } else {
            str6 = str;
        }
        if ((i6 & 2) != 0) {
            str7 = userLibraryItemAccessModel.itemType;
        } else {
            str7 = str2;
        }
        if ((i6 & 4) != 0) {
            str8 = userLibraryItemAccessModel.label;
        } else {
            str8 = str3;
        }
        if ((i6 & 8) != 0) {
            l12 = userLibraryItemAccessModel.startDate;
        } else {
            l12 = l2;
        }
        if ((i6 & 16) != 0) {
            l13 = userLibraryItemAccessModel.lastAccessedDate;
        } else {
            l13 = l10;
        }
        if ((i6 & 32) != 0) {
            z13 = userLibraryItemAccessModel.isFavourite;
        } else {
            z13 = z10;
        }
        if ((i6 & 64) != 0) {
            z14 = userLibraryItemAccessModel.isCompleted;
        } else {
            z14 = z11;
        }
        if ((i6 & 128) != 0) {
            str9 = userLibraryItemAccessModel.parentId;
        } else {
            str9 = str4;
        }
        if ((i6 & 256) != 0) {
            str10 = userLibraryItemAccessModel.parentType;
        } else {
            str10 = str5;
        }
        if ((i6 & 512) != 0) {
            z15 = userLibraryItemAccessModel.isFree;
        } else {
            z15 = z12;
        }
        if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
            l14 = userLibraryItemAccessModel.bookmarkedDate;
        } else {
            l14 = l11;
        }
        return userLibraryItemAccessModel.copy(str6, str7, str8, l12, l13, z13, z14, str9, str10, z15, l14);
    }

    public final String component1() {
        return this.f11300id;
    }

    public final boolean component10() {
        return this.isFree;
    }

    public final Long component11() {
        return this.bookmarkedDate;
    }

    public final String component2() {
        return this.itemType;
    }

    public final String component3() {
        return this.label;
    }

    public final Long component4() {
        return this.startDate;
    }

    public final Long component5() {
        return this.lastAccessedDate;
    }

    public final boolean component6() {
        return this.isFavourite;
    }

    public final boolean component7() {
        return this.isCompleted;
    }

    public final String component8() {
        return this.parentId;
    }

    public final String component9() {
        return this.parentType;
    }

    public final UserLibraryItemAccessModel copy(String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, Long l11) {
        return new UserLibraryItemAccessModel(str, str2, str3, l2, l10, z10, z11, str4, str5, z12, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLibraryItemAccessModel)) {
            return false;
        }
        UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) obj;
        if (i.b(this.f11300id, userLibraryItemAccessModel.f11300id) && i.b(this.itemType, userLibraryItemAccessModel.itemType) && i.b(this.label, userLibraryItemAccessModel.label) && i.b(this.startDate, userLibraryItemAccessModel.startDate) && i.b(this.lastAccessedDate, userLibraryItemAccessModel.lastAccessedDate) && this.isFavourite == userLibraryItemAccessModel.isFavourite && this.isCompleted == userLibraryItemAccessModel.isCompleted && i.b(this.parentId, userLibraryItemAccessModel.parentId) && i.b(this.parentType, userLibraryItemAccessModel.parentType) && this.isFree == userLibraryItemAccessModel.isFree && i.b(this.bookmarkedDate, userLibraryItemAccessModel.bookmarkedDate)) {
            return true;
        }
        return false;
    }

    public final Long getBookmarkedDate() {
        return this.bookmarkedDate;
    }

    public final String getId() {
        return this.f11300id;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f11300id;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.itemType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.label;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l2 = this.startDate;
        if (l2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l10 = this.lastAccessedDate;
        if (l10 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l10.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        boolean z10 = this.isFavourite;
        int i15 = 1;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int i17 = (i14 + i16) * 31;
        boolean z11 = this.isCompleted;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        String str4 = this.parentId;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i20 = (i19 + hashCode6) * 31;
        String str5 = this.parentType;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i21 = (i20 + hashCode7) * 31;
        boolean z12 = this.isFree;
        if (!z12) {
            i15 = z12 ? 1 : 0;
        }
        int i22 = (i21 + i15) * 31;
        Long l11 = this.bookmarkedDate;
        if (l11 != null) {
            i6 = l11.hashCode();
        }
        return i22 + i6;
    }

    @PropertyName("isCompleted")
    public final boolean isCompleted() {
        return this.isCompleted;
    }

    @PropertyName("isFavourite")
    public final boolean isFavourite() {
        return this.isFavourite;
    }

    @PropertyName("isFree")
    public final boolean isFree() {
        return this.isFree;
    }

    public final void setBookmarkedDate(Long l2) {
        this.bookmarkedDate = l2;
    }

    @PropertyName("isCompleted")
    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    @PropertyName("isFavourite")
    public final void setFavourite(boolean z10) {
        this.isFavourite = z10;
    }

    @PropertyName("isFree")
    public final void setFree(boolean z10) {
        this.isFree = z10;
    }

    public final void setId(String str) {
        this.f11300id = str;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setLastAccessedDate(Long l2) {
        this.lastAccessedDate = l2;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setParentType(String str) {
        this.parentType = str;
    }

    public final void setStartDate(Long l2) {
        this.startDate = l2;
    }

    public String toString() {
        return "UserLibraryItemAccessModel(id=" + this.f11300id + ", itemType=" + this.itemType + ", label=" + this.label + ", startDate=" + this.startDate + ", lastAccessedDate=" + this.lastAccessedDate + ", isFavourite=" + this.isFavourite + ", isCompleted=" + this.isCompleted + ", parentId=" + this.parentId + ", parentType=" + this.parentType + ", isFree=" + this.isFree + ", bookmarkedDate=" + this.bookmarkedDate + ')';
    }

    public /* synthetic */ UserLibraryItemAccessModel(String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, Long l11, int i6, d dVar) {
        this(str, str2, str3, l2, l10, z10, z11, str4, str5, z12, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? 0L : l11);
    }

    public UserLibraryItemAccessModel() {
        this(null, null, null, null, null, false, false, null, null, false, 0L);
    }
}
