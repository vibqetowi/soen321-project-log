package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class q extends w9.a {

    /* renamed from: u  reason: collision with root package name */
    public final int f23185u;

    /* renamed from: v  reason: collision with root package name */
    public final int f23186v;

    /* renamed from: w  reason: collision with root package name */
    public final int f23187w;

    /* renamed from: x  reason: collision with root package name */
    public static final p9.b f23184x = new p9.b("VideoInfo");
    @RecentlyNonNull
    public static final Parcelable.Creator<q> CREATOR = new u0();

    public q(int i6, int i10, int i11) {
        this.f23185u = i6;
        this.f23186v = i10;
        this.f23187w = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f23186v == qVar.f23186v && this.f23185u == qVar.f23185u && this.f23187w == qVar.f23187w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23186v), Integer.valueOf(this.f23185u), Integer.valueOf(this.f23187w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 2, this.f23185u);
        hc.d.s0(parcel, 3, this.f23186v);
        hc.d.s0(parcel, 4, this.f23187w);
        hc.d.C0(parcel, B0);
    }
}
