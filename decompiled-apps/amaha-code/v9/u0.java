package v9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import v9.b;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class u0 extends i0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f34949g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f34950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b bVar, int i6, IBinder iBinder, Bundle bundle) {
        super(bVar, i6, bundle);
        this.f34950h = bVar;
        this.f34949g = iBinder;
    }

    @Override // v9.i0
    public final void e(s9.b bVar) {
        b bVar2 = this.f34950h;
        b.InterfaceC0590b interfaceC0590b = bVar2.K;
        if (interfaceC0590b != null) {
            interfaceC0590b.v(bVar);
        }
        bVar2.C(bVar);
    }

    @Override // v9.i0
    public final boolean f() {
        IBinder iBinder = this.f34949g;
        try {
            o.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            b bVar = this.f34950h;
            if (!bVar.z().equals(interfaceDescriptor)) {
                String z10 = bVar.z();
                Log.w("GmsClient", "service descriptor mismatch: " + z10 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface r = bVar.r(iBinder);
            if (r == null || (!b.G(bVar, 2, 4, r) && !b.G(bVar, 3, 4, r))) {
                return false;
            }
            bVar.O = null;
            Bundle v10 = bVar.v();
            b.a aVar = bVar.J;
            if (aVar != null) {
                aVar.a(v10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
