package hn;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.login.model.ExpandedState;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.ReworkLoginState;
import com.theinnerhour.b2b.components.login.model.ReworkSignupState;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$fetchDynamicLink$1", f = "LoginSignupReworkViewModel.kt", l = {1597}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17936u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17937v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, ls.d<? super s> dVar) {
        super(2, dVar);
        this.f17937v = qVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new s(this.f17937v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        String str;
        ReworkSignupState copy;
        ReworkSignupState copy2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17936u;
        q qVar = this.f17937v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
                b10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
                String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK);
                kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ants.DYNAMIC_SIGNUP_LINK)");
                if (gv.r.J0(stringValue, "linktype=pre")) {
                    qVar.F.i(LoginLoading.SHOW_LOADING);
                    this.f17936u = 1;
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ta.v.H(kc.f.H(qVar), o0.f23640a, 0, new u(qVar, hVar, null), 2);
                    b10 = hVar.b();
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
            }
            qVar.A.i(new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null));
            qVar.B.i(new ReworkLoginState(null, null, null, null, false, null, null, false, 255, null));
            qVar.f17892z.i(Boolean.TRUE);
            return hs.k.f19476a;
        }
        JSONObject jSONObject = (JSONObject) b10;
        if (jSONObject != null) {
            qVar.R = jSONObject.optBoolean("blockLogin");
            qVar.Q = jSONObject.optBoolean("blockSignup");
            androidx.lifecycle.w<ReworkSignupState> wVar = qVar.A;
            ReworkSignupState reworkSignupState = new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null);
            if (jSONObject.optBoolean("passwordRules")) {
                reworkSignupState = reworkSignupState.copy((r28 & 1) != 0 ? reworkSignupState.expandedState : null, (r28 & 2) != 0 ? reworkSignupState.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState.isEnforcePasswordRules : true, (r28 & 128) != 0 ? reworkSignupState.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState.isDisableLogin : false);
            }
            ReworkSignupState reworkSignupState2 = reworkSignupState;
            if (jSONObject.has("socialEnabled") && !jSONObject.optBoolean("socialEnabled")) {
                reworkSignupState2 = reworkSignupState2.copy((r28 & 1) != 0 ? reworkSignupState2.expandedState : null, (r28 & 2) != 0 ? reworkSignupState2.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState2.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState2.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState2.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState2.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState2.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState2.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState2.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState2.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState2.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState2.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState2.isDisableLogin : false);
            }
            ReworkSignupState reworkSignupState3 = reworkSignupState2;
            if (!jSONObject.optBoolean("branding")) {
                str = "brandImage";
            } else {
                str = "brandImage";
                reworkSignupState3 = reworkSignupState3.copy((r28 & 1) != 0 ? reworkSignupState3.expandedState : null, (r28 & 2) != 0 ? reworkSignupState3.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState3.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState3.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState3.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState3.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState3.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState3.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState3.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState3.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState3.brandingInfo : new hs.f(Boolean.TRUE, jSONObject.getString("brandImage")), (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState3.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState3.isDisableLogin : false);
            }
            copy = r7.copy((r28 & 1) != 0 ? r7.expandedState : null, (r28 & 2) != 0 ? r7.phoneNameInputError : null, (r28 & 4) != 0 ? r7.emailNameInputError : null, (r28 & 8) != 0 ? r7.emailInputError : null, (r28 & 16) != 0 ? r7.passwordInputError : null, (r28 & 32) != 0 ? r7.phoneInputError : null, (r28 & 64) != 0 ? r7.isEnforcePasswordRules : false, (r28 & 128) != 0 ? r7.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? r7.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? r7.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? r7.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? r7.signupTextOverride : new hs.f(jSONObject.optString("signUpTitle"), jSONObject.optString("signUpSubtitle")), (r28 & 4096) != 0 ? reworkSignupState3.isDisableLogin : false);
            ExpandedState expandedState = ExpandedState.BOTTOM_EXPANDED;
            copy2 = copy.copy((r28 & 1) != 0 ? copy.expandedState : expandedState, (r28 & 2) != 0 ? copy.phoneNameInputError : null, (r28 & 4) != 0 ? copy.emailNameInputError : null, (r28 & 8) != 0 ? copy.emailInputError : null, (r28 & 16) != 0 ? copy.passwordInputError : null, (r28 & 32) != 0 ? copy.phoneInputError : null, (r28 & 64) != 0 ? copy.isEnforcePasswordRules : false, (r28 & 128) != 0 ? copy.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? copy.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? copy.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.signupTextOverride : null, (r28 & 4096) != 0 ? copy.isDisableLogin : qVar.R);
            wVar.i(copy2);
            androidx.lifecycle.w<ReworkLoginState> wVar2 = qVar.B;
            ReworkLoginState reworkLoginState = new ReworkLoginState(null, null, null, null, false, null, null, false, 255, null);
            if (jSONObject.has("socialEnabled") && !jSONObject.optBoolean("socialEnabled")) {
                reworkLoginState = ReworkLoginState.copy$default(reworkLoginState, null, null, null, null, false, null, null, false, 239, null);
            }
            ReworkLoginState reworkLoginState2 = reworkLoginState;
            if (jSONObject.optBoolean("branding")) {
                reworkLoginState2 = ReworkLoginState.copy$default(reworkLoginState2, null, null, null, null, false, new hs.f(Boolean.TRUE, jSONObject.getString(str)), null, false, 223, null);
            }
            wVar2.i(ReworkLoginState.copy$default(ReworkLoginState.copy$default(reworkLoginState2, null, null, null, null, false, null, new hs.f(jSONObject.optString("loginTitle"), jSONObject.optString("loginSubtitle")), false, 191, null), expandedState, null, null, null, false, null, null, qVar.Q, R.styleable.AppCompatTheme_windowNoTitle, null));
            qVar.f17890b0 = "default";
        } else {
            qVar.A.i(new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null));
            qVar.B.i(new ReworkLoginState(null, null, null, null, false, null, null, false, 255, null));
        }
        qVar.f17892z.i(Boolean.TRUE);
        qVar.F.i(LoginLoading.HIDE_LOADING);
        return hs.k.f19476a;
    }
}
