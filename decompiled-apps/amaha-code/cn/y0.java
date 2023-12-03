package cn;

import jl.t1;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$submitRating$1", f = "LibraryViewModel.kt", l = {512}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5832u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f5833v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f5834w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5835x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k0 k0Var, int i6, String str, ls.d<? super y0> dVar) {
        super(2, dVar);
        this.f5833v = k0Var;
        this.f5834w = i6;
        this.f5835x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new y0(this.f5833v, this.f5834w, this.f5835x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5832u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            this.f5832u = 1;
            if (((t1) this.f5833v.S.getValue()).a(this.f5834w, this.f5835x, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
