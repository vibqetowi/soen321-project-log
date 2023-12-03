package ha;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class b extends z6.a implements d {
    public b(IBinder iBinder) {
        super(iBinder, 1);
    }

    @Override // ha.d
    public final String c() {
        Parcel c12 = c1(z(), 1);
        String readString = c12.readString();
        c12.recycle();
        return readString;
    }

    @Override // ha.d
    public final boolean d() {
        Parcel z10 = z();
        int i6 = a.f17352a;
        boolean z11 = true;
        z10.writeInt(1);
        Parcel c12 = c1(z10, 2);
        if (c12.readInt() == 0) {
            z11 = false;
        }
        c12.recycle();
        return z11;
    }
}
