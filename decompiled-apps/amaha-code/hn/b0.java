package hn;

import android.app.Application;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.EmailLoginRequestModel;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseDataModel;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseModel;
import com.theinnerhour.b2b.components.login.model.LoginFailure;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.LoginModel;
import com.theinnerhour.b2b.components.login.model.LoginResponse;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.o0;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$signIn$1", f = "LoginSignupReworkViewModel.kt", l = {937, 950}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17820u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17821v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ LoginModel f17822w;

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17823a;

        static {
            int[] iArr = new int[LoginFailure.values().length];
            try {
                iArr[LoginFailure.AUTHENTICATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginFailure.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginFailure.NOT_PERMITTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginFailure.CLIENT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoginFailure.API_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17823a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(q qVar, LoginModel loginModel, ls.d<? super b0> dVar) {
        super(2, dVar);
        this.f17821v = qVar;
        this.f17822w = loginModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b0(this.f17821v, this.f17822w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i6;
        String string;
        EmailLoginResponseDataModel data;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f17820u;
        String str2 = null;
        LoginModel loginModel = this.f17822w;
        q qVar = this.f17821v;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sp.b.d0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        qVar.n();
                    } else {
                        qVar.F.i(LoginLoading.HIDE_LOADING);
                        Utils.INSTANCE.clearPersistence();
                        qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginParseError));
                    }
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            b bVar = qVar.C;
            String userName = loginModel.getUserName();
            String password = loginModel.getPassword();
            if (loginModel.isGoogleLoginRedirect()) {
                str = "google_oauth2";
            } else {
                str = null;
            }
            EmailLoginRequestModel emailLoginRequestModel = new EmailLoginRequestModel(userName, password, str);
            this.f17820u = 1;
            bVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            ((or.d) nr.b.a(or.d.class)).f("https://api.theinnerhour.com/v1/authenticate/sign_in", emailLoginRequestModel).I(new h(kVar));
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        LoginResponse loginResponse = (LoginResponse) obj;
        if (loginResponse.getSuccess()) {
            EmailLoginResponseModel response = loginResponse.getResponse();
            if (response != null && (data = response.getData()) != null) {
                str2 = data.getToken();
            }
            String str3 = str2;
            if (str3 != null) {
                SessionManager.getInstance().parseSessionManagerValues(loginResponse.getResponse().getData());
                String timezone = loginResponse.getResponse().getData().getTimezone();
                if (timezone != null) {
                    qVar.C.getClass();
                    b.f(timezone);
                }
                String userName2 = loginModel.getUserName();
                this.f17820u = 2;
                qVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new c0(str3, hVar, qVar, userName2, null), 2);
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                Utils.INSTANCE.clearPersistence();
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginParseError));
            }
        } else {
            qVar.F.i(LoginLoading.HIDE_LOADING);
            Utils.INSTANCE.clearPersistence();
            androidx.lifecycle.w<String> wVar = qVar.H;
            LoginFailure error = loginResponse.getError();
            if (error == null) {
                i6 = -1;
            } else {
                i6 = a.f17823a[error.ordinal()];
            }
            Application application = qVar.f2382x;
            if (i6 != -1) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                string = application.getApplicationContext().getString(R.string.loginNetworkError);
                            }
                        } else {
                            string = application.getApplicationContext().getString(R.string.loginNotPermitted);
                        }
                    } else {
                        string = application.getApplicationContext().getString(R.string.loginParseError);
                    }
                } else {
                    string = loginResponse.getErrorString();
                }
                wVar.i(string);
            }
            string = application.getApplicationContext().getString(R.string.loginSomethingWentWrong);
            wVar.i(string);
        }
        return hs.k.f19476a;
    }
}
