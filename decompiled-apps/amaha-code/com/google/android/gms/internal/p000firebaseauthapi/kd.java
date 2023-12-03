package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import fd.x;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kd  reason: invalid package */
/* loaded from: classes.dex */
public final class kd extends a {
    public static final Parcelable.Creator<kd> CREATOR = new ld();

    /* renamed from: u  reason: collision with root package name */
    public final Status f7947u;

    /* renamed from: v  reason: collision with root package name */
    public final x f7948v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7949w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7950x;

    public kd(Status status, x xVar, String str, String str2) {
        this.f7947u = status;
        this.f7948v = xVar;
        this.f7949w = str;
        this.f7950x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.w0(parcel, 1, this.f7947u, i6);
        d.w0(parcel, 2, this.f7948v, i6);
        d.x0(parcel, 3, this.f7949w);
        d.x0(parcel, 4, this.f7950x);
        d.C0(parcel, B0);
    }
}
