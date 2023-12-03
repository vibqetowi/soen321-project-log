package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.c1;
/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes2.dex */
public abstract class a<T> extends g1 implements ls.d<T>, d0 {

    /* renamed from: v  reason: collision with root package name */
    public final ls.f f23480v;

    public a(ls.f fVar, boolean z10) {
        super(z10);
        U((c1) fVar.e(c1.b.f23496u));
        this.f23480v = fVar.h(this);
    }

    @Override // kotlinx.coroutines.g1
    public final String B() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.g1
    public final void T(CompletionHandlerException completionHandlerException) {
        ta.v.z(this.f23480v, completionHandlerException);
    }

    @Override // kotlinx.coroutines.g1
    public final String X() {
        return super.X();
    }

    @Override // kotlinx.coroutines.g1, kotlinx.coroutines.c1
    public boolean a() {
        return super.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.g1
    public final void a0(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            o0(uVar.f23703a, uVar.a());
            return;
        }
        r0(obj);
    }

    @Override // kotlinx.coroutines.d0
    public final ls.f f0() {
        return this.f23480v;
    }

    @Override // ls.d
    public final ls.f getContext() {
        return this.f23480v;
    }

    public void n0(Object obj) {
        u(obj);
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        Throwable a10 = hs.g.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        Object W = W(obj);
        if (W == kotlin.jvm.internal.b0.N) {
            return;
        }
        n0(W);
    }

    public final void s0(int i6, a aVar, ss.p pVar) {
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            try {
                                ls.f fVar = this.f23480v;
                                Object c10 = kotlinx.coroutines.internal.t.c(fVar, null);
                                kotlin.jvm.internal.c0.e(2, pVar);
                                Object invoke = pVar.invoke(aVar, this);
                                kotlinx.coroutines.internal.t.a(fVar, c10);
                                if (invoke != ms.a.COROUTINE_SUSPENDED) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                return;
                            }
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    kotlin.jvm.internal.i.g(pVar, "<this>");
                    ca.a.G0(ca.a.M(aVar, this, pVar)).resumeWith(hs.k.f19476a);
                    return;
                }
                return;
            }
            try {
                sc.b.d0(ca.a.G0(ca.a.M(aVar, this, pVar)), hs.k.f19476a, null);
                return;
            } finally {
                resumeWith(sp.b.j(th2));
            }
        }
        throw null;
    }

    public void r0(T t3) {
    }

    public void o0(Throwable th2, boolean z10) {
    }
}
