package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
/* compiled from: Month.java */
/* loaded from: classes.dex */
public final class w implements Comparable<w>, Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();
    public String A;

    /* renamed from: u  reason: collision with root package name */
    public final Calendar f9001u;

    /* renamed from: v  reason: collision with root package name */
    public final int f9002v;

    /* renamed from: w  reason: collision with root package name */
    public final int f9003w;

    /* renamed from: x  reason: collision with root package name */
    public final int f9004x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9005y;

    /* renamed from: z  reason: collision with root package name */
    public final long f9006z;

    /* compiled from: Month.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            return w.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i6) {
            return new w[i6];
        }
    }

    public w(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = e0.b(calendar);
        this.f9001u = b10;
        this.f9002v = b10.get(2);
        this.f9003w = b10.get(1);
        this.f9004x = b10.getMaximum(7);
        this.f9005y = b10.getActualMaximum(5);
        this.f9006z = b10.getTimeInMillis();
    }

    public static w d(int i6, int i10) {
        Calendar d10 = e0.d(null);
        d10.set(1, i6);
        d10.set(2, i10);
        return new w(d10);
    }

    public static w f(long j10) {
        Calendar d10 = e0.d(null);
        d10.setTimeInMillis(j10);
        return new w(d10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(w wVar) {
        return this.f9001u.compareTo(wVar.f9001u);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f9002v == wVar.f9002v && this.f9003w == wVar.f9003w) {
            return true;
        }
        return false;
    }

    public final String h() {
        if (this.A == null) {
            this.A = DateUtils.formatDateTime(null, this.f9001u.getTimeInMillis(), 8228);
        }
        return this.A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9002v), Integer.valueOf(this.f9003w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f9003w);
        parcel.writeInt(this.f9002v);
    }
}
