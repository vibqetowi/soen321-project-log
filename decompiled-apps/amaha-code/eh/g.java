package eh;

import android.content.Context;
import com.moengage.core.internal.push.PushManager;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.core.internal.push.pushamp.PushAmpHandler;
import ne.u;
import qg.w;
/* compiled from: ApplicationLifecycleHandler.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f14004a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14005b;

    /* compiled from: ApplicationLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" notifyOnAppBackground() : ", g.this.f14005b);
        }
    }

    /* compiled from: ApplicationLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateAdvertisingId() : ", g.this.f14005b);
        }
    }

    /* compiled from: ApplicationLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateFeatureConfigForOptOutIfRequired() : Sdk disabled, clear data", g.this.f14005b);
        }
    }

    public g(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f14004a = sdkInstance;
        this.f14005b = "Core_ApplicationLifecycleHandler";
    }

    public final void a(Context context) {
        gh.a aVar = gh.c.f16512a;
        ih.p sdkInstance = this.f14004a;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        gh.a aVar2 = gh.c.f16512a;
        if (aVar2 != null) {
            aVar2.a();
        }
        ch.a aVar3 = ch.c.f5286a;
        if (aVar3 != null) {
            aVar3.onAppOpen(context, sdkInstance);
        }
        PushAmpHandler pushAmpHandler = sh.b.f31571a;
        if (pushAmpHandler != null) {
            pushAmpHandler.onAppOpen(context, sdkInstance);
        }
        yh.a aVar4 = yh.c.f38625a;
        if (aVar4 != null) {
            aVar4.a();
        }
        tg.a aVar5 = tg.c.f33009a;
        if (aVar5 != null) {
            aVar5.a();
        }
        PushManager.f10185a.getClass();
        PushBaseHandler pushBaseHandler = PushManager.f10186b;
        if (pushBaseHandler != null) {
            pushBaseHandler.updateNotificationPermission(context, sdkInstance);
        }
    }

    public final void b(Context context) {
        ih.p pVar = this.f14004a;
        di.b.a(pVar);
        w.f29578a.getClass();
        for (ei.a aVar : w.b(pVar).f34153a) {
            try {
                aVar.a();
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new a());
            }
        }
    }

    public final void c(Context context) {
        ih.p pVar = this.f14004a;
        try {
            w.f29578a.getClass();
            uh.b f = w.f(context, pVar);
            if (!f.E().f20081b) {
                return;
            }
            String advertisingId = f.L();
            int k10 = f.k();
            kotlin.jvm.internal.i.g(advertisingId, "advertisingId");
            ad.h a10 = rg.a.a(context);
            if (a10 == null) {
                return;
            }
            String str = a10.f505b;
            boolean z10 = !gv.n.B0(str);
            c9.d dVar = pVar.f20102a;
            if (z10 && !kotlin.jvm.internal.i.b(str, advertisingId)) {
                og.b.c(context, "MOE_GAID", str, (String) dVar.f5133c);
                f.V(str);
            }
            int i6 = a10.f504a;
            if (i6 != k10) {
                og.b.c(context, "MOE_ISLAT", String.valueOf(i6), (String) dVar.f5133c);
                f.A(i6);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
        }
    }

    public final void d(Context context) {
        w.f29578a.getClass();
        ih.p pVar = this.f14004a;
        ih.g Q = w.f(context, pVar).Q();
        qg.d dVar = new qg.d(pVar);
        boolean z10 = Q.f20083a;
        ih.p pVar2 = dVar.f29536a;
        if (z10) {
            hh.g.b(pVar2.f20105d, 0, new qg.c(dVar), 3);
            gh.a aVar = gh.c.f16512a;
            if (aVar != null) {
                aVar.c();
            }
            dh.a aVar2 = pVar2.f20103b;
            pg.n nVar = aVar2.f;
            aVar2.f = new pg.n(nVar.f28421a, false, nVar.f28423c);
            pVar2.f20106e.b(new u(context, 10, dVar));
        }
        if (!di.b.u(context, pVar)) {
            hh.g.b(pVar.f20105d, 0, new c(), 3);
            pVar2.f20106e.b(new androidx.emoji2.text.g(20, dVar, context, ih.b.OTHER));
        }
    }
}
