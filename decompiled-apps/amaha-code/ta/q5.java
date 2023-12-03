package ta;

import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32832a;

    public q5(Context context) {
        v9.o.h(context);
        this.f32832a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f32925z.b("onRebind called with null intent");
            return;
        }
        c().H.c(intent.getAction(), "onRebind called. action");
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f32925z.b("onUnbind called with null intent");
            return;
        }
        c().H.c(intent.getAction(), "onUnbind called for intent. action");
    }

    public final w2 c() {
        w2 w2Var = y3.s(this.f32832a, null, null).C;
        y3.k(w2Var);
        return w2Var;
    }
}
