package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bd  reason: invalid package */
/* loaded from: classes.dex */
public final class bd extends a {
    public static final Parcelable.Creator<bd> CREATOR = new cd();

    /* renamed from: u  reason: collision with root package name */
    public final String f7731u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7732v;

    public bd(String str, String str2) {
        this.f7731u = str;
        this.f7732v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f7731u);
        d.x0(parcel, 2, this.f7732v);
        d.C0(parcel, B0);
    }
}
