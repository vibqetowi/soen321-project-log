package cn;

import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchTopicalCourses$1", f = "LibraryShortCoursesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f5569u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, ls.d<? super i0> dVar) {
        super(2, dVar);
        this.f5569u = j0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i0(this.f5569u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        j0 j0Var = this.f5569u;
        j0Var.getClass();
        try {
            ta.v.H(kc.f.H(j0Var), null, 0, new h0(j0Var, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(j0Var.f5582y, e10);
        }
        return hs.k.f19476a;
    }
}
