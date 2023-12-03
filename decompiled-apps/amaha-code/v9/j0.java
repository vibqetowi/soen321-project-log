package v9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class j0 extends ja.a {
    public j0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r5.f34932u >= r3.f34932u) goto L19;
     */
    @Override // ja.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        q qVar;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                x0 x0Var = (x0) ma.a.a(parcel, x0.CREATOR);
                ma.a.b(parcel);
                s0 s0Var = (s0) this;
                b bVar = s0Var.f34945b;
                o.i(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                o.h(x0Var);
                bVar.Q = x0Var;
                if (bVar.E()) {
                    d dVar = x0Var.f34962x;
                    p a10 = p.a();
                    if (dVar == null) {
                        qVar = null;
                    } else {
                        qVar = dVar.f34871u;
                    }
                    synchronized (a10) {
                        if (qVar == null) {
                            qVar = p.f34930c;
                        } else {
                            q qVar2 = a10.f34931a;
                            if (qVar2 != null) {
                            }
                        }
                        a10.f34931a = qVar;
                    }
                }
                Bundle bundle = x0Var.f34959u;
                o.i(s0Var.f34945b, "onPostInitComplete can be called only once per call to getRemoteService");
                s0Var.f34945b.D(readInt, readStrongBinder, bundle, s0Var.f34946c);
                s0Var.f34945b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) ma.a.a(parcel, Bundle.CREATOR);
                ma.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            ma.a.b(parcel);
            s0 s0Var2 = (s0) this;
            o.i(s0Var2.f34945b, "onPostInitComplete can be called only once per call to getRemoteService");
            s0Var2.f34945b.D(parcel.readInt(), parcel.readStrongBinder(), (Bundle) ma.a.a(parcel, Bundle.CREATOR), s0Var2.f34946c);
            s0Var2.f34945b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
