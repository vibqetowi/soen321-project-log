package n2;

import android.util.Log;
import androidx.work.p;
import androidx.work.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f25804u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d0 f25805v;

    public c0(d0 d0Var, String str) {
        this.f25805v = d0Var;
        this.f25804u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f25804u;
        d0 d0Var = this.f25805v;
        try {
            try {
                p.a aVar = d0Var.K.get();
                if (aVar == null) {
                    androidx.work.q.d().b(d0.M, d0Var.f25811y.f34736c + " returned a null result. Treating it as a failure.");
                } else {
                    androidx.work.q.d().a(d0.M, d0Var.f25811y.f34736c + " returned a " + aVar + ".");
                    d0Var.B = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                androidx.work.q.d().c(d0.M, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e11) {
                androidx.work.q d10 = androidx.work.q.d();
                String str2 = d0.M;
                String str3 = str + " was cancelled";
                if (((q.a) d10).f3335c <= 4) {
                    Log.i(str2, str3, e11);
                }
            } catch (ExecutionException e12) {
                e = e12;
                androidx.work.q.d().c(d0.M, str + " failed because it threw an exception/error", e);
            }
        } finally {
            d0Var.b();
        }
    }
}
