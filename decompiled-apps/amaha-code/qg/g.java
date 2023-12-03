package qg;

import android.app.Application;
import android.content.Context;
import com.moengage.core.internal.lifecycle.ApplicationLifecycleObserver;
/* compiled from: CoreController.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f29546a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29547b;

    /* renamed from: c  reason: collision with root package name */
    public final ug.b f29548c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f29549d;

    /* renamed from: e  reason: collision with root package name */
    public final hs.i f29550e;
    public ApplicationLifecycleObserver f;

    /* renamed from: g  reason: collision with root package name */
    public eh.a f29551g;

    /* renamed from: h  reason: collision with root package name */
    public final eh.g f29552h;

    /* renamed from: i  reason: collision with root package name */
    public final eh.d f29553i;

    /* compiled from: CoreController.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<vg.d> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final vg.d invoke() {
            return new vg.d(g.this.f29546a);
        }
    }

    /* compiled from: CoreController.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackEvent() : ", g.this.f29547b);
        }
    }

    public g(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f29546a = sdkInstance;
        this.f29547b = "Core_CoreController";
        this.f29548c = new ug.b(sdkInstance);
        this.f29549d = new f0(sdkInstance);
        this.f29550e = sp.b.O(new a());
        this.f29552h = new eh.g(sdkInstance);
        this.f29553i = new eh.d(sdkInstance);
    }

    public static void b(g gVar, Context context) {
        ih.p pVar = gVar.f29546a;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.g.b(pVar.f20105d, 0, new q(gVar), 3);
            w.f29578a.getClass();
            if (w.f(context, pVar).f() + 3600000 < System.currentTimeMillis()) {
                pVar.f20106e.a(new ah.e("SYNC_CONFIG", true, new e(context, gVar)));
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new r(gVar));
        }
    }

    public final void a(Application application) {
        kotlin.jvm.internal.i.g(application, "application");
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "application.applicationContext");
        synchronized (ng.a.class) {
            try {
                hh.g.b(this.f29546a.f20105d, 0, new j(this), 3);
            } catch (Throwable th2) {
                this.f29546a.f20105d.a(1, th2, new m(this));
                hs.k kVar = hs.k.f19476a;
            }
            if (this.f != null) {
                hh.g.b(this.f29546a.f20105d, 0, new k(this), 3);
            } else {
                Context applicationContext2 = applicationContext.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext2, "context.applicationContext");
                this.f = new ApplicationLifecycleObserver(applicationContext2, this.f29546a);
                if (di.b.s()) {
                    ApplicationLifecycleObserver applicationLifecycleObserver = this.f;
                    if (applicationLifecycleObserver != null) {
                        androidx.lifecycle.z.C.f2476z.a(applicationLifecycleObserver);
                    }
                    hs.k kVar2 = hs.k.f19476a;
                } else {
                    hh.g.b(this.f29546a.f20105d, 0, new l(this), 3);
                    bh.b.f4298b.post(new je.o(10, this));
                }
            }
        }
        ih.p pVar = this.f29546a;
        hh.g.b(pVar.f20105d, 0, new i(this), 3);
        if (this.f29551g == null) {
            eh.a aVar = new eh.a(pVar, this.f29553i);
            this.f29551g = aVar;
            application.registerActivityLifecycleCallbacks(aVar);
        }
    }

    public final void c(Context context, String eventName, ng.c cVar) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(eventName, "eventName");
        try {
            this.f29548c.a(context, eventName, cVar);
        } catch (Throwable th2) {
            this.f29546a.f20105d.a(1, th2, new b());
        }
    }
}
