package wo;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentAddFamilyViewModel$removeMember$1", f = "ExperimentAddFamilyViewModel.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36908u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f36909v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AddFamilyMember f36910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, AddFamilyMember addFamilyMember, ls.d<? super i> dVar) {
        super(2, dVar);
        this.f36909v = hVar;
        this.f36910w = addFamilyMember;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i(this.f36909v, this.f36910w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36908u;
        h hVar = this.f36909v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            hVar.f36901z.i(Boolean.TRUE);
            this.f36908u = 1;
            g gVar = hVar.f36899x;
            gVar.getClass();
            ls.h hVar2 = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            AddFamilyMember addFamilyMember = this.f36910w;
            jSONObject.put("customer_id", addFamilyMember.getUuid());
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/remove_member", jSONObject, new a(gVar, addFamilyMember, hVar2), new b(gVar, hVar2)));
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
