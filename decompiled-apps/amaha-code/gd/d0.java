package gd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class d0 implements w9.b {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: u  reason: collision with root package name */
    public final String f16401u;

    /* renamed from: v  reason: collision with root package name */
    public final String f16402v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f16403w;

    public d0(boolean z10) {
        this.f16403w = z10;
        this.f16402v = null;
        this.f16401u = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f16401u);
        hc.d.x0(parcel, 2, this.f16402v);
        hc.d.o0(parcel, 3, this.f16403w);
        hc.d.C0(parcel, B0);
    }

    public d0(String str, String str2, boolean z10) {
        v9.o.e(str);
        v9.o.e(str2);
        this.f16401u = str;
        this.f16402v = str2;
        p.c(str2);
        this.f16403w = z10;
    }
}
