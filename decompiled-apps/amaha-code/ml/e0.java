package ml;

import android.app.Application;
import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$checkMcSlugUpdate$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c0 f25415u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, ls.d<? super e0> dVar) {
        super(2, dVar);
        this.f25415u = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e0(this.f25415u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        c0 c0Var = this.f25415u;
        Application application = c0Var.f2382x;
        kotlin.jvm.internal.i.f(application, "getApplication()");
        ((CourseApiUtil) c0Var.T.getValue()).checkMcSlugUpdate(0, application);
        return hs.k.f19476a;
    }
}
