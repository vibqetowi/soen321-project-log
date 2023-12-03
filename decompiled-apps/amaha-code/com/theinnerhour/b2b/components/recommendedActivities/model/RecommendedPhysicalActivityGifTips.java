package com.theinnerhour.b2b.components.recommendedActivities.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import fe.p;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: RecommendedPhysicalActivityGifTips.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedPhysicalActivityGifTips;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhs/k;", "writeToParcel", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedPhysicalActivityGifTips implements Parcelable {
    public static final Parcelable.Creator<RecommendedPhysicalActivityGifTips> CREATOR = new Creator();
    private String content;
    private String index;

    /* compiled from: RecommendedPhysicalActivityGifTips.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<RecommendedPhysicalActivityGifTips> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedPhysicalActivityGifTips createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            return new RecommendedPhysicalActivityGifTips(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedPhysicalActivityGifTips[] newArray(int i6) {
            return new RecommendedPhysicalActivityGifTips[i6];
        }
    }

    public RecommendedPhysicalActivityGifTips() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @p("list_key")
    public final String getContent() {
        return this.content;
    }

    @p("list_index")
    public final String getIndex() {
        return this.index;
    }

    @p("list_key")
    public final void setContent(String str) {
        i.g(str, "<set-?>");
        this.content = str;
    }

    @p("list_index")
    public final void setIndex(String str) {
        i.g(str, "<set-?>");
        this.index = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i6) {
        i.g(out, "out");
        out.writeString(this.content);
        out.writeString(this.index);
    }

    public RecommendedPhysicalActivityGifTips(String content, String index) {
        i.g(content, "content");
        i.g(index, "index");
        this.content = content;
        this.index = index;
    }

    public /* synthetic */ RecommendedPhysicalActivityGifTips(String str, String str2, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2);
    }
}
