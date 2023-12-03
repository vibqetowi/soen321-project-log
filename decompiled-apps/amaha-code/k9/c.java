package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class c extends w9.a {

    /* renamed from: u  reason: collision with root package name */
    public final long f23090u;

    /* renamed from: v  reason: collision with root package name */
    public final long f23091v;

    /* renamed from: w  reason: collision with root package name */
    public final String f23092w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23093x;

    /* renamed from: y  reason: collision with root package name */
    public final long f23094y;

    /* renamed from: z  reason: collision with root package name */
    public static final p9.b f23089z = new p9.b("AdBreakStatus");
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new n0();

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f23090u = j10;
        this.f23091v = j11;
        this.f23092w = str;
        this.f23093x = str2;
        this.f23094y = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23090u == cVar.f23090u && this.f23091v == cVar.f23091v && p9.a.e(this.f23092w, cVar.f23092w) && p9.a.e(this.f23093x, cVar.f23093x) && this.f23094y == cVar.f23094y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23090u), Long.valueOf(this.f23091v), this.f23092w, this.f23093x, Long.valueOf(this.f23094y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.u0(parcel, 2, this.f23090u);
        hc.d.u0(parcel, 3, this.f23091v);
        hc.d.x0(parcel, 4, this.f23092w);
        hc.d.x0(parcel, 5, this.f23093x);
        hc.d.u0(parcel, 6, this.f23094y);
        hc.d.C0(parcel, B0);
    }
}
