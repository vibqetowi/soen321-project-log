package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zc  reason: invalid package */
/* loaded from: classes.dex */
public final class zc extends a {
    public static final Parcelable.Creator<zc> CREATOR = new ad();

    /* renamed from: u  reason: collision with root package name */
    public final j f8294u;

    public zc(j jVar) {
        this.f8294u = jVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.w0(parcel, 1, this.f8294u, i6);
        d.C0(parcel, B0);
    }
}
