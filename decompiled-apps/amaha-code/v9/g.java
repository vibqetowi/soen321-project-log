package v9;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f34896a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static e1 f34897b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f34898c;

    public static e1 a(Context context) {
        synchronized (f34896a) {
            if (f34897b == null) {
                f34897b = new e1(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f34897b;
    }

    public static HandlerThread b() {
        synchronized (f34896a) {
            HandlerThread handlerThread = f34898c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f34898c = handlerThread2;
            handlerThread2.start();
            return f34898c;
        }
    }

    public final void c(String str, String str2, int i6, t0 t0Var, boolean z10) {
        b1 b1Var = new b1(i6, str, str2, z10);
        e1 e1Var = (e1) this;
        synchronized (e1Var.f34891d) {
            c1 c1Var = (c1) e1Var.f34891d.get(b1Var);
            if (c1Var != null) {
                if (c1Var.f34865u.containsKey(t0Var)) {
                    c1Var.f34865u.remove(t0Var);
                    if (c1Var.f34865u.isEmpty()) {
                        e1Var.f.sendMessageDelayed(e1Var.f.obtainMessage(0, b1Var), e1Var.f34894h);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(b1Var.toString()));
                }
            } else {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(b1Var.toString()));
            }
        }
    }

    public abstract boolean d(b1 b1Var, t0 t0Var, String str, Executor executor);
}
