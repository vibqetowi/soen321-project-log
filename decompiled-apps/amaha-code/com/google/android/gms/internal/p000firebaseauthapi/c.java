package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c  reason: invalid package */
/* loaded from: classes.dex */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();
    public final String A;

    /* renamed from: u  reason: collision with root package name */
    public final String f7740u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7741v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7742w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7743x;

    /* renamed from: y  reason: collision with root package name */
    public String f7744y;

    /* renamed from: z  reason: collision with root package name */
    public final String f7745z;

    public c() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7740u);
        d.x0(parcel, 3, this.f7741v);
        d.x0(parcel, 4, this.f7742w);
        d.x0(parcel, 5, this.f7743x);
        d.x0(parcel, 6, this.f7744y);
        d.x0(parcel, 7, this.f7745z);
        d.x0(parcel, 8, this.A);
        d.C0(parcel, B0);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7740u = str;
        this.f7741v = str2;
        this.f7742w = str3;
        this.f7743x = str4;
        this.f7744y = str5;
        this.f7745z = str6;
        this.A = str7;
    }
}
