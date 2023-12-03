package com.theinnerhour.b2b.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: CourseDayDomainModelV1.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lcom/theinnerhour/b2b/model/CourseDayDomainModelV1;", "Landroid/os/Parcelable;", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "component1", "", "component2", "component3", "dayModelV1", "courseName", "duration", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhs/k;", "writeToParcel", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "getDayModelV1", "()Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "setDayModelV1", "(Lcom/theinnerhour/b2b/model/CourseDayModelV1;)V", "Ljava/lang/String;", "getCourseName", "()Ljava/lang/String;", "setCourseName", "(Ljava/lang/String;)V", "getDuration", "setDuration", "<init>", "(Lcom/theinnerhour/b2b/model/CourseDayModelV1;Ljava/lang/String;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseDayDomainModelV1 implements Parcelable {
    public static final Parcelable.Creator<CourseDayDomainModelV1> CREATOR = new Creator();
    private String courseName;
    private CourseDayModelV1 dayModelV1;
    private String duration;

    /* compiled from: CourseDayDomainModelV1.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CourseDayDomainModelV1> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseDayDomainModelV1 createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            return new CourseDayDomainModelV1((CourseDayModelV1) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseDayDomainModelV1[] newArray(int i6) {
            return new CourseDayDomainModelV1[i6];
        }
    }

    public CourseDayDomainModelV1(CourseDayModelV1 dayModelV1, String courseName, String duration) {
        i.g(dayModelV1, "dayModelV1");
        i.g(courseName, "courseName");
        i.g(duration, "duration");
        this.dayModelV1 = dayModelV1;
        this.courseName = courseName;
        this.duration = duration;
    }

    public static /* synthetic */ CourseDayDomainModelV1 copy$default(CourseDayDomainModelV1 courseDayDomainModelV1, CourseDayModelV1 courseDayModelV1, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            courseDayModelV1 = courseDayDomainModelV1.dayModelV1;
        }
        if ((i6 & 2) != 0) {
            str = courseDayDomainModelV1.courseName;
        }
        if ((i6 & 4) != 0) {
            str2 = courseDayDomainModelV1.duration;
        }
        return courseDayDomainModelV1.copy(courseDayModelV1, str, str2);
    }

    public final CourseDayModelV1 component1() {
        return this.dayModelV1;
    }

    public final String component2() {
        return this.courseName;
    }

    public final String component3() {
        return this.duration;
    }

    public final CourseDayDomainModelV1 copy(CourseDayModelV1 dayModelV1, String courseName, String duration) {
        i.g(dayModelV1, "dayModelV1");
        i.g(courseName, "courseName");
        i.g(duration, "duration");
        return new CourseDayDomainModelV1(dayModelV1, courseName, duration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseDayDomainModelV1)) {
            return false;
        }
        CourseDayDomainModelV1 courseDayDomainModelV1 = (CourseDayDomainModelV1) obj;
        if (i.b(this.dayModelV1, courseDayDomainModelV1.dayModelV1) && i.b(this.courseName, courseDayDomainModelV1.courseName) && i.b(this.duration, courseDayDomainModelV1.duration)) {
            return true;
        }
        return false;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final CourseDayModelV1 getDayModelV1() {
        return this.dayModelV1;
    }

    public final String getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return this.duration.hashCode() + a.c(this.courseName, this.dayModelV1.hashCode() * 31, 31);
    }

    public final void setCourseName(String str) {
        i.g(str, "<set-?>");
        this.courseName = str;
    }

    public final void setDayModelV1(CourseDayModelV1 courseDayModelV1) {
        i.g(courseDayModelV1, "<set-?>");
        this.dayModelV1 = courseDayModelV1;
    }

    public final void setDuration(String str) {
        i.g(str, "<set-?>");
        this.duration = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CourseDayDomainModelV1(dayModelV1=");
        sb2.append(this.dayModelV1);
        sb2.append(", courseName=");
        sb2.append(this.courseName);
        sb2.append(", duration=");
        return g.c(sb2, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i6) {
        i.g(out, "out");
        out.writeSerializable(this.dayModelV1);
        out.writeString(this.courseName);
        out.writeString(this.duration);
    }

    public /* synthetic */ CourseDayDomainModelV1(CourseDayModelV1 courseDayModelV1, String str, String str2, int i6, d dVar) {
        this(courseDayModelV1, str, (i6 & 4) != 0 ? "" : str2);
    }
}
