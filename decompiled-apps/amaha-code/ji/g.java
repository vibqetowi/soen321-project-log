package ji;

import android.content.Context;
import hh.g;
import java.util.concurrent.ScheduledExecutorService;
import mi.a0;
import mi.a1;
import mi.h1;
import mi.i1;
import mi.j1;
import mi.m1;
import mi.y0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements fh.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22049a;

    public /* synthetic */ g(int i6) {
        this.f22049a = i6;
    }

    @Override // fh.a
    public final void a(Context context) {
        a0 a0Var;
        ScheduledExecutorService scheduledExecutorService;
        switch (this.f22049a) {
            case 0:
                hh.a aVar = hh.g.f17610d;
                g.a.b(0, i.f22051u, 3);
                try {
                    g.a.b(0, k.f22053u, 3);
                    ScheduledExecutorService scheduledExecutorService2 = o.f22057a;
                    if (scheduledExecutorService2 != null && (!scheduledExecutorService2.isShutdown()) && (scheduledExecutorService = o.f22057a) != null) {
                        scheduledExecutorService.shutdownNow();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    hh.a aVar2 = hh.g.f17610d;
                    g.a.a(1, e10, l.f22054u);
                    return;
                }
            default:
                Object obj = j1.f25215a;
                hh.a aVar3 = hh.g.f17610d;
                g.a.b(0, m1.f25237u, 3);
                a0 a0Var2 = a0.f25129c;
                if (a0Var2 == null) {
                    synchronized (a0.class) {
                        a0Var = a0.f25129c;
                        if (a0Var == null) {
                            a0Var = new a0();
                        }
                        a0.f25129c = a0Var;
                    }
                    a0Var2 = a0Var;
                }
                r9.o oVar = a0Var2.f25131b;
                oVar.f30641d = null;
                oVar.f30639b = -1;
                oVar.f30640c = null;
                oVar.f30642e = null;
                j1.d();
                i1.f25206a.getClass();
                for (h1 h1Var : i1.f25208c.values()) {
                    ih.p pVar = h1Var.f25197a;
                    try {
                        i1.f25206a.getClass();
                        vi.a a10 = i1.a(pVar);
                        a10.f35173e.clear();
                        a10.f35176i = false;
                        ScheduledExecutorService scheduledExecutorService3 = h1Var.f;
                        if (scheduledExecutorService3 != null) {
                            scheduledExecutorService3.shutdown();
                        }
                        pVar.f20106e.a(new ah.e("INAPP_UPLOAD_STATS_TASK", true, new y0(context, pVar)));
                    } catch (Exception e11) {
                        pVar.f20105d.a(1, e11, new a1(h1Var));
                    }
                }
                return;
        }
    }
}
