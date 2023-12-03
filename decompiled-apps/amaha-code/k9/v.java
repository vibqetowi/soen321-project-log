package k9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class v extends w9.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: u  reason: collision with root package name */
    public final t f23191u;

    /* renamed from: v  reason: collision with root package name */
    public final t f23192v;

    public v(t tVar, t tVar2) {
        this.f23191u = tVar;
        this.f23192v = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (p9.a.e(this.f23191u, vVar.f23191u) && p9.a.e(this.f23192v, vVar.f23192v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23191u, this.f23192v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 2, this.f23191u, i6);
        hc.d.w0(parcel, 3, this.f23192v, i6);
        hc.d.C0(parcel, B0);
    }
}
