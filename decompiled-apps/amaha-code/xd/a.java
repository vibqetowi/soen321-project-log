package xd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: DynamicLinkData.java */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: u  reason: collision with root package name */
    public final String f37731u;

    /* renamed from: v  reason: collision with root package name */
    public final String f37732v;

    /* renamed from: w  reason: collision with root package name */
    public final int f37733w;

    /* renamed from: x  reason: collision with root package name */
    public long f37734x;

    /* renamed from: y  reason: collision with root package name */
    public final Bundle f37735y;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f37736z;

    public a(String str, String str2, int i6, long j10, Bundle bundle, Uri uri) {
        this.f37735y = null;
        this.f37731u = str;
        this.f37732v = str2;
        this.f37733w = i6;
        this.f37734x = j10;
        this.f37735y = bundle;
        this.f37736z = uri;
    }

    public final Bundle f0() {
        Bundle bundle = this.f37735y;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f37731u);
        hc.d.x0(parcel, 2, this.f37732v);
        hc.d.s0(parcel, 3, this.f37733w);
        hc.d.u0(parcel, 4, this.f37734x);
        hc.d.p0(parcel, 5, f0());
        hc.d.w0(parcel, 6, this.f37736z, i6);
        hc.d.C0(parcel, B0);
    }
}
