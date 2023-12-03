package nd;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26132a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f26133b;

    /* renamed from: c  reason: collision with root package name */
    public final z f26134c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26135d;

    /* renamed from: e  reason: collision with root package name */
    public z f26136e;
    public z f;

    /* renamed from: g  reason: collision with root package name */
    public t f26137g;

    /* renamed from: h  reason: collision with root package name */
    public final h0 f26138h;

    /* renamed from: i  reason: collision with root package name */
    public final sd.b f26139i;

    /* renamed from: j  reason: collision with root package name */
    public final md.b f26140j;

    /* renamed from: k  reason: collision with root package name */
    public final ld.a f26141k;

    /* renamed from: l  reason: collision with root package name */
    public final ExecutorService f26142l;

    /* renamed from: m  reason: collision with root package name */
    public final g f26143m;

    /* renamed from: n  reason: collision with root package name */
    public final kd.a f26144n;

    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes.dex */
    public class a implements Callable<Boolean> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            try {
                z zVar = x.this.f26136e;
                sd.b bVar = (sd.b) zVar.f26149c;
                bVar.getClass();
                boolean delete = new File(bVar.f31460b, (String) zVar.f26148b).delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public x(sc.e eVar, h0 h0Var, kd.b bVar, d0 d0Var, jd.a aVar, jd.a aVar2, sd.b bVar2, ExecutorService executorService) {
        this.f26133b = d0Var;
        eVar.b();
        this.f26132a = eVar.f31432a;
        this.f26138h = h0Var;
        this.f26144n = bVar;
        this.f26140j = aVar;
        this.f26141k = aVar2;
        this.f26142l = executorService;
        this.f26139i = bVar2;
        this.f26143m = new g(executorService);
        this.f26135d = System.currentTimeMillis();
        this.f26134c = new z(1);
    }

    public static ya.h a(final x xVar, ud.f fVar) {
        ya.h d10;
        if (Boolean.TRUE.equals(xVar.f26143m.f26062d.get())) {
            xVar.f26136e.e();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    xVar.f26140j.a(new md.a() { // from class: nd.u
                        @Override // md.a
                        public final void a(String str) {
                            x xVar2 = x.this;
                            xVar2.getClass();
                            t tVar = xVar2.f26137g;
                            tVar.getClass();
                            tVar.f26116e.a(new p(tVar, System.currentTimeMillis() - xVar2.f26135d, str));
                        }
                    });
                    ud.d dVar = (ud.d) fVar;
                    if (!dVar.b().f34001b.f34005a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        d10 = ya.k.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    } else {
                        if (!xVar.f26137g.d(dVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        d10 = xVar.f26137g.f(dVar.f34017i.get().f38392a);
                    }
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                    d10 = ya.k.d(e10);
                }
                return d10;
            } finally {
                xVar.c();
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(ud.d dVar) {
        Future<?> submit = this.f26142l.submit(new w(this, dVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        this.f26143m.a(new a());
    }
}
