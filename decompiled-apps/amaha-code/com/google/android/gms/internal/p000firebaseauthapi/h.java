package com.google.android.gms.internal.p000firebaseauthapi;

import aa.i;
import android.os.Parcel;
import android.os.Parcelable;
import hc.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h  reason: invalid package */
/* loaded from: classes.dex */
public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: u  reason: collision with root package name */
    public final int f7867u;

    /* renamed from: v  reason: collision with root package name */
    public final List f7868v;

    public h(int i6, ArrayList arrayList) {
        this.f7867u = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                arrayList.set(i10, i.a((String) arrayList.get(i10)));
            }
            this.f7868v = Collections.unmodifiableList(arrayList);
            return;
        }
        this.f7868v = Collections.emptyList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.s0(parcel, 1, this.f7867u);
        d.y0(parcel, 2, this.f7868v);
        d.C0(parcel, B0);
    }

    public h() {
        this.f7867u = 1;
        this.f7868v = new ArrayList();
    }
}
