package v9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class t0 implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public final int f34947u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f34948v;

    public t0(b bVar, int i6) {
        this.f34948v = bVar;
        this.f34947u = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j k0Var;
        b bVar = this.f34948v;
        if (iBinder == null) {
            b.F(bVar);
            return;
        }
        synchronized (bVar.C) {
            b bVar2 = this.f34948v;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                k0Var = (j) queryLocalInterface;
            } else {
                k0Var = new k0(iBinder);
            }
            bVar2.D = k0Var;
        }
        b bVar3 = this.f34948v;
        int i6 = this.f34947u;
        bVar3.getClass();
        v0 v0Var = new v0(bVar3, 0);
        q0 q0Var = bVar3.A;
        q0Var.sendMessage(q0Var.obtainMessage(7, i6, -1, v0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f34948v.C) {
            bVar = this.f34948v;
            bVar.D = null;
        }
        q0 q0Var = bVar.A;
        q0Var.sendMessage(q0Var.obtainMessage(6, this.f34947u, 1));
    }
}
