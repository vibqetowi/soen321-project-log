package mi;

import android.app.Activity;
import android.content.Context;
import hh.g;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: InAppController.kt */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f25197a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25198b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25199c;

    /* renamed from: d  reason: collision with root package name */
    public final e2 f25200d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25201e;
    public ScheduledExecutorService f;

    /* renamed from: g  reason: collision with root package name */
    public final s1 f25202g;

    public h1(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25197a = sdkInstance;
        this.f25198b = "InApp_6.5.0_InAppController";
        this.f25200d = new e2(sdkInstance);
        this.f25202g = new s1();
    }

    public final void a(pi.d payload, ri.b bVar) {
        kotlin.jvm.internal.i.g(payload, "payload");
        Activity b10 = j1.b();
        if (b10 == null) {
            return;
        }
        s1.s sVar = new s1.s(payload.a(), payload.b(), payload.c());
        ih.p pVar = this.f25197a;
        aj.b bVar2 = new aj.b(b10, new aj.c(sVar, di.b.a(pVar)));
        i1.f25206a.getClass();
        Iterator it = i1.a(pVar).f35172d.iterator();
        while (it.hasNext()) {
            bh.b.f4298b.post(new u5.f(bVar, (zi.a) it.next(), bVar2, this, 6));
        }
    }

    public final void b(Activity activity, pi.d dVar) {
        a0 a0Var;
        Context context = activity.getApplicationContext();
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
        ih.p sdkInstance = this.f25197a;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            if (kotlin.jvm.internal.i.b(dVar.g(), "EMBEDDED")) {
                hh.g.b(sdkInstance.f20105d, 0, new s(a0Var2, dVar), 3);
            } else {
                hh.g.b(sdkInstance.f20105d, 0, new t(a0Var2, dVar), 3);
                r9.o oVar = a0Var2.f25131b;
                oVar.f30640c = dVar;
                oVar.f30642e = (String) sdkInstance.f20102a.f5133c;
            }
        } catch (Exception e10) {
            sdkInstance.f20105d.a(1, e10, new u(a0Var2));
            a0Var2.f25131b.f30640c = null;
        }
        kotlin.jvm.internal.i.f(context, "context");
        ih.p sdkInstance2 = this.f25197a;
        s1.s sVar = new s1.s(dVar.a(), dVar.b(), dVar.c());
        kotlin.jvm.internal.i.g(sdkInstance2, "sdkInstance");
        ng.c cVar = new ng.c();
        t1.a(cVar, (String) sVar.f31225w, (String) sVar.f31226x, (aj.a) sVar.f31224v);
        cVar.b();
        String appId = (String) sdkInstance2.f20102a.f5133c;
        kotlin.jvm.internal.i.g(appId, "appId");
        ih.p b10 = qg.g0.b(appId);
        if (b10 != null) {
            qg.w.f29578a.getClass();
            qg.w.d(b10).c(context, "MOE_IN_APP_SHOWN", cVar);
        }
        ih.p pVar = this.f25197a;
        ah.f fVar = pVar.f20106e;
        String campaignId = dVar.b();
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        fVar.c(new ah.e("INAPP_UPDATE_CAMPAIGN_STATE_TASK", false, new u5.f(context, pVar, campaignId)));
        a(dVar, ri.b.SHOWN);
    }

    public final void c(Context context) {
        li.a aVar;
        kotlin.jvm.internal.i.g(context, "context");
        this.f25199c = true;
        if (this.f25201e) {
            this.f25201e = false;
            li.a aVar2 = li.a.f24376b;
            if (aVar2 == null) {
                synchronized (li.a.class) {
                    aVar = li.a.f24376b;
                    if (aVar == null) {
                        aVar = new li.a();
                    }
                    li.a.f24376b = aVar;
                }
                aVar2 = aVar;
            }
            String appId = (String) this.f25197a.f20102a.f5133c;
            kotlin.jvm.internal.i.g(appId, "appId");
            ih.p b10 = qg.g0.b(appId);
            if (b10 == null) {
                hh.a aVar3 = hh.g.f17610d;
                g.a.b(0, new li.b(aVar2), 3);
            } else {
                li.a.b(context, b10);
            }
        }
        this.f25202g.a(this.f25197a);
    }

    public final void d(Context context, ih.i event) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(event, "event");
        boolean z10 = this.f25199c;
        ih.p pVar = this.f25197a;
        if (!z10) {
            i1.f25206a.getClass();
            i1.a(pVar).f35173e.add(event);
            return;
        }
        i1.f25206a.getClass();
        if (i1.a(pVar).f35170b.contains(event.f20088a)) {
            i1.a(pVar);
            pVar.f20106e.a(new ah.e("INAPP_CHECK_AND_SHOW_TRIGGER_BASED_TASK", false, new u5.f(context, pVar, event, null, 4)));
        }
    }
}
