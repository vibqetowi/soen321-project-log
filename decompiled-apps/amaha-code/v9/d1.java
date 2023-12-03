package v9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class d1 implements Handler.Callback {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e1 f34880u;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 0) {
            if (i6 != 1) {
                return false;
            }
            synchronized (this.f34880u.f34891d) {
                b1 b1Var = (b1) message.obj;
                c1 c1Var = (c1) this.f34880u.f34891d.get(b1Var);
                if (c1Var != null && c1Var.f34866v == 3) {
                    String valueOf = String.valueOf(b1Var);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(valueOf), new Exception());
                    ComponentName componentName = c1Var.f34870z;
                    if (componentName == null) {
                        b1Var.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = b1Var.f34851b;
                        o.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    c1Var.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
        synchronized (this.f34880u.f34891d) {
            try {
                b1 b1Var2 = (b1) message.obj;
                c1 c1Var2 = (c1) this.f34880u.f34891d.get(b1Var2);
                if (c1Var2 != null && c1Var2.f34865u.isEmpty()) {
                    if (c1Var2.f34867w) {
                        c1Var2.A.f.removeMessages(1, c1Var2.f34869y);
                        e1 e1Var = c1Var2.A;
                        e1Var.f34893g.c(e1Var.f34892e, c1Var2);
                        c1Var2.f34867w = false;
                        c1Var2.f34866v = 2;
                    }
                    this.f34880u.f34891d.remove(b1Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
