package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uc  reason: invalid package */
/* loaded from: classes.dex */
public final class uc extends a {
    public static final Parcelable.Creator<uc> CREATOR = new vc();

    /* renamed from: u  reason: collision with root package name */
    public final String f8183u;

    /* renamed from: v  reason: collision with root package name */
    public final j f8184v;

    public uc(String str, j jVar) {
        this.f8183u = str;
        this.f8184v = jVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f8183u);
        d.w0(parcel, 2, this.f8184v, i6);
        d.C0(parcel, B0);
    }
}
