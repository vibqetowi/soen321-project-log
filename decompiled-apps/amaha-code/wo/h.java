package wo;

import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<String> A;
    public final androidx.lifecycle.w<String> B;

    /* renamed from: x  reason: collision with root package name */
    public final g f36899x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.w<ArrayList<AddFamilyMember>> f36900y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f36901z;

    /* compiled from: ExperimentAddFamilyViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentAddFamilyViewModel$fetchMemberDetails$1", f = "ExperimentAddFamilyViewModel.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36902u;

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36902u;
            h hVar = h.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                hVar.f36901z.i(Boolean.TRUE);
                this.f36902u = 1;
                g gVar = hVar.f36899x;
                gVar.getClass();
                ls.h hVar2 = new ls.h(ca.a.G0(this));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("customer_id", SessionManager.getInstance().getStringValue(SessionManager.KEY_UUID));
                VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/get_members", jSONObject, new c(gVar, hVar2), new d(gVar, hVar2)));
                obj = hVar2.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            ApiNetworkStatus apiNetworkStatus = (ApiNetworkStatus) obj;
            hVar.f36901z.i(Boolean.FALSE);
            return hs.k.f19476a;
        }
    }

    public h() {
        g gVar = new g();
        this.f36899x = gVar;
        this.f36900y = new androidx.lifecycle.w<>();
        this.f36901z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.f36900y = gVar.f36892b;
        this.A = gVar.f36893c;
        this.B = gVar.f36894d;
        e();
    }

    public final void e() {
        ta.v.H(kc.f.H(this), null, 0, new a(null), 3);
    }
}
