package m9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class b extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new a0();

    /* renamed from: u  reason: collision with root package name */
    public final int f24945u;

    /* renamed from: v  reason: collision with root package name */
    public final int f24946v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24947w;

    public b(int i6, int i10, int i11) {
        this.f24945u = i6;
        this.f24946v = i10;
        this.f24947w = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 2, this.f24945u);
        hc.d.s0(parcel, 3, this.f24946v);
        hc.d.s0(parcel, 4, this.f24947w);
        hc.d.C0(parcel, B0);
    }
}
