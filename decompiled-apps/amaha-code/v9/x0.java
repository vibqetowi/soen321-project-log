package v9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class x0 extends w9.a {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f34959u;

    /* renamed from: v  reason: collision with root package name */
    public final s9.d[] f34960v;

    /* renamed from: w  reason: collision with root package name */
    public final int f34961w;

    /* renamed from: x  reason: collision with root package name */
    public final d f34962x;

    public x0(Bundle bundle, s9.d[] dVarArr, int i6, d dVar) {
        this.f34959u = bundle;
        this.f34960v = dVarArr;
        this.f34961w = i6;
        this.f34962x = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.p0(parcel, 1, this.f34959u);
        hc.d.z0(parcel, 2, this.f34960v, i6);
        hc.d.s0(parcel, 3, this.f34961w);
        hc.d.w0(parcel, 4, this.f34962x, i6);
        hc.d.C0(parcel, B0);
    }

    public x0() {
    }
}
