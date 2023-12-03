package iv;

import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes2.dex */
public final class x<E> extends w<E> {

    /* renamed from: z  reason: collision with root package name */
    public final ss.l<E, hs.k> f20764z;

    public x(Object obj, kotlinx.coroutines.k kVar, ss.l lVar) {
        super(obj, kVar);
        this.f20764z = lVar;
    }

    @Override // iv.u
    public final void F() {
        ls.f context = this.f20763y.getContext();
        UndeliveredElementException l2 = kc.f.l(this.f20764z, this.f20762x, null);
        if (l2 != null) {
            ta.v.z(context, l2);
        }
    }

    @Override // kotlinx.coroutines.internal.g
    public final boolean w() {
        if (!super.w()) {
            return false;
        }
        F();
        return true;
    }
}
