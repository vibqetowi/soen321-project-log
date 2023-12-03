package fd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class p extends b {
    public static final Parcelable.Creator<p> CREATOR = new w();

    /* renamed from: u  reason: collision with root package name */
    public final String f14970u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14971v;

    public p(String str, String str2) {
        v9.o.e(str);
        this.f14970u = str;
        v9.o.e(str2);
        this.f14971v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14970u);
        hc.d.x0(parcel, 2, this.f14971v);
        hc.d.C0(parcel, B0);
    }
}
