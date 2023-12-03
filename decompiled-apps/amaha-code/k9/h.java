package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class h extends w9.a {

    /* renamed from: u  reason: collision with root package name */
    public final long f23139u;

    /* renamed from: v  reason: collision with root package name */
    public final long f23140v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f23141w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f23142x;

    /* renamed from: y  reason: collision with root package name */
    public static final p9.b f23138y = new p9.b("MediaLiveSeekableRange");
    @RecentlyNonNull
    public static final Parcelable.Creator<h> CREATOR = new j0();

    public h(long j10, long j11, boolean z10, boolean z11) {
        this.f23139u = Math.max(j10, 0L);
        this.f23140v = Math.max(j11, 0L);
        this.f23141w = z10;
        this.f23142x = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f23139u == hVar.f23139u && this.f23140v == hVar.f23140v && this.f23141w == hVar.f23141w && this.f23142x == hVar.f23142x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23139u), Long.valueOf(this.f23140v), Boolean.valueOf(this.f23141w), Boolean.valueOf(this.f23142x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.u0(parcel, 2, this.f23139u);
        hc.d.u0(parcel, 3, this.f23140v);
        hc.d.o0(parcel, 4, this.f23141w);
        hc.d.o0(parcel, 5, this.f23142x);
        hc.d.C0(parcel, B0);
    }
}
