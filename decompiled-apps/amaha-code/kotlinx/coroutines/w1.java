package kotlinx.coroutines;

import ls.e;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class w1<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: x  reason: collision with root package name */
    public final ThreadLocal<hs.f<ls.f, Object>> f23712x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w1(ls.d dVar, ls.f fVar) {
        super(dVar, r0);
        ls.f fVar2;
        x1 x1Var = x1.f23714u;
        if (fVar.e(x1Var) == null) {
            fVar2 = fVar.h(x1Var);
        } else {
            fVar2 = fVar;
        }
        ThreadLocal<hs.f<ls.f, Object>> threadLocal = new ThreadLocal<>();
        this.f23712x = threadLocal;
        if (!(dVar.getContext().e(e.a.f24519u) instanceof a0)) {
            Object c10 = kotlinx.coroutines.internal.t.c(fVar, null);
            kotlinx.coroutines.internal.t.a(fVar, c10);
            threadLocal.set(new hs.f<>(fVar, c10));
        }
    }

    @Override // kotlinx.coroutines.internal.p, kotlinx.coroutines.a
    public final void n0(Object obj) {
        ThreadLocal<hs.f<ls.f, Object>> threadLocal = this.f23712x;
        hs.f<ls.f, Object> fVar = threadLocal.get();
        w1<?> w1Var = null;
        if (fVar != null) {
            kotlinx.coroutines.internal.t.a(fVar.f19464u, fVar.f19465v);
            threadLocal.set(null);
        }
        Object e12 = ca.a.e1(obj);
        ls.d<T> dVar = this.f23613w;
        ls.f context = dVar.getContext();
        Object c10 = kotlinx.coroutines.internal.t.c(context, null);
        if (c10 != kotlinx.coroutines.internal.t.f23617a) {
            w1Var = y.c(dVar, context, c10);
        }
        try {
            dVar.resumeWith(e12);
            hs.k kVar = hs.k.f19476a;
        } finally {
            if (w1Var == null || w1Var.t0()) {
                kotlinx.coroutines.internal.t.a(context, c10);
            }
        }
    }

    public final boolean t0() {
        ThreadLocal<hs.f<ls.f, Object>> threadLocal = this.f23712x;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
