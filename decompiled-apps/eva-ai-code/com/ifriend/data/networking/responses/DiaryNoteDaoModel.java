package com.ifriend.data.networking.responses;

import com.google.gson.annotations.SerializedName;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryNoteDaoModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010'\u001a\u00020\fJ\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000f¨\u0006+"}, d2 = {"Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "", "id", "", "title", "descriptionShort", "description", "isAvailable", "", "isAnswered", "isFree", AnalyticsConstants.TIMESTAMP, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJ)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDescriptionShort", "setDescriptionShort", "getId", "setId", "()Z", "setFree", "(Z)V", "getTimestamp", "()J", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "getDatetimeInMillis", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryNoteDaoModel {
    @SerializedName("description")
    private String description;
    @SerializedName("shortDescription")
    private String descriptionShort;
    @SerializedName("id")
    private String id;
    @SerializedName("isAnswered")
    private final boolean isAnswered;
    @SerializedName("isAvailable")
    private final boolean isAvailable;
    @SerializedName("isFree")
    private boolean isFree;
    @SerializedName(AnalyticsConstants.TIMESTAMP)
    private final long timestamp;
    @SerializedName("title")
    private final String title;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.descriptionShort;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isAvailable;
    }

    public final boolean component6() {
        return this.isAnswered;
    }

    public final boolean component7() {
        return this.isFree;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final DiaryNoteDaoModel copy(String id, String title, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DiaryNoteDaoModel(id, title, str, str2, z, z2, z3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiaryNoteDaoModel) {
            DiaryNoteDaoModel diaryNoteDaoModel = (DiaryNoteDaoModel) obj;
            return Intrinsics.areEqual(this.id, diaryNoteDaoModel.id) && Intrinsics.areEqual(this.title, diaryNoteDaoModel.title) && Intrinsics.areEqual(this.descriptionShort, diaryNoteDaoModel.descriptionShort) && Intrinsics.areEqual(this.description, diaryNoteDaoModel.description) && this.isAvailable == diaryNoteDaoModel.isAvailable && this.isAnswered == diaryNoteDaoModel.isAnswered && this.isFree == diaryNoteDaoModel.isFree && this.timestamp == diaryNoteDaoModel.timestamp;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.descriptionShort;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isAvailable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.isAnswered;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isFree;
        return ((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.descriptionShort;
        String str4 = this.description;
        boolean z = this.isAvailable;
        boolean z2 = this.isAnswered;
        boolean z3 = this.isFree;
        long j = this.timestamp;
        return "DiaryNoteDaoModel(id=" + str + ", title=" + str2 + ", descriptionShort=" + str3 + ", description=" + str4 + ", isAvailable=" + z + ", isAnswered=" + z2 + ", isFree=" + z3 + ", timestamp=" + j + ")";
    }

    public DiaryNoteDaoModel(String id, String title, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id;
        this.title = title;
        this.descriptionShort = str;
        this.description = str2;
        this.isAvailable = z;
        this.isAnswered = z2;
        this.isFree = z3;
        this.timestamp = j;
    }

    public /* synthetic */ DiaryNoteDaoModel(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, z2, (i & 64) != 0 ? false : z3, j);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescriptionShort() {
        return this.descriptionShort;
    }

    public final void setDescriptionShort(String str) {
        this.descriptionShort = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isAnswered() {
        return this.isAnswered;
    }

    public final boolean isFree() {
        return this.isFree;
    }

    public final void setFree(boolean z) {
        this.isFree = z;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getDatetimeInMillis() {
        return this.timestamp;
    }
}
