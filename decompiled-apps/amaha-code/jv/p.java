package jv;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes2.dex */
public final class p<T> implements ls.d<T>, ns.d {

    /* renamed from: u  reason: collision with root package name */
    public final ls.d<T> f22686u;

    /* renamed from: v  reason: collision with root package name */
    public final ls.f f22687v;

    /* JADX WARN: Multi-variable type inference failed */
    public p(ls.d<? super T> dVar, ls.f fVar) {
        this.f22686u = dVar;
        this.f22687v = fVar;
    }

    @Override // ns.d
    public final ns.d getCallerFrame() {
        ls.d<T> dVar = this.f22686u;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // ls.d
    public final ls.f getContext() {
        return this.f22687v;
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        this.f22686u.resumeWith(obj);
    }
}
