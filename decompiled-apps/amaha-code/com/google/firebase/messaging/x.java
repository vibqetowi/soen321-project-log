package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* compiled from: RemoteMessage.java */
/* loaded from: classes.dex */
public final class x extends w9.a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f9786u;

    /* renamed from: v  reason: collision with root package name */
    public t.b f9787v;

    public x(Bundle bundle) {
        this.f9786u = bundle;
    }

    public final Map<String, String> f0() {
        if (this.f9787v == null) {
            t.b bVar = new t.b();
            Bundle bundle = this.f9786u;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bVar.put(str, str2);
                    }
                }
            }
            this.f9787v = bVar;
        }
        return this.f9787v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.p0(parcel, 2, this.f9786u);
        hc.d.C0(parcel, B0);
    }
}
