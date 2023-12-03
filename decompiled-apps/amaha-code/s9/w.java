package s9;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class w extends w9.a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: u  reason: collision with root package name */
    public final boolean f31371u;

    /* renamed from: v  reason: collision with root package name */
    public final String f31372v;

    /* renamed from: w  reason: collision with root package name */
    public final int f31373w;

    /* renamed from: x  reason: collision with root package name */
    public final int f31374x;

    public w(int i6, int i10, String str, boolean z10) {
        this.f31371u = z10;
        this.f31372v = str;
        this.f31373w = sc.b.o0(i6) - 1;
        this.f31374x = sc.b.m0(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.o0(parcel, 1, this.f31371u);
        hc.d.x0(parcel, 2, this.f31372v);
        hc.d.s0(parcel, 3, this.f31373w);
        hc.d.s0(parcel, 4, this.f31374x);
        hc.d.C0(parcel, B0);
    }
}
