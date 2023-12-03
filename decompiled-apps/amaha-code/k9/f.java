package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class f extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new s();

    /* renamed from: u  reason: collision with root package name */
    public final String f23117u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23118v;

    public f(String str, String str2) {
        this.f23117u = str;
        this.f23118v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (v9.m.a(this.f23117u, fVar.f23117u) && v9.m.a(this.f23118v, fVar.f23118v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23117u, this.f23118v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f23117u);
        hc.d.x0(parcel, 2, this.f23118v);
        hc.d.C0(parcel, B0);
    }
}
