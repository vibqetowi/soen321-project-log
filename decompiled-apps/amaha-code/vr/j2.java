package vr;

import tr.a;
import vr.l;
import vr.s;
/* compiled from: MetadataApplierImpl.java */
/* loaded from: classes2.dex */
public final class j2 extends a.AbstractC0558a {

    /* renamed from: a  reason: collision with root package name */
    public final t f35728a;

    /* renamed from: b  reason: collision with root package name */
    public final tr.d0<?, ?> f35729b;

    /* renamed from: c  reason: collision with root package name */
    public final tr.c0 f35730c;

    /* renamed from: d  reason: collision with root package name */
    public final io.grpc.b f35731d;
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final io.grpc.c[] f35733g;

    /* renamed from: i  reason: collision with root package name */
    public r f35735i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f35736j;

    /* renamed from: k  reason: collision with root package name */
    public f0 f35737k;

    /* renamed from: h  reason: collision with root package name */
    public final Object f35734h = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final tr.l f35732e = tr.l.b();

    /* compiled from: MetadataApplierImpl.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public j2(w wVar, tr.d0 d0Var, tr.c0 c0Var, io.grpc.b bVar, l.a.C0605a c0605a, io.grpc.c[] cVarArr) {
        this.f35728a = wVar;
        this.f35729b = d0Var;
        this.f35730c = c0Var;
        this.f35731d = bVar;
        this.f = c0605a;
        this.f35733g = cVarArr;
    }

    @Override // tr.a.AbstractC0558a
    public final void a(tr.c0 c0Var) {
        sc.b.B("apply() or fail() already called", !this.f35736j);
        tr.c0 c0Var2 = this.f35730c;
        c0Var2.d(c0Var);
        tr.l lVar = this.f35732e;
        tr.l a10 = lVar.a();
        try {
            r f = this.f35728a.f(this.f35729b, c0Var2, this.f35731d, this.f35733g);
            lVar.c(a10);
            c(f);
        } catch (Throwable th2) {
            lVar.c(a10);
            throw th2;
        }
    }

    @Override // tr.a.AbstractC0558a
    public final void b(tr.i0 i0Var) {
        sc.b.s("Cannot fail with OK status", !i0Var.e());
        sc.b.B("apply() or fail() already called", !this.f35736j);
        c(new k0(u0.g(i0Var), s.a.PROCESSED, this.f35733g));
    }

    public final void c(r rVar) {
        boolean z10;
        boolean z11 = true;
        sc.b.B("already finalized", !this.f35736j);
        this.f35736j = true;
        synchronized (this.f35734h) {
            if (this.f35735i == null) {
                this.f35735i = rVar;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            l.a aVar = l.a.this;
            if (aVar.f35753b.decrementAndGet() == 0) {
                l.a.b(aVar);
                return;
            }
            return;
        }
        if (this.f35737k == null) {
            z11 = false;
        }
        sc.b.B("delayedStream is null", z11);
        g0 s10 = this.f35737k.s(rVar);
        if (s10 != null) {
            s10.run();
        }
        l.a aVar2 = l.a.this;
        if (aVar2.f35753b.decrementAndGet() == 0) {
            l.a.b(aVar2);
        }
    }
}
