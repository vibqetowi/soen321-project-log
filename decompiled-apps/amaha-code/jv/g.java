package jv;

import kotlinx.coroutines.internal.t;
import ls.e;
import ta.v;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes2.dex */
public abstract class g<S, T> extends e<T> {

    /* renamed from: x  reason: collision with root package name */
    public final kotlinx.coroutines.flow.d<S> f22652x;

    /* JADX WARN: Multi-variable type inference failed */
    public g(kotlinx.coroutines.flow.d<? extends S> dVar, ls.f fVar, int i6, iv.e eVar) {
        super(fVar, i6, eVar);
        this.f22652x = dVar;
    }

    @Override // jv.e, kotlinx.coroutines.flow.d
    public final Object a(kotlinx.coroutines.flow.e<? super T> eVar, ls.d<? super hs.k> dVar) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        if (this.f22647v == -3) {
            ls.f context = dVar.getContext();
            ls.f h10 = context.h(this.f22646u);
            if (kotlin.jvm.internal.i.b(h10, context)) {
                Object f = f(eVar, dVar);
                if (f != aVar) {
                    return hs.k.f19476a;
                }
                return f;
            }
            int i6 = ls.e.f24518n;
            e.a aVar2 = e.a.f24519u;
            if (kotlin.jvm.internal.i.b(h10.e(aVar2), context.e(aVar2))) {
                ls.f context2 = dVar.getContext();
                if (eVar instanceof o) {
                    z10 = true;
                } else {
                    z10 = eVar instanceof k;
                }
                if (!z10) {
                    eVar = new q(eVar, context2);
                }
                Object T = v.T(h10, eVar, t.b(h10), new f(this, null), dVar);
                if (T != aVar) {
                    T = hs.k.f19476a;
                }
                if (T != aVar) {
                    return hs.k.f19476a;
                }
                return T;
            }
        }
        Object a10 = super.a(eVar, dVar);
        if (a10 != aVar) {
            return hs.k.f19476a;
        }
        return a10;
    }

    @Override // jv.e
    public final Object c(iv.q<? super T> qVar, ls.d<? super hs.k> dVar) {
        Object f = f(new o(qVar), dVar);
        if (f != ms.a.COROUTINE_SUSPENDED) {
            return hs.k.f19476a;
        }
        return f;
    }

    public abstract Object f(kotlinx.coroutines.flow.e<? super T> eVar, ls.d<? super hs.k> dVar);

    @Override // jv.e
    public final String toString() {
        return this.f22652x + " -> " + super.toString();
    }
}
