package vr;

import java.util.Collection;
import java.util.concurrent.Future;
import vr.v2;
/* compiled from: RetriableStream.java */
/* loaded from: classes2.dex */
public final class w2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Collection f36104u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v2.z f36105v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Future f36106w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Future f36107x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ v2 f36108y;

    public w2(v2 v2Var, Collection collection, v2.z zVar, Future future, Future future2) {
        this.f36108y = v2Var;
        this.f36104u = collection;
        this.f36105v = zVar;
        this.f36106w = future;
        this.f36107x = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (v2.z zVar : this.f36104u) {
            if (zVar != this.f36105v) {
                zVar.f36096a.o(v2.C);
            }
        }
        Future future = this.f36106w;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f36107x;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f36108y.x();
    }
}
