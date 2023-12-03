package w2;

import android.content.Context;
import java.util.UUID;
import x2.a;
/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x2.c f36333u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ UUID f36334v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ androidx.work.g f36335w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Context f36336x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w f36337y;

    public v(w wVar, x2.c cVar, UUID uuid, androidx.work.g gVar, Context context) {
        this.f36337y = wVar;
        this.f36333u = cVar;
        this.f36334v = uuid;
        this.f36335w = gVar;
        this.f36336x = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f36333u.f37581u instanceof a.b)) {
                String uuid = this.f36334v.toString();
                v2.s p10 = this.f36337y.f36340c.p(uuid);
                if (p10 != null && !p10.f34735b.d()) {
                    ((n2.p) this.f36337y.f36339b).i(uuid, this.f36335w);
                    this.f36336x.startService(androidx.work.impl.foreground.a.b(this.f36336x, ca.a.a0(p10), this.f36335w));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f36333u.i(null);
        } catch (Throwable th2) {
            this.f36333u.j(th2);
        }
    }
}
