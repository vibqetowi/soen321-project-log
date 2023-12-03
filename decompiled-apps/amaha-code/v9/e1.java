package v9;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class e1 extends g {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f34891d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f34892e;
    public volatile ma.c f;

    /* renamed from: g  reason: collision with root package name */
    public final z9.a f34893g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34894h;

    /* renamed from: i  reason: collision with root package name */
    public final long f34895i;

    public e1(Context context, Looper looper) {
        d1 d1Var = new d1(this);
        this.f34892e = context.getApplicationContext();
        this.f = new ma.c(looper, d1Var);
        this.f34893g = z9.a.b();
        this.f34894h = 5000L;
        this.f34895i = 300000L;
    }

    @Override // v9.g
    public final boolean d(b1 b1Var, t0 t0Var, String str, Executor executor) {
        boolean z10;
        synchronized (this.f34891d) {
            try {
                c1 c1Var = (c1) this.f34891d.get(b1Var);
                if (c1Var == null) {
                    c1Var = new c1(this, b1Var);
                    c1Var.f34865u.put(t0Var, t0Var);
                    c1Var.a(str, executor);
                    this.f34891d.put(b1Var, c1Var);
                } else {
                    this.f.removeMessages(0, b1Var);
                    if (!c1Var.f34865u.containsKey(t0Var)) {
                        c1Var.f34865u.put(t0Var, t0Var);
                        int i6 = c1Var.f34866v;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                c1Var.a(str, executor);
                            }
                        } else {
                            t0Var.onServiceConnected(c1Var.f34870z, c1Var.f34868x);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(b1Var.toString()));
                    }
                }
                z10 = c1Var.f34867w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
