package vr;

import java.util.concurrent.Executor;
import vr.c3;
/* compiled from: SharedResourceHolder.java */
/* loaded from: classes2.dex */
public final class d3 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c3.b f35517u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c3.c f35518v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f35519w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c3 f35520x;

    public d3(c3 c3Var, c3.b bVar, c3.c cVar, Executor executor) {
        this.f35520x = c3Var;
        this.f35517u = bVar;
        this.f35518v = cVar;
        this.f35519w = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35520x) {
            if (this.f35517u.f35485b == 0) {
                this.f35518v.b(this.f35519w);
                this.f35520x.f35481a.remove(this.f35518v);
                if (this.f35520x.f35481a.isEmpty()) {
                    this.f35520x.f35483c.shutdown();
                    this.f35520x.f35483c = null;
                }
            }
        }
    }
}
