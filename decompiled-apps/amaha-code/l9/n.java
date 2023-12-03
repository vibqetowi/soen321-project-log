package l9;

import android.os.IBinder;
import android.os.Parcel;
import da.a;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class n extends z6.a implements p {
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession", 4);
    }

    @Override // l9.p
    public final void G1(int i6) {
        Parcel z10 = z();
        z10.writeInt(i6);
        R1(z10, 13);
    }

    @Override // l9.p
    public final da.a d() {
        Parcel c12 = c1(z(), 1);
        da.a X1 = a.AbstractBinderC0186a.X1(c12.readStrongBinder());
        c12.recycle();
        return X1;
    }

    @Override // l9.p
    public final boolean f() {
        boolean z10;
        Parcel c12 = c1(z(), 5);
        int i6 = com.google.android.gms.internal.cast.d.f7498a;
        if (c12.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c12.recycle();
        return z10;
    }

    @Override // l9.p
    public final void m() {
        Parcel z10 = z();
        z10.writeInt(2153);
        R1(z10, 15);
    }

    @Override // l9.p
    public final void n() {
        Parcel z10 = z();
        z10.writeInt(2151);
        R1(z10, 12);
    }

    @Override // l9.p
    public final boolean o() {
        boolean z10;
        Parcel c12 = c1(z(), 9);
        int i6 = com.google.android.gms.internal.cast.d.f7498a;
        if (c12.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c12.recycle();
        return z10;
    }
}
