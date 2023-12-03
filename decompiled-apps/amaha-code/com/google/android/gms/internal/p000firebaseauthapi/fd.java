package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import fd.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fd  reason: invalid package */
/* loaded from: classes.dex */
public final class fd extends a {
    public static final Parcelable.Creator<fd> CREATOR = new gd();

    /* renamed from: u  reason: collision with root package name */
    public final d f7853u;

    public fd(d dVar) {
        this.f7853u = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f7853u, i6);
        hc.d.C0(parcel, B0);
    }
}
