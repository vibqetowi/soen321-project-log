package ta;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class k3 implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public final String f32691u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l3 f32692v;

    public k3(l3 l3Var, String str) {
        this.f32692v = l3Var;
        this.f32691u = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object a0Var;
        l3 l3Var = this.f32692v;
        if (iBinder != null) {
            try {
                int i6 = com.google.android.gms.internal.measurement.b0.f8308a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof com.google.android.gms.internal.measurement.c0) {
                    a0Var = (com.google.android.gms.internal.measurement.c0) queryLocalInterface;
                } else {
                    a0Var = new com.google.android.gms.internal.measurement.a0(iBinder);
                }
                if (a0Var == null) {
                    w2 w2Var = l3Var.f32704a.C;
                    y3.k(w2Var);
                    w2Var.C.b("Install Referrer Service implementation was not found");
                    return;
                }
                w2 w2Var2 = l3Var.f32704a.C;
                y3.k(w2Var2);
                w2Var2.H.b("Install Referrer Service connected");
                w3 w3Var = l3Var.f32704a.D;
                y3.k(w3Var);
                w3Var.p(new k9.d0(this, a0Var, this, 3));
                return;
            } catch (RuntimeException e10) {
                w2 w2Var3 = l3Var.f32704a.C;
                y3.k(w2Var3);
                w2Var3.C.c(e10, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        w2 w2Var4 = l3Var.f32704a.C;
        y3.k(w2Var4);
        w2Var4.C.b("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w2 w2Var = this.f32692v.f32704a.C;
        y3.k(w2Var);
        w2Var.H.b("Install Referrer Service disconnected");
    }
}
