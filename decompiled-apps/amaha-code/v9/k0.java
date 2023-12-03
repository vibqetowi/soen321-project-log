package v9;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class k0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f34915a;

    public k0(IBinder iBinder) {
        this.f34915a = iBinder;
    }

    @Override // v9.j
    public final void E(s0 s0Var, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(s0Var);
            obtain.writeInt(1);
            a1.a(eVar, obtain, 0);
            this.f34915a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34915a;
    }
}
