package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class b extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new a0();
    public final boolean A;

    /* renamed from: u  reason: collision with root package name */
    public final long f23083u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23084v;

    /* renamed from: w  reason: collision with root package name */
    public final long f23085w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f23086x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f23087y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23088z;

    public b(long j10, @RecentlyNonNull String str, long j11, boolean z10, @RecentlyNonNull String[] strArr, boolean z11, boolean z12) {
        this.f23083u = j10;
        this.f23084v = str;
        this.f23085w = j11;
        this.f23086x = z10;
        this.f23087y = strArr;
        this.f23088z = z11;
        this.A = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (p9.a.e(this.f23084v, bVar.f23084v) && this.f23083u == bVar.f23083u && this.f23085w == bVar.f23085w && this.f23086x == bVar.f23086x && Arrays.equals(this.f23087y, bVar.f23087y) && this.f23088z == bVar.f23088z && this.A == bVar.A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23084v.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.u0(parcel, 2, this.f23083u);
        hc.d.x0(parcel, 3, this.f23084v);
        hc.d.u0(parcel, 4, this.f23085w);
        hc.d.o0(parcel, 5, this.f23086x);
        String[] strArr = this.f23087y;
        if (strArr != null) {
            int B02 = hc.d.B0(parcel, 6);
            parcel.writeStringArray(strArr);
            hc.d.C0(parcel, B02);
        }
        hc.d.o0(parcel, 7, this.f23088z);
        hc.d.o0(parcel, 8, this.A);
        hc.d.C0(parcel, B0);
    }
}
