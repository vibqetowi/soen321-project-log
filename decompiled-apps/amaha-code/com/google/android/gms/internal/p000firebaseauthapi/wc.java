package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import fd.m;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wc  reason: invalid package */
/* loaded from: classes.dex */
public final class wc extends a {
    public static final Parcelable.Creator<wc> CREATOR = new xc();

    /* renamed from: u  reason: collision with root package name */
    public final String f8229u;

    /* renamed from: v  reason: collision with root package name */
    public final m f8230v;

    public wc(m mVar, String str) {
        this.f8229u = str;
        this.f8230v = mVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f8229u);
        d.w0(parcel, 2, this.f8230v, i6);
        d.C0(parcel, B0);
    }
}
