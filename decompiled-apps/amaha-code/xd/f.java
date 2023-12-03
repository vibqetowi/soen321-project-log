package xd;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import xd.e;
/* compiled from: IDynamicLinksCallbacks.java */
/* loaded from: classes.dex */
public abstract class f extends Binder implements IInterface {
    public f() {
        attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        Status status;
        a aVar;
        Bundle bundle;
        wc.a aVar2;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 1598968902) {
                    return super.onTransact(i6, parcel, parcel2, i10);
                }
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                return true;
            }
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            if (parcel.readInt() != 0) {
                Status.CREATOR.createFromParcel(parcel);
            }
            if (parcel.readInt() != 0) {
                h.CREATOR.createFromParcel(parcel);
            }
            throw new UnsupportedOperationException();
        }
        parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        wd.b bVar = null;
        if (parcel.readInt() != 0) {
            status = Status.CREATOR.createFromParcel(parcel);
        } else {
            status = null;
        }
        if (parcel.readInt() != 0) {
            aVar = a.CREATOR.createFromParcel(parcel);
        } else {
            aVar = null;
        }
        e.b bVar2 = (e.b) this;
        if (aVar != null) {
            bVar = new wd.b(aVar);
        }
        boolean f02 = status.f0();
        ya.i<wd.b> iVar = bVar2.f37740a;
        if (f02) {
            iVar.b(bVar);
        } else {
            iVar.a(new ApiException(status));
        }
        if (aVar != null && (bundle = aVar.f0().getBundle("scionData")) != null && bundle.keySet() != null && (aVar2 = bVar2.f37741b.get()) != null) {
            for (String str : bundle.keySet()) {
                aVar2.b("fdl", str, bundle.getBundle(str));
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
