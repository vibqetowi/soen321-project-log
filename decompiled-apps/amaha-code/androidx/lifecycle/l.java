package androidx.lifecycle;

import androidx.lifecycle.j;
/* compiled from: Lifecycle.kt */
@ns.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2434u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2435v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, ls.d<? super l> dVar) {
        super(2, dVar);
        this.f2435v = lifecycleCoroutineScopeImpl;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        l lVar = new l(this.f2435v, dVar);
        lVar.f2434u = obj;
        return lVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f2434u;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2435v;
        if (lifecycleCoroutineScopeImpl.f2353u.b().compareTo(j.c.INITIALIZED) >= 0) {
            lifecycleCoroutineScopeImpl.f2353u.a(lifecycleCoroutineScopeImpl);
        } else {
            sp.b.d(d0Var.f0(), null);
        }
        return hs.k.f19476a;
    }
}
