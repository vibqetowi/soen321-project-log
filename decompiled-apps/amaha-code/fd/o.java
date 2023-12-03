package fd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class o extends b {
    public static final Parcelable.Creator<o> CREATOR = new v();

    /* renamed from: u  reason: collision with root package name */
    public final String f14969u;

    public o(String str) {
        v9.o.e(str);
        this.f14969u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14969u);
        hc.d.C0(parcel, B0);
    }
}
