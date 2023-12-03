package q5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import h5.p;
import h5.w;
import j5.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import w5.e0;
import w5.l;
import w5.m;
import w5.n;
import w5.o;
import w5.v;
/* compiled from: ActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f29137a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final String f29138b;

    /* renamed from: c  reason: collision with root package name */
    public static final ScheduledExecutorService f29139c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile ScheduledFuture<?> f29140d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f29141e;
    public static final AtomicInteger f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile j f29142g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicBoolean f29143h;

    /* renamed from: i  reason: collision with root package name */
    public static String f29144i;

    /* renamed from: j  reason: collision with root package name */
    public static long f29145j;

    /* renamed from: k  reason: collision with root package name */
    public static int f29146k;

    /* renamed from: l  reason: collision with root package name */
    public static WeakReference<Activity> f29147l;

    /* compiled from: ActivityLifecycleTracker.kt */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.i.g(activity, "activity");
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivityCreated");
            int i6 = d.f29148a;
            c.f29139c.execute(new i5.b(9));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.i.g(activity, "activity");
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivityDestroyed");
            c.f29137a.getClass();
            l5.b bVar = l5.b.f24059a;
            if (!b6.a.b(l5.b.class)) {
                try {
                    l5.c a10 = l5.c.f.a();
                    if (!b6.a.b(a10)) {
                        a10.f24071e.remove(Integer.valueOf(activity.hashCode()));
                    }
                } catch (Throwable th2) {
                    b6.a.a(l5.b.class, th2);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ScheduledFuture<?> scheduledFuture;
            kotlin.jvm.internal.i.g(activity, "activity");
            v.a aVar = v.f36544d;
            w wVar = w.APP_EVENTS;
            String str = c.f29138b;
            v.a.a(wVar, str, "onActivityPaused");
            int i6 = d.f29148a;
            c.f29137a.getClass();
            AtomicInteger atomicInteger = c.f;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
                Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
            }
            synchronized (c.f29141e) {
                if (c.f29140d != null && (scheduledFuture = c.f29140d) != null) {
                    scheduledFuture.cancel(false);
                }
                c.f29140d = null;
                hs.k kVar = hs.k.f19476a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String l2 = e0.l(activity);
            l5.b bVar = l5.b.f24059a;
            if (!b6.a.b(l5.b.class)) {
                try {
                    if (l5.b.f.get()) {
                        l5.c.f.a().c(activity);
                        l5.e eVar = l5.b.f24062d;
                        if (eVar != null && !b6.a.b(eVar) && eVar.f24086b.get() != null) {
                            try {
                                Timer timer = eVar.f24087c;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                eVar.f24087c = null;
                            } catch (Exception e10) {
                                Log.e(l5.e.f24084e, "Error unscheduling indexing job", e10);
                            }
                        }
                        SensorManager sensorManager = l5.b.f24061c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(l5.b.f24060b);
                        }
                    }
                } catch (Throwable th2) {
                    b6.a.a(l5.b.class, th2);
                }
            }
            c.f29139c.execute(new q5.a(l2, currentTimeMillis, 0));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Boolean bool;
            ScheduledFuture<?> scheduledFuture;
            kotlin.jvm.internal.i.g(activity, "activity");
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivityResumed");
            int i6 = d.f29148a;
            c.f29147l = new WeakReference<>(activity);
            c.f.incrementAndGet();
            c.f29137a.getClass();
            synchronized (c.f29141e) {
                if (c.f29140d != null && (scheduledFuture = c.f29140d) != null) {
                    scheduledFuture.cancel(false);
                }
                bool = null;
                c.f29140d = null;
                hs.k kVar = hs.k.f19476a;
            }
            long currentTimeMillis = System.currentTimeMillis();
            c.f29145j = currentTimeMillis;
            String l2 = e0.l(activity);
            l5.f fVar = l5.b.f24060b;
            if (!b6.a.b(l5.b.class)) {
                try {
                    if (l5.b.f.get()) {
                        l5.c.f.a().a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String b10 = p.b();
                        o b11 = w5.p.b(b10);
                        if (b11 != null) {
                            bool = Boolean.valueOf(b11.f36518h);
                        }
                        boolean b12 = kotlin.jvm.internal.i.b(bool, Boolean.TRUE);
                        l5.b bVar = l5.b.f24059a;
                        if (!b12) {
                            bVar.getClass();
                            b6.a.b(bVar);
                        } else {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                l5.b.f24061c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                l5.e eVar = new l5.e(activity);
                                l5.b.f24062d = eVar;
                                dd.a aVar2 = new dd.a(b11, 1, b10);
                                fVar.getClass();
                                if (!b6.a.b(fVar)) {
                                    fVar.f24091a = aVar2;
                                }
                                sensorManager.registerListener(fVar, defaultSensor, 2);
                                if (b11 != null && b11.f36518h) {
                                    eVar.c();
                                }
                            }
                        }
                        bVar.getClass();
                        b6.a.b(bVar);
                    }
                } catch (Throwable th2) {
                    b6.a.a(l5.b.class, th2);
                }
            }
            j5.a aVar3 = j5.a.f21671a;
            if (!b6.a.b(j5.a.class)) {
                try {
                    if (j5.a.f21672b) {
                        CopyOnWriteArraySet copyOnWriteArraySet = j5.c.f21674d;
                        if (!new HashSet(j5.c.a()).isEmpty()) {
                            HashMap hashMap = j5.d.f21678y;
                            d.a.b(activity);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th3) {
                    b6.a.a(j5.a.class, th3);
                }
            }
            u5.d.d(activity);
            o5.h.a();
            c.f29139c.execute(new b(currentTimeMillis, activity.getApplicationContext(), l2));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.i.g(activity, "activity");
            kotlin.jvm.internal.i.g(outState, "outState");
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.i.g(activity, "activity");
            c.f29146k++;
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.i.g(activity, "activity");
            v.a aVar = v.f36544d;
            v.a.a(w.APP_EVENTS, c.f29138b, "onActivityStopped");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i5.i.f19861c;
            String str = i5.f.f19852a;
            if (!b6.a.b(i5.f.class)) {
                try {
                    i5.f.f19855d.execute(new i5.b(2));
                } catch (Throwable th2) {
                    b6.a.a(i5.f.class, th2);
                }
            }
            c.f29146k--;
        }
    }

    static {
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f29138b = canonicalName;
        f29139c = Executors.newSingleThreadScheduledExecutor();
        f29141e = new Object();
        f = new AtomicInteger(0);
        f29143h = new AtomicBoolean(false);
    }

    public static final UUID a() {
        j jVar;
        if (f29142g == null || (jVar = f29142g) == null) {
            return null;
        }
        return jVar.f29171c;
    }

    public static final void b(Application application, String str) {
        if (!f29143h.compareAndSet(false, true)) {
            return;
        }
        w5.l lVar = w5.l.f36497a;
        n.c(new m(new p7.b(13), l.b.CodelessEvents));
        f29144i = str;
        application.registerActivityLifecycleCallbacks(new a());
    }
}
