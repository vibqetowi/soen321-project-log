package v9;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class l0 extends z6.a implements n0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 5);
    }

    @Override // v9.n0
    public final boolean B0(s9.y yVar, da.b bVar) {
        Parcel z10 = z();
        int i6 = ma.a.f25010a;
        boolean z11 = true;
        z10.writeInt(1);
        yVar.writeToParcel(z10, 0);
        ma.a.c(z10, bVar);
        Parcel v10 = v(z10, 5);
        if (v10.readInt() == 0) {
            z11 = false;
        }
        v10.recycle();
        return z11;
    }

    @Override // v9.n0
    public final s9.w I1(s9.u uVar) {
        Parcel z10 = z();
        int i6 = ma.a.f25010a;
        z10.writeInt(1);
        uVar.writeToParcel(z10, 0);
        Parcel v10 = v(z10, 6);
        s9.w wVar = (s9.w) ma.a.a(v10, s9.w.CREATOR);
        v10.recycle();
        return wVar;
    }

    @Override // v9.n0
    public final boolean g() {
        boolean z10;
        Parcel v10 = v(z(), 7);
        int i6 = ma.a.f25010a;
        if (v10.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v10.recycle();
        return z10;
    }
}
