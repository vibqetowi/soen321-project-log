package p2;

import android.os.Handler;
import androidx.work.q;
import v2.l;
import w2.z;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27869u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.background.systemalarm.c f27870v;

    public /* synthetic */ b(androidx.work.impl.background.systemalarm.c cVar, int i6) {
        this.f27869u = i6;
        this.f27870v = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27869u) {
            case 0:
            case 1:
            case 2:
                androidx.work.impl.background.systemalarm.c.b(this.f27870v);
                return;
            default:
                androidx.work.impl.background.systemalarm.c cVar = this.f27870v;
                if (cVar.A == 0) {
                    cVar.A = 1;
                    q d10 = q.d();
                    String str = androidx.work.impl.background.systemalarm.c.G;
                    d10.a(str, "onAllConstraintsMet for " + cVar.f3276w);
                    if (cVar.f3277x.f3283x.j(cVar.F, null)) {
                        z zVar = cVar.f3277x.f3282w;
                        l lVar = cVar.f3276w;
                        synchronized (zVar.f36352d) {
                            q d11 = q.d();
                            String str2 = z.f36348e;
                            d11.a(str2, "Starting timer for " + lVar);
                            zVar.a(lVar);
                            z.b bVar = new z.b(zVar, lVar);
                            zVar.f36350b.put(lVar, bVar);
                            zVar.f36351c.put(lVar, cVar);
                            ((Handler) zVar.f36349a.f16143v).postDelayed(bVar, 600000L);
                        }
                        return;
                    }
                    cVar.c();
                    return;
                }
                q d12 = q.d();
                String str3 = androidx.work.impl.background.systemalarm.c.G;
                d12.a(str3, "Already started work for " + cVar.f3276w);
                return;
        }
    }
}
