package vr;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: SharedResourceHolder.java */
/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: d  reason: collision with root package name */
    public static final c3 f35480d = new c3(new a());

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap<c<?>, b> f35481a = new IdentityHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f35482b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f35483c;

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public class a implements d {
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f35484a;

        /* renamed from: b  reason: collision with root package name */
        public int f35485b;

        /* renamed from: c  reason: collision with root package name */
        public ScheduledFuture<?> f35486c;

        public b(Object obj) {
            this.f35484a = obj;
        }
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
        T a();

        void b(T t3);
    }

    /* compiled from: SharedResourceHolder.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    public c3(a aVar) {
        this.f35482b = aVar;
    }

    public static <T> T a(c<T> cVar) {
        T t3;
        c3 c3Var = f35480d;
        synchronized (c3Var) {
            b bVar = c3Var.f35481a.get(cVar);
            if (bVar == null) {
                bVar = new b(cVar.a());
                c3Var.f35481a.put(cVar, bVar);
            }
            ScheduledFuture<?> scheduledFuture = bVar.f35486c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                bVar.f35486c = null;
            }
            bVar.f35485b++;
            t3 = (T) bVar.f35484a;
        }
        return t3;
    }

    public static void b(c cVar, Executor executor) {
        boolean z10;
        boolean z11;
        c3 c3Var = f35480d;
        synchronized (c3Var) {
            b bVar = c3Var.f35481a.get(cVar);
            if (bVar != null) {
                boolean z12 = false;
                if (executor == bVar.f35484a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.s("Releasing the wrong instance", z10);
                if (bVar.f35485b > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.B("Refcount has already reached zero", z11);
                int i6 = bVar.f35485b - 1;
                bVar.f35485b = i6;
                if (i6 == 0) {
                    if (bVar.f35486c == null) {
                        z12 = true;
                    }
                    sc.b.B("Destroy task already scheduled", z12);
                    if (c3Var.f35483c == null) {
                        ((a) c3Var.f35482b).getClass();
                        c3Var.f35483c = Executors.newSingleThreadScheduledExecutor(u0.d("grpc-shared-destroyer-%d"));
                    }
                    bVar.f35486c = c3Var.f35483c.schedule(new o1(new d3(c3Var, bVar, cVar, executor)), 1L, TimeUnit.SECONDS);
                }
            } else {
                throw new IllegalArgumentException("No cached instance found for " + cVar);
            }
        }
    }
}
