package iv;

import iv.n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.g1;
/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes2.dex */
public class g<E> extends kotlinx.coroutines.a<hs.k> implements f<E> {

    /* renamed from: w  reason: collision with root package name */
    public final f<E> f20744w;

    public g(ls.f fVar, a aVar) {
        super(fVar, true);
        this.f20744w = aVar;
    }

    @Override // iv.v
    public final Object b(E e10, ls.d<? super hs.k> dVar) {
        return this.f20744w.b(e10, dVar);
    }

    @Override // iv.v
    public final boolean f(Throwable th2) {
        return this.f20744w.f(th2);
    }

    @Override // kotlinx.coroutines.g1, kotlinx.coroutines.c1, iv.s
    public final void g(CancellationException cancellationException) {
        boolean z10;
        Object Q = Q();
        if (!(Q instanceof kotlinx.coroutines.u) && (!(Q instanceof g1.c) || !((g1.c) Q).d())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(B(), null, this);
        }
        z(cancellationException);
    }

    @Override // iv.s
    public final Object l(ls.d<? super i<? extends E>> dVar) {
        return this.f20744w.l(dVar);
    }

    @Override // iv.v
    public final void n(n.b bVar) {
        this.f20744w.n(bVar);
    }

    @Override // iv.v
    public final Object q(E e10) {
        return this.f20744w.q(e10);
    }

    @Override // iv.v
    public final boolean r() {
        return this.f20744w.r();
    }

    @Override // kotlinx.coroutines.g1
    public final void z(CancellationException cancellationException) {
        this.f20744w.g(cancellationException);
        y(cancellationException);
    }
}
