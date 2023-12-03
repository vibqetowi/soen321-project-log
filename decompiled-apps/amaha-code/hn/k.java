package hn;

import com.theinnerhour.b2b.components.login.model.PasswordResetResponseModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class k implements CustomRetrofitCallback<PasswordResetResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<Boolean, String>> f17878u;

    public k(ls.h hVar) {
        this.f17878u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<PasswordResetResponseModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f17878u.resumeWith(new hs.f(Boolean.FALSE, null));
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<PasswordResetResponseModel> call, dw.z<PasswordResetResponseModel> response) {
        String h10;
        String str;
        String str2 = "";
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<hs.f<Boolean, String>> dVar = this.f17878u;
        if (a10) {
            Boolean bool = Boolean.TRUE;
            PasswordResetResponseModel passwordResetResponseModel = response.f13696b;
            if (passwordResetResponseModel != null) {
                str = passwordResetResponseModel.getMessage();
            } else {
                str = null;
            }
            dVar.resumeWith(new hs.f(bool, str));
            return;
        }
        try {
            lv.e0 e0Var = response.f13697c;
            if (e0Var != null && (h10 = e0Var.h()) != null) {
                Object obj = new JSONObject(h10).get("errors");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                Object obj2 = ((JSONObject) obj).get("full_messages");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type org.json.JSONArray");
                String obj3 = ((JSONArray) obj2).get(0).toString();
                if (obj3 != null) {
                    str2 = obj3;
                }
            }
        } catch (Exception unused) {
        }
        dVar.resumeWith(new hs.f(Boolean.FALSE, str2));
    }
}
