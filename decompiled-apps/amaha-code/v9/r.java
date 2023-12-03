package v9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class r extends w9.a {
    public static final Parcelable.Creator<r> CREATOR = new t();

    /* renamed from: u  reason: collision with root package name */
    public final int f34938u;

    /* renamed from: v  reason: collision with root package name */
    public List<l> f34939v;

    public r(int i6, List<l> list) {
        this.f34938u = i6;
        this.f34939v = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f34938u);
        hc.d.A0(parcel, 2, this.f34939v);
        hc.d.C0(parcel, B0);
    }
}
