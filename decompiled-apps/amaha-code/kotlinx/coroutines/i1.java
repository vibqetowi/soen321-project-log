package kotlinx.coroutines;
/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final class i1<T> extends i0<T> {

    /* renamed from: w  reason: collision with root package name */
    public final ls.d<hs.k> f23584w;

    public i1(ls.f fVar, ss.p<? super d0, ? super ls.d<? super T>, ? extends Object> pVar) {
        super(fVar, false);
        this.f23584w = ca.a.M(this, this, pVar);
    }

    @Override // kotlinx.coroutines.g1
    public final void b0() {
        try {
            sc.b.d0(ca.a.G0(this.f23584w), hs.k.f19476a, null);
        } catch (Throwable th2) {
            resumeWith(sp.b.j(th2));
            throw th2;
        }
    }
}
