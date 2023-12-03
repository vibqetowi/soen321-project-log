package ta;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class u3 extends FutureTask implements Comparable {

    /* renamed from: u  reason: collision with root package name */
    public final long f32895u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f32896v;

    /* renamed from: w  reason: collision with root package name */
    public final String f32897w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w3 f32898x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f32898x = w3Var;
        long andIncrement = w3.E.getAndIncrement();
        this.f32895u = andIncrement;
        this.f32897w = str;
        this.f32896v = z10;
        if (andIncrement == Long.MAX_VALUE) {
            w2 w2Var = w3Var.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u3 u3Var = (u3) obj;
        boolean z10 = u3Var.f32896v;
        boolean z11 = this.f32896v;
        if (z11 != z10) {
            if (!z11) {
                return 1;
            }
            return -1;
        }
        long j10 = u3Var.f32895u;
        long j11 = this.f32895u;
        int i6 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i6 < 0) {
            return -1;
        }
        if (i6 > 0) {
            return 1;
        }
        w2 w2Var = this.f32898x.f32943u.C;
        y3.k(w2Var);
        w2Var.A.c(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        w2 w2Var = this.f32898x.f32943u.C;
        y3.k(w2Var);
        w2Var.f32925z.c(th2, this.f32897w);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Callable callable, boolean z10) {
        super(callable);
        this.f32898x = w3Var;
        long andIncrement = w3.E.getAndIncrement();
        this.f32895u = andIncrement;
        this.f32897w = "Task exception on worker thread";
        this.f32896v = z10;
        if (andIncrement == Long.MAX_VALUE) {
            w2 w2Var = w3Var.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Tasks index overflow");
        }
    }
}
