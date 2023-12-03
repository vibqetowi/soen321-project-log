package ta;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import v9.b;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class k5 implements ServiceConnection, b.a, b.InterfaceC0590b {

    /* renamed from: u  reason: collision with root package name */
    public volatile boolean f32695u;

    /* renamed from: v  reason: collision with root package name */
    public volatile s2 f32696v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l5 f32697w;

    public k5(l5 l5Var) {
        this.f32697w = l5Var;
    }

    @Override // v9.b.a
    public final void a(Bundle bundle) {
        v9.o.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                v9.o.h(this.f32696v);
                w3 w3Var = this.f32697w.f32943u.D;
                y3.k(w3Var);
                w3Var.p(new i5(this, (m2) this.f32696v.y(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f32696v = null;
                this.f32695u = false;
            }
        }
    }

    public final void b(Intent intent) {
        this.f32697w.h();
        Context context = this.f32697w.f32943u.f32953u;
        z9.a b10 = z9.a.b();
        synchronized (this) {
            if (this.f32695u) {
                w2 w2Var = this.f32697w.f32943u.C;
                y3.k(w2Var);
                w2Var.H.b("Connection attempt already in progress");
                return;
            }
            w2 w2Var2 = this.f32697w.f32943u.C;
            y3.k(w2Var2);
            w2Var2.H.b("Using local app measurement service");
            this.f32695u = true;
            b10.a(context, intent, this.f32697w.f32729w, 129);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m2 k2Var;
        v9.o.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f32695u = false;
                w2 w2Var = this.f32697w.f32943u.C;
                y3.k(w2Var);
                w2Var.f32925z.b("Service connected with null binder");
                return;
            }
            m2 m2Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof m2) {
                        k2Var = (m2) queryLocalInterface;
                    } else {
                        k2Var = new k2(iBinder);
                    }
                    m2Var = k2Var;
                    w2 w2Var2 = this.f32697w.f32943u.C;
                    y3.k(w2Var2);
                    w2Var2.H.b("Bound to IMeasurementService interface");
                } else {
                    w2 w2Var3 = this.f32697w.f32943u.C;
                    y3.k(w2Var3);
                    w2Var3.f32925z.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                w2 w2Var4 = this.f32697w.f32943u.C;
                y3.k(w2Var4);
                w2Var4.f32925z.b("Service connect failed to get IMeasurementService");
            }
            if (m2Var == null) {
                this.f32695u = false;
                try {
                    z9.a b10 = z9.a.b();
                    l5 l5Var = this.f32697w;
                    b10.c(l5Var.f32943u.f32953u, l5Var.f32729w);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                w3 w3Var = this.f32697w.f32943u.D;
                y3.k(w3Var);
                w3Var.p(new i5(this, m2Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v9.o.d("MeasurementServiceConnection.onServiceDisconnected");
        l5 l5Var = this.f32697w;
        w2 w2Var = l5Var.f32943u.C;
        y3.k(w2Var);
        w2Var.G.b("Service disconnected");
        w3 w3Var = l5Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new androidx.work.n(this, componentName, 19));
    }

    @Override // v9.b.InterfaceC0590b
    public final void v(s9.b bVar) {
        v9.o.d("MeasurementServiceConnection.onConnectionFailed");
        w2 w2Var = this.f32697w.f32943u.C;
        if (w2Var == null || !w2Var.f32544v) {
            w2Var = null;
        }
        if (w2Var != null) {
            w2Var.C.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f32695u = false;
            this.f32696v = null;
        }
        w3 w3Var = this.f32697w.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new j5(this, 1));
    }

    @Override // v9.b.a
    public final void z(int i6) {
        v9.o.d("MeasurementServiceConnection.onConnectionSuspended");
        l5 l5Var = this.f32697w;
        w2 w2Var = l5Var.f32943u.C;
        y3.k(w2Var);
        w2Var.G.b("Service connection suspended");
        w3 w3Var = l5Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new j5(this, 0));
    }
}
