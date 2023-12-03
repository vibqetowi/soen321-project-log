package hn;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class c implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f17824u;

    public c(b bVar) {
        this.f17824u = bVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper logHelper = LogHelper.INSTANCE;
        String tag_util = Utils.INSTANCE.getTAG_UTIL();
        String message = t3.getMessage();
        if (message == null) {
            message = "Failure in checkComponentVisibility";
        }
        logHelper.e(tag_util, message);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        if (response.a()) {
            SessionManager.getInstance().setStringValue(SessionManager.KEY_COMPONENT_VISIBILITY, String.valueOf(response.f13696b));
            return;
        }
        lv.e0 e0Var = response.f13697c;
        if (e0Var != null) {
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = this.f17824u.f17789a;
            logHelper.e(str, "exception in checkcomponentvisibility " + e0Var);
        }
    }
}
