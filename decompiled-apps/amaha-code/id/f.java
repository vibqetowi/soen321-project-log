package id;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.a;
/* compiled from: DelegatingScheduledFuture.java */
/* loaded from: classes.dex */
public final class f<V> extends u.a<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> B;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes.dex */
    public class a implements b<V> {
        public a() {
        }

        public final void a(Exception exc) {
            f fVar = f.this;
            fVar.getClass();
            if (u.a.f33705z.b(fVar, null, new a.c(exc))) {
                u.a.i(fVar);
            }
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes.dex */
    public interface b<T> {
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public f(c<V> cVar) {
        this.B = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.B.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.B.getDelay(timeUnit);
    }

    @Override // u.a
    public final void h() {
        boolean z10;
        ScheduledFuture<?> scheduledFuture = this.B;
        Object obj = this.f33706u;
        if ((obj instanceof a.b) && ((a.b) obj).f33711a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }
}
