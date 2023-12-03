package or;

import com.theinnerhour.b2b.components.login.model.EmailLoginRequestModel;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseModel;
import com.theinnerhour.b2b.components.login.model.PasswordResetRequestModel;
import com.theinnerhour.b2b.components.login.model.PasswordResetResponseModel;
import com.theinnerhour.b2b.components.login.model.PhoneLoginRequestModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import fw.o;
import fw.t;
import fw.y;
import kotlin.Metadata;
import lv.c0;
/* compiled from: LoginService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0010H'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0013H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0015H'¨\u0006\u0018"}, d2 = {"Lor/d;", "", "", "type", Constants.NOTIFICATION_URL, "Ldw/b;", "e", "Llv/c0;", "body", "Lsf/m;", "c", SessionManager.KEY_MOBILE, "countryCode", "a", "login", "d", "Lcom/theinnerhour/b2b/components/login/model/EmailLoginRequestModel;", "Lcom/theinnerhour/b2b/components/login/model/EmailLoginResponseModel;", "f", "Lcom/theinnerhour/b2b/components/login/model/PhoneLoginRequestModel;", "g", "Lcom/theinnerhour/b2b/components/login/model/PasswordResetRequestModel;", "Lcom/theinnerhour/b2b/components/login/model/PasswordResetResponseModel;", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface d {
    @fw.k({"Content-Type: application/json"})
    @fw.f
    dw.b<sf.m> a(@y String str, @t("mobile") String str2, @t("country_code") String str3);

    @o
    dw.b<PasswordResetResponseModel> b(@y String str, @fw.a PasswordResetRequestModel passwordResetRequestModel);

    @fw.k({"Content-Type: application/json"})
    @o
    dw.b<sf.m> c(@y String str, @fw.a c0 c0Var);

    @fw.k({"Content-Type: application/json"})
    @fw.f
    dw.b<sf.m> d(@y String str, @t("mobile") String str2, @t("login") String str3);

    @fw.f
    dw.b<String> e(@fw.i("accept") String str, @y String str2);

    @o
    dw.b<EmailLoginResponseModel> f(@y String str, @fw.a EmailLoginRequestModel emailLoginRequestModel);

    @fw.k({"Content-Type: application/json", "Android-Version: 214", "Create-Firebase: false"})
    @o
    dw.b<EmailLoginResponseModel> g(@y String str, @fw.a PhoneLoginRequestModel phoneLoginRequestModel);
}
