package vr;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vr.i3;
import vr.s;
/* compiled from: DelayedStream.java */
/* loaded from: classes2.dex */
public class f0 implements r {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f35558a;

    /* renamed from: b  reason: collision with root package name */
    public s f35559b;

    /* renamed from: c  reason: collision with root package name */
    public r f35560c;

    /* renamed from: d  reason: collision with root package name */
    public tr.i0 f35561d;
    public n f;

    /* renamed from: g  reason: collision with root package name */
    public long f35563g;

    /* renamed from: h  reason: collision with root package name */
    public long f35564h;

    /* renamed from: e  reason: collision with root package name */
    public List<Runnable> f35562e = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f35565i = new ArrayList();

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35566u;

        public a(int i6) {
            this.f35566u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.e(this.f35566u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.c();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.h f35569u;

        public c(tr.h hVar) {
            this.f35569u = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.a(this.f35569u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f35571u;

        public d(boolean z10) {
            this.f35571u = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.p(this.f35571u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.o f35573u;

        public e(tr.o oVar) {
            this.f35573u = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.k(this.f35573u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35575u;

        public f(int i6) {
            this.f35575u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.g(this.f35575u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35577u;

        public g(int i6) {
            this.f35577u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.h(this.f35577u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.m f35579u;

        public h(tr.m mVar) {
            this.f35579u = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.i(this.f35579u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f35581u;

        public i(String str) {
            this.f35581u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.l(this.f35581u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ InputStream f35583u;

        public j(InputStream inputStream) {
            this.f35583u = inputStream;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.b(this.f35583u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.flush();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.i0 f35586u;

        public l(tr.i0 i0Var) {
            this.f35586u = i0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.o(this.f35586u);
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.this.f35560c.m();
        }
    }

    /* compiled from: DelayedStream.java */
    /* loaded from: classes2.dex */
    public static class n implements s {

        /* renamed from: a  reason: collision with root package name */
        public final s f35589a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f35590b;

        /* renamed from: c  reason: collision with root package name */
        public List<Runnable> f35591c = new ArrayList();

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ i3.a f35592u;

            public a(i3.a aVar) {
                this.f35592u = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f35589a.a(this.f35592u);
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f35589a.onReady();
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f35595u;

            public c(tr.c0 c0Var) {
                this.f35595u = c0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f35589a.c(this.f35595u);
            }
        }

        /* compiled from: DelayedStream.java */
        /* loaded from: classes2.dex */
        public class d implements Runnable {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ tr.i0 f35597u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s.a f35598v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ tr.c0 f35599w;

            public d(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
                this.f35597u = i0Var;
                this.f35598v = aVar;
                this.f35599w = c0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f35589a.b(this.f35597u, this.f35598v, this.f35599w);
            }
        }

        public n(s sVar) {
            this.f35589a = sVar;
        }

        @Override // vr.i3
        public final void a(i3.a aVar) {
            if (this.f35590b) {
                this.f35589a.a(aVar);
            } else {
                d(new a(aVar));
            }
        }

        @Override // vr.s
        public final void b(tr.i0 i0Var, s.a aVar, tr.c0 c0Var) {
            d(new d(i0Var, aVar, c0Var));
        }

        @Override // vr.s
        public final void c(tr.c0 c0Var) {
            d(new c(c0Var));
        }

        public final void d(Runnable runnable) {
            synchronized (this) {
                if (!this.f35590b) {
                    this.f35591c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f35591c.isEmpty()) {
                        this.f35591c = null;
                        this.f35590b = true;
                        return;
                    }
                    list = this.f35591c;
                    this.f35591c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // vr.i3
        public final void onReady() {
            if (this.f35590b) {
                this.f35589a.onReady();
            } else {
                d(new b());
            }
        }
    }

    @Override // vr.h3
    public final void a(tr.h hVar) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        sc.b.w(hVar, "compressor");
        this.f35565i.add(new c(hVar));
    }

    @Override // vr.h3
    public final void b(InputStream inputStream) {
        boolean z10;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        sc.b.w(inputStream, "message");
        if (this.f35558a) {
            this.f35560c.b(inputStream);
        } else {
            d(new j(inputStream));
        }
    }

    @Override // vr.h3
    public final void c() {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        this.f35565i.add(new b());
    }

    public final void d(Runnable runnable) {
        boolean z10;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        synchronized (this) {
            if (!this.f35558a) {
                this.f35562e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // vr.h3
    public final void e(int i6) {
        boolean z10;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        if (this.f35558a) {
            this.f35560c.e(i6);
        } else {
            d(new a(i6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        n nVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f35562e.isEmpty()) {
                    break;
                }
                list = this.f35562e;
                this.f35562e = arrayList;
            }
            if (nVar == null) {
                nVar.e();
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.f35562e = null;
        this.f35558a = true;
        nVar = this.f;
        if (nVar == null) {
        }
    }

    @Override // vr.h3
    public final void flush() {
        boolean z10;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        if (this.f35558a) {
            this.f35560c.flush();
        } else {
            d(new k());
        }
    }

    @Override // vr.r
    public final void g(int i6) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        this.f35565i.add(new f(i6));
    }

    @Override // vr.r
    public final void h(int i6) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        this.f35565i.add(new g(i6));
    }

    @Override // vr.r
    public final void i(tr.m mVar) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        this.f35565i.add(new h(mVar));
    }

    @Override // vr.h3
    public final boolean isReady() {
        if (this.f35558a) {
            return this.f35560c.isReady();
        }
        return false;
    }

    @Override // vr.r
    public void j(b1 b1Var) {
        synchronized (this) {
            if (this.f35559b == null) {
                return;
            }
            if (this.f35560c != null) {
                b1Var.c(Long.valueOf(this.f35564h - this.f35563g), "buffered_nanos");
                this.f35560c.j(b1Var);
            } else {
                b1Var.c(Long.valueOf(System.nanoTime() - this.f35563g), "buffered_nanos");
                b1Var.f35403b.add("waiting_for_connection");
            }
        }
    }

    @Override // vr.r
    public final void k(tr.o oVar) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        sc.b.w(oVar, "decompressorRegistry");
        this.f35565i.add(new e(oVar));
    }

    @Override // vr.r
    public final void l(String str) {
        boolean z10;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called before start", z10);
        sc.b.w(str, "authority");
        this.f35565i.add(new i(str));
    }

    @Override // vr.r
    public final void m() {
        boolean z10;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        d(new m());
    }

    @Override // vr.r
    public final void n(s sVar) {
        boolean z10;
        tr.i0 i0Var;
        boolean z11;
        if (this.f35559b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("already started", z10);
        synchronized (this) {
            i0Var = this.f35561d;
            z11 = this.f35558a;
            if (!z11) {
                n nVar = new n(sVar);
                this.f = nVar;
                sVar = nVar;
            }
            this.f35559b = sVar;
            this.f35563g = System.nanoTime();
        }
        if (i0Var != null) {
            sVar.b(i0Var, s.a.PROCESSED, new tr.c0());
        } else if (z11) {
            q(sVar);
        }
    }

    @Override // vr.r
    public void o(tr.i0 i0Var) {
        boolean z10;
        boolean z11 = false;
        boolean z12 = true;
        if (this.f35559b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("May only be called after start", z10);
        sc.b.w(i0Var, "reason");
        synchronized (this) {
            try {
                r rVar = this.f35560c;
                if (rVar == null) {
                    k2 k2Var = k2.f35746a;
                    if (rVar != null) {
                        z12 = false;
                    }
                    sc.b.z(rVar, "realStream already set to %s", z12);
                    this.f35560c = k2Var;
                    this.f35564h = System.nanoTime();
                    this.f35561d = i0Var;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            d(new l(i0Var));
            return;
        }
        f();
        r(i0Var);
        this.f35559b.b(i0Var, s.a.PROCESSED, new tr.c0());
    }

    @Override // vr.r
    public final void p(boolean z10) {
        boolean z11;
        if (this.f35559b == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.B("May only be called before start", z11);
        this.f35565i.add(new d(z10));
    }

    public final void q(s sVar) {
        Iterator it = this.f35565i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f35565i = null;
        this.f35560c.n(sVar);
    }

    public final g0 s(r rVar) {
        boolean z10;
        synchronized (this) {
            if (this.f35560c != null) {
                return null;
            }
            sc.b.w(rVar, "stream");
            r rVar2 = this.f35560c;
            if (rVar2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.z(rVar2, "realStream already set to %s", z10);
            this.f35560c = rVar;
            this.f35564h = System.nanoTime();
            s sVar = this.f35559b;
            if (sVar == null) {
                this.f35562e = null;
                this.f35558a = true;
            }
            if (sVar == null) {
                return null;
            }
            q(sVar);
            return new g0(this);
        }
    }

    public void r(tr.i0 i0Var) {
    }
}
