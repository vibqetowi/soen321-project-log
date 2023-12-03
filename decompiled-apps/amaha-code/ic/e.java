package ic;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class e implements g, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f19929a;

    public e(IBinder iBinder) {
        this.f19929a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19929a;
    }

    @Override // ic.g
    public final void f0(String str, Bundle bundle, hc.j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i6 = d.f19928a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f19929a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
