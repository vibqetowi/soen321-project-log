package vr;

import java.io.Closeable;
import java.io.InputStream;
import vr.i3;
/* compiled from: ApplicationThreadDeframer.java */
/* loaded from: classes2.dex */
public final class g implements z {

    /* renamed from: u  reason: collision with root package name */
    public final f3 f35618u;

    /* renamed from: v  reason: collision with root package name */
    public final h f35619v;

    /* renamed from: w  reason: collision with root package name */
    public final h2 f35620w;

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35621u;

        public a(int i6) {
            this.f35621u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if (gVar.f35620w.isClosed()) {
                return;
            }
            try {
                gVar.f35620w.e(this.f35621u);
            } catch (Throwable th2) {
                gVar.f35619v.e(th2);
                gVar.f35620w.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ r2 f35623u;

        public b(wr.l lVar) {
            this.f35623u = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            try {
                gVar.f35620w.m(this.f35623u);
            } catch (Throwable th2) {
                gVar.f35619v.e(th2);
                gVar.f35620w.close();
            }
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class c implements Closeable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ r2 f35625u;

        public c(wr.l lVar) {
            this.f35625u = lVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f35625u.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f35620w.j();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f35620w.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* loaded from: classes2.dex */
    public class f extends C0604g implements Closeable {

        /* renamed from: x  reason: collision with root package name */
        public final Closeable f35628x;

        public f(g gVar, b bVar, c cVar) {
            super(bVar);
            this.f35628x = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f35628x.close();
        }
    }

    /* compiled from: ApplicationThreadDeframer.java */
    /* renamed from: vr.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0604g implements i3.a {

        /* renamed from: u  reason: collision with root package name */
        public final Runnable f35629u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f35630v = false;

        public C0604g(Runnable runnable) {
            this.f35629u = runnable;
        }

        @Override // vr.i3.a
        public final InputStream next() {
            if (!this.f35630v) {
                this.f35629u.run();
                this.f35630v = true;
            }
            return (InputStream) g.this.f35619v.f35639c.poll();
        }
    }

    public g(x0 x0Var, x0 x0Var2, h2 h2Var) {
        f3 f3Var = new f3(x0Var);
        this.f35618u = f3Var;
        h hVar = new h(f3Var, x0Var2);
        this.f35619v = hVar;
        h2Var.f35679u = hVar;
        this.f35620w = h2Var;
    }

    @Override // vr.z
    public final void close() {
        this.f35620w.K = true;
        this.f35618u.a(new C0604g(new e()));
    }

    @Override // vr.z
    public final void e(int i6) {
        this.f35618u.a(new C0604g(new a(i6)));
    }

    @Override // vr.z
    public final void g(int i6) {
        this.f35620w.f35680v = i6;
    }

    @Override // vr.z
    public final void h(tr.n nVar) {
        this.f35620w.h(nVar);
    }

    @Override // vr.z
    public final void j() {
        this.f35618u.a(new C0604g(new d()));
    }

    @Override // vr.z
    public final void m(r2 r2Var) {
        wr.l lVar = (wr.l) r2Var;
        this.f35618u.a(new f(this, new b(lVar), new c(lVar)));
    }
}
