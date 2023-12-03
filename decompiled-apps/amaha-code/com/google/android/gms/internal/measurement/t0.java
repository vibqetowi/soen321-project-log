package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class t0 extends w9.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();
    public final Bundle A;
    public final String B;

    /* renamed from: u  reason: collision with root package name */
    public final long f8605u;

    /* renamed from: v  reason: collision with root package name */
    public final long f8606v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f8607w;

    /* renamed from: x  reason: collision with root package name */
    public final String f8608x;

    /* renamed from: y  reason: collision with root package name */
    public final String f8609y;

    /* renamed from: z  reason: collision with root package name */
    public final String f8610z;

    public t0(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8605u = j10;
        this.f8606v = j11;
        this.f8607w = z10;
        this.f8608x = str;
        this.f8609y = str2;
        this.f8610z = str3;
        this.A = bundle;
        this.B = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.u0(parcel, 1, this.f8605u);
        hc.d.u0(parcel, 2, this.f8606v);
        hc.d.o0(parcel, 3, this.f8607w);
        hc.d.x0(parcel, 4, this.f8608x);
        hc.d.x0(parcel, 5, this.f8609y);
        hc.d.x0(parcel, 6, this.f8610z);
        hc.d.p0(parcel, 7, this.A);
        hc.d.x0(parcel, 8, this.B);
        hc.d.C0(parcel, B0);
    }
}
