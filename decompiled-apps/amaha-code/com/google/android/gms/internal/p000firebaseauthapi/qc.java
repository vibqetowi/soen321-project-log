package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qc  reason: invalid package */
/* loaded from: classes.dex */
public final class qc extends a {
    public static final Parcelable.Creator<qc> CREATOR = new rc();

    /* renamed from: u  reason: collision with root package name */
    public final String f8086u;

    public qc(String str) {
        this.f8086u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f8086u);
        d.C0(parcel, B0);
    }
}
