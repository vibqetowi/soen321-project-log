package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import fd.x;
import hc.d;
import java.util.ArrayList;
import java.util.List;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.md  reason: invalid package */
/* loaded from: classes.dex */
public final class md extends a {
    public static final Parcelable.Creator<md> CREATOR = new nd();

    /* renamed from: u  reason: collision with root package name */
    public final String f7983u;

    /* renamed from: v  reason: collision with root package name */
    public final List f7984v;

    /* renamed from: w  reason: collision with root package name */
    public final x f7985w;

    public md(String str, ArrayList arrayList, x xVar) {
        this.f7983u = str;
        this.f7984v = arrayList;
        this.f7985w = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f7983u);
        d.A0(parcel, 2, this.f7984v);
        d.w0(parcel, 3, this.f7985w, i6);
        d.C0(parcel, B0);
    }
}
