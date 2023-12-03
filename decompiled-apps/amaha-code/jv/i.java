package jv;

import ls.f;
/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class i implements ls.f {

    /* renamed from: u  reason: collision with root package name */
    public final Throwable f22672u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.f f22673v;

    public i(ls.f fVar, Throwable th2) {
        this.f22672u = th2;
        this.f22673v = fVar;
    }

    @Override // ls.f
    public final <E extends f.b> E e(f.c<E> cVar) {
        return (E) this.f22673v.e(cVar);
    }

    @Override // ls.f
    public final ls.f h(ls.f fVar) {
        return this.f22673v.h(fVar);
    }

    @Override // ls.f
    public final ls.f o(f.c<?> cVar) {
        return this.f22673v.o(cVar);
    }

    @Override // ls.f
    public final <R> R s(R r, ss.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) this.f22673v.s(r, pVar);
    }
}
