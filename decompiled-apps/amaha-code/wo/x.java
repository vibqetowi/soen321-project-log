package wo;

import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import java.util.regex.Pattern;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileViewModel$verifyOTP$1", f = "ExperimentEditProfileViewModel.kt", l = {157, 160}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f37008u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f37009v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f37010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, String str, ls.d<? super x> dVar) {
        super(2, dVar);
        this.f37009v = vVar;
        this.f37010w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new x(this.f37009v, this.f37010w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((x) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f37008u;
        v vVar = this.f37009v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            vVar.A.i(ApiNetworkStatus.LOADING);
            this.f37008u = 1;
            n nVar = vVar.D;
            nVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otp", this.f37010w);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "requestObject.toString()");
            Pattern pattern = lv.v.f24702d;
            ((or.h) nr.b.a(or.h.class)).a("https://api.theinnerhour.com/v1/client/verify_phone", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new u(nVar, kVar));
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            vVar.A.i(ApiNetworkStatus.SUCCESS);
            this.f37008u = 2;
            n nVar2 = vVar.D;
            nVar2.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            ((or.l) nr.b.a(or.l.class)).b("https://api.theinnerhour.com/v1/refresh_token").I(new m(nVar2, hVar));
            if (hVar.b() == aVar) {
                return aVar;
            }
        } else {
            vVar.A.i(ApiNetworkStatus.ERROR);
        }
        return hs.k.f19476a;
    }
}
