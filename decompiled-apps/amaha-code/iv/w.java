package iv;

import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.e0;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes2.dex */
public class w<E> extends u {

    /* renamed from: x  reason: collision with root package name */
    public final E f20762x;

    /* renamed from: y  reason: collision with root package name */
    public final kotlinx.coroutines.j<hs.k> f20763y;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Object obj, kotlinx.coroutines.k kVar) {
        this.f20762x = obj;
        this.f20763y = kVar;
    }

    @Override // iv.u
    public final void B() {
        this.f20763y.i();
    }

    @Override // iv.u
    public final E C() {
        return this.f20762x;
    }

    @Override // iv.u
    public final void D(k<?> kVar) {
        Throwable th2 = kVar.f20752x;
        if (th2 == null) {
            th2 = new ClosedSendChannelException();
        }
        this.f20763y.resumeWith(sp.b.j(th2));
    }

    @Override // iv.u
    public final kotlinx.coroutines.internal.r E() {
        if (this.f20763y.d(hs.k.f19476a, null) == null) {
            return null;
        }
        return sc.b.I;
    }

    @Override // kotlinx.coroutines.internal.g
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.q(this) + '(' + this.f20762x + ')';
    }
}
