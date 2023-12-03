package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* compiled from: CalendarConstraints.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0147a();
    public final int A;

    /* renamed from: u  reason: collision with root package name */
    public final w f8923u;

    /* renamed from: v  reason: collision with root package name */
    public final w f8924v;

    /* renamed from: w  reason: collision with root package name */
    public final c f8925w;

    /* renamed from: x  reason: collision with root package name */
    public final w f8926x;

    /* renamed from: y  reason: collision with root package name */
    public final int f8927y;

    /* renamed from: z  reason: collision with root package name */
    public final int f8928z;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0147a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((w) parcel.readParcelable(w.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final long f = e0.a(w.d(1900, 0).f9006z);

        /* renamed from: g  reason: collision with root package name */
        public static final long f8929g = e0.a(w.d(2100, 11).f9006z);

        /* renamed from: a  reason: collision with root package name */
        public final long f8930a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8931b;

        /* renamed from: c  reason: collision with root package name */
        public Long f8932c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8933d;

        /* renamed from: e  reason: collision with root package name */
        public final c f8934e;

        public b(a aVar) {
            this.f8930a = f;
            this.f8931b = f8929g;
            this.f8934e = new e(Long.MIN_VALUE);
            this.f8930a = aVar.f8923u.f9006z;
            this.f8931b = aVar.f8924v.f9006z;
            this.f8932c = Long.valueOf(aVar.f8926x.f9006z);
            this.f8933d = aVar.f8927y;
            this.f8934e = aVar.f8925w;
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean Q(long j10);
    }

    public a(w wVar, w wVar2, c cVar, w wVar3, int i6) {
        Objects.requireNonNull(wVar, "start cannot be null");
        Objects.requireNonNull(wVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f8923u = wVar;
        this.f8924v = wVar2;
        this.f8926x = wVar3;
        this.f8927y = i6;
        this.f8925w = cVar;
        Calendar calendar = wVar.f9001u;
        if (wVar3 != null && calendar.compareTo(wVar3.f9001u) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (wVar3 != null && wVar3.f9001u.compareTo(wVar2.f9001u) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 >= 0 && i6 <= e0.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i10 = wVar2.f9003w;
                int i11 = wVar.f9003w;
                this.A = (wVar2.f9002v - wVar.f9002v) + ((i10 - i11) * 12) + 1;
                this.f8928z = (i10 - i11) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f8923u.equals(aVar.f8923u) && this.f8924v.equals(aVar.f8924v) && s0.b.a(this.f8926x, aVar.f8926x) && this.f8927y == aVar.f8927y && this.f8925w.equals(aVar.f8925w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8923u, this.f8924v, this.f8926x, Integer.valueOf(this.f8927y), this.f8925w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f8923u, 0);
        parcel.writeParcelable(this.f8924v, 0);
        parcel.writeParcelable(this.f8926x, 0);
        parcel.writeParcelable(this.f8925w, 0);
        parcel.writeInt(this.f8927y);
    }
}
