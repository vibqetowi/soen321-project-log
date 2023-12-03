package wa;

import android.os.Parcel;
import android.os.Parcelable;
import v9.g0;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class l extends w9.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: u  reason: collision with root package name */
    public final int f36662u;

    /* renamed from: v  reason: collision with root package name */
    public final s9.b f36663v;

    /* renamed from: w  reason: collision with root package name */
    public final g0 f36664w;

    public l(int i6, s9.b bVar, g0 g0Var) {
        this.f36662u = i6;
        this.f36663v = bVar;
        this.f36664w = g0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f36662u);
        hc.d.w0(parcel, 2, this.f36663v, i6);
        hc.d.w0(parcel, 3, this.f36664w, i6);
        hc.d.C0(parcel, B0);
    }
}
