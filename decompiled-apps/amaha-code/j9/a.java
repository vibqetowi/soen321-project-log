package j9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: u  reason: collision with root package name */
    public final int f21750u;

    /* renamed from: v  reason: collision with root package name */
    public final int f21751v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f21752w;

    public a(int i6, int i10, Bundle bundle) {
        this.f21750u = i6;
        this.f21751v = i10;
        this.f21752w = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f21750u);
        hc.d.s0(parcel, 2, this.f21751v);
        hc.d.p0(parcel, 3, this.f21752w);
        hc.d.C0(parcel, B0);
    }
}
