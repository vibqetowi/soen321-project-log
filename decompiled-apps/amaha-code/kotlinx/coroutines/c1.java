package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import jv.h;
import ls.f;
/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface c1 extends f.b {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f23495m = 0;

    /* compiled from: Job.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ p0 a(c1 c1Var, boolean z10, f1 f1Var, int i6) {
            boolean z11 = false;
            if ((i6 & 1) != 0) {
                z10 = false;
            }
            if ((i6 & 2) != 0) {
                z11 = true;
            }
            return c1Var.G(z10, z11, f1Var);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes2.dex */
    public static final class b implements f.c<c1> {

        /* renamed from: u  reason: collision with root package name */
        public static final /* synthetic */ b f23496u = new b();
    }

    p0 G(boolean z10, boolean z11, ss.l<? super Throwable, hs.k> lVar);

    CancellationException I();

    n O(g1 g1Var);

    boolean a();

    void g(CancellationException cancellationException);

    Object j(h.a.C0346a.b bVar);

    p0 k0(ss.l<? super Throwable, hs.k> lVar);

    boolean start();
}
