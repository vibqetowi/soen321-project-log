package l9;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class q extends z6.a implements r {
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager", 4);
    }

    @Override // l9.r
    public final void C1(v vVar) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.c(z10, vVar);
        R1(z10, 2);
    }

    @Override // l9.r
    public final da.a d() {
        Parcel c12 = c1(z(), 1);
        da.a X1 = a.AbstractBinderC0186a.X1(c12.readStrongBinder());
        c12.recycle();
        return X1;
    }

    @Override // l9.r
    public final void j0(boolean z10) {
        Parcel z11 = z();
        int i6 = com.google.android.gms.internal.cast.d.f7498a;
        z11.writeInt(1);
        z11.writeInt(z10 ? 1 : 0);
        R1(z11, 6);
    }

    @Override // l9.r
    public final da.a s() {
        Parcel c12 = c1(z(), 7);
        da.a X1 = a.AbstractBinderC0186a.X1(c12.readStrongBinder());
        c12.recycle();
        return X1;
    }
}
