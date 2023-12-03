package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import fd.m;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hd  reason: invalid package */
/* loaded from: classes.dex */
public final class hd extends a {
    public static final Parcelable.Creator<hd> CREATOR = new id();

    /* renamed from: u  reason: collision with root package name */
    public final m f7879u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7880v;

    public hd(m mVar, String str) {
        this.f7879u = mVar;
        this.f7880v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.w0(parcel, 1, this.f7879u, i6);
        d.x0(parcel, 2, this.f7880v);
        d.C0(parcel, B0);
    }
}
