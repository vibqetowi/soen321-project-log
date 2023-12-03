package wo;

import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.regex.Pattern;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileViewModel$sendOTP$1", f = "ExperimentEditProfileViewModel.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f37004u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f37005v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f37006w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f37007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, String str, boolean z10, ls.d<? super w> dVar) {
        super(2, dVar);
        this.f37005v = vVar;
        this.f37006w = str;
        this.f37007x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new w(this.f37005v, this.f37006w, this.f37007x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((w) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f37004u;
        v vVar = this.f37005v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            vVar.A.i(ApiNetworkStatus.LOADING);
            this.f37004u = 1;
            vVar.D.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("number", this.f37006w);
            jSONObject.put("resend", this.f37007x);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "requestObject.toString()");
            Pattern pattern = lv.v.f24702d;
            ((or.h) nr.b.a(or.h.class)).b("https://api.theinnerhour.com/v1/client/send_otp_for_phone_verification", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new mo.b(kVar));
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        hs.f fVar = (hs.f) obj;
        if (((Boolean) fVar.f19464u).booleanValue()) {
            vVar.A.i(ApiNetworkStatus.SUCCESS);
            vVar.I.i(new SingleUseEvent<>(Boolean.TRUE));
        } else {
            vVar.A.i(ApiNetworkStatus.ERROR);
            vVar.K.i(new SingleUseEvent<>(fVar.f19465v));
        }
        return hs.k.f19476a;
    }
}
