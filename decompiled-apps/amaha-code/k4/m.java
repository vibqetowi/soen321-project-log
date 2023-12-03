package k4;

import android.os.SystemClock;
import android.util.Log;
import e5.a;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import k4.c;
import k4.j;
import k4.q;
import m4.a;
import m4.h;
/* compiled from: Engine.java */
/* loaded from: classes.dex */
public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f22881h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final s f22882a;

    /* renamed from: b  reason: collision with root package name */
    public final df.b f22883b;

    /* renamed from: c  reason: collision with root package name */
    public final m4.h f22884c;

    /* renamed from: d  reason: collision with root package name */
    public final b f22885d;

    /* renamed from: e  reason: collision with root package name */
    public final y f22886e;
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final k4.c f22887g;

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f22888a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f22889b = e5.a.a(150, new C0352a());

        /* renamed from: c  reason: collision with root package name */
        public int f22890c;

        /* compiled from: Engine.java */
        /* renamed from: k4.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0352a implements a.b<j<?>> {
            public C0352a() {
            }

            @Override // e5.a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.f22888a, aVar.f22889b);
            }
        }

        public a(c cVar) {
            this.f22888a = cVar;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final n4.a f22892a;

        /* renamed from: b  reason: collision with root package name */
        public final n4.a f22893b;

        /* renamed from: c  reason: collision with root package name */
        public final n4.a f22894c;

        /* renamed from: d  reason: collision with root package name */
        public final n4.a f22895d;

        /* renamed from: e  reason: collision with root package name */
        public final o f22896e;
        public final q.a f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f22897g = e5.a.a(150, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes.dex */
        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // e5.a.b
            public final n<?> a() {
                b bVar = b.this;
                return new n<>(bVar.f22892a, bVar.f22893b, bVar.f22894c, bVar.f22895d, bVar.f22896e, bVar.f, bVar.f22897g);
            }
        }

        public b(n4.a aVar, n4.a aVar2, n4.a aVar3, n4.a aVar4, o oVar, q.a aVar5) {
            this.f22892a = aVar;
            this.f22893b = aVar2;
            this.f22894c = aVar3;
            this.f22895d = aVar4;
            this.f22896e = oVar;
            this.f = aVar5;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0400a f22899a;

        /* renamed from: b  reason: collision with root package name */
        public volatile m4.a f22900b;

        public c(a.InterfaceC0400a interfaceC0400a) {
            this.f22899a = interfaceC0400a;
        }

        public final m4.a a() {
            if (this.f22900b == null) {
                synchronized (this) {
                    if (this.f22900b == null) {
                        m4.c cVar = (m4.c) this.f22899a;
                        m4.e eVar = (m4.e) cVar.f24810b;
                        File cacheDir = eVar.f24816a.getCacheDir();
                        m4.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f24817b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.mkdirs() || (cacheDir.exists() && cacheDir.isDirectory()))) {
                            dVar = new m4.d(cacheDir, cVar.f24809a);
                        }
                        this.f22900b = dVar;
                    }
                    if (this.f22900b == null) {
                        this.f22900b = new hc.d();
                    }
                }
            }
            return this.f22900b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f22901a;

        /* renamed from: b  reason: collision with root package name */
        public final z4.g f22902b;

        public d(z4.g gVar, n<?> nVar) {
            this.f22902b = gVar;
            this.f22901a = nVar;
        }
    }

    public m(m4.h hVar, a.InterfaceC0400a interfaceC0400a, n4.a aVar, n4.a aVar2, n4.a aVar3, n4.a aVar4) {
        this.f22884c = hVar;
        c cVar = new c(interfaceC0400a);
        k4.c cVar2 = new k4.c();
        this.f22887g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f22828d = this;
            }
        }
        this.f22883b = new df.b(4);
        this.f22882a = new s(0);
        this.f22885d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f = new a(cVar);
        this.f22886e = new y();
        ((m4.g) hVar).f24818d = this;
    }

    public static void e(String str, long j10, h4.e eVar) {
        StringBuilder d10 = v.g.d(str, " in ");
        d10.append(d5.f.a(j10));
        d10.append("ms, key: ");
        d10.append(eVar);
        Log.v("Engine", d10.toString());
    }

    public static void g(v vVar) {
        if (vVar instanceof q) {
            ((q) vVar).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // k4.q.a
    public final void a(h4.e eVar, q<?> qVar) {
        k4.c cVar = this.f22887g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f22826b.remove(eVar);
            if (aVar != null) {
                aVar.f22831c = null;
                aVar.clear();
            }
        }
        if (qVar.f22925u) {
            ((m4.g) this.f22884c).d(eVar, qVar);
        } else {
            this.f22886e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.c cVar, Object obj, h4.e eVar, int i6, int i10, Class cls, Class cls2, com.bumptech.glide.d dVar, l lVar, d5.b bVar, boolean z10, boolean z11, h4.g gVar, boolean z12, boolean z13, boolean z14, boolean z15, z4.g gVar2, Executor executor) {
        long j10;
        if (f22881h) {
            int i11 = d5.f.f12193b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f22883b.getClass();
        p pVar = new p(obj, eVar, i6, i10, bVar, cls, cls2, gVar);
        synchronized (this) {
            try {
                q<?> d10 = d(pVar, z12, j11);
                if (d10 == null) {
                    return h(cVar, obj, eVar, i6, i10, cls, cls2, dVar, lVar, bVar, z10, z11, gVar, z12, z13, z14, z15, gVar2, executor, pVar, j11);
                }
                ((z4.h) gVar2).l(h4.a.MEMORY_CACHE, d10);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q<?> c(h4.e eVar) {
        Object remove;
        q<?> qVar;
        m4.g gVar = (m4.g) this.f22884c;
        synchronized (gVar) {
            remove = gVar.f12194a.remove(eVar);
            if (remove != null) {
                gVar.f12196c -= gVar.b(remove);
            }
        }
        v vVar = (v) remove;
        if (vVar == null) {
            qVar = null;
        } else if (vVar instanceof q) {
            qVar = (q) vVar;
        } else {
            qVar = new q<>(vVar, true, true, eVar, this);
        }
        if (qVar != null) {
            qVar.c();
            this.f22887g.a(eVar, qVar);
        }
        return qVar;
    }

    public final q<?> d(p pVar, boolean z10, long j10) {
        q<?> qVar;
        if (!z10) {
            return null;
        }
        k4.c cVar = this.f22887g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f22826b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.c();
        }
        if (qVar != null) {
            if (f22881h) {
                e("Loaded resource from active resources", j10, pVar);
            }
            return qVar;
        }
        q<?> c10 = c(pVar);
        if (c10 == null) {
            return null;
        }
        if (f22881h) {
            e("Loaded resource from cache", j10, pVar);
        }
        return c10;
    }

    public final synchronized void f(n<?> nVar, h4.e eVar, q<?> qVar) {
        HashMap hashMap;
        if (qVar != null) {
            if (qVar.f22925u) {
                this.f22887g.a(eVar, qVar);
            }
        }
        s sVar = this.f22882a;
        sVar.getClass();
        if (nVar.J) {
            hashMap = sVar.f22932b;
        } else {
            hashMap = sVar.f22931a;
        }
        if (nVar.equals(hashMap.get(eVar))) {
            hashMap.remove(eVar);
        }
    }

    public final d h(com.bumptech.glide.c cVar, Object obj, h4.e eVar, int i6, int i10, Class cls, Class cls2, com.bumptech.glide.d dVar, l lVar, d5.b bVar, boolean z10, boolean z11, h4.g gVar, boolean z12, boolean z13, boolean z14, boolean z15, z4.g gVar2, Executor executor, p pVar, long j10) {
        s sVar = this.f22882a;
        n nVar = (n) (z15 ? sVar.f22932b : sVar.f22931a).get(pVar);
        if (nVar != null) {
            nVar.a(gVar2, executor);
            if (f22881h) {
                e("Added to existing load", j10, pVar);
            }
            return new d(gVar2, nVar);
        }
        n nVar2 = (n) this.f22885d.f22897g.b();
        kc.f.p(nVar2);
        synchronized (nVar2) {
            nVar2.F = pVar;
            nVar2.G = z12;
            nVar2.H = z13;
            nVar2.I = z14;
            nVar2.J = z15;
        }
        a aVar = this.f;
        j jVar = (j) aVar.f22889b.b();
        kc.f.p(jVar);
        int i11 = aVar.f22890c;
        aVar.f22890c = i11 + 1;
        i<R> iVar = jVar.f22859u;
        iVar.f22845c = cVar;
        iVar.f22846d = obj;
        iVar.f22855n = eVar;
        iVar.f22847e = i6;
        iVar.f = i10;
        iVar.f22857p = lVar;
        iVar.f22848g = cls;
        iVar.f22849h = jVar.f22862x;
        iVar.f22852k = cls2;
        iVar.f22856o = dVar;
        iVar.f22850i = gVar;
        iVar.f22851j = bVar;
        iVar.f22858q = z10;
        iVar.r = z11;
        jVar.B = cVar;
        jVar.C = eVar;
        jVar.D = dVar;
        jVar.E = pVar;
        jVar.F = i6;
        jVar.G = i10;
        jVar.H = lVar;
        jVar.O = z15;
        jVar.I = gVar;
        jVar.J = nVar2;
        jVar.K = i11;
        jVar.M = 1;
        jVar.P = obj;
        s sVar2 = this.f22882a;
        sVar2.getClass();
        (nVar2.J ? sVar2.f22932b : sVar2.f22931a).put(pVar, nVar2);
        nVar2.a(gVar2, executor);
        nVar2.k(jVar);
        if (f22881h) {
            e("Started new load", j10, pVar);
        }
        return new d(gVar2, nVar2);
    }
}
