package qg;

import android.content.Context;
import com.moengage.core.internal.exception.NetworkRequestDisabledException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29539u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f29540v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f29541w;

    public /* synthetic */ e(Context context, g gVar) {
        this.f29539u = 2;
        this.f29541w = context;
        this.f29540v = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f29539u;
        Context context = this.f29541w;
        g this$0 = this.f29540v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                eh.g gVar = this$0.f29552h;
                ih.p pVar = gVar.f14004a;
                try {
                    hh.g.b(pVar.f20105d, 0, new eh.h(gVar), 3);
                    if (pVar.f20104c.f33010a) {
                        gVar.b(context);
                        w wVar = w.f29578a;
                        wVar.getClass();
                        ((vg.d) w.d(pVar).f29550e.getValue()).d(context);
                        w.d(pVar).c(context, "MOE_APP_EXIT", new ng.c());
                        sg.a a10 = w.a(context, pVar);
                        ih.p pVar2 = a10.f31520b;
                        hh.g.b(pVar2.f20105d, 0, new sg.d(a10), 3);
                        Context context2 = a10.f31519a;
                        if (di.b.u(context2, pVar2)) {
                            a10.f31523e = false;
                            long currentTimeMillis = System.currentTimeMillis();
                            jh.b bVar = a10.f31524g;
                            if (bVar != null) {
                                bVar.f22033d = currentTimeMillis;
                            }
                            if (bVar != null) {
                                wVar.getClass();
                                w.f(context2, pVar2).c0(bVar);
                            }
                        }
                        w.f(context, pVar).S(w.c(pVar).f572a);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    pVar.f20105d.a(1, e10, new eh.i(gVar));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                eh.g gVar2 = this$0.f29552h;
                ih.p pVar3 = gVar2.f14004a;
                try {
                    hh.g.b(pVar3.f20105d, 0, new eh.j(gVar2), 3);
                    gVar2.d(context);
                    boolean u10 = di.b.u(context, pVar3);
                    hh.g gVar3 = pVar3.f20105d;
                    if (!u10) {
                        hh.g.b(gVar3, 0, new eh.k(gVar2), 3);
                        return;
                    }
                    w.f29578a.getClass();
                    g.b(w.d(pVar3), context);
                    if (!pVar3.f20104c.f33010a) {
                        hh.g.b(gVar3, 0, new eh.l(gVar2), 3);
                        return;
                    }
                    ng.c cVar = new ng.c();
                    String appId = (String) pVar3.f20102a.f5133c;
                    kotlin.jvm.internal.i.g(appId, "appId");
                    ih.p b10 = g0.b(appId);
                    if (b10 != null) {
                        w.d(b10).c(context, "EVENT_ACTION_ACTIVITY_START", cVar);
                    }
                    gVar2.a(context);
                    uh.b f = w.f(context, pVar3);
                    f.a0();
                    gVar2.c(context);
                    if (f.Y()) {
                        dh.a aVar = pVar3.f20103b;
                        pg.h hVar = new pg.h(5, true);
                        aVar.getClass();
                        aVar.f12859e = hVar;
                    }
                    uh.b f2 = w.f(context, pVar3);
                    if ((60 * 60 * 1000) + f2.D() < System.currentTimeMillis()) {
                        f2.j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    pVar3.f20105d.a(1, e11, new eh.m(gVar2));
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                th.c cVar2 = new th.c();
                ih.p sdkInstance = this$0.f29546a;
                kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
                hh.g gVar4 = sdkInstance.f20105d;
                try {
                    hh.g.b(gVar4, 0, new th.d(cVar2), 3);
                    if (gv.n.B0(sdkInstance.f20103b.f12855a)) {
                        hh.g.b(gVar4, 0, new th.e(cVar2), 3);
                    } else {
                        hh.g.b(gVar4, 0, new th.f(cVar2), 3);
                        w.f29578a.getClass();
                        if (w.f(context, sdkInstance).i0()) {
                            sdkInstance.f20104c = cVar2.a(context, sdkInstance);
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (th2 instanceof NetworkRequestDisabledException) {
                        hh.g.b(gVar4, 1, new th.g(cVar2), 2);
                        return;
                    } else {
                        gVar4.a(1, th2, new th.h(cVar2));
                        return;
                    }
                }
        }
    }

    public /* synthetic */ e(g gVar, Context context, int i6) {
        this.f29539u = i6;
        this.f29540v = gVar;
        this.f29541w = context;
    }
}
