package ml;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$checkAndFetchB2BOrgLogo$1", f = "V3DashboardViewModel.kt", l = {1429}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25404u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f25405v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, ls.d<? super d0> dVar) {
        super(2, dVar);
        this.f25405v = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d0(this.f25405v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25404u;
        c0 c0Var = this.f25405v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ager.KEY_ORGANISATION_ID)");
            this.f25404u = 1;
            obj = ((a) c0Var.Y.getValue()).a(stringValue, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        c0Var.E.i((String) obj);
        return hs.k.f19476a;
    }
}
