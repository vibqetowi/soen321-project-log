package hn;

import android.os.Bundle;
import com.theinnerhour.b2b.components.login.model.SignupModel;
import com.theinnerhour.b2b.components.login.model.SignupResponse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class m<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SignupModel f17879u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<SignupResponse> f17880v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f17881w;

    public m(SignupModel signupModel, kotlinx.coroutines.k kVar, b bVar) {
        this.f17879u = signupModel;
        this.f17880v = kVar;
        this.f17881w = bVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        String phone;
        boolean z10;
        Boolean bool;
        String str;
        String str2;
        String phone2;
        boolean z11;
        Boolean bool2;
        String phone3;
        boolean z12;
        Boolean bool3;
        JSONObject jSONObject = (JSONObject) obj;
        SignupModel signupModel = this.f17879u;
        kotlinx.coroutines.j<SignupResponse> jVar = this.f17880v;
        try {
            String res = jSONObject.getString("status");
            kotlin.jvm.internal.i.f(res, "res");
            if (gv.r.J0(res, "success")) {
                ApplicationPersistence.getInstance().clearData();
                SessionManager.getInstance().setLongValue(SessionManager.KEY_USERID, Long.valueOf(jSONObject.getJSONObject("data").getLong("id")));
                SessionManager.getInstance().setStringValue(SessionManager.KEY_FB_TOKEN, jSONObject.getJSONObject("data").getString(SessionManager.KEY_FB_TOKEN));
                SessionManager.getInstance().setStringValue(SessionManager.KEY_UUID, jSONObject.getJSONObject("data").getString(SessionManager.KEY_UUID));
                SessionManager.getInstance().setStringValue(SessionManager.KEY_UID, jSONObject.getJSONObject("data").getString(SessionManager.KEY_UID));
                SessionManager.getInstance().setStringValue(SessionManager.KEY_USERTYPE, jSONObject.getJSONObject("data").getString("usertype"));
                SessionManager.getInstance().setStringValue(SessionManager.KEY_FIRSTNAME, signupModel.getName());
                Utils.parseLoginResponse$default(Utils.INSTANCE, jSONObject, false, 2, null);
                jd.e.a().c(jSONObject.getJSONObject("data").getString(SessionManager.KEY_UUID));
                String str3 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "signup_success");
                if (jVar.a()) {
                    if (signupModel.getPhone() != null && (!gv.n.B0(phone3))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        bool3 = Boolean.TRUE;
                    } else {
                        bool3 = null;
                    }
                    jVar.resumeWith(new SignupResponse(true, jSONObject, null, null, bool3, null, 32, null));
                    return;
                }
                return;
            }
            if (!jVar.a()) {
                str = "variant";
                str2 = Constants.ONBOARDING_EXPERIMENT;
            } else {
                if (signupModel.getPhone() != null && (!gv.n.B0(phone2))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = null;
                }
                str = "variant";
                str2 = Constants.ONBOARDING_EXPERIMENT;
                jVar.resumeWith(new SignupResponse(false, jSONObject, "SignUp failed. Please try again", null, bool2, null, 32, null));
            }
            String str4 = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            bundle2.putString(str, ApplicationPersistence.getInstance().getStringValue(str2));
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle2, "signup_failure");
        } catch (JSONException e10) {
            Utils.INSTANCE.clearPersistence();
            LogHelper.INSTANCE.e(this.f17881w.f17789a, e10);
            if (jVar.a()) {
                if (signupModel.getPhone() != null && (!gv.n.B0(phone))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                jVar.resumeWith(new SignupResponse(false, null, "SignUp failed. Please try again", null, bool, null, 32, null));
            }
        }
    }
}
