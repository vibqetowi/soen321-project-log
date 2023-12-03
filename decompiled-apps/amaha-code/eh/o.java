package eh;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import com.moengage.core.internal.lifecycle.GlobalApplicationLifecycleObserver;
import com.moengage.core.internal.push.PushManager;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.core.internal.push.fcm.FcmHandler;
import com.moengage.core.internal.push.mipush.MiPushHandler;
import com.moengage.core.internal.push.pushamp.PushAmpHandler;
import com.moengage.core.internal.push.pushkit.PushKitHandler;
import hh.g;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import yg.s;
import yg.y;
/* compiled from: LifecycleManager.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static GlobalApplicationLifecycleObserver f14030b;

    /* renamed from: c  reason: collision with root package name */
    public static n f14031c;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<fh.a> f14029a = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: d  reason: collision with root package name */
    public static final Object f14032d = new Object();

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f14033u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager addObserver() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f14034u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager addObserver() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f14035u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager onAppBackground() : Application goes to background.";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f14036u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager onAppForeground() : Application in foreground.";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f14037u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager onAppForeground() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f14038u = new f();

        public f() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager registerActivityLifecycleObserver() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f14039u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager registerActivityLifecycleObserver() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f14040u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager registerForApplicationLifecycle() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final i f14041u = new i();

        public i() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager registerForApplicationLifecycle() : ";
        }
    }

    /* compiled from: LifecycleManager.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f14042u = new j();

        public j() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LifecycleManager registerForObservers() : ";
        }
    }

    public static void a() {
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, a.f14033u, 3);
            GlobalApplicationLifecycleObserver globalApplicationLifecycleObserver = f14030b;
            if (globalApplicationLifecycleObserver == null) {
                return;
            }
            z.C.f2476z.a(globalApplicationLifecycleObserver);
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, b.f14034u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0013, B:11:0x002d, B:14:0x0037, B:15:0x003a, B:6:0x0022), top: B:24:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context) {
        ScheduledExecutorService scheduledExecutorService;
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, c.f14035u, 3);
        hc.d.A = false;
        ScheduledExecutorService scheduledExecutorService2 = yg.n.f38599a;
        try {
            g.a.b(0, yg.r.f38615u, 3);
            g.a.b(0, y.f38622u, 3);
            scheduledExecutorService = yg.n.f38599a;
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, s.f38616u);
        }
        try {
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                z10 = true;
                if (z10) {
                    g.a.b(0, yg.z.f38623u, 3);
                    ScheduledExecutorService scheduledExecutorService3 = yg.n.f38599a;
                    if (scheduledExecutorService3 != null) {
                        scheduledExecutorService3.shutdownNow();
                    }
                }
                yg.n.f38600b.a(context);
                bh.b.a().execute(new yg.m(context, 1));
                return;
            }
            bh.b.a().execute(new yg.m(context, 1));
            return;
        } catch (Throwable th3) {
            hh.a aVar3 = hh.g.f17610d;
            g.a.a(1, th3, r.f14045u);
            return;
        }
        z10 = false;
        if (z10) {
        }
        yg.n.f38600b.a(context);
    }

    public static void c(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, d.f14036u, 3);
            hc.d.A = true;
            yg.n.d(context);
            PushManager.f10185a.getClass();
            try {
                PushBaseHandler pushBaseHandler = PushManager.f10186b;
                if (pushBaseHandler != null) {
                    pushBaseHandler.onAppOpen(context);
                }
                FcmHandler fcmHandler = PushManager.f10187c;
                if (fcmHandler != null) {
                    fcmHandler.registerForPushToken(context);
                }
                PushKitHandler pushKitHandler = PushManager.f10189e;
                if (pushKitHandler != null) {
                    pushKitHandler.onAppOpen(context);
                }
                MiPushHandler miPushHandler = PushManager.f10188d;
                if (miPushHandler != null) {
                    miPushHandler.onAppOpen(context);
                }
            } catch (Exception e10) {
                hh.a aVar2 = hh.g.f17610d;
                g.a.a(1, e10, rh.e.f30721u);
            }
            ch.a aVar3 = ch.c.f5286a;
            if (aVar3 != null) {
                aVar3.initialiseModule(context);
            }
            PushManager.f10185a.getClass();
            FcmHandler fcmHandler2 = PushManager.f10187c;
            if (fcmHandler2 != null) {
                fcmHandler2.initialiseModule(context);
            }
            MiPushHandler miPushHandler2 = PushManager.f10188d;
            if (miPushHandler2 != null) {
                miPushHandler2.initialiseModule(context);
            }
            PushAmpHandler pushAmpHandler = sh.b.f31571a;
            if (pushAmpHandler != null) {
                pushAmpHandler.initialise(context);
            }
            tg.a aVar4 = tg.c.f33009a;
            if (aVar4 != null) {
                aVar4.c();
            }
            yh.a aVar5 = yh.c.f38625a;
            if (aVar5 != null) {
                aVar5.c();
            }
        } catch (Throwable th2) {
            hh.a aVar6 = hh.g.f17610d;
            g.a.a(1, th2, e.f14037u);
        }
    }

    public static void d(Application application) {
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, f.f14038u, 3);
            if (f14031c != null) {
                return;
            }
            synchronized (f14032d) {
                if (f14031c == null) {
                    n nVar = new n();
                    f14031c = nVar;
                    application.registerActivityLifecycleCallbacks(nVar);
                }
                hs.k kVar = hs.k.f19476a;
            }
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, g.f14039u);
        }
    }

    public static void e(Context context) {
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, h.f14040u, 3);
            if (f14030b != null) {
                return;
            }
            synchronized (f14032d) {
                if (f14030b != null) {
                    return;
                }
                f14030b = new GlobalApplicationLifecycleObserver(context);
                if (di.b.s()) {
                    a();
                    hs.k kVar = hs.k.f19476a;
                } else {
                    new Handler(Looper.getMainLooper()).post(new i5.b(17));
                }
            }
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, i.f14041u);
        }
    }

    public static void f(Application application) {
        kotlin.jvm.internal.i.g(application, "application");
        synchronized (f14032d) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, j.f14042u, 3);
            Context applicationContext = application.getApplicationContext();
            kotlin.jvm.internal.i.f(applicationContext, "application.applicationContext");
            e(applicationContext);
            d(application);
            hs.k kVar = hs.k.f19476a;
        }
    }
}
