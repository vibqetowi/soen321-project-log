package v9;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class q extends w9.a {
    public static final Parcelable.Creator<q> CREATOR = new p0();

    /* renamed from: u  reason: collision with root package name */
    public final int f34932u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f34933v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f34934w;

    /* renamed from: x  reason: collision with root package name */
    public final int f34935x;

    /* renamed from: y  reason: collision with root package name */
    public final int f34936y;

    public q(int i6, boolean z10, boolean z11, int i10, int i11) {
        this.f34932u = i6;
        this.f34933v = z10;
        this.f34934w = z11;
        this.f34935x = i10;
        this.f34936y = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f34932u);
        hc.d.o0(parcel, 2, this.f34933v);
        hc.d.o0(parcel, 3, this.f34934w);
        hc.d.s0(parcel, 4, this.f34935x);
        hc.d.s0(parcel, 5, this.f34936y);
        hc.d.C0(parcel, B0);
    }
}
