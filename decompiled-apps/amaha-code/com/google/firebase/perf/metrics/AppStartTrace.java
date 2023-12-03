package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jf.e;
import kf.c;
import kf.f;
import kf.i;
import lf.k;
import lf.m;
import ne.u;
import sc.g;
/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, o {
    public static final i Q = new i();
    public static final long R = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace S;
    public static ExecutorService T;
    public final i B;
    public final i C;
    public hf.a L;

    /* renamed from: v  reason: collision with root package name */
    public final e f9791v;

    /* renamed from: w  reason: collision with root package name */
    public final df.b f9792w;

    /* renamed from: x  reason: collision with root package name */
    public final bf.a f9793x;

    /* renamed from: y  reason: collision with root package name */
    public final m.a f9794y;

    /* renamed from: z  reason: collision with root package name */
    public Context f9795z;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9790u = false;
    public boolean A = false;
    public i D = null;
    public i E = null;
    public i F = null;
    public i G = null;
    public i H = null;
    public i I = null;
    public i J = null;
    public i K = null;
    public boolean M = false;
    public int N = 0;
    public final a O = new a();
    public boolean P = false;

    /* loaded from: classes.dex */
    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.N++;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final AppStartTrace f9797u;

        public b(AppStartTrace appStartTrace) {
            this.f9797u = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.f9797u;
            if (appStartTrace.D == null) {
                appStartTrace.M = true;
            }
        }
    }

    public AppStartTrace(e eVar, df.b bVar, bf.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        i iVar;
        long startElapsedRealtime;
        i iVar2 = null;
        this.f9791v = eVar;
        this.f9792w = bVar;
        this.f9793x = aVar;
        T = threadPoolExecutor;
        m.a f02 = m.f0();
        f02.B("_experiment_app_start_ttid");
        this.f9794y = f02;
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(startElapsedRealtime);
            iVar = new i((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            iVar = null;
        }
        this.B = iVar;
        g gVar = (g) sc.e.e().c(g.class);
        if (gVar != null) {
            long a10 = gVar.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(a10);
            iVar2 = new i((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.C = iVar2;
    }

    public static AppStartTrace i() {
        if (S != null) {
            return S;
        }
        e eVar = e.M;
        df.b bVar = new df.b(17);
        if (S == null) {
            synchronized (AppStartTrace.class) {
                if (S == null) {
                    S = new AppStartTrace(eVar, bVar, bf.a.e(), new ThreadPoolExecutor(0, 1, R + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return S;
    }

    public static boolean k(Context context) {
        boolean z10;
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY);
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String f = pl.a.f(packageName, ":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(f))) {
                    if (Build.VERSION.SDK_INT < 23 && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        z10 = powerManager.isInteractive();
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final i h() {
        i iVar = this.C;
        if (iVar != null) {
            return iVar;
        }
        return Q;
    }

    public final i j() {
        i iVar = this.B;
        if (iVar != null) {
            return iVar;
        }
        return h();
    }

    public final void l(m.a aVar) {
        if (this.I != null && this.J != null && this.K != null) {
            T.execute(new u(this, 8, aVar));
            n();
        }
    }

    public final synchronized void m(Context context) {
        boolean z10;
        if (this.f9790u) {
            return;
        }
        z.C.f2476z.a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.P && !k(applicationContext)) {
                z10 = false;
                this.P = z10;
                this.f9790u = true;
                this.f9795z = applicationContext;
            }
            z10 = true;
            this.P = z10;
            this.f9790u = true;
            this.f9795z = applicationContext;
        }
    }

    public final synchronized void n() {
        if (!this.f9790u) {
            return;
        }
        z.C.f2476z.c(this);
        ((Application) this.f9795z).unregisterActivityLifecycleCallbacks(this);
        this.f9790u = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:15:0x001b, B:17:0x0042), top: B:25:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        i j10;
        i iVar;
        if (!this.M && this.D == null) {
            if (!this.P && !k(this.f9795z)) {
                z10 = false;
                this.P = z10;
                new WeakReference(activity);
                this.f9792w.getClass();
                this.D = new i();
                j10 = j();
                iVar = this.D;
                j10.getClass();
                if (iVar.f23323v - j10.f23323v > R) {
                    this.A = true;
                }
            }
            z10 = true;
            this.P = z10;
            new WeakReference(activity);
            this.f9792w.getClass();
            this.D = new i();
            j10 = j();
            iVar = this.D;
            j10.getClass();
            if (iVar.f23323v - j10.f23323v > R) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.M && !this.A && this.f9793x.f()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.O);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ef.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ef.a] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ef.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (!this.M && !this.A) {
            boolean f = this.f9793x.f();
            if (f) {
                View findViewById = activity.findViewById(16908290);
                findViewById.getViewTreeObserver().addOnDrawListener(this.O);
                boolean z10 = false;
                c cVar = new c(findViewById, new Runnable(this) { // from class: ef.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f13944v;

                    {
                        this.f13944v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i6 = r2;
                        AppStartTrace appStartTrace = this.f13944v;
                        switch (i6) {
                            case 0:
                                if (appStartTrace.K == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.K = new i();
                                    m.a f02 = m.f0();
                                    f02.B("_experiment_onDrawFoQ");
                                    f02.z(appStartTrace.j().f23322u);
                                    i j10 = appStartTrace.j();
                                    i iVar = appStartTrace.K;
                                    j10.getClass();
                                    f02.A(iVar.f23323v - j10.f23323v);
                                    m.a aVar = appStartTrace.f9794y;
                                    aVar.x(f02.r());
                                    if (appStartTrace.B != null) {
                                        m.a f03 = m.f0();
                                        f03.B("_experiment_procStart_to_classLoad");
                                        f03.z(appStartTrace.j().f23322u);
                                        i j11 = appStartTrace.j();
                                        i h10 = appStartTrace.h();
                                        j11.getClass();
                                        f03.A(h10.f23323v - j11.f23323v);
                                        aVar.x(f03.r());
                                    }
                                    if (appStartTrace.P) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    aVar.u();
                                    m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                    aVar.y(appStartTrace.N, "onDrawCount");
                                    k a10 = appStartTrace.L.a();
                                    aVar.u();
                                    m.R((m) aVar.f10073v, a10);
                                    appStartTrace.l(aVar);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.I == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.I = new i();
                                    long j12 = appStartTrace.j().f23322u;
                                    m.a aVar2 = appStartTrace.f9794y;
                                    aVar2.z(j12);
                                    i j13 = appStartTrace.j();
                                    i iVar2 = appStartTrace.I;
                                    j13.getClass();
                                    aVar2.A(iVar2.f23323v - j13.f23323v);
                                    appStartTrace.l(aVar2);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.J == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.J = new i();
                                    m.a f04 = m.f0();
                                    f04.B("_experiment_preDrawFoQ");
                                    f04.z(appStartTrace.j().f23322u);
                                    i j14 = appStartTrace.j();
                                    i iVar3 = appStartTrace.J;
                                    j14.getClass();
                                    f04.A(iVar3.f23323v - j14.f23323v);
                                    m.a aVar3 = appStartTrace.f9794y;
                                    aVar3.x(f04.r());
                                    appStartTrace.l(aVar3);
                                    return;
                                }
                                return;
                            default:
                                i iVar4 = AppStartTrace.Q;
                                appStartTrace.getClass();
                                m.a f05 = m.f0();
                                f05.B("_as");
                                f05.z(appStartTrace.h().f23322u);
                                i h11 = appStartTrace.h();
                                i iVar5 = appStartTrace.F;
                                h11.getClass();
                                f05.A(iVar5.f23323v - h11.f23323v);
                                ArrayList arrayList = new ArrayList(3);
                                m.a f06 = m.f0();
                                f06.B("_astui");
                                f06.z(appStartTrace.h().f23322u);
                                i h12 = appStartTrace.h();
                                i iVar6 = appStartTrace.D;
                                h12.getClass();
                                f06.A(iVar6.f23323v - h12.f23323v);
                                arrayList.add(f06.r());
                                m.a f07 = m.f0();
                                f07.B("_astfd");
                                f07.z(appStartTrace.D.f23322u);
                                i iVar7 = appStartTrace.D;
                                i iVar8 = appStartTrace.E;
                                iVar7.getClass();
                                f07.A(iVar8.f23323v - iVar7.f23323v);
                                arrayList.add(f07.r());
                                m.a f08 = m.f0();
                                f08.B("_asti");
                                f08.z(appStartTrace.E.f23322u);
                                i iVar9 = appStartTrace.E;
                                i iVar10 = appStartTrace.F;
                                iVar9.getClass();
                                f08.A(iVar10.f23323v - iVar9.f23323v);
                                arrayList.add(f08.r());
                                f05.u();
                                m.P((m) f05.f10073v, arrayList);
                                k a11 = appStartTrace.L.a();
                                f05.u();
                                m.R((m) f05.f10073v, a11);
                                lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                                appStartTrace.f9791v.c(f05.r(), dVar);
                                return;
                        }
                    }
                });
                if (Build.VERSION.SDK_INT < 26) {
                    if (findViewById.getViewTreeObserver().isAlive() && findViewById.isAttachedToWindow()) {
                        z10 = true;
                    }
                    if (!z10) {
                        findViewById.addOnAttachStateChangeListener(new kf.b(cVar));
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new f(findViewById, new Runnable(this) { // from class: ef.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f13944v;

                            {
                                this.f13944v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                int i6 = r2;
                                AppStartTrace appStartTrace = this.f13944v;
                                switch (i6) {
                                    case 0:
                                        if (appStartTrace.K == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.K = new i();
                                            m.a f02 = m.f0();
                                            f02.B("_experiment_onDrawFoQ");
                                            f02.z(appStartTrace.j().f23322u);
                                            i j10 = appStartTrace.j();
                                            i iVar = appStartTrace.K;
                                            j10.getClass();
                                            f02.A(iVar.f23323v - j10.f23323v);
                                            m.a aVar = appStartTrace.f9794y;
                                            aVar.x(f02.r());
                                            if (appStartTrace.B != null) {
                                                m.a f03 = m.f0();
                                                f03.B("_experiment_procStart_to_classLoad");
                                                f03.z(appStartTrace.j().f23322u);
                                                i j11 = appStartTrace.j();
                                                i h10 = appStartTrace.h();
                                                j11.getClass();
                                                f03.A(h10.f23323v - j11.f23323v);
                                                aVar.x(f03.r());
                                            }
                                            if (appStartTrace.P) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            aVar.u();
                                            m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                            aVar.y(appStartTrace.N, "onDrawCount");
                                            k a10 = appStartTrace.L.a();
                                            aVar.u();
                                            m.R((m) aVar.f10073v, a10);
                                            appStartTrace.l(aVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.I == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.I = new i();
                                            long j12 = appStartTrace.j().f23322u;
                                            m.a aVar2 = appStartTrace.f9794y;
                                            aVar2.z(j12);
                                            i j13 = appStartTrace.j();
                                            i iVar2 = appStartTrace.I;
                                            j13.getClass();
                                            aVar2.A(iVar2.f23323v - j13.f23323v);
                                            appStartTrace.l(aVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.J == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.J = new i();
                                            m.a f04 = m.f0();
                                            f04.B("_experiment_preDrawFoQ");
                                            f04.z(appStartTrace.j().f23322u);
                                            i j14 = appStartTrace.j();
                                            i iVar3 = appStartTrace.J;
                                            j14.getClass();
                                            f04.A(iVar3.f23323v - j14.f23323v);
                                            m.a aVar3 = appStartTrace.f9794y;
                                            aVar3.x(f04.r());
                                            appStartTrace.l(aVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar4 = AppStartTrace.Q;
                                        appStartTrace.getClass();
                                        m.a f05 = m.f0();
                                        f05.B("_as");
                                        f05.z(appStartTrace.h().f23322u);
                                        i h11 = appStartTrace.h();
                                        i iVar5 = appStartTrace.F;
                                        h11.getClass();
                                        f05.A(iVar5.f23323v - h11.f23323v);
                                        ArrayList arrayList = new ArrayList(3);
                                        m.a f06 = m.f0();
                                        f06.B("_astui");
                                        f06.z(appStartTrace.h().f23322u);
                                        i h12 = appStartTrace.h();
                                        i iVar6 = appStartTrace.D;
                                        h12.getClass();
                                        f06.A(iVar6.f23323v - h12.f23323v);
                                        arrayList.add(f06.r());
                                        m.a f07 = m.f0();
                                        f07.B("_astfd");
                                        f07.z(appStartTrace.D.f23322u);
                                        i iVar7 = appStartTrace.D;
                                        i iVar8 = appStartTrace.E;
                                        iVar7.getClass();
                                        f07.A(iVar8.f23323v - iVar7.f23323v);
                                        arrayList.add(f07.r());
                                        m.a f08 = m.f0();
                                        f08.B("_asti");
                                        f08.z(appStartTrace.E.f23322u);
                                        i iVar9 = appStartTrace.E;
                                        i iVar10 = appStartTrace.F;
                                        iVar9.getClass();
                                        f08.A(iVar10.f23323v - iVar9.f23323v);
                                        arrayList.add(f08.r());
                                        f05.u();
                                        m.P((m) f05.f10073v, arrayList);
                                        k a11 = appStartTrace.L.a();
                                        f05.u();
                                        m.R((m) f05.f10073v, a11);
                                        lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                                        appStartTrace.f9791v.c(f05.r(), dVar);
                                        return;
                                }
                            }
                        }, new Runnable(this) { // from class: ef.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f13944v;

                            {
                                this.f13944v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                int i6 = r2;
                                AppStartTrace appStartTrace = this.f13944v;
                                switch (i6) {
                                    case 0:
                                        if (appStartTrace.K == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.K = new i();
                                            m.a f02 = m.f0();
                                            f02.B("_experiment_onDrawFoQ");
                                            f02.z(appStartTrace.j().f23322u);
                                            i j10 = appStartTrace.j();
                                            i iVar = appStartTrace.K;
                                            j10.getClass();
                                            f02.A(iVar.f23323v - j10.f23323v);
                                            m.a aVar = appStartTrace.f9794y;
                                            aVar.x(f02.r());
                                            if (appStartTrace.B != null) {
                                                m.a f03 = m.f0();
                                                f03.B("_experiment_procStart_to_classLoad");
                                                f03.z(appStartTrace.j().f23322u);
                                                i j11 = appStartTrace.j();
                                                i h10 = appStartTrace.h();
                                                j11.getClass();
                                                f03.A(h10.f23323v - j11.f23323v);
                                                aVar.x(f03.r());
                                            }
                                            if (appStartTrace.P) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            aVar.u();
                                            m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                            aVar.y(appStartTrace.N, "onDrawCount");
                                            k a10 = appStartTrace.L.a();
                                            aVar.u();
                                            m.R((m) aVar.f10073v, a10);
                                            appStartTrace.l(aVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.I == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.I = new i();
                                            long j12 = appStartTrace.j().f23322u;
                                            m.a aVar2 = appStartTrace.f9794y;
                                            aVar2.z(j12);
                                            i j13 = appStartTrace.j();
                                            i iVar2 = appStartTrace.I;
                                            j13.getClass();
                                            aVar2.A(iVar2.f23323v - j13.f23323v);
                                            appStartTrace.l(aVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.J == null) {
                                            appStartTrace.f9792w.getClass();
                                            appStartTrace.J = new i();
                                            m.a f04 = m.f0();
                                            f04.B("_experiment_preDrawFoQ");
                                            f04.z(appStartTrace.j().f23322u);
                                            i j14 = appStartTrace.j();
                                            i iVar3 = appStartTrace.J;
                                            j14.getClass();
                                            f04.A(iVar3.f23323v - j14.f23323v);
                                            m.a aVar3 = appStartTrace.f9794y;
                                            aVar3.x(f04.r());
                                            appStartTrace.l(aVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar4 = AppStartTrace.Q;
                                        appStartTrace.getClass();
                                        m.a f05 = m.f0();
                                        f05.B("_as");
                                        f05.z(appStartTrace.h().f23322u);
                                        i h11 = appStartTrace.h();
                                        i iVar5 = appStartTrace.F;
                                        h11.getClass();
                                        f05.A(iVar5.f23323v - h11.f23323v);
                                        ArrayList arrayList = new ArrayList(3);
                                        m.a f06 = m.f0();
                                        f06.B("_astui");
                                        f06.z(appStartTrace.h().f23322u);
                                        i h12 = appStartTrace.h();
                                        i iVar6 = appStartTrace.D;
                                        h12.getClass();
                                        f06.A(iVar6.f23323v - h12.f23323v);
                                        arrayList.add(f06.r());
                                        m.a f07 = m.f0();
                                        f07.B("_astfd");
                                        f07.z(appStartTrace.D.f23322u);
                                        i iVar7 = appStartTrace.D;
                                        i iVar8 = appStartTrace.E;
                                        iVar7.getClass();
                                        f07.A(iVar8.f23323v - iVar7.f23323v);
                                        arrayList.add(f07.r());
                                        m.a f08 = m.f0();
                                        f08.B("_asti");
                                        f08.z(appStartTrace.E.f23322u);
                                        i iVar9 = appStartTrace.E;
                                        i iVar10 = appStartTrace.F;
                                        iVar9.getClass();
                                        f08.A(iVar10.f23323v - iVar9.f23323v);
                                        arrayList.add(f08.r());
                                        f05.u();
                                        m.P((m) f05.f10073v, arrayList);
                                        k a11 = appStartTrace.L.a();
                                        f05.u();
                                        m.R((m) f05.f10073v, a11);
                                        lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                                        appStartTrace.f9791v.c(f05.r(), dVar);
                                        return;
                                }
                            }
                        }));
                    }
                }
                findViewById.getViewTreeObserver().addOnDrawListener(cVar);
                findViewById.getViewTreeObserver().addOnPreDrawListener(new f(findViewById, new Runnable(this) { // from class: ef.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f13944v;

                    {
                        this.f13944v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i6 = r2;
                        AppStartTrace appStartTrace = this.f13944v;
                        switch (i6) {
                            case 0:
                                if (appStartTrace.K == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.K = new i();
                                    m.a f02 = m.f0();
                                    f02.B("_experiment_onDrawFoQ");
                                    f02.z(appStartTrace.j().f23322u);
                                    i j10 = appStartTrace.j();
                                    i iVar = appStartTrace.K;
                                    j10.getClass();
                                    f02.A(iVar.f23323v - j10.f23323v);
                                    m.a aVar = appStartTrace.f9794y;
                                    aVar.x(f02.r());
                                    if (appStartTrace.B != null) {
                                        m.a f03 = m.f0();
                                        f03.B("_experiment_procStart_to_classLoad");
                                        f03.z(appStartTrace.j().f23322u);
                                        i j11 = appStartTrace.j();
                                        i h10 = appStartTrace.h();
                                        j11.getClass();
                                        f03.A(h10.f23323v - j11.f23323v);
                                        aVar.x(f03.r());
                                    }
                                    if (appStartTrace.P) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    aVar.u();
                                    m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                    aVar.y(appStartTrace.N, "onDrawCount");
                                    k a10 = appStartTrace.L.a();
                                    aVar.u();
                                    m.R((m) aVar.f10073v, a10);
                                    appStartTrace.l(aVar);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.I == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.I = new i();
                                    long j12 = appStartTrace.j().f23322u;
                                    m.a aVar2 = appStartTrace.f9794y;
                                    aVar2.z(j12);
                                    i j13 = appStartTrace.j();
                                    i iVar2 = appStartTrace.I;
                                    j13.getClass();
                                    aVar2.A(iVar2.f23323v - j13.f23323v);
                                    appStartTrace.l(aVar2);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.J == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.J = new i();
                                    m.a f04 = m.f0();
                                    f04.B("_experiment_preDrawFoQ");
                                    f04.z(appStartTrace.j().f23322u);
                                    i j14 = appStartTrace.j();
                                    i iVar3 = appStartTrace.J;
                                    j14.getClass();
                                    f04.A(iVar3.f23323v - j14.f23323v);
                                    m.a aVar3 = appStartTrace.f9794y;
                                    aVar3.x(f04.r());
                                    appStartTrace.l(aVar3);
                                    return;
                                }
                                return;
                            default:
                                i iVar4 = AppStartTrace.Q;
                                appStartTrace.getClass();
                                m.a f05 = m.f0();
                                f05.B("_as");
                                f05.z(appStartTrace.h().f23322u);
                                i h11 = appStartTrace.h();
                                i iVar5 = appStartTrace.F;
                                h11.getClass();
                                f05.A(iVar5.f23323v - h11.f23323v);
                                ArrayList arrayList = new ArrayList(3);
                                m.a f06 = m.f0();
                                f06.B("_astui");
                                f06.z(appStartTrace.h().f23322u);
                                i h12 = appStartTrace.h();
                                i iVar6 = appStartTrace.D;
                                h12.getClass();
                                f06.A(iVar6.f23323v - h12.f23323v);
                                arrayList.add(f06.r());
                                m.a f07 = m.f0();
                                f07.B("_astfd");
                                f07.z(appStartTrace.D.f23322u);
                                i iVar7 = appStartTrace.D;
                                i iVar8 = appStartTrace.E;
                                iVar7.getClass();
                                f07.A(iVar8.f23323v - iVar7.f23323v);
                                arrayList.add(f07.r());
                                m.a f08 = m.f0();
                                f08.B("_asti");
                                f08.z(appStartTrace.E.f23322u);
                                i iVar9 = appStartTrace.E;
                                i iVar10 = appStartTrace.F;
                                iVar9.getClass();
                                f08.A(iVar10.f23323v - iVar9.f23323v);
                                arrayList.add(f08.r());
                                f05.u();
                                m.P((m) f05.f10073v, arrayList);
                                k a11 = appStartTrace.L.a();
                                f05.u();
                                m.R((m) f05.f10073v, a11);
                                lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                                appStartTrace.f9791v.c(f05.r(), dVar);
                                return;
                        }
                    }
                }, new Runnable(this) { // from class: ef.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f13944v;

                    {
                        this.f13944v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i6 = r2;
                        AppStartTrace appStartTrace = this.f13944v;
                        switch (i6) {
                            case 0:
                                if (appStartTrace.K == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.K = new i();
                                    m.a f02 = m.f0();
                                    f02.B("_experiment_onDrawFoQ");
                                    f02.z(appStartTrace.j().f23322u);
                                    i j10 = appStartTrace.j();
                                    i iVar = appStartTrace.K;
                                    j10.getClass();
                                    f02.A(iVar.f23323v - j10.f23323v);
                                    m.a aVar = appStartTrace.f9794y;
                                    aVar.x(f02.r());
                                    if (appStartTrace.B != null) {
                                        m.a f03 = m.f0();
                                        f03.B("_experiment_procStart_to_classLoad");
                                        f03.z(appStartTrace.j().f23322u);
                                        i j11 = appStartTrace.j();
                                        i h10 = appStartTrace.h();
                                        j11.getClass();
                                        f03.A(h10.f23323v - j11.f23323v);
                                        aVar.x(f03.r());
                                    }
                                    if (appStartTrace.P) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    aVar.u();
                                    m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                    aVar.y(appStartTrace.N, "onDrawCount");
                                    k a10 = appStartTrace.L.a();
                                    aVar.u();
                                    m.R((m) aVar.f10073v, a10);
                                    appStartTrace.l(aVar);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.I == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.I = new i();
                                    long j12 = appStartTrace.j().f23322u;
                                    m.a aVar2 = appStartTrace.f9794y;
                                    aVar2.z(j12);
                                    i j13 = appStartTrace.j();
                                    i iVar2 = appStartTrace.I;
                                    j13.getClass();
                                    aVar2.A(iVar2.f23323v - j13.f23323v);
                                    appStartTrace.l(aVar2);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.J == null) {
                                    appStartTrace.f9792w.getClass();
                                    appStartTrace.J = new i();
                                    m.a f04 = m.f0();
                                    f04.B("_experiment_preDrawFoQ");
                                    f04.z(appStartTrace.j().f23322u);
                                    i j14 = appStartTrace.j();
                                    i iVar3 = appStartTrace.J;
                                    j14.getClass();
                                    f04.A(iVar3.f23323v - j14.f23323v);
                                    m.a aVar3 = appStartTrace.f9794y;
                                    aVar3.x(f04.r());
                                    appStartTrace.l(aVar3);
                                    return;
                                }
                                return;
                            default:
                                i iVar4 = AppStartTrace.Q;
                                appStartTrace.getClass();
                                m.a f05 = m.f0();
                                f05.B("_as");
                                f05.z(appStartTrace.h().f23322u);
                                i h11 = appStartTrace.h();
                                i iVar5 = appStartTrace.F;
                                h11.getClass();
                                f05.A(iVar5.f23323v - h11.f23323v);
                                ArrayList arrayList = new ArrayList(3);
                                m.a f06 = m.f0();
                                f06.B("_astui");
                                f06.z(appStartTrace.h().f23322u);
                                i h12 = appStartTrace.h();
                                i iVar6 = appStartTrace.D;
                                h12.getClass();
                                f06.A(iVar6.f23323v - h12.f23323v);
                                arrayList.add(f06.r());
                                m.a f07 = m.f0();
                                f07.B("_astfd");
                                f07.z(appStartTrace.D.f23322u);
                                i iVar7 = appStartTrace.D;
                                i iVar8 = appStartTrace.E;
                                iVar7.getClass();
                                f07.A(iVar8.f23323v - iVar7.f23323v);
                                arrayList.add(f07.r());
                                m.a f08 = m.f0();
                                f08.B("_asti");
                                f08.z(appStartTrace.E.f23322u);
                                i iVar9 = appStartTrace.E;
                                i iVar10 = appStartTrace.F;
                                iVar9.getClass();
                                f08.A(iVar10.f23323v - iVar9.f23323v);
                                arrayList.add(f08.r());
                                f05.u();
                                m.P((m) f05.f10073v, arrayList);
                                k a11 = appStartTrace.L.a();
                                f05.u();
                                m.R((m) f05.f10073v, a11);
                                lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                                appStartTrace.f9791v.c(f05.r(), dVar);
                                return;
                        }
                    }
                }));
            }
            if (this.F != null) {
                return;
            }
            new WeakReference(activity);
            this.f9792w.getClass();
            this.F = new i();
            this.L = SessionManager.getInstance().perfSession();
            df.a d10 = df.a.d();
            StringBuilder sb2 = new StringBuilder("onResume(): ");
            sb2.append(activity.getClass().getName());
            sb2.append(": ");
            i h10 = h();
            i iVar = this.F;
            h10.getClass();
            sb2.append(iVar.f23323v - h10.f23323v);
            sb2.append(" microseconds");
            d10.a(sb2.toString());
            T.execute(new Runnable(this) { // from class: ef.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ AppStartTrace f13944v;

                {
                    this.f13944v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    int i6 = r2;
                    AppStartTrace appStartTrace = this.f13944v;
                    switch (i6) {
                        case 0:
                            if (appStartTrace.K == null) {
                                appStartTrace.f9792w.getClass();
                                appStartTrace.K = new i();
                                m.a f02 = m.f0();
                                f02.B("_experiment_onDrawFoQ");
                                f02.z(appStartTrace.j().f23322u);
                                i j10 = appStartTrace.j();
                                i iVar2 = appStartTrace.K;
                                j10.getClass();
                                f02.A(iVar2.f23323v - j10.f23323v);
                                m.a aVar = appStartTrace.f9794y;
                                aVar.x(f02.r());
                                if (appStartTrace.B != null) {
                                    m.a f03 = m.f0();
                                    f03.B("_experiment_procStart_to_classLoad");
                                    f03.z(appStartTrace.j().f23322u);
                                    i j11 = appStartTrace.j();
                                    i h102 = appStartTrace.h();
                                    j11.getClass();
                                    f03.A(h102.f23323v - j11.f23323v);
                                    aVar.x(f03.r());
                                }
                                if (appStartTrace.P) {
                                    str = "true";
                                } else {
                                    str = "false";
                                }
                                aVar.u();
                                m.Q((m) aVar.f10073v).put("systemDeterminedForeground", str);
                                aVar.y(appStartTrace.N, "onDrawCount");
                                k a10 = appStartTrace.L.a();
                                aVar.u();
                                m.R((m) aVar.f10073v, a10);
                                appStartTrace.l(aVar);
                                return;
                            }
                            return;
                        case 1:
                            if (appStartTrace.I == null) {
                                appStartTrace.f9792w.getClass();
                                appStartTrace.I = new i();
                                long j12 = appStartTrace.j().f23322u;
                                m.a aVar2 = appStartTrace.f9794y;
                                aVar2.z(j12);
                                i j13 = appStartTrace.j();
                                i iVar22 = appStartTrace.I;
                                j13.getClass();
                                aVar2.A(iVar22.f23323v - j13.f23323v);
                                appStartTrace.l(aVar2);
                                return;
                            }
                            return;
                        case 2:
                            if (appStartTrace.J == null) {
                                appStartTrace.f9792w.getClass();
                                appStartTrace.J = new i();
                                m.a f04 = m.f0();
                                f04.B("_experiment_preDrawFoQ");
                                f04.z(appStartTrace.j().f23322u);
                                i j14 = appStartTrace.j();
                                i iVar3 = appStartTrace.J;
                                j14.getClass();
                                f04.A(iVar3.f23323v - j14.f23323v);
                                m.a aVar3 = appStartTrace.f9794y;
                                aVar3.x(f04.r());
                                appStartTrace.l(aVar3);
                                return;
                            }
                            return;
                        default:
                            i iVar4 = AppStartTrace.Q;
                            appStartTrace.getClass();
                            m.a f05 = m.f0();
                            f05.B("_as");
                            f05.z(appStartTrace.h().f23322u);
                            i h11 = appStartTrace.h();
                            i iVar5 = appStartTrace.F;
                            h11.getClass();
                            f05.A(iVar5.f23323v - h11.f23323v);
                            ArrayList arrayList = new ArrayList(3);
                            m.a f06 = m.f0();
                            f06.B("_astui");
                            f06.z(appStartTrace.h().f23322u);
                            i h12 = appStartTrace.h();
                            i iVar6 = appStartTrace.D;
                            h12.getClass();
                            f06.A(iVar6.f23323v - h12.f23323v);
                            arrayList.add(f06.r());
                            m.a f07 = m.f0();
                            f07.B("_astfd");
                            f07.z(appStartTrace.D.f23322u);
                            i iVar7 = appStartTrace.D;
                            i iVar8 = appStartTrace.E;
                            iVar7.getClass();
                            f07.A(iVar8.f23323v - iVar7.f23323v);
                            arrayList.add(f07.r());
                            m.a f08 = m.f0();
                            f08.B("_asti");
                            f08.z(appStartTrace.E.f23322u);
                            i iVar9 = appStartTrace.E;
                            i iVar10 = appStartTrace.F;
                            iVar9.getClass();
                            f08.A(iVar10.f23323v - iVar9.f23323v);
                            arrayList.add(f08.r());
                            f05.u();
                            m.P((m) f05.f10073v, arrayList);
                            k a11 = appStartTrace.L.a();
                            f05.u();
                            m.R((m) f05.f10073v, a11);
                            lf.d dVar = lf.d.FOREGROUND_BACKGROUND;
                            appStartTrace.f9791v.c(f05.r(), dVar);
                            return;
                    }
                }
            });
            if (!f) {
                n();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.M && this.E == null && !this.A) {
            this.f9792w.getClass();
            this.E = new i();
        }
    }

    @y(j.b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.M && !this.A && this.H == null) {
            this.f9792w.getClass();
            this.H = new i();
            m.a f02 = m.f0();
            f02.B("_experiment_firstBackgrounding");
            f02.z(j().f23322u);
            i j10 = j();
            i iVar = this.H;
            j10.getClass();
            f02.A(iVar.f23323v - j10.f23323v);
            this.f9794y.x(f02.r());
        }
    }

    @y(j.b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.M && !this.A && this.G == null) {
            this.f9792w.getClass();
            this.G = new i();
            m.a f02 = m.f0();
            f02.B("_experiment_firstForegrounding");
            f02.z(j().f23322u);
            i j10 = j();
            i iVar = this.G;
            j10.getClass();
            f02.A(iVar.f23323v - j10.f23323v);
            this.f9794y.x(f02.r());
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
