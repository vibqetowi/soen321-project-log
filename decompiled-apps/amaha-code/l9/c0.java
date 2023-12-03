package l9;

import android.os.RemoteException;
import k9.w0;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f24171a;

    public /* synthetic */ c0(c cVar) {
        this.f24171a = cVar;
    }

    @Override // k9.w0
    public final void a() {
        c cVar = this.f24171a;
        if (cVar.f24165e == null) {
            return;
        }
        try {
            m9.g gVar = cVar.f24168i;
            if (gVar != null) {
                gVar.l();
            }
            cVar.f24165e.t(null);
        } catch (RemoteException e10) {
            c.f24162l.a("Unable to call %s on %s.", e10, "onConnected", k0.class.getSimpleName());
        }
    }

    @Override // k9.w0
    public final void b(int i6) {
        k0 k0Var = this.f24171a.f24165e;
        if (k0Var == null) {
            return;
        }
        try {
            k0Var.i1(new s9.b(i6));
        } catch (RemoteException e10) {
            c.f24162l.a("Unable to call %s on %s.", e10, "onConnectionFailed", k0.class.getSimpleName());
        }
    }

    @Override // k9.w0
    public final void c(int i6) {
        k0 k0Var = this.f24171a.f24165e;
        if (k0Var == null) {
            return;
        }
        try {
            k0Var.j(i6);
        } catch (RemoteException e10) {
            c.f24162l.a("Unable to call %s on %s.", e10, "onConnectionSuspended", k0.class.getSimpleName());
        }
    }

    @Override // k9.w0
    public final void d(int i6) {
        k0 k0Var = this.f24171a.f24165e;
        if (k0Var == null) {
            return;
        }
        try {
            k0Var.i1(new s9.b(i6));
        } catch (RemoteException e10) {
            c.f24162l.a("Unable to call %s on %s.", e10, "onDisconnected", k0.class.getSimpleName());
        }
    }
}
