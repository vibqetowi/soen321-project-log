package com.theinnerhour.b2b.components.recommendedActivities.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import fe.p;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: RecommendedActivityHintIconModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityHintListModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "content", "index", "label", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhs/k;", "writeToParcel", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getIndex", "setIndex", "getLabel", "setLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivityHintListModel implements Parcelable {
    public static final Parcelable.Creator<RecommendedActivityHintListModel> CREATOR = new Creator();
    private String content;
    private String index;
    private String label;

    /* compiled from: RecommendedActivityHintIconModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<RecommendedActivityHintListModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityHintListModel createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            return new RecommendedActivityHintListModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityHintListModel[] newArray(int i6) {
            return new RecommendedActivityHintListModel[i6];
        }
    }

    public RecommendedActivityHintListModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RecommendedActivityHintListModel copy$default(RecommendedActivityHintListModel recommendedActivityHintListModel, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = recommendedActivityHintListModel.content;
        }
        if ((i6 & 2) != 0) {
            str2 = recommendedActivityHintListModel.index;
        }
        if ((i6 & 4) != 0) {
            str3 = recommendedActivityHintListModel.label;
        }
        return recommendedActivityHintListModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.content;
    }

    public final String component2() {
        return this.index;
    }

    public final String component3() {
        return this.label;
    }

    public final RecommendedActivityHintListModel copy(String content, String index, String label) {
        i.g(content, "content");
        i.g(index, "index");
        i.g(label, "label");
        return new RecommendedActivityHintListModel(content, index, label);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedActivityHintListModel)) {
            return false;
        }
        RecommendedActivityHintListModel recommendedActivityHintListModel = (RecommendedActivityHintListModel) obj;
        if (i.b(this.content, recommendedActivityHintListModel.content) && i.b(this.index, recommendedActivityHintListModel.index) && i.b(this.label, recommendedActivityHintListModel.label)) {
            return true;
        }
        return false;
    }

    @p("list_key")
    public final String getContent() {
        return this.content;
    }

    @p("list_index")
    public final String getIndex() {
        return this.index;
    }

    @p("list_label")
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + a.c(this.index, this.content.hashCode() * 31, 31);
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

    @p("list_label")
    public final void setLabel(String str) {
        i.g(str, "<set-?>");
        this.label = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendedActivityHintListModel(content=");
        sb2.append(this.content);
        sb2.append(", index=");
        sb2.append(this.index);
        sb2.append(", label=");
        return g.c(sb2, this.label, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i6) {
        i.g(out, "out");
        out.writeString(this.content);
        out.writeString(this.index);
        out.writeString(this.label);
    }

    public RecommendedActivityHintListModel(String str, String str2, String str3) {
        e.u(str, "content", str2, "index", str3, "label");
        this.content = str;
        this.index = str2;
        this.label = str3;
    }

    public /* synthetic */ RecommendedActivityHintListModel(String str, String str2, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3);
    }
}
