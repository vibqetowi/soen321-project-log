package m9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class e extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new j0();

    /* renamed from: u  reason: collision with root package name */
    public final String f24965u;

    /* renamed from: v  reason: collision with root package name */
    public final int f24966v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24967w;

    public e(String str, int i6, String str2) {
        this.f24965u = str;
        this.f24966v = i6;
        this.f24967w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f24965u);
        hc.d.s0(parcel, 3, this.f24966v);
        hc.d.x0(parcel, 4, this.f24967w);
        hc.d.C0(parcel, B0);
    }
}
