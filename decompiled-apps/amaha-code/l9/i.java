package l9;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i extends z6.a implements j {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 4);
    }

    @Override // l9.j
    public final da.a d() {
        Parcel c12 = c1(z(), 5);
        da.a X1 = a.AbstractBinderC0186a.X1(c12.readStrongBinder());
        c12.recycle();
        return X1;
    }
}
