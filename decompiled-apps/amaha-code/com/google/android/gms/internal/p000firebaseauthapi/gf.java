package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gf  reason: invalid package */
/* loaded from: classes.dex */
public final class gf extends a {
    public static final Parcelable.Creator<gf> CREATOR = new hf();

    /* renamed from: u  reason: collision with root package name */
    public final List f7866u;

    public gf() {
        this.f7866u = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.A0(parcel, 2, this.f7866u);
        d.C0(parcel, B0);
    }

    public gf(ArrayList arrayList) {
        List unmodifiableList;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f7866u = unmodifiableList;
    }
}
