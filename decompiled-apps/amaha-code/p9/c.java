package p9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class c extends w9.a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: u  reason: collision with root package name */
    public final String f28038u;

    public c() {
        this.f28038u = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.e(this.f28038u, ((c) obj).f28038u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28038u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f28038u);
        hc.d.C0(parcel, B0);
    }

    public c(String str) {
        this.f28038u = str;
    }
}
