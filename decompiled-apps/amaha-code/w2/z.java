package w2;

import java.util.HashMap;
/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: e  reason: collision with root package name */
    public static final String f36348e = androidx.work.q.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final g.x f36349a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f36350b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f36351c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f36352d = new Object();

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(v2.l lVar);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final z f36353u;

        /* renamed from: v  reason: collision with root package name */
        public final v2.l f36354v;

        public b(z zVar, v2.l lVar) {
            this.f36353u = zVar;
            this.f36354v = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f36353u.f36352d) {
                if (((b) this.f36353u.f36350b.remove(this.f36354v)) != null) {
                    a aVar = (a) this.f36353u.f36351c.remove(this.f36354v);
                    if (aVar != null) {
                        aVar.a(this.f36354v);
                    }
                } else {
                    androidx.work.q.d().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f36354v));
                }
            }
        }
    }

    public z(g.x xVar) {
        this.f36349a = xVar;
    }

    public final void a(v2.l lVar) {
        synchronized (this.f36352d) {
            if (((b) this.f36350b.remove(lVar)) != null) {
                androidx.work.q d10 = androidx.work.q.d();
                String str = f36348e;
                d10.a(str, "Stopping timer for " + lVar);
                this.f36351c.remove(lVar);
            }
        }
    }
}
