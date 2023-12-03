package n2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import g0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import n2.d0;
import x2.a;
/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class p implements c, u2.a {
    public static final String G = androidx.work.q.f("Processor");
    public final List<r> C;

    /* renamed from: v  reason: collision with root package name */
    public final Context f25840v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.work.b f25841w;

    /* renamed from: x  reason: collision with root package name */
    public final y2.a f25842x;

    /* renamed from: y  reason: collision with root package name */
    public final WorkDatabase f25843y;
    public final HashMap A = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final HashMap f25844z = new HashMap();
    public final HashSet D = new HashSet();
    public final ArrayList E = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public PowerManager.WakeLock f25839u = null;
    public final Object F = new Object();
    public final HashMap B = new HashMap();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final c f25845u;

        /* renamed from: v  reason: collision with root package name */
        public final v2.l f25846v;

        /* renamed from: w  reason: collision with root package name */
        public final rc.b<Boolean> f25847w;

        public a(c cVar, v2.l lVar, x2.c cVar2) {
            this.f25845u = cVar;
            this.f25846v = lVar;
            this.f25847w = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.f25847w.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f25845u.a(this.f25846v, z10);
        }
    }

    public p(Context context, androidx.work.b bVar, y2.b bVar2, WorkDatabase workDatabase, List list) {
        this.f25840v = context;
        this.f25841w = bVar;
        this.f25842x = bVar2;
        this.f25843y = workDatabase;
        this.C = list;
    }

    public static boolean d(d0 d0Var, String str) {
        if (d0Var != null) {
            d0Var.L = true;
            d0Var.h();
            d0Var.K.cancel(true);
            if (d0Var.f25812z != null && (d0Var.K.f37581u instanceof a.b)) {
                d0Var.f25812z.stop();
            } else {
                androidx.work.q.d().a(d0.M, "WorkSpec " + d0Var.f25811y + " is already done. Not interrupting.");
            }
            androidx.work.q d10 = androidx.work.q.d();
            String str2 = G;
            d10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        androidx.work.q d11 = androidx.work.q.d();
        String str3 = G;
        d11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    @Override // n2.c
    public final void a(v2.l lVar, boolean z10) {
        synchronized (this.F) {
            d0 d0Var = (d0) this.A.get(lVar.f34722a);
            if (d0Var != null && lVar.equals(ca.a.a0(d0Var.f25811y))) {
                this.A.remove(lVar.f34722a);
            }
            androidx.work.q d10 = androidx.work.q.d();
            String str = G;
            d10.a(str, p.class.getSimpleName() + " " + lVar.f34722a + " executed; reschedule = " + z10);
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(lVar, z10);
            }
        }
    }

    public final void b(c cVar) {
        synchronized (this.F) {
            this.E.add(cVar);
        }
    }

    public final v2.s c(String str) {
        synchronized (this.F) {
            d0 d0Var = (d0) this.f25844z.get(str);
            if (d0Var == null) {
                d0Var = (d0) this.A.get(str);
            }
            if (d0Var != null) {
                return d0Var.f25811y;
            }
            return null;
        }
    }

    public final boolean e(String str) {
        boolean contains;
        synchronized (this.F) {
            contains = this.D.contains(str);
        }
        return contains;
    }

    public final boolean f(String str) {
        boolean z10;
        synchronized (this.F) {
            if (!this.A.containsKey(str) && !this.f25844z.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final void g(c cVar) {
        synchronized (this.F) {
            this.E.remove(cVar);
        }
    }

    public final void h(v2.l lVar) {
        ((y2.b) this.f25842x).f38190c.execute(new o(0, this, lVar));
    }

    public final void i(String str, androidx.work.g gVar) {
        synchronized (this.F) {
            androidx.work.q d10 = androidx.work.q.d();
            String str2 = G;
            d10.e(str2, "Moving WorkSpec (" + str + ") to the foreground");
            d0 d0Var = (d0) this.A.remove(str);
            if (d0Var != null) {
                if (this.f25839u == null) {
                    PowerManager.WakeLock a10 = w2.s.a(this.f25840v, "ProcessorForegroundLck");
                    this.f25839u = a10;
                    a10.acquire();
                }
                this.f25844z.put(str, d0Var);
                Intent c10 = androidx.work.impl.foreground.a.c(this.f25840v, ca.a.a0(d0Var.f25811y), gVar);
                Context context = this.f25840v;
                Object obj = g0.a.f16164a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.f.b(context, c10);
                } else {
                    context.startService(c10);
                }
            }
        }
    }

    public final boolean j(t tVar, WorkerParameters.a aVar) {
        v2.l lVar = tVar.f25851a;
        String str = lVar.f34722a;
        ArrayList arrayList = new ArrayList();
        v2.s sVar = (v2.s) this.f25843y.m(new n(0, this, arrayList, str));
        if (sVar == null) {
            androidx.work.q d10 = androidx.work.q.d();
            String str2 = G;
            d10.g(str2, "Didn't find WorkSpec for id " + lVar);
            h(lVar);
            return false;
        }
        synchronized (this.F) {
            if (f(str)) {
                Set set = (Set) this.B.get(str);
                if (((t) set.iterator().next()).f25851a.f34723b == lVar.f34723b) {
                    set.add(tVar);
                    androidx.work.q d11 = androidx.work.q.d();
                    String str3 = G;
                    d11.a(str3, "Work " + lVar + " is already enqueued for processing");
                } else {
                    h(lVar);
                }
                return false;
            } else if (sVar.f34751t != lVar.f34723b) {
                h(lVar);
                return false;
            } else {
                d0.a aVar2 = new d0.a(this.f25840v, this.f25841w, this.f25842x, this, this.f25843y, sVar, arrayList);
                aVar2.f25818g = this.C;
                if (aVar != null) {
                    aVar2.f25820i = aVar;
                }
                d0 d0Var = new d0(aVar2);
                x2.c<Boolean> cVar = d0Var.J;
                cVar.d(new a(this, tVar.f25851a, cVar), ((y2.b) this.f25842x).f38190c);
                this.A.put(str, d0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(tVar);
                this.B.put(str, hashSet);
                ((y2.b) this.f25842x).f38188a.execute(d0Var);
                androidx.work.q d12 = androidx.work.q.d();
                String str4 = G;
                d12.a(str4, p.class.getSimpleName() + ": processing " + lVar);
                return true;
            }
        }
    }

    public final void k(String str) {
        synchronized (this.F) {
            this.f25844z.remove(str);
            l();
        }
    }

    public final void l() {
        synchronized (this.F) {
            if (!(!this.f25844z.isEmpty())) {
                Context context = this.f25840v;
                String str = androidx.work.impl.foreground.a.D;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f25840v.startService(intent);
                PowerManager.WakeLock wakeLock = this.f25839u;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f25839u = null;
                }
            }
        }
    }

    public final boolean m(t tVar) {
        d0 d0Var;
        String str = tVar.f25851a.f34722a;
        synchronized (this.F) {
            androidx.work.q d10 = androidx.work.q.d();
            String str2 = G;
            d10.a(str2, "Processor stopping foreground work " + str);
            d0Var = (d0) this.f25844z.remove(str);
            if (d0Var != null) {
                this.B.remove(str);
            }
        }
        return d(d0Var, str);
    }
}
