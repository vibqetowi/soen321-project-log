package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.j;
/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f2426a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2427b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f2428c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final q f2429u;

        /* renamed from: v  reason: collision with root package name */
        public final j.b f2430v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2431w = false;

        public a(q qVar, j.b bVar) {
            this.f2429u = qVar;
            this.f2430v = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f2431w) {
                this.f2429u.f(this.f2430v);
                this.f2431w = true;
            }
        }
    }

    public j0(p pVar) {
        this.f2426a = new q(pVar);
    }

    public final void a(j.b bVar) {
        a aVar = this.f2428c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2426a, bVar);
        this.f2428c = aVar2;
        this.f2427b.postAtFrontOfQueue(aVar2);
    }
}
