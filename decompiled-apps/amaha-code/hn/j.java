package hn;

import com.theinnerhour.b2b.components.login.model.EmailLoginResponseDataModel;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseModel;
import com.theinnerhour.b2b.components.login.model.LoginFailure;
import com.theinnerhour.b2b.components.login.model.LoginResponse;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class j implements CustomRetrofitCallback<EmailLoginResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<LoginResponse> f17877u;

    public j(kotlinx.coroutines.k kVar) {
        this.f17877u = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<EmailLoginResponseModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f17877u.resumeWith(new LoginResponse(null, false, LoginFailure.API_FAILURE, null, 8, null));
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<EmailLoginResponseModel> call, dw.z<EmailLoginResponseModel> response) {
        boolean z10;
        LoginFailure loginFailure;
        String h10;
        Object obj;
        EmailLoginResponseDataModel data;
        String str = "";
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        kotlinx.coroutines.j<LoginResponse> jVar = this.f17877u;
        String str2 = null;
        EmailLoginResponseModel emailLoginResponseModel = response.f13696b;
        if (a10) {
            EmailLoginResponseModel emailLoginResponseModel2 = emailLoginResponseModel;
            if (emailLoginResponseModel2 != null && (data = emailLoginResponseModel2.getData()) != null) {
                str2 = data.getUsertype();
            }
            if (kotlin.jvm.internal.i.b(str2, "therapist")) {
                jVar.resumeWith(new LoginResponse(null, false, LoginFailure.NOT_PERMITTED, null, 8, null));
                return;
            } else {
                jVar.resumeWith(new LoginResponse(emailLoginResponseModel, true, null, null, 8, null));
                return;
            }
        }
        try {
            lv.e0 e0Var = response.f13697c;
            if (e0Var != null && (h10 = e0Var.h()) != null) {
                JSONArray optJSONArray = new JSONObject(h10).optJSONArray("errors");
                if (optJSONArray != null) {
                    obj = optJSONArray.opt(0);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
                if (str2 != null) {
                    str = str2;
                }
            }
        } catch (Exception unused) {
        }
        EmailLoginResponseModel emailLoginResponseModel3 = emailLoginResponseModel;
        int i6 = response.f13695a.f24586x;
        if (i6 == 401) {
            loginFailure = LoginFailure.AUTHENTICATION_ERROR;
        } else {
            boolean z11 = true;
            if (400 <= i6 && i6 < 500) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                loginFailure = LoginFailure.CLIENT_ERROR;
            } else {
                if ((500 > i6 || i6 >= 600) ? false : false) {
                    loginFailure = LoginFailure.SERVER_ERROR;
                } else {
                    loginFailure = LoginFailure.API_FAILURE;
                }
            }
        }
        jVar.resumeWith(new LoginResponse(emailLoginResponseModel3, false, loginFailure, str));
    }
}
