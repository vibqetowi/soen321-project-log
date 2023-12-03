package ml;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V2DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V2DashboardViewModel$checkAndFetchB2BOrgLogo$1", f = "V2DashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25613u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ y f25614v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f25614v = yVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z(this.f25614v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25613u;
        y yVar = this.f25614v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…_ID\n                    )");
            this.f25613u = 1;
            obj = ((a) yVar.B.getValue()).a(stringValue, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        yVar.A.i((String) obj);
        return hs.k.f19476a;
    }
}
