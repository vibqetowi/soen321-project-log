package e4;

import android.os.Handler;
import com.android.volley.VolleyError;
import java.util.concurrent.Executor;
/* compiled from: ExecutorDelivery.java */
/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    public final a f13756a;

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    public class a implements Executor {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Handler f13757u;

        public a(Handler handler) {
            this.f13757u = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f13757u.post(runnable);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final j f13758u;

        /* renamed from: v  reason: collision with root package name */
        public final l f13759v;

        /* renamed from: w  reason: collision with root package name */
        public final Runnable f13760w;

        public b(j jVar, l lVar, e4.b bVar) {
            this.f13758u = jVar;
            this.f13759v = lVar;
            this.f13760w = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            j jVar = this.f13758u;
            if (jVar.isCanceled()) {
                jVar.finish("canceled-at-delivery");
                return;
            }
            l lVar = this.f13759v;
            VolleyError volleyError = lVar.f13790c;
            if (volleyError == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                jVar.deliverResponse(lVar.f13788a);
            } else {
                jVar.deliverError(volleyError);
            }
            if (lVar.f13791d) {
                jVar.addMarker("intermediate-response");
            } else {
                jVar.finish("done");
            }
            Runnable runnable = this.f13760w;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public e(Handler handler) {
        this.f13756a = new a(handler);
    }

    public final void a(j jVar, l lVar, e4.b bVar) {
        jVar.markDelivered();
        jVar.addMarker("post-response");
        this.f13756a.execute(new b(jVar, lVar, bVar));
    }
}
