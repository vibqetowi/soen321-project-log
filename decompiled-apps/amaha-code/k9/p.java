package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<p> CREATOR = new t0();

    /* renamed from: u  reason: collision with root package name */
    public final String f23182u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23183v;

    public p(String str, String str2) {
        this.f23182u = str;
        this.f23183v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (p9.a.e(this.f23182u, pVar.f23182u) && p9.a.e(this.f23183v, pVar.f23183v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23182u, this.f23183v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f23182u);
        hc.d.x0(parcel, 3, this.f23183v);
        hc.d.C0(parcel, B0);
    }
}
