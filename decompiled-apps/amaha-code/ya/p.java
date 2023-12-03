package ya;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38405a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f38406b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f38407c;

    /* renamed from: d  reason: collision with root package name */
    public Object f38408d;

    public p(Executor executor, b bVar, v vVar) {
        this.f38405a = 0;
        this.f38406b = executor;
        this.f38407c = bVar;
        this.f38408d = vVar;
    }

    private final void b() {
        synchronized (this.f38407c) {
            this.f38408d = null;
        }
    }

    private final void d() {
        synchronized (this.f38407c) {
            this.f38408d = null;
        }
    }

    private final void e() {
        synchronized (this.f38407c) {
            this.f38408d = null;
        }
    }

    private final void f(h hVar) {
        synchronized (this.f38407c) {
            if (((d) this.f38408d) == null) {
                return;
            }
            this.f38406b.execute(new androidx.work.n(this, hVar, 25));
        }
    }

    private final void g(h hVar) {
        if (!hVar.isSuccessful() && !hVar.isCanceled()) {
            synchronized (this.f38407c) {
                if (((e) this.f38408d) == null) {
                    return;
                }
                this.f38406b.execute(new androidx.work.n(this, hVar, 26));
            }
        }
    }

    private final void h(h hVar) {
        if (hVar.isSuccessful()) {
            synchronized (this.f38407c) {
                if (((f) this.f38408d) == null) {
                    return;
                }
                this.f38406b.execute(new androidx.work.n(this, hVar, 27));
            }
        }
    }

    @Override // ya.s
    public final void a(h hVar) {
        switch (this.f38405a) {
            case 0:
                this.f38406b.execute(new androidx.work.n(this, hVar, 23));
                return;
            case 1:
                if (hVar.isCanceled()) {
                    synchronized (this.f38407c) {
                        if (((c) this.f38408d) != null) {
                            this.f38406b.execute(new r(this));
                        }
                    }
                    return;
                }
                return;
            case 2:
                f(hVar);
                return;
            case 3:
                g(hVar);
                return;
            default:
                h(hVar);
                return;
        }
    }

    @Override // ya.s
    public final void c() {
        switch (this.f38405a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                synchronized (this.f38407c) {
                    this.f38408d = null;
                }
                return;
            case 2:
                b();
                return;
            case 3:
                d();
                return;
            default:
                e();
                return;
        }
    }

    public p(Executor executor, c cVar) {
        this.f38405a = 1;
        this.f38407c = new Object();
        this.f38406b = executor;
        this.f38408d = cVar;
    }

    public p(Executor executor, d dVar) {
        this.f38405a = 2;
        this.f38407c = new Object();
        this.f38406b = executor;
        this.f38408d = dVar;
    }

    public p(Executor executor, e eVar) {
        this.f38405a = 3;
        this.f38407c = new Object();
        this.f38406b = executor;
        this.f38408d = eVar;
    }

    public p(Executor executor, f fVar) {
        this.f38405a = 4;
        this.f38407c = new Object();
        this.f38406b = executor;
        this.f38408d = fVar;
    }
}
