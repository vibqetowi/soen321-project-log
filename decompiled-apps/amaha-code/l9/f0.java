package l9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class f0 extends z6.a implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext", 4);
    }

    @Override // l9.h0
    public final boolean g() {
        boolean z10;
        Parcel c12 = c1(z(), 12);
        int i6 = com.google.android.gms.internal.cast.d.f7498a;
        if (c12.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c12.recycle();
        return z10;
    }

    @Override // l9.h0
    public final r h() {
        r qVar;
        Parcel c12 = c1(z(), 5);
        IBinder readStrongBinder = c12.readStrongBinder();
        if (readStrongBinder == null) {
            qVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof r) {
                qVar = (r) queryLocalInterface;
            } else {
                qVar = new q(readStrongBinder);
            }
        }
        c12.recycle();
        return qVar;
    }

    @Override // l9.h0
    public final j i() {
        j iVar;
        Parcel c12 = c1(z(), 6);
        IBinder readStrongBinder = c12.readStrongBinder();
        if (readStrongBinder == null) {
            iVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof j) {
                iVar = (j) queryLocalInterface;
            } else {
                iVar = new i(readStrongBinder);
            }
        }
        c12.recycle();
        return iVar;
    }
}
