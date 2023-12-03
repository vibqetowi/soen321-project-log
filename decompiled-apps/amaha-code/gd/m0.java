package gd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class m0 implements w9.b {
    public static final Parcelable.Creator<m0> CREATOR = new c();

    /* renamed from: u  reason: collision with root package name */
    public final long f16436u;

    /* renamed from: v  reason: collision with root package name */
    public final long f16437v;

    public m0(long j10, long j11) {
        this.f16436u = j10;
        this.f16437v = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.u0(parcel, 1, this.f16436u);
        hc.d.u0(parcel, 2, this.f16437v);
        hc.d.C0(parcel, B0);
    }
}
