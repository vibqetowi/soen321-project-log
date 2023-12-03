package jl;

import android.app.Application;
import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$checkMcSlugUpdate$1", f = "CustomDashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f22116u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f22116u = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f22116u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        e eVar = this.f22116u;
        Application application = eVar.f2382x;
        kotlin.jvm.internal.i.f(application, "getApplication()");
        ((CourseApiUtil) eVar.J.getValue()).checkMcSlugUpdate(0, application);
        return hs.k.f19476a;
    }
}
