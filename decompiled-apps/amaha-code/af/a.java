package af;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import f0.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import jf.e;
import kf.h;
import kf.i;
import lf.k;
import lf.m;
/* compiled from: AppStateMonitor.java */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static final df.a L = df.a.d();
    public static volatile a M;
    public final HashSet A;
    public final AtomicInteger B;
    public final e C;
    public final bf.a D;
    public final df.b E;
    public final boolean F;
    public i G;
    public i H;
    public lf.d I;
    public boolean J;
    public boolean K;

    /* renamed from: u  reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f529u;

    /* renamed from: v  reason: collision with root package name */
    public final WeakHashMap<Activity, d> f530v;

    /* renamed from: w  reason: collision with root package name */
    public final WeakHashMap<Activity, c> f531w;

    /* renamed from: x  reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f532x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap f533y;

    /* renamed from: z  reason: collision with root package name */
    public final HashSet f534z;

    /* compiled from: AppStateMonitor.java */
    /* renamed from: af.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0010a {
        void a();
    }

    /* compiled from: AppStateMonitor.java */
    /* loaded from: classes.dex */
    public interface b {
        void onUpdateAppState(lf.d dVar);
    }

    public a(e eVar, df.b bVar) {
        bf.a e10 = bf.a.e();
        df.a aVar = d.f540e;
        this.f529u = new WeakHashMap<>();
        this.f530v = new WeakHashMap<>();
        this.f531w = new WeakHashMap<>();
        this.f532x = new WeakHashMap<>();
        this.f533y = new HashMap();
        this.f534z = new HashSet();
        this.A = new HashSet();
        this.B = new AtomicInteger(0);
        this.I = lf.d.BACKGROUND;
        this.J = false;
        this.K = true;
        this.C = eVar;
        this.E = bVar;
        this.D = e10;
        this.F = true;
    }

    public static a a() {
        if (M == null) {
            synchronized (a.class) {
                if (M == null) {
                    M = new a(e.M, new df.b(17));
                }
            }
        }
        return M;
    }

    public final void b(String str) {
        synchronized (this.f533y) {
            Long l2 = (Long) this.f533y.get(str);
            if (l2 == null) {
                this.f533y.put(str, 1L);
            } else {
                this.f533y.put(str, Long.valueOf(l2.longValue() + 1));
            }
        }
    }

    public final void c(ze.d dVar) {
        synchronized (this.A) {
            this.A.add(dVar);
        }
    }

    public final void d(WeakReference<b> weakReference) {
        synchronized (this.f534z) {
            this.f534z.add(weakReference);
        }
    }

    public final void e() {
        synchronized (this.A) {
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                InterfaceC0010a interfaceC0010a = (InterfaceC0010a) it.next();
                if (interfaceC0010a != null) {
                    interfaceC0010a.a();
                }
            }
        }
    }

    public final void f(Activity activity) {
        kf.e<ef.c> eVar;
        WeakHashMap<Activity, Trace> weakHashMap = this.f532x;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        d dVar = this.f530v.get(activity);
        l lVar = dVar.f542b;
        boolean z10 = dVar.f544d;
        df.a aVar = d.f540e;
        if (!z10) {
            aVar.a("Cannot stop because no recording was started");
            eVar = new kf.e<>();
        } else {
            Map<Fragment, ef.c> map = dVar.f543c;
            if (!map.isEmpty()) {
                aVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            kf.e<ef.c> a10 = dVar.a();
            try {
                lVar.f14636a.c(dVar.f541a);
            } catch (IllegalArgumentException | NullPointerException e10) {
                if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e10;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                a10 = new kf.e<>();
            }
            lVar.f14636a.d();
            dVar.f544d = false;
            eVar = a10;
        }
        if (!eVar.b()) {
            L.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        h.a(trace, eVar.a());
        trace.stop();
    }

    public final void g(String str, i iVar, i iVar2) {
        if (!this.D.u()) {
            return;
        }
        m.a f02 = m.f0();
        f02.B(str);
        f02.z(iVar.f23322u);
        f02.A(iVar2.f23323v - iVar.f23323v);
        k a10 = SessionManager.getInstance().perfSession().a();
        f02.u();
        m.R((m) f02.f10073v, a10);
        int andSet = this.B.getAndSet(0);
        synchronized (this.f533y) {
            HashMap hashMap = this.f533y;
            f02.u();
            m.N((m) f02.f10073v).putAll(hashMap);
            if (andSet != 0) {
                f02.y(andSet, "_tsns");
            }
            this.f533y.clear();
        }
        this.C.c(f02.r(), lf.d.FOREGROUND_BACKGROUND);
    }

    public final void h(Activity activity) {
        if (this.F && this.D.u()) {
            d dVar = new d(activity);
            this.f530v.put(activity, dVar);
            if (activity instanceof p) {
                c cVar = new c(this.E, this.C, this, dVar);
                this.f531w.put(activity, cVar);
                ((p) activity).getSupportFragmentManager().f2317n.f2299a.add(new w.a(cVar, true));
            }
        }
    }

    public final void i(lf.d dVar) {
        this.I = dVar;
        synchronized (this.f534z) {
            Iterator it = this.f534z.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.I);
                } else {
                    it.remove();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f530v.remove(activity);
        WeakHashMap<Activity, c> weakHashMap = this.f531w;
        if (weakHashMap.containsKey(activity)) {
            ((p) activity).getSupportFragmentManager().p0(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f529u.isEmpty()) {
            this.E.getClass();
            this.G = new i();
            this.f529u.put(activity, Boolean.TRUE);
            if (this.K) {
                i(lf.d.FOREGROUND);
                e();
                this.K = false;
            } else {
                g("_bs", this.H, this.G);
                i(lf.d.FOREGROUND);
            }
        } else {
            this.f529u.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.F && this.D.u()) {
            if (!this.f530v.containsKey(activity)) {
                h(activity);
            }
            d dVar = this.f530v.get(activity);
            boolean z10 = dVar.f544d;
            Activity activity2 = dVar.f541a;
            if (z10) {
                d.f540e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
            } else {
                dVar.f542b.f14636a.a(activity2);
                dVar.f544d = true;
            }
            Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.C, this.E, this);
            trace.start();
            this.f532x.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        if (this.F) {
            f(activity);
        }
        if (this.f529u.containsKey(activity)) {
            this.f529u.remove(activity);
            if (this.f529u.isEmpty()) {
                this.E.getClass();
                i iVar = new i();
                this.H = iVar;
                g("_fs", this.G, iVar);
                i(lf.d.BACKGROUND);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
