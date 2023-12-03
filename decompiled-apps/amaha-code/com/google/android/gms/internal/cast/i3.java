package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i3 extends z6.a implements e4 {
    public i3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 4);
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final l9.m K0(da.b bVar, da.a aVar, da.a aVar2) {
        l9.m kVar;
        Parcel z10 = z();
        d.c(z10, bVar);
        d.c(z10, aVar);
        d.c(z10, aVar2);
        Parcel c12 = c1(z10, 5);
        IBinder readStrongBinder = c12.readStrongBinder();
        int i6 = l9.l.f24186b;
        if (readStrongBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof l9.m) {
                kVar = (l9.m) queryLocalInterface;
            } else {
                kVar = new l9.k(readStrongBinder);
            }
        }
        c12.recycle();
        return kVar;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final l9.p X0(String str, String str2, l9.u uVar) {
        l9.p nVar;
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeString(str2);
        d.c(z10, uVar);
        Parcel c12 = c1(z10, 2);
        IBinder readStrongBinder = c12.readStrongBinder();
        int i6 = l9.o.f24187b;
        if (readStrongBinder == null) {
            nVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof l9.p) {
                nVar = (l9.p) queryLocalInterface;
            } else {
                nVar = new l9.n(readStrongBinder);
            }
        }
        c12.recycle();
        return nVar;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final l9.h0 b0(da.b bVar, l9.b bVar2, n5 n5Var, HashMap hashMap) {
        l9.h0 f0Var;
        Parcel z10 = z();
        d.c(z10, bVar);
        d.b(z10, bVar2);
        d.c(z10, n5Var);
        z10.writeMap(hashMap);
        Parcel c12 = c1(z10, 1);
        IBinder readStrongBinder = c12.readStrongBinder();
        int i6 = l9.g0.f24182b;
        if (readStrongBinder == null) {
            f0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof l9.h0) {
                f0Var = (l9.h0) queryLocalInterface;
            } else {
                f0Var = new l9.f0(readStrongBinder);
            }
        }
        c12.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final l9.k0 f1(l9.b bVar, da.a aVar, l9.a0 a0Var) {
        l9.k0 i0Var;
        Parcel z10 = z();
        d.b(z10, bVar);
        d.c(z10, aVar);
        d.c(z10, a0Var);
        Parcel c12 = c1(z10, 3);
        IBinder readStrongBinder = c12.readStrongBinder();
        int i6 = l9.j0.f24185b;
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof l9.k0) {
                i0Var = (l9.k0) queryLocalInterface;
            } else {
                i0Var = new l9.i0(readStrongBinder);
            }
        }
        c12.recycle();
        return i0Var;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final n9.g s1(da.b bVar, n9.c cVar, int i6, int i10) {
        n9.g eVar;
        Parcel z10 = z();
        d.c(z10, bVar);
        d.c(z10, cVar);
        z10.writeInt(i6);
        z10.writeInt(i10);
        z10.writeInt(0);
        z10.writeLong(2097152L);
        z10.writeInt(5);
        z10.writeInt(333);
        z10.writeInt(Constants.TIMEOUT_MS);
        Parcel c12 = c1(z10, 6);
        IBinder readStrongBinder = c12.readStrongBinder();
        int i11 = n9.f.f25957b;
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof n9.g) {
                eVar = (n9.g) queryLocalInterface;
            } else {
                eVar = new n9.e(readStrongBinder);
            }
        }
        c12.recycle();
        return eVar;
    }
}
