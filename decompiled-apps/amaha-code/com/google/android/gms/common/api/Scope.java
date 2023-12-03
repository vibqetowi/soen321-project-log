package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import t9.f;
import v9.o;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class Scope extends w9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new f();

    /* renamed from: u  reason: collision with root package name */
    public final int f7294u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7295v;

    public Scope() {
        throw null;
    }

    public Scope(int i6, String str) {
        o.f("scopeUri must not be null or empty", str);
        this.f7294u = i6;
        this.f7295v = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f7295v.equals(((Scope) obj).f7295v);
    }

    public final int hashCode() {
        return this.f7295v.hashCode();
    }

    public final String toString() {
        return this.f7295v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.s0(parcel, 1, this.f7294u);
        d.x0(parcel, 2, this.f7295v);
        d.C0(parcel, B0);
    }
}
