package v9;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class l extends w9.a {
    public static final Parcelable.Creator<l> CREATOR = new c0();
    public final String A;
    public final int B;
    public final int C;

    /* renamed from: u  reason: collision with root package name */
    public final int f34917u;

    /* renamed from: v  reason: collision with root package name */
    public final int f34918v;

    /* renamed from: w  reason: collision with root package name */
    public final int f34919w;

    /* renamed from: x  reason: collision with root package name */
    public final long f34920x;

    /* renamed from: y  reason: collision with root package name */
    public final long f34921y;

    /* renamed from: z  reason: collision with root package name */
    public final String f34922z;

    public l(int i6, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f34917u = i6;
        this.f34918v = i10;
        this.f34919w = i11;
        this.f34920x = j10;
        this.f34921y = j11;
        this.f34922z = str;
        this.A = str2;
        this.B = i12;
        this.C = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f34917u);
        hc.d.s0(parcel, 2, this.f34918v);
        hc.d.s0(parcel, 3, this.f34919w);
        hc.d.u0(parcel, 4, this.f34920x);
        hc.d.u0(parcel, 5, this.f34921y);
        hc.d.x0(parcel, 6, this.f34922z);
        hc.d.x0(parcel, 7, this.A);
        hc.d.s0(parcel, 8, this.B);
        hc.d.s0(parcel, 9, this.C);
        hc.d.C0(parcel, B0);
    }
}
