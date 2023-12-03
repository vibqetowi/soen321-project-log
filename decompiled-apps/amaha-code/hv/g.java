package hv;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import hs.g;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class g {
    private static volatile Choreographer choreographer;

    static {
        Object j10;
        try {
            j10 = new e(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            j10 = sp.b.j(th2);
        }
        if (j10 instanceof g.a) {
            j10 = null;
        }
        f fVar = (f) j10;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
