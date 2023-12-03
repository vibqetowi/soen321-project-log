package l9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class k extends z6.a implements m {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService", 4);
    }

    @Override // l9.m
    public final int F(int i6, int i10, Intent intent) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.b(z10, intent);
        z10.writeInt(i6);
        z10.writeInt(i10);
        Parcel c12 = c1(z10, 2);
        int readInt = c12.readInt();
        c12.recycle();
        return readInt;
    }

    @Override // l9.m
    public final void d() {
        R1(z(), 1);
    }

    @Override // l9.m
    public final void f() {
        R1(z(), 4);
    }

    @Override // l9.m
    public final IBinder m0(Intent intent) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.b(z10, intent);
        Parcel c12 = c1(z10, 3);
        IBinder readStrongBinder = c12.readStrongBinder();
        c12.recycle();
        return readStrongBinder;
    }
}
