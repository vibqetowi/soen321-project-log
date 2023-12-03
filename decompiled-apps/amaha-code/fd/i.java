package fd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new s();

    /* renamed from: u  reason: collision with root package name */
    public final String f14957u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14958v;

    public i(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f14957u = str;
        this.f14958v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14957u);
        hc.d.x0(parcel, 2, this.f14958v);
        hc.d.C0(parcel, B0);
    }
}
