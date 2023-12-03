package k4;

import com.bumptech.glide.load.engine.GlideException;
import e5.a;
import e5.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k4.j;
import k4.q;
/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public final class n<R> implements j.a<R>, a.d {
    public static final c S = new c();
    public final n4.a A;
    public final n4.a B;
    public final n4.a C;
    public final n4.a D;
    public final AtomicInteger E;
    public h4.e F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public v<?> K;
    public h4.a L;
    public boolean M;
    public GlideException N;
    public boolean O;
    public q<?> P;
    public j<R> Q;
    public volatile boolean R;

    /* renamed from: u  reason: collision with root package name */
    public final e f22904u;

    /* renamed from: v  reason: collision with root package name */
    public final d.a f22905v;

    /* renamed from: w  reason: collision with root package name */
    public final q.a f22906w;

    /* renamed from: x  reason: collision with root package name */
    public final s0.d<n<?>> f22907x;

    /* renamed from: y  reason: collision with root package name */
    public final c f22908y;

    /* renamed from: z  reason: collision with root package name */
    public final o f22909z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final z4.g f22910u;

        public a(z4.g gVar) {
            this.f22910u = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            z4.h hVar = (z4.h) this.f22910u;
            hVar.f39167b.a();
            synchronized (hVar.f39168c) {
                synchronized (n.this) {
                    e eVar = n.this.f22904u;
                    z4.g gVar = this.f22910u;
                    eVar.getClass();
                    if (eVar.f22916u.contains(new d(gVar, d5.e.f12190b))) {
                        n nVar = n.this;
                        z4.g gVar2 = this.f22910u;
                        nVar.getClass();
                        ((z4.h) gVar2).k(nVar.N, 5);
                    }
                    n.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final z4.g f22912u;

        public b(z4.g gVar) {
            this.f22912u = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            z4.h hVar = (z4.h) this.f22912u;
            hVar.f39167b.a();
            synchronized (hVar.f39168c) {
                synchronized (n.this) {
                    e eVar = n.this.f22904u;
                    z4.g gVar = this.f22912u;
                    eVar.getClass();
                    if (eVar.f22916u.contains(new d(gVar, d5.e.f12190b))) {
                        n.this.P.c();
                        n nVar = n.this;
                        z4.g gVar2 = this.f22912u;
                        nVar.getClass();
                        z4.h hVar2 = (z4.h) gVar2;
                        hVar2.l(nVar.L, nVar.P);
                        n.this.j(this.f22912u);
                    }
                    n.this.c();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final z4.g f22914a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f22915b;

        public d(z4.g gVar, Executor executor) {
            this.f22914a = gVar;
            this.f22915b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f22914a.equals(((d) obj).f22914a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f22914a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: u  reason: collision with root package name */
        public final List<d> f22916u;

        public e(ArrayList arrayList) {
            this.f22916u = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f22916u.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(n4.a aVar, n4.a aVar2, n4.a aVar3, n4.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = S;
        this.f22904u = new e(new ArrayList(2));
        this.f22905v = new d.a();
        this.E = new AtomicInteger();
        this.A = aVar;
        this.B = aVar2;
        this.C = aVar3;
        this.D = aVar4;
        this.f22909z = oVar;
        this.f22906w = aVar5;
        this.f22907x = cVar;
        this.f22908y = cVar2;
    }

    public final synchronized void a(z4.g gVar, Executor executor) {
        this.f22905v.a();
        e eVar = this.f22904u;
        eVar.getClass();
        eVar.f22916u.add(new d(gVar, executor));
        boolean z10 = true;
        if (this.M) {
            d(1);
            executor.execute(new b(gVar));
        } else if (this.O) {
            d(1);
            executor.execute(new a(gVar));
        } else {
            if (this.R) {
                z10 = false;
            }
            kc.f.n("Cannot add callbacks to a cancelled EngineJob", z10);
        }
    }

    public final void b() {
        HashMap hashMap;
        if (e()) {
            return;
        }
        this.R = true;
        j<R> jVar = this.Q;
        jVar.Y = true;
        h hVar = jVar.W;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.f22909z;
        h4.e eVar = this.F;
        m mVar = (m) oVar;
        synchronized (mVar) {
            s sVar = mVar.f22882a;
            sVar.getClass();
            if (this.J) {
                hashMap = sVar.f22932b;
            } else {
                hashMap = sVar.f22931a;
            }
            if (equals(hashMap.get(eVar))) {
                hashMap.remove(eVar);
            }
        }
    }

    public final void c() {
        boolean z10;
        q<?> qVar;
        synchronized (this) {
            this.f22905v.a();
            kc.f.n("Not yet complete!", e());
            int decrementAndGet = this.E.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kc.f.n("Can't decrement below 0", z10);
            if (decrementAndGet == 0) {
                qVar = this.P;
                h();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.d();
        }
    }

    public final synchronized void d(int i6) {
        q<?> qVar;
        kc.f.n("Not yet complete!", e());
        if (this.E.getAndAdd(i6) == 0 && (qVar = this.P) != null) {
            qVar.c();
        }
    }

    public final boolean e() {
        if (!this.O && !this.M && !this.R) {
            return false;
        }
        return true;
    }

    public final void f() {
        synchronized (this) {
            this.f22905v.a();
            if (this.R) {
                h();
            } else if (!this.f22904u.f22916u.isEmpty()) {
                if (!this.O) {
                    this.O = true;
                    h4.e eVar = this.F;
                    e eVar2 = this.f22904u;
                    eVar2.getClass();
                    ArrayList<d> arrayList = new ArrayList(eVar2.f22916u);
                    d(arrayList.size() + 1);
                    ((m) this.f22909z).f(this, eVar, null);
                    for (d dVar : arrayList) {
                        dVar.f22915b.execute(new a(dVar.f22914a));
                    }
                    c();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    public final void g() {
        synchronized (this) {
            this.f22905v.a();
            if (this.R) {
                this.K.recycle();
                h();
            } else if (!this.f22904u.f22916u.isEmpty()) {
                if (!this.M) {
                    c cVar = this.f22908y;
                    v<?> vVar = this.K;
                    boolean z10 = this.G;
                    h4.e eVar = this.F;
                    q.a aVar = this.f22906w;
                    cVar.getClass();
                    this.P = new q<>(vVar, z10, true, eVar, aVar);
                    this.M = true;
                    e eVar2 = this.f22904u;
                    eVar2.getClass();
                    ArrayList<d> arrayList = new ArrayList(eVar2.f22916u);
                    d(arrayList.size() + 1);
                    ((m) this.f22909z).f(this, this.F, this.P);
                    for (d dVar : arrayList) {
                        dVar.f22915b.execute(new b(dVar.f22914a));
                    }
                    c();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public final synchronized void h() {
        if (this.F != null) {
            this.f22904u.f22916u.clear();
            this.F = null;
            this.P = null;
            this.K = null;
            this.O = false;
            this.R = false;
            this.M = false;
            this.Q.w();
            this.Q = null;
            this.N = null;
            this.L = null;
            this.f22907x.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // e5.a.d
    public final d.a i() {
        return this.f22905v;
    }

    public final synchronized void j(z4.g gVar) {
        boolean z10;
        this.f22905v.a();
        e eVar = this.f22904u;
        eVar.getClass();
        eVar.f22916u.remove(new d(gVar, d5.e.f12190b));
        if (this.f22904u.f22916u.isEmpty()) {
            b();
            if (!this.M && !this.O) {
                z10 = false;
                if (z10 && this.E.get() == 0) {
                    h();
                }
            }
            z10 = true;
            if (z10) {
                h();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        r0 = r3.A;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void k(j<R> jVar) {
        n4.a aVar;
        this.Q = jVar;
        boolean z10 = true;
        int p10 = jVar.p(1);
        if (p10 != 2 && p10 != 3) {
            z10 = false;
        }
        if (this.H) {
            aVar = this.C;
        } else if (this.I) {
            aVar = this.D;
        } else {
            aVar = this.B;
        }
        aVar.execute(jVar);
    }
}
