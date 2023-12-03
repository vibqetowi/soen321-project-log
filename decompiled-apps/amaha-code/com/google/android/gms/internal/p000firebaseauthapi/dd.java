package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dd  reason: invalid package */
/* loaded from: classes.dex */
public final class dd extends a {
    public static final Parcelable.Creator<dd> CREATOR = new ed();

    /* renamed from: u  reason: collision with root package name */
    public final String f7786u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7787v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7788w;

    public dd(String str, String str2, String str3) {
        this.f7786u = str;
        this.f7787v = str2;
        this.f7788w = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f7786u);
        d.x0(parcel, 2, this.f7787v);
        d.x0(parcel, 3, this.f7788w);
        d.C0(parcel, B0);
    }
}
