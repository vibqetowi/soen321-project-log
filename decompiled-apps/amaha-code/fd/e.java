package fd;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a0();

    /* renamed from: u  reason: collision with root package name */
    public final String f14953u;

    public e(String str) {
        v9.o.e(str);
        this.f14953u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14953u);
        hc.d.C0(parcel, B0);
    }
}
