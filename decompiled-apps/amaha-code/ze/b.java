package ze;

import android.app.Application;
import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import kf.j;
import sc.e;
import sc.g;
/* compiled from: FirebasePerfEarly.java */
/* loaded from: classes.dex */
public final class b {
    public b(e eVar, g gVar, Executor executor) {
        eVar.b();
        Context context = eVar.f31432a;
        bf.a e10 = bf.a.e();
        e10.getClass();
        bf.a.f4250d.f12837b = j.a(context);
        e10.f4254c.b(context);
        af.a a10 = af.a.a();
        synchronized (a10) {
            if (!a10.J) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(a10);
                    a10.J = true;
                }
            }
        }
        a10.c(new d());
        if (gVar != null) {
            AppStartTrace i6 = AppStartTrace.i();
            i6.m(context);
            executor.execute(new AppStartTrace.b(i6));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
