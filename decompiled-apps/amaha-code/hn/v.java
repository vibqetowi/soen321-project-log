package hn;

import com.facebook.FacebookException;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.SocialSignupModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: LoginSignupReworkViewModel.kt */
/* loaded from: classes2.dex */
public final class v implements h5.m<g6.z> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f17944a;

    public v(q qVar) {
        this.f17944a = qVar;
    }

    @Override // h5.m
    public final void a(FacebookException facebookException) {
        LogHelper logHelper = LogHelper.INSTANCE;
        q qVar = this.f17944a;
        logHelper.e(qVar.f17891y, String.valueOf(facebookException.getMessage()));
        qVar.f17889a0.i(new SingleUseEvent<>("OOPS something went wrong"));
    }

    @Override // h5.m
    public final void b(g6.z zVar) {
        LoginSignupFlow loginSignupFlow;
        q qVar = this.f17944a;
        qVar.getClass();
        String str = zVar.f16349a.f17180y;
        if (qVar.l()) {
            loginSignupFlow = LoginSignupFlow.SIGN_UP_FACEBOOK;
        } else {
            loginSignupFlow = LoginSignupFlow.SIGN_IN_FACEBOOK;
        }
        qVar.v(new SocialSignupModel("https://api.theinnerhour.com/v1/oauth/facebook/callback", null, null, str, null, loginSignupFlow));
    }

    @Override // h5.m
    public final void onCancel() {
    }
}
