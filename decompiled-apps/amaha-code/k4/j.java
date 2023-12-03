package k4;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import e5.a;
import e5.d;
import i4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k4.h;
import k4.m;
/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public com.bumptech.glide.c B;
    public h4.e C;
    public com.bumptech.glide.d D;
    public p E;
    public int F;
    public int G;
    public l H;
    public h4.g I;
    public a<R> J;
    public int K;
    public int L;
    public int M;
    public long N;
    public boolean O;
    public Object P;
    public Thread Q;
    public h4.e R;
    public h4.e S;
    public Object T;
    public h4.a U;
    public i4.d<?> V;
    public volatile h W;
    public volatile boolean X;
    public volatile boolean Y;

    /* renamed from: x  reason: collision with root package name */
    public final d f22862x;

    /* renamed from: y  reason: collision with root package name */
    public final s0.d<j<?>> f22863y;

    /* renamed from: u  reason: collision with root package name */
    public final i<R> f22859u = new i<>();

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f22860v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    public final d.a f22861w = new d.a();

    /* renamed from: z  reason: collision with root package name */
    public final c<?> f22864z = new c<>();
    public final e A = new e();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final h4.a f22865a;

        public b(h4.a aVar) {
            this.f22865a = aVar;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public h4.e f22867a;

        /* renamed from: b  reason: collision with root package name */
        public h4.j<Z> f22868b;

        /* renamed from: c  reason: collision with root package name */
        public u<Z> f22869c;
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22870a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22871b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22872c;

        public final boolean a() {
            if ((this.f22872c || this.f22871b) && this.f22870a) {
                return true;
            }
            return false;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f22862x = dVar;
        this.f22863y = cVar;
    }

    public final void A() {
        Throwable th2;
        this.f22861w.a();
        if (this.X) {
            if (this.f22860v.isEmpty()) {
                th2 = null;
            } else {
                ArrayList arrayList = this.f22860v;
                th2 = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.X = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.D.ordinal() - jVar2.D.ordinal();
        if (ordinal == 0) {
            return this.K - jVar2.K;
        }
        return ordinal;
    }

    @Override // k4.h.a
    public final void d() {
        n4.a aVar;
        this.M = 2;
        n nVar = (n) this.J;
        if (nVar.H) {
            aVar = nVar.C;
        } else if (nVar.I) {
            aVar = nVar.D;
        } else {
            aVar = nVar.B;
        }
        aVar.execute(this);
    }

    @Override // k4.h.a
    public final void f(h4.e eVar, Exception exc, i4.d<?> dVar, h4.a aVar) {
        n4.a aVar2;
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        glideException.f5969v = eVar;
        glideException.f5970w = aVar;
        glideException.f5971x = a10;
        this.f22860v.add(glideException);
        if (Thread.currentThread() != this.Q) {
            this.M = 2;
            n nVar = (n) this.J;
            if (nVar.H) {
                aVar2 = nVar.C;
            } else if (nVar.I) {
                aVar2 = nVar.D;
            } else {
                aVar2 = nVar.B;
            }
            aVar2.execute(this);
            return;
        }
        y();
    }

    @Override // k4.h.a
    public final void h(h4.e eVar, Object obj, i4.d<?> dVar, h4.a aVar, h4.e eVar2) {
        n4.a aVar2;
        this.R = eVar;
        this.T = obj;
        this.V = dVar;
        this.U = aVar;
        this.S = eVar2;
        if (Thread.currentThread() != this.Q) {
            this.M = 3;
            n nVar = (n) this.J;
            if (nVar.H) {
                aVar2 = nVar.C;
            } else if (nVar.I) {
                aVar2 = nVar.D;
            } else {
                aVar2 = nVar.B;
            }
            aVar2.execute(this);
            return;
        }
        l();
    }

    @Override // e5.a.d
    public final d.a i() {
        return this.f22861w;
    }

    public final <Data> v<R> j(i4.d<?> dVar, Data data, h4.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            int i6 = d5.f.f12193b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v<R> k10 = k(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                r(elapsedRealtimeNanos, "Decoded result " + k10, null);
            }
            return k10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> k(Data data, h4.a aVar) {
        i4.e b10;
        boolean z10;
        t<Data, ?, R> c10 = this.f22859u.c(data.getClass());
        h4.g gVar = this.I;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != h4.a.RESOURCE_DISK_CACHE && !this.f22859u.r) {
                z10 = false;
            } else {
                z10 = true;
            }
            h4.f<Boolean> fVar = r4.i.f30404i;
            Boolean bool = (Boolean) gVar.c(fVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                gVar = new h4.g();
                gVar.f17172b.j(this.I.f17172b);
                gVar.f17172b.put(fVar, Boolean.valueOf(z10));
            }
        }
        h4.g gVar2 = gVar;
        i4.f fVar2 = this.B.f5941b.f5934e;
        synchronized (fVar2) {
            e.a aVar2 = (e.a) fVar2.f19811a.get(data.getClass());
            if (aVar2 == null) {
                Iterator it = fVar2.f19811a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar3 = (e.a) it.next();
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = i4.f.f19810b;
            }
            b10 = aVar2.b(data);
        }
        try {
            return c10.a(this.F, this.G, gVar2, b10, new b(aVar));
        } finally {
            b10.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        v vVar;
        boolean z10;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.N;
            r(j10, "Retrieved data", "data: " + this.T + ", cache key: " + this.R + ", fetcher: " + this.V);
        }
        u uVar = null;
        try {
            vVar = (v<R>) j(this.V, this.T, this.U);
        } catch (GlideException e10) {
            h4.e eVar = this.S;
            h4.a aVar = this.U;
            e10.f5969v = eVar;
            e10.f5970w = aVar;
            e10.f5971x = null;
            this.f22860v.add(e10);
            vVar = (v<R>) null;
        }
        if (vVar != null) {
            h4.a aVar2 = this.U;
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            boolean z11 = true;
            if (this.f22864z.f22869c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                uVar = (u) u.f22936y.b();
                kc.f.p(uVar);
                uVar.f22940x = false;
                uVar.f22939w = true;
                uVar.f22938v = vVar;
                vVar = uVar;
            }
            A();
            n nVar = (n) this.J;
            synchronized (nVar) {
                nVar.K = vVar;
                nVar.L = aVar2;
            }
            nVar.g();
            this.L = 5;
            try {
                c<?> cVar = this.f22864z;
                if (cVar.f22869c == null) {
                    z11 = false;
                }
                if (z11) {
                    d dVar = this.f22862x;
                    h4.g gVar = this.I;
                    cVar.getClass();
                    ((m.c) dVar).a().b(cVar.f22867a, new g(cVar.f22868b, cVar.f22869c, gVar));
                    cVar.f22869c.c();
                }
                u();
                return;
            } finally {
                if (uVar != null) {
                    uVar.c();
                }
            }
        }
        y();
    }

    public final h n() {
        int d10 = v.h.d(this.L);
        i<R> iVar = this.f22859u;
        if (d10 != 1) {
            if (d10 != 2) {
                if (d10 != 3) {
                    if (d10 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(defpackage.b.D(this.L)));
                }
                return new a0(iVar, this);
            }
            return new k4.e(iVar.a(), iVar, this);
        }
        return new w(iVar, this);
    }

    public final int p(int i6) {
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3 || i10 == 5) {
                            return 6;
                        }
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(defpackage.b.D(i6)));
                    } else if (this.O) {
                        return 6;
                    } else {
                        return 4;
                    }
                } else if (this.H.a()) {
                    return 3;
                } else {
                    return p(3);
                }
            } else if (this.H.b()) {
                return 2;
            } else {
                return p(2);
            }
        }
        throw null;
    }

    public final void r(long j10, String str, String str2) {
        String str3;
        StringBuilder d10 = v.g.d(str, " in ");
        d10.append(d5.f.a(j10));
        d10.append(", load key: ");
        d10.append(this.E);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        d10.append(str3);
        d10.append(", thread: ");
        d10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", d10.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        i4.d<?> dVar = this.V;
        try {
            try {
                if (this.Y) {
                    t();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                z();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th2;
            }
        } catch (k4.d e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.Y + ", stage: " + defpackage.b.D(this.L), th3);
            }
            if (this.L != 5) {
                this.f22860v.add(th3);
                t();
            }
            if (!this.Y) {
                throw th3;
            }
            throw th3;
        }
    }

    public final void t() {
        A();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f22860v));
        n nVar = (n) this.J;
        synchronized (nVar) {
            nVar.N = glideException;
        }
        nVar.f();
        v();
    }

    public final void u() {
        boolean a10;
        e eVar = this.A;
        synchronized (eVar) {
            eVar.f22871b = true;
            a10 = eVar.a();
        }
        if (a10) {
            x();
        }
    }

    public final void v() {
        boolean a10;
        e eVar = this.A;
        synchronized (eVar) {
            eVar.f22872c = true;
            a10 = eVar.a();
        }
        if (a10) {
            x();
        }
    }

    public final void w() {
        boolean a10;
        e eVar = this.A;
        synchronized (eVar) {
            eVar.f22870a = true;
            a10 = eVar.a();
        }
        if (a10) {
            x();
        }
    }

    public final void x() {
        e eVar = this.A;
        synchronized (eVar) {
            eVar.f22871b = false;
            eVar.f22870a = false;
            eVar.f22872c = false;
        }
        c<?> cVar = this.f22864z;
        cVar.f22867a = null;
        cVar.f22868b = null;
        cVar.f22869c = null;
        i<R> iVar = this.f22859u;
        iVar.f22845c = null;
        iVar.f22846d = null;
        iVar.f22855n = null;
        iVar.f22848g = null;
        iVar.f22852k = null;
        iVar.f22850i = null;
        iVar.f22856o = null;
        iVar.f22851j = null;
        iVar.f22857p = null;
        iVar.f22843a.clear();
        iVar.f22853l = false;
        iVar.f22844b.clear();
        iVar.f22854m = false;
        this.X = false;
        this.B = null;
        this.C = null;
        this.I = null;
        this.D = null;
        this.E = null;
        this.J = null;
        this.L = 0;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.N = 0L;
        this.Y = false;
        this.P = null;
        this.f22860v.clear();
        this.f22863y.a(this);
    }

    public final void y() {
        this.Q = Thread.currentThread();
        int i6 = d5.f.f12193b;
        this.N = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.Y && this.W != null && !(z10 = this.W.a())) {
            this.L = p(this.L);
            this.W = n();
            if (this.L == 4) {
                d();
                return;
            }
        }
        if ((this.L == 6 || this.Y) && !z10) {
            t();
        }
    }

    public final void z() {
        int d10 = v.h.d(this.M);
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 == 2) {
                    l();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(defpackage.e.y(this.M)));
            }
            y();
            return;
        }
        this.L = p(1);
        this.W = n();
        y();
    }
}
