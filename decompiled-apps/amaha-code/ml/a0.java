package ml;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
/* compiled from: V2DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V2DashboardViewModel$fetchTopicalData$1", f = "V2DashboardViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25337u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ y f25338v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, ls.d<? super a0> dVar) {
        super(2, dVar);
        this.f25338v = yVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a0(this.f25338v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25337u;
        y yVar = this.f25338v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            u uVar = yVar.f25609x;
            this.f25337u = 1;
            uVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/new_topical", null, new s(uVar, hVar), new t(uVar, hVar));
            customVolleyJsonObjectRequest.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 2));
            VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        yVar.C.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return hs.k.f19476a;
    }
}
