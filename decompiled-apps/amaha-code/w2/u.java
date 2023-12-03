package w2;

import android.content.Context;
import android.os.Build;
import java.util.UUID;
import x2.a;
/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public static final String A = androidx.work.q.f("WorkForegroundRunnable");

    /* renamed from: u  reason: collision with root package name */
    public final x2.c<Void> f36325u = new x2.c<>();

    /* renamed from: v  reason: collision with root package name */
    public final Context f36326v;

    /* renamed from: w  reason: collision with root package name */
    public final v2.s f36327w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.work.p f36328x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.work.h f36329y;

    /* renamed from: z  reason: collision with root package name */
    public final y2.a f36330z;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x2.c f36331u;

        public a(x2.c cVar) {
            this.f36331u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (u.this.f36325u.f37581u instanceof a.b) {
                return;
            }
            try {
                androidx.work.g gVar = (androidx.work.g) this.f36331u.get();
                if (gVar != null) {
                    androidx.work.q d10 = androidx.work.q.d();
                    String str = u.A;
                    d10.a(str, "Updating notification for " + u.this.f36327w.f34736c);
                    u uVar = u.this;
                    x2.c<Void> cVar = uVar.f36325u;
                    androidx.work.h hVar = uVar.f36329y;
                    Context context = uVar.f36326v;
                    UUID id2 = uVar.f36328x.getId();
                    w wVar = (w) hVar;
                    wVar.getClass();
                    x2.c cVar2 = new x2.c();
                    ((y2.b) wVar.f36338a).a(new v(wVar, cVar2, id2, gVar, context));
                    cVar.k(cVar2);
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + u.this.f36327w.f34736c + ") but did not provide ForegroundInfo");
            } catch (Throwable th2) {
                u.this.f36325u.j(th2);
            }
        }
    }

    public u(Context context, v2.s sVar, androidx.work.p pVar, androidx.work.h hVar, y2.a aVar) {
        this.f36326v = context;
        this.f36327w = sVar;
        this.f36328x = pVar;
        this.f36329y = hVar;
        this.f36330z = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36327w.f34749q && Build.VERSION.SDK_INT < 31) {
            x2.c cVar = new x2.c();
            y2.b bVar = (y2.b) this.f36330z;
            bVar.f38190c.execute(new g.v(this, 9, cVar));
            cVar.d(new a(cVar), bVar.f38190c);
            return;
        }
        this.f36325u.i(null);
    }
}
