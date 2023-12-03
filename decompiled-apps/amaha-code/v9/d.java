package v9;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class d extends w9.a {
    public static final Parcelable.Creator<d> CREATOR = new z0();

    /* renamed from: u  reason: collision with root package name */
    public final q f34871u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f34872v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f34873w;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f34874x;

    /* renamed from: y  reason: collision with root package name */
    public final int f34875y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f34876z;

    public d(q qVar, boolean z10, boolean z11, int[] iArr, int i6, int[] iArr2) {
        this.f34871u = qVar;
        this.f34872v = z10;
        this.f34873w = z11;
        this.f34874x = iArr;
        this.f34875y = i6;
        this.f34876z = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f34871u, i6);
        hc.d.o0(parcel, 2, this.f34872v);
        hc.d.o0(parcel, 3, this.f34873w);
        hc.d.t0(parcel, 4, this.f34874x);
        hc.d.s0(parcel, 5, this.f34875y);
        hc.d.t0(parcel, 6, this.f34876z);
        hc.d.C0(parcel, B0);
    }
}
