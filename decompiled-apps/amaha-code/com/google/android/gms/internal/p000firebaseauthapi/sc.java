package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sc  reason: invalid package */
/* loaded from: classes.dex */
public final class sc extends a {
    public static final Parcelable.Creator<sc> CREATOR = new tc();

    /* renamed from: u  reason: collision with root package name */
    public final String f8133u;

    /* renamed from: v  reason: collision with root package name */
    public final String f8134v;

    /* renamed from: w  reason: collision with root package name */
    public final String f8135w;

    public sc(String str, String str2, String str3) {
        this.f8133u = str;
        this.f8134v = str2;
        this.f8135w = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f8133u);
        d.x0(parcel, 2, this.f8134v);
        d.x0(parcel, 3, this.f8135w);
        d.C0(parcel, B0);
    }
}
