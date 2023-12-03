package yg;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.PersistableBundle;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import hh.g;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ReportsManager.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f38599a;

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f38600b = new d0();

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f38601u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f38601u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(this.f38601u, "Core_ReportsManager backgroundSync() : SyncType: ");
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f38602u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager batchAndSyncDataAsync() : ";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f38603u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager batchData() : ";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f38604u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager onAppOpen() : ";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f38605u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager scheduleRetry() : Will schedule retry if required.";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f38606u = new f();

        public f() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager scheduleRetry() : Scheduling 1st attempt retry";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f38607u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager scheduleRetry() : Scheduling 2nd attempt retry";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f38608u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager backgroundSync() : Max retry exceeded. stopping";
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ long f38609u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f38610v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i6, long j10) {
            super(0);
            this.f38609u = j10;
            this.f38610v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return "Core_ReportsManager scheduleRetry() : Scheduling retry. Interval: " + this.f38609u + ", attempt count: " + this.f38610v;
        }
    }

    /* compiled from: ReportsManager.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f38611u = new j();

        public j() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_ReportsManager syncDataForAllInstances() : ";
        }
    }

    public static void a(Context context, nd.z zVar, String str) {
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new a(str), 3);
        bh.b.a().submit(new androidx.emoji2.text.g(24, context, zVar, str));
    }

    public static void b(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g.b(sdkInstance.f20105d, 0, b.f38602u, 3);
        qg.w.f29578a.getClass();
        qg.w.e(sdkInstance).a(context);
    }

    public static void c(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g.b(sdkInstance.f20105d, 0, c.f38603u, 3);
        qg.w.f29578a.getClass();
        qg.w.e(sdkInstance).b(context);
    }

    public static void d(Context context) {
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, d.f38604u, 3);
        try {
            g.a.b(0, t.f38617u, 3);
            LinkedHashMap sdkInstances = qg.g0.f29557b;
            kotlin.jvm.internal.i.g(sdkInstances, "sdkInstances");
            loop0: while (true) {
                z10 = true;
                for (ih.p pVar : sdkInstances.values()) {
                    if (z10) {
                        pVar.f20103b.f12862i.getClass();
                        if (pVar.f20104c.f33012c.f28434j) {
                            break;
                        }
                    }
                    z10 = false;
                }
            }
            if (z10) {
                m mVar = new m(context, 0);
                long d10 = ug.l.d(qg.g0.f29557b);
                hh.a aVar2 = hh.g.f17610d;
                g.a.b(0, new u(d10), 3);
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                f38599a = newScheduledThreadPool;
                if (newScheduledThreadPool != null) {
                    newScheduledThreadPool.scheduleWithFixedDelay(mVar, d10, d10, TimeUnit.SECONDS);
                }
            }
        } catch (Throwable th2) {
            hh.a aVar3 = hh.g.f17610d;
            g.a.a(1, th2, v.f38619u);
        }
    }

    public static void e(Context context, long j10, int i6) {
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new i(i6, j10), 3);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("ATTEMPT_COUNT", i6);
        com.google.android.gms.internal.p000firebaseauthapi.z zVar = new com.google.android.gms.internal.p000firebaseauthapi.z(90004, j10, "SYNC_TYPE_BACKGROUND_SYNC_RETRY", persistableBundle);
        d0 d0Var = f38600b;
        d0Var.getClass();
        g.a.b(0, new g0(d0Var, zVar), 3);
        d0Var.c(context, zVar);
    }

    public static void f(nd.z zVar, Context context) {
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, e.f38605u, 3);
        int i6 = ((JobParameters) zVar.f26148b).getExtras().getInt("ATTEMPT_COUNT", -1);
        if (i6 != -1) {
            if (i6 != 1) {
                g.a.b(0, h.f38608u, 3);
                return;
            }
            g.a.b(0, g.f38607u, 3);
            e(context, vs.c.f36135u.d(SubsamplingScaleImageView.ORIENTATION_180, 300), 2);
            return;
        }
        g.a.b(0, f.f38606u, 3);
        e(context, vs.c.f36135u.d(60, SubsamplingScaleImageView.ORIENTATION_180), 1);
    }

    public static boolean g(Context context) {
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, j.f38611u, 3);
        LinkedHashMap linkedHashMap = qg.g0.f29557b;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(linkedHashMap.size(), 5));
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        CountDownLatch countDownLatch = new CountDownLatch(linkedHashMap.size());
        for (ih.p pVar : linkedHashMap.values()) {
            newFixedThreadPool.submit(new u5.f(uVar, pVar, context, countDownLatch, 3));
        }
        countDownLatch.await();
        return uVar.f23466u;
    }
}
