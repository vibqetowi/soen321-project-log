package iv;

import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.e0;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes2.dex */
public final class k<E> extends u implements t<E> {

    /* renamed from: x  reason: collision with root package name */
    public final Throwable f20752x;

    public k(Throwable th2) {
        this.f20752x = th2;
    }

    @Override // iv.u
    public final kotlinx.coroutines.internal.r E() {
        return sc.b.I;
    }

    public final Throwable G() {
        Throwable th2 = this.f20752x;
        if (th2 == null) {
            return new ClosedReceiveChannelException();
        }
        return th2;
    }

    @Override // iv.t
    public final kotlinx.coroutines.internal.r b(Object obj) {
        return sc.b.I;
    }

    @Override // kotlinx.coroutines.internal.g
    public final String toString() {
        return "Closed@" + e0.q(this) + '[' + this.f20752x + ']';
    }

    @Override // iv.u
    public final void B() {
    }

    @Override // iv.u
    public final Object C() {
        return this;
    }

    @Override // iv.t
    public final Object c() {
        return this;
    }

    @Override // iv.u
    public final void D(k<?> kVar) {
    }

    @Override // iv.t
    public final void j(E e10) {
    }
}
