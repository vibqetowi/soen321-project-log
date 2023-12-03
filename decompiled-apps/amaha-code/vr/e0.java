package vr;

import io.grpc.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import vr.g2;
import vr.q1;
import vr.s;
/* compiled from: DelayedClientTransport.java */
/* loaded from: classes2.dex */
public final class e0 implements g2 {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f35529c;

    /* renamed from: d  reason: collision with root package name */
    public final tr.l0 f35530d;

    /* renamed from: e  reason: collision with root package name */
    public a f35531e;
    public b f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f35532g;

    /* renamed from: h  reason: collision with root package name */
    public g2.a f35533h;

    /* renamed from: j  reason: collision with root package name */
    public tr.i0 f35535j;

    /* renamed from: k  reason: collision with root package name */
    public h.AbstractC0310h f35536k;

    /* renamed from: l  reason: collision with root package name */
    public long f35537l;

    /* renamed from: a  reason: collision with root package name */
    public final tr.w f35527a = tr.w.a(e0.class, null);

    /* renamed from: b  reason: collision with root package name */
    public final Object f35528b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public Collection<e> f35534i = new LinkedHashSet();

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g2.a f35538u;

        public a(q1.h hVar) {
            this.f35538u = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35538u.d(true);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g2.a f35539u;

        public b(q1.h hVar) {
            this.f35539u = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35539u.d(false);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g2.a f35540u;

        public c(q1.h hVar) {
            this.f35540u = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35540u.b();
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ tr.i0 f35541u;

        public d(tr.i0 i0Var) {
            this.f35541u = i0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e0.this.f35533h.c(this.f35541u);
        }
    }

    /* compiled from: DelayedClientTransport.java */
    /* loaded from: classes2.dex */
    public class e extends f0 {

        /* renamed from: j  reason: collision with root package name */
        public final h.e f35543j;

        /* renamed from: k  reason: collision with root package name */
        public final tr.l f35544k = tr.l.b();

        /* renamed from: l  reason: collision with root package name */
        public final io.grpc.c[] f35545l;

        public e(p2 p2Var, io.grpc.c[] cVarArr) {
            this.f35543j = p2Var;
            this.f35545l = cVarArr;
        }

        @Override // vr.f0, vr.r
        public final void j(b1 b1Var) {
            if (Boolean.TRUE.equals(((p2) this.f35543j).f35840a.f20438h)) {
                b1Var.f35403b.add("wait_for_ready");
            }
            super.j(b1Var);
        }

        @Override // vr.f0, vr.r
        public final void o(tr.i0 i0Var) {
            super.o(i0Var);
            synchronized (e0.this.f35528b) {
                e0 e0Var = e0.this;
                if (e0Var.f35532g != null) {
                    boolean remove = e0Var.f35534i.remove(this);
                    if (!e0.this.b() && remove) {
                        e0 e0Var2 = e0.this;
                        e0Var2.f35530d.b(e0Var2.f);
                        e0 e0Var3 = e0.this;
                        if (e0Var3.f35535j != null) {
                            e0Var3.f35530d.b(e0Var3.f35532g);
                            e0.this.f35532g = null;
                        }
                    }
                }
            }
            e0.this.f35530d.a();
        }

        @Override // vr.f0
        public final void r(tr.i0 i0Var) {
            for (io.grpc.c cVar : this.f35545l) {
                cVar.s(i0Var);
            }
        }
    }

    public e0(Executor executor, tr.l0 l0Var) {
        this.f35529c = executor;
        this.f35530d = l0Var;
    }

    public final e a(p2 p2Var, io.grpc.c[] cVarArr) {
        int size;
        e eVar = new e(p2Var, cVarArr);
        this.f35534i.add(eVar);
        synchronized (this.f35528b) {
            size = this.f35534i.size();
        }
        if (size == 1) {
            this.f35530d.b(this.f35531e);
        }
        return eVar;
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f35528b) {
            if (!this.f35534i.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // vr.g2
    public final void c(tr.i0 i0Var) {
        Collection<e> collection;
        Runnable runnable;
        h(i0Var);
        synchronized (this.f35528b) {
            collection = this.f35534i;
            runnable = this.f35532g;
            this.f35532g = null;
            if (!collection.isEmpty()) {
                this.f35534i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                g0 s10 = eVar.s(new k0(i0Var, s.a.REFUSED, eVar.f35545l));
                if (s10 != null) {
                    s10.run();
                }
            }
            this.f35530d.execute(runnable);
        }
    }

    @Override // vr.g2
    public final Runnable e(g2.a aVar) {
        this.f35533h = aVar;
        q1.h hVar = (q1.h) aVar;
        this.f35531e = new a(hVar);
        this.f = new b(hVar);
        this.f35532g = new c(hVar);
        return null;
    }

    @Override // vr.t
    public final r f(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar, io.grpc.c[] cVarArr) {
        r k0Var;
        try {
            p2 p2Var = new p2(d0Var, c0Var, bVar);
            h.AbstractC0310h abstractC0310h = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f35528b) {
                    tr.i0 i0Var = this.f35535j;
                    if (i0Var != null) {
                        k0Var = new k0(i0Var, s.a.PROCESSED, cVarArr);
                        break;
                    }
                    h.AbstractC0310h abstractC0310h2 = this.f35536k;
                    if (abstractC0310h2 == null) {
                        k0Var = a(p2Var, cVarArr);
                        break;
                    } else if (abstractC0310h != null && j10 == this.f35537l) {
                        k0Var = a(p2Var, cVarArr);
                        break;
                    } else {
                        j10 = this.f35537l;
                        t e10 = u0.e(abstractC0310h2.a(p2Var), Boolean.TRUE.equals(bVar.f20438h));
                        if (e10 != null) {
                            k0Var = e10.f(p2Var.f35842c, p2Var.f35841b, p2Var.f35840a, cVarArr);
                            break;
                        }
                        abstractC0310h = abstractC0310h2;
                    }
                }
            }
            return k0Var;
        } finally {
            this.f35530d.a();
        }
    }

    @Override // tr.v
    public final tr.w g() {
        return this.f35527a;
    }

    @Override // vr.g2
    public final void h(tr.i0 i0Var) {
        Runnable runnable;
        synchronized (this.f35528b) {
            if (this.f35535j != null) {
                return;
            }
            this.f35535j = i0Var;
            this.f35530d.b(new d(i0Var));
            if (!b() && (runnable = this.f35532g) != null) {
                this.f35530d.b(runnable);
                this.f35532g = null;
            }
            this.f35530d.a();
        }
    }

    public final void i(h.AbstractC0310h abstractC0310h) {
        Runnable runnable;
        synchronized (this.f35528b) {
            this.f35536k = abstractC0310h;
            this.f35537l++;
            if (abstractC0310h != null && b()) {
                ArrayList arrayList = new ArrayList(this.f35534i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    h.d a10 = abstractC0310h.a(eVar.f35543j);
                    io.grpc.b bVar = ((p2) eVar.f35543j).f35840a;
                    t e10 = u0.e(a10, Boolean.TRUE.equals(bVar.f20438h));
                    if (e10 != null) {
                        Executor executor = this.f35529c;
                        Executor executor2 = bVar.f20433b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        tr.l lVar = eVar.f35544k;
                        tr.l a11 = lVar.a();
                        try {
                            h.e eVar2 = eVar.f35543j;
                            r f = e10.f(((p2) eVar2).f35842c, ((p2) eVar2).f35841b, ((p2) eVar2).f35840a, eVar.f35545l);
                            lVar.c(a11);
                            g0 s10 = eVar.s(f);
                            if (s10 != null) {
                                executor.execute(s10);
                            }
                            arrayList2.add(eVar);
                        } catch (Throwable th2) {
                            lVar.c(a11);
                            throw th2;
                        }
                    }
                }
                synchronized (this.f35528b) {
                    if (!b()) {
                        return;
                    }
                    this.f35534i.removeAll(arrayList2);
                    if (this.f35534i.isEmpty()) {
                        this.f35534i = new LinkedHashSet();
                    }
                    if (!b()) {
                        this.f35530d.b(this.f);
                        if (this.f35535j != null && (runnable = this.f35532g) != null) {
                            this.f35530d.b(runnable);
                            this.f35532g = null;
                        }
                    }
                    this.f35530d.a();
                }
            }
        }
    }
}
