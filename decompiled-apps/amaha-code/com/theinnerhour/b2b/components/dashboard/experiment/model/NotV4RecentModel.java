package com.theinnerhour.b2b.components.dashboard.experiment.model;

import com.appsflyer.R;
import com.google.firebase.database.PropertyName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: NotV4RecentModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010(J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¤\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001d\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u0011\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006H"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/model/NotV4RecentModel;", "", "()V", "id", "", "itemType", "label", "startDate", "", "lastAccessedDate", "isFavourite", "", "isCompleted", "parentId", "parentType", "isFree", "subText", "isHeader", "headerTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getHeaderTitle", "()Ljava/lang/String;", "setHeaderTitle", "(Ljava/lang/String;)V", "getId", "setId", "()Z", "setCompleted", "(Z)V", "setFavourite", "setFree", "()Ljava/lang/Boolean;", "setHeader", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getItemType", "setItemType", "getLabel", "setLabel", "getLastAccessedDate", "()Ljava/lang/Long;", "setLastAccessedDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getParentId", "setParentId", "getParentType", "setParentType", "getStartDate", "setStartDate", "getSubText", "setSubText", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/theinnerhour/b2b/components/dashboard/experiment/model/NotV4RecentModel;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NotV4RecentModel {
    private String headerTitle;

    /* renamed from: id  reason: collision with root package name */
    private String f10853id;
    private boolean isCompleted;
    private boolean isFavourite;
    private boolean isFree;
    private Boolean isHeader;
    private String itemType;
    private String label;
    private Long lastAccessedDate;
    private String parentId;
    private String parentType;
    private Long startDate;
    private String subText;

    public NotV4RecentModel(String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, String str6, Boolean bool, String str7) {
        this.f10853id = str;
        this.itemType = str2;
        this.label = str3;
        this.startDate = l2;
        this.lastAccessedDate = l10;
        this.isFavourite = z10;
        this.isCompleted = z11;
        this.parentId = str4;
        this.parentType = str5;
        this.isFree = z12;
        this.subText = str6;
        this.isHeader = bool;
        this.headerTitle = str7;
    }

    public final String component1() {
        return this.f10853id;
    }

    public final boolean component10() {
        return this.isFree;
    }

    public final String component11() {
        return this.subText;
    }

    public final Boolean component12() {
        return this.isHeader;
    }

    public final String component13() {
        return this.headerTitle;
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

    public final NotV4RecentModel copy(String str, String str2, String str3, Long l2, Long l10, boolean z10, boolean z11, String str4, String str5, boolean z12, String str6, Boolean bool, String str7) {
        return new NotV4RecentModel(str, str2, str3, l2, l10, z10, z11, str4, str5, z12, str6, bool, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotV4RecentModel)) {
            return false;
        }
        NotV4RecentModel notV4RecentModel = (NotV4RecentModel) obj;
        if (i.b(this.f10853id, notV4RecentModel.f10853id) && i.b(this.itemType, notV4RecentModel.itemType) && i.b(this.label, notV4RecentModel.label) && i.b(this.startDate, notV4RecentModel.startDate) && i.b(this.lastAccessedDate, notV4RecentModel.lastAccessedDate) && this.isFavourite == notV4RecentModel.isFavourite && this.isCompleted == notV4RecentModel.isCompleted && i.b(this.parentId, notV4RecentModel.parentId) && i.b(this.parentType, notV4RecentModel.parentType) && this.isFree == notV4RecentModel.isFree && i.b(this.subText, notV4RecentModel.subText) && i.b(this.isHeader, notV4RecentModel.isHeader) && i.b(this.headerTitle, notV4RecentModel.headerTitle)) {
            return true;
        }
        return false;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getId() {
        return this.f10853id;
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

    public final String getSubText() {
        return this.subText;
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
        int hashCode8;
        int hashCode9;
        String str = this.f10853id;
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
        String str6 = this.subText;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i23 = (i22 + hashCode8) * 31;
        Boolean bool = this.isHeader;
        if (bool == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool.hashCode();
        }
        int i24 = (i23 + hashCode9) * 31;
        String str7 = this.headerTitle;
        if (str7 != null) {
            i6 = str7.hashCode();
        }
        return i24 + i6;
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

    public final Boolean isHeader() {
        return this.isHeader;
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

    public final void setHeader(Boolean bool) {
        this.isHeader = bool;
    }

    public final void setHeaderTitle(String str) {
        this.headerTitle = str;
    }

    public final void setId(String str) {
        this.f10853id = str;
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

    public final void setSubText(String str) {
        this.subText = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotV4RecentModel(id=");
        sb2.append(this.f10853id);
        sb2.append(", itemType=");
        sb2.append(this.itemType);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", startDate=");
        sb2.append(this.startDate);
        sb2.append(", lastAccessedDate=");
        sb2.append(this.lastAccessedDate);
        sb2.append(", isFavourite=");
        sb2.append(this.isFavourite);
        sb2.append(", isCompleted=");
        sb2.append(this.isCompleted);
        sb2.append(", parentId=");
        sb2.append(this.parentId);
        sb2.append(", parentType=");
        sb2.append(this.parentType);
        sb2.append(", isFree=");
        sb2.append(this.isFree);
        sb2.append(", subText=");
        sb2.append(this.subText);
        sb2.append(", isHeader=");
        sb2.append(this.isHeader);
        sb2.append(", headerTitle=");
        return g.c(sb2, this.headerTitle, ')');
    }

    public NotV4RecentModel() {
        this(null, null, null, null, null, false, false, null, null, false, null, null, null);
    }
}
