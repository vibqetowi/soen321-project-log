package jv;

import iv.v;
/* compiled from: SendingCollector.kt */
/* loaded from: classes2.dex */
public final class o<T> implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: u  reason: collision with root package name */
    public final v<T> f22685u;

    /* JADX WARN: Multi-variable type inference failed */
    public o(v<? super T> vVar) {
        this.f22685u = vVar;
    }

    @Override // kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        Object b10 = this.f22685u.b(t3, dVar);
        if (b10 == ms.a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return hs.k.f19476a;
    }
}
