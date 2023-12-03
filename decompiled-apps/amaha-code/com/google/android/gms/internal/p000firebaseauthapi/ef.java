package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import fd.x;
import hc.d;
import java.util.ArrayList;
import java.util.List;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ef  reason: invalid package */
/* loaded from: classes.dex */
public final class ef extends a {
    public static final Parcelable.Creator<ef> CREATOR = new ff();
    public String A;
    public final String B;
    public final long C;
    public final long D;
    public boolean E;
    public x F;
    public final List G;

    /* renamed from: u  reason: collision with root package name */
    public final String f7826u;

    /* renamed from: v  reason: collision with root package name */
    public String f7827v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f7828w;

    /* renamed from: x  reason: collision with root package name */
    public String f7829x;

    /* renamed from: y  reason: collision with root package name */
    public String f7830y;

    /* renamed from: z  reason: collision with root package name */
    public e f7831z;

    public ef() {
        this.f7831z = new e();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7826u);
        d.x0(parcel, 3, this.f7827v);
        d.o0(parcel, 4, this.f7828w);
        d.x0(parcel, 5, this.f7829x);
        d.x0(parcel, 6, this.f7830y);
        d.w0(parcel, 7, this.f7831z, i6);
        d.x0(parcel, 8, this.A);
        d.x0(parcel, 9, this.B);
        d.u0(parcel, 10, this.C);
        d.u0(parcel, 11, this.D);
        d.o0(parcel, 12, this.E);
        d.w0(parcel, 13, this.F, i6);
        d.A0(parcel, 14, this.G);
        d.C0(parcel, B0);
    }

    public ef(String str, String str2, boolean z10, String str3, String str4, e eVar, String str5, String str6, long j10, long j11, boolean z11, x xVar, ArrayList arrayList) {
        e eVar2;
        this.f7826u = str;
        this.f7827v = str2;
        this.f7828w = z10;
        this.f7829x = str3;
        this.f7830y = str4;
        if (eVar == null) {
            eVar2 = new e();
        } else {
            eVar2 = new e();
            List list = eVar.f7795u;
            if (list != null) {
                eVar2.f7795u.addAll(list);
            }
        }
        this.f7831z = eVar2;
        this.A = str5;
        this.B = str6;
        this.C = j10;
        this.D = j11;
        this.E = z11;
        this.F = xVar;
        this.G = arrayList == null ? new ArrayList() : arrayList;
    }
}
