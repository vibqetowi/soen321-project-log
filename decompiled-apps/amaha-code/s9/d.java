package s9;

import android.os.Parcel;
import android.os.Parcelable;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Arrays;
import v9.m;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class d extends w9.a {
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: u  reason: collision with root package name */
    public final String f31333u;
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public final int f31334v;

    /* renamed from: w  reason: collision with root package name */
    public final long f31335w;

    public d(String str) {
        this.f31333u = str;
        this.f31335w = 1L;
        this.f31334v = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f31333u;
            if (((str != null && str.equals(dVar.f31333u)) || (str == null && dVar.f31333u == null)) && f0() == dVar.f0()) {
                return true;
            }
        }
        return false;
    }

    public final long f0() {
        long j10 = this.f31335w;
        if (j10 == -1) {
            return this.f31334v;
        }
        return j10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31333u, Long.valueOf(f0())});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f31333u, SessionManager.KEY_NAME);
        aVar.a(Long.valueOf(f0()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f31333u);
        hc.d.s0(parcel, 2, this.f31334v);
        hc.d.u0(parcel, 3, f0());
        hc.d.C0(parcel, B0);
    }

    public d(String str, long j10, int i6) {
        this.f31333u = str;
        this.f31334v = i6;
        this.f31335w = j10;
    }
}
