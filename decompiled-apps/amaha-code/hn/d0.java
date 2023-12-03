package hn;

import android.os.Bundle;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.LoginModel;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.SignupModel;
import com.theinnerhour.b2b.components.login.model.SignupResponse;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import java.util.TimeZone;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$signup$1", f = "LoginSignupReworkViewModel.kt", l = {858}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17844u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17845v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ SignupModel f17846w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(q qVar, SignupModel signupModel, ls.d<? super d0> dVar) {
        super(2, dVar);
        this.f17845v = qVar;
        this.f17846w = signupModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d0(this.f17845v, this.f17846w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        JSONObject jSONObject;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17844u;
        SignupModel signupModel = this.f17846w;
        q qVar = this.f17845v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            b bVar = qVar.C;
            this.f17844u = 1;
            bVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String userName = signupModel.getUserName();
                if (userName != null) {
                    jSONObject2.put(SessionManager.KEY_EMAIL, userName);
                }
                jSONObject2.put("firstname", signupModel.getName());
                String password = signupModel.getPassword();
                if (password != null) {
                    jSONObject2.put(SessionManager.KEY_PASS, password);
                }
                String phone = signupModel.getPhone();
                if (phone != null) {
                    jSONObject2.put(SessionManager.KEY_MOBILE, phone);
                    jSONObject2.put(SessionManager.KEY_COUNTRY_CODE, "91");
                }
                String otp = signupModel.getOtp();
                if (otp != null) {
                    jSONObject2.put("otp", otp);
                }
                jSONObject2.put("origin", "app");
                jSONObject2.put("timezone", TimeZone.getDefault().getID());
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f17789a, e10);
            }
            l lVar = new l(jSONObject2, new m(signupModel, kVar, bVar), new n(signupModel, kVar, bVar));
            lVar.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 0));
            VolleySingleton.getInstance().add(lVar);
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        SignupResponse signupResponse = (SignupResponse) obj;
        if (signupResponse.getSuccess()) {
            JSONObject response = signupResponse.getResponse();
            if (response != null && (jSONObject = response.getJSONObject("data")) != null) {
                str2 = jSONObject.getString(SessionManager.KEY_FB_TOKEN);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                q.g(qVar, str2, signupModel.getUserName(), qVar.Z);
            } else {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                Utils.INSTANCE.clearPersistence();
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
            }
        } else {
            Boolean loginUser = signupResponse.getLoginUser();
            Boolean bool = Boolean.TRUE;
            if (kotlin.jvm.internal.i.b(loginUser, bool)) {
                q.h(qVar, new LoginModel(signupModel.getUserName(), signupModel.getPassword(), null, null, false));
                qVar.Z = LoginSignupFlow.SIGN_IN_EMAIL;
            } else {
                String error = signupResponse.getError();
                if (error != null) {
                    qVar.H.i(error);
                }
                qVar.F.i(LoginLoading.HIDE_LOADING);
            }
            String str3 = gk.a.f16573a;
            Bundle a10 = r1.b0.a("source", "auth_screen");
            if (kotlin.jvm.internal.i.b(signupResponse.getOtpVerified(), bool)) {
                str = "success";
            } else {
                str = "fail";
            }
            a10.putString("status", str);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(a10, "auth_verify_otp_confirm");
        }
        qVar.U.i(new SingleUseEvent<>(signupResponse.getOtpVerified()));
        qVar.V.i(new SingleUseEvent<>(signupResponse.getOtpError()));
        return hs.k.f19476a;
    }
}
