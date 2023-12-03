package wo;

import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentAddFamilyViewModel$saveMemberDetails$1", f = "ExperimentAddFamilyViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36916u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f36917v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f36918w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f36919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, String str, String str2, ls.d<? super j> dVar) {
        super(2, dVar);
        this.f36917v = hVar;
        this.f36918w = str;
        this.f36919x = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j(this.f36917v, this.f36918w, this.f36919x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36916u;
        h hVar = this.f36917v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            hVar.f36901z.i(Boolean.TRUE);
            this.f36916u = 1;
            g gVar = hVar.f36899x;
            gVar.getClass();
            ls.h hVar2 = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SessionManager.KEY_EMAIL, this.f36918w);
            jSONObject.put("relation", this.f36919x);
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/customers", jSONObject, new e(gVar, hVar2), new f(gVar, hVar2)));
            obj = hVar2.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((ApiNetworkStatus) obj) == ApiNetworkStatus.SUCCESS) {
            hVar.e();
        } else {
            hVar.f36901z.i(Boolean.FALSE);
        }
        return hs.k.f19476a;
    }
}
