package hn;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.AppsFlyerLib;
import com.bugsnag.android.Bugsnag;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseDataModel;
import com.theinnerhour.b2b.components.login.model.EmailLoginResponseModel;
import com.theinnerhour.b2b.components.login.model.ExpandedState;
import com.theinnerhour.b2b.components.login.model.InitFirebaseResponses;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.LoginModel;
import com.theinnerhour.b2b.components.login.model.LoginResponse;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.NavigationScreenName;
import com.theinnerhour.b2b.components.login.model.PhoneLoginRequestModel;
import com.theinnerhour.b2b.components.login.model.ReworkLoginState;
import com.theinnerhour.b2b.components.login.model.ReworkSignupEvents;
import com.theinnerhour.b2b.components.login.model.ReworkSignupState;
import com.theinnerhour.b2b.components.login.model.SignupModel;
import com.theinnerhour.b2b.components.login.model.SocialSignupModel;
import com.theinnerhour.b2b.components.login.model.SocialSignupResponse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlinx.coroutines.o0;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
/* loaded from: classes2.dex */
public final class q extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<ReworkSignupState> A;
    public final androidx.lifecycle.w<ReworkLoginState> B;
    public final hn.b C;
    public SocialSignupModel D;
    public final hs.i E;
    public final androidx.lifecycle.w<LoginLoading> F;
    public final androidx.lifecycle.w<Boolean> G;
    public final androidx.lifecycle.w<String> H;
    public final androidx.lifecycle.w<LoginSignupFlow> I;
    public final androidx.lifecycle.w<SingleUseEvent<String>> J;
    public final androidx.lifecycle.w<SingleUseEvent<String>> K;
    public final androidx.lifecycle.w<SingleUseEvent<hs.f<NavigationScreenName, Bundle>>> L;
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> M;
    public int N;
    public e0 O;
    public final androidx.lifecycle.w<String> P;
    public boolean Q;
    public boolean R;
    public final hs.i S;
    public final hs.i T;
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> U;
    public final androidx.lifecycle.w<SingleUseEvent<String>> V;
    public final androidx.lifecycle.w<SingleUseEvent<Integer>> W;
    public final androidx.lifecycle.w<String> X;
    public boolean Y;
    public LoginSignupFlow Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<String>> f17889a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f17890b0;
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> c0;

    /* renamed from: y  reason: collision with root package name */
    public final String f17891y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f17892z;

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$1", f = "LoginSignupReworkViewModel.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17893u;

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17893u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.flow.b bVar = q.this.C.f17791c;
                this.f17893u = 1;
                if (ta.v.M(bVar, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17895a;

        static {
            int[] iArr = new int[InitFirebaseResponses.values().length];
            try {
                iArr[InitFirebaseResponses.INITIALISE_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitFirebaseResponses.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17895a = iArr;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<h5.l> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f17896u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final h5.l invoke() {
            return new w5.d();
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<i9.a> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final i9.a invoke() {
            boolean z10;
            q qVar = q.this;
            Context applicationContext = qVar.f2382x.getApplicationContext();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.F;
            new HashSet();
            new HashMap();
            v9.o.h(googleSignInOptions);
            HashSet hashSet = new HashSet(googleSignInOptions.f7223v);
            Account account = googleSignInOptions.f7224w;
            String str = googleSignInOptions.B;
            HashMap g02 = GoogleSignInOptions.g0(googleSignInOptions.C);
            String str2 = googleSignInOptions.D;
            Application application = qVar.f2382x;
            String string = application.getApplicationContext().getString(R.string.default_android_client_id);
            v9.o.e(string);
            boolean z11 = false;
            String str3 = googleSignInOptions.A;
            if (str3 != null && !str3.equals(string)) {
                z10 = false;
            } else {
                z10 = true;
            }
            v9.o.a("two different server client ids provided", z10);
            String string2 = application.getApplicationContext().getString(R.string.default_android_client_id);
            v9.o.e(string2);
            v9.o.a("two different server client ids provided", (string == null || string.equals(string2)) ? true : true);
            hashSet.add(GoogleSignInOptions.G);
            if (hashSet.contains(GoogleSignInOptions.J)) {
                Scope scope = GoogleSignInOptions.I;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            if (account == null || !hashSet.isEmpty()) {
                hashSet.add(GoogleSignInOptions.H);
            }
            return new i9.a(applicationContext, new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, true, false, string2, str, g02, str2));
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$onInitialiseComplete$1", f = "LoginSignupReworkViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public e(ls.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            hn.b bVar = q.this.C;
            bVar.getClass();
            ((or.k) nr.b.a(or.k.class)).d("https://api.theinnerhour.com/v1/appvisibility").I(new hn.c(bVar));
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$onInitialiseComplete$2", f = "LoginSignupReworkViewModel.kt", l = {1081}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17899u;

        public f(ls.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17899u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                hn.b bVar = q.this.C;
                this.f17899u = 1;
                bVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.l) nr.b.a(or.l.class)).b("https://api.theinnerhour.com/v1/refresh_token").I(new hn.g(bVar, hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$socialSignup$1", f = "LoginSignupReworkViewModel.kt", l = {1127}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17901u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ LoginSignupFlow f17903w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LoginSignupFlow loginSignupFlow, ls.d<? super g> dVar) {
            super(2, dVar);
            this.f17903w = loginSignupFlow;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new g(this.f17903w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17901u;
            LoginSignupFlow loginSignupFlow = this.f17903w;
            q qVar = q.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                qVar.Z = loginSignupFlow;
                this.f17901u = 1;
                obj = q.e(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            qVar.F.i(LoginLoading.HIDE_LOADING);
            if (!booleanValue) {
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.signUpNetworkError));
            } else {
                qVar.I.i(loginSignupFlow);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<jp.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f17904u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final jp.a invoke() {
            return new jp.a(0);
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startEmailLogin$1", f = "LoginSignupReworkViewModel.kt", l = {913}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17905u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f17907w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f17908x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f17909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, boolean z10, ls.d<? super i> dVar) {
            super(2, dVar);
            this.f17907w = str;
            this.f17908x = str2;
            this.f17909y = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f17907w, this.f17908x, this.f17909y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17905u;
            q qVar = q.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                qVar.F.i(LoginLoading.SHOW_LOADING);
                this.f17905u = 1;
                obj = q.e(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.signUpConnectivityError));
            } else {
                q.h(qVar, new LoginModel(this.f17907w, this.f17908x, null, null, this.f17909y));
                qVar.Z = LoginSignupFlow.SIGN_IN_EMAIL;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startEmailSignup$1", f = "LoginSignupReworkViewModel.kt", l = {629}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17910u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f17912w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f17913x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, String str3, ls.d<? super j> dVar) {
            super(2, dVar);
            this.f17912w = str;
            this.f17913x = str2;
            this.f17914y = str3;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new j(this.f17912w, this.f17913x, this.f17914y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17910u;
            q qVar = q.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f17910u = 1;
                obj = q.e(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.signUpConnectivityError));
            } else {
                String str = this.f17912w;
                String str2 = this.f17913x;
                String str3 = this.f17914y;
                kotlin.jvm.internal.i.d(str3);
                SignupModel signupModel = new SignupModel(str, str2, str3, null, null);
                qVar.getClass();
                ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new d0(qVar, signupModel, null), 2);
                qVar.Z = LoginSignupFlow.SIGN_UP_EMAIL;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startPhoneLogin$1", f = "LoginSignupReworkViewModel.kt", l = {757, 765, 784, 786, 812}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public q f17915u;

        /* renamed from: v  reason: collision with root package name */
        public int f17916v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f17917w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17919y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f17920z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, ls.d<? super k> dVar) {
            super(2, dVar);
            this.f17919y = str;
            this.f17920z = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            k kVar = new k(this.f17919y, this.f17920z, dVar);
            kVar.f17917w = obj;
            return kVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x024d  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.d0 d0Var;
            Object e10;
            Object c10;
            Object s10;
            LoginResponse loginResponse;
            EmailLoginResponseDataModel emailLoginResponseDataModel;
            EmailLoginResponseDataModel data;
            String token;
            Object b10;
            kotlinx.coroutines.d0 d0Var2;
            q qVar;
            EmailLoginResponseDataModel data2;
            String uuid;
            EmailLoginResponseDataModel data3;
            String timezone;
            fd.c cVar;
            hs.f fVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17916v;
            hs.k kVar = null;
            q qVar2 = q.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 == 5) {
                                    sp.b.d0(obj);
                                    c10 = obj;
                                    fVar = (hs.f) c10;
                                    if (!((Boolean) fVar.f19464u).booleanValue()) {
                                        qVar2.c0.i(new SingleUseEvent<>(Boolean.TRUE));
                                        q.i(qVar2);
                                    } else {
                                        androidx.lifecycle.w<String> wVar = qVar2.H;
                                        String str = (String) fVar.f19465v;
                                        if (str == null) {
                                            str = qVar2.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong);
                                            kotlin.jvm.internal.i.f(str, "getApplication<Applicati….loginSomethingWentWrong)");
                                        }
                                        wVar.i(str);
                                    }
                                    qVar2.F.i(LoginLoading.HIDE_LOADING);
                                    return hs.k.f19476a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.d0 d0Var3 = (kotlinx.coroutines.d0) this.f17917w;
                            sp.b.d0(obj);
                            kVar = hs.k.f19476a;
                            if (kVar == null) {
                                qVar2.H.i(qVar2.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                                qVar2.F.i(LoginLoading.HIDE_LOADING);
                                ApplicationPersistence.getInstance().clearData();
                            }
                            qVar2.F.i(LoginLoading.HIDE_LOADING);
                            return hs.k.f19476a;
                        }
                        qVar = this.f17915u;
                        sp.b.d0(obj);
                        d0Var2 = (kotlinx.coroutines.d0) this.f17917w;
                        b10 = obj;
                        cVar = (fd.c) b10;
                        if (cVar != null) {
                            if (cVar.getUser() != null) {
                                this.f17917w = d0Var2;
                                this.f17915u = null;
                                this.f17916v = 4;
                                if (q.f(qVar, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                                qVar.F.i(LoginLoading.HIDE_LOADING);
                                ApplicationPersistence.getInstance().clearData();
                            }
                            kVar = hs.k.f19476a;
                        }
                        if (kVar == null) {
                        }
                        qVar2.F.i(LoginLoading.HIDE_LOADING);
                        return hs.k.f19476a;
                    }
                    d0Var = (kotlinx.coroutines.d0) this.f17917w;
                    sp.b.d0(obj);
                    s10 = obj;
                    loginResponse = (LoginResponse) s10;
                    if (!loginResponse.getSuccess()) {
                        String str2 = gk.a.f16573a;
                        Bundle f = defpackage.e.f("source", "auth_screen", "status", "success");
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(f, "auth_verify_otp_confirm");
                        qVar2.U.i(new SingleUseEvent<>(Boolean.TRUE));
                        ApplicationPersistence.getInstance().clearData();
                        SessionManager sessionManager = SessionManager.getInstance();
                        EmailLoginResponseModel response = loginResponse.getResponse();
                        if (response != null) {
                            emailLoginResponseDataModel = response.getData();
                        } else {
                            emailLoginResponseDataModel = null;
                        }
                        sessionManager.parseSessionManagerValues(emailLoginResponseDataModel);
                        EmailLoginResponseModel response2 = loginResponse.getResponse();
                        hn.b bVar = qVar2.C;
                        if (response2 != null && (data3 = response2.getData()) != null && (timezone = data3.getTimezone()) != null) {
                            bVar.getClass();
                            hn.b.f(timezone);
                        }
                        EmailLoginResponseModel response3 = loginResponse.getResponse();
                        if (response3 != null && (data2 = response3.getData()) != null && (uuid = data2.getUuid()) != null) {
                            jd.e.a().c(uuid);
                        }
                        EmailLoginResponseModel response4 = loginResponse.getResponse();
                        if (response4 != null && (data = response4.getData()) != null && (token = data.getToken()) != null) {
                            this.f17917w = d0Var;
                            this.f17915u = qVar2;
                            this.f17916v = 3;
                            b10 = bVar.b(token, this);
                            if (b10 == aVar) {
                                return aVar;
                            }
                            d0Var2 = d0Var;
                            qVar = qVar2;
                            cVar = (fd.c) b10;
                            if (cVar != null) {
                            }
                        }
                        if (kVar == null) {
                        }
                        qVar2.F.i(LoginLoading.HIDE_LOADING);
                        return hs.k.f19476a;
                    }
                    String str3 = gk.a.f16573a;
                    Bundle f2 = defpackage.e.f("source", "auth_screen", "status", "fail");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(f2, "auth_verify_otp_confirm");
                    Bundle bundle = new Bundle();
                    bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                    gk.a.b(bundle, "login_failure");
                    qVar2.U.i(new SingleUseEvent<>(Boolean.FALSE));
                    qVar2.V.i(new SingleUseEvent<>(loginResponse.getErrorString()));
                    qVar2.F.i(LoginLoading.HIDE_LOADING);
                    return hs.k.f19476a;
                }
                d0Var = (kotlinx.coroutines.d0) this.f17917w;
                sp.b.d0(obj);
                e10 = obj;
            } else {
                sp.b.d0(obj);
                d0Var = (kotlinx.coroutines.d0) this.f17917w;
                qVar2.F.i(LoginLoading.SHOW_LOADING);
                this.f17917w = d0Var;
                this.f17916v = 1;
                e10 = q.e(qVar2, this);
                if (e10 == aVar) {
                    return aVar;
                }
            }
            if (!((Boolean) e10).booleanValue()) {
                qVar2.F.i(LoginLoading.HIDE_LOADING);
                qVar2.H.i(qVar2.f2382x.getApplicationContext().getString(R.string.signUpConnectivityError));
                return hs.k.f19476a;
            }
            qVar2.Z = LoginSignupFlow.SIGN_IN_PHONE;
            hn.b bVar2 = qVar2.C;
            String str4 = this.f17919y;
            String str5 = this.f17920z;
            if (str4 != null) {
                kotlin.jvm.internal.i.d(str5);
                String str6 = this.f17919y;
                String id2 = TimeZone.getDefault().getID();
                kotlin.jvm.internal.i.f(id2, "getDefault().id");
                PhoneLoginRequestModel phoneLoginRequestModel = new PhoneLoginRequestModel(str5, str6, null, id2, 4, null);
                this.f17917w = d0Var;
                this.f17916v = 2;
                bVar2.getClass();
                kotlinx.coroutines.k kVar4 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar4.u();
                ((or.d) nr.b.a(or.d.class)).g("https://api.theinnerhour.com/v1/authenticate/sign_in", phoneLoginRequestModel).I(new hn.j(kVar4));
                s10 = kVar4.s();
                if (s10 == aVar) {
                    return aVar;
                }
                loginResponse = (LoginResponse) s10;
                if (!loginResponse.getSuccess()) {
                }
            } else {
                this.f17917w = null;
                this.f17916v = 5;
                c10 = bVar2.c(str5, this, false);
                if (c10 == aVar) {
                    return aVar;
                }
                fVar = (hs.f) c10;
                if (!((Boolean) fVar.f19464u).booleanValue()) {
                }
                qVar2.F.i(LoginLoading.HIDE_LOADING);
                return hs.k.f19476a;
            }
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startPhoneSignup$1", f = "LoginSignupReworkViewModel.kt", l = {713, 730}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17921u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f17923w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f17924x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, String str3, ls.d<? super l> dVar) {
            super(2, dVar);
            this.f17923w = str;
            this.f17924x = str2;
            this.f17925y = str3;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new l(this.f17923w, this.f17924x, this.f17925y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hs.f fVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17921u;
            q qVar = q.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        fVar = (hs.f) obj;
                        if (!((Boolean) fVar.f19464u).booleanValue()) {
                            qVar.c0.i(new SingleUseEvent<>(Boolean.TRUE));
                            q.i(qVar);
                        } else {
                            androidx.lifecycle.w<String> wVar = qVar.H;
                            String str = (String) fVar.f19465v;
                            if (str == null) {
                                str = qVar.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong);
                                kotlin.jvm.internal.i.f(str, "getApplication<Applicati….loginSomethingWentWrong)");
                            }
                            wVar.i(str);
                        }
                        qVar.F.i(LoginLoading.HIDE_LOADING);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                qVar.F.i(LoginLoading.SHOW_LOADING);
                this.f17921u = 1;
                obj = q.e(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.signUpConnectivityError));
            } else {
                qVar.Z = LoginSignupFlow.SIGN_UP_PHONE;
                if (this.f17923w != null) {
                    String str2 = this.f17924x;
                    kotlin.jvm.internal.i.d(str2);
                    ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new d0(qVar, new SignupModel(null, null, str2, this.f17925y, this.f17923w), null), 2);
                } else {
                    this.f17921u = 2;
                    obj = qVar.C.c(this.f17925y, this, true);
                    if (obj == aVar) {
                        return aVar;
                    }
                    fVar = (hs.f) obj;
                    if (!((Boolean) fVar.f19464u).booleanValue()) {
                    }
                    qVar.F.i(LoginLoading.HIDE_LOADING);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startSocialSignup$1", f = "LoginSignupReworkViewModel.kt", l = {1147}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17926u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SocialSignupModel f17928w;

        /* compiled from: LoginSignupReworkViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$startSocialSignup$1$1$1", f = "LoginSignupReworkViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public /* synthetic */ Object f17929u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SocialSignupResponse f17930v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q f17931w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SocialSignupResponse socialSignupResponse, q qVar, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f17930v = socialSignupResponse;
                this.f17931w = qVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                a aVar = new a(this.f17930v, this.f17931w, dVar);
                aVar.f17929u = obj;
                return aVar;
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                hs.k kVar;
                JSONObject jSONObject;
                String string;
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f17929u;
                JSONObject response = this.f17930v.getResponse();
                q qVar = this.f17931w;
                if (response != null && (jSONObject = response.getJSONObject("user")) != null && (string = jSONObject.getString(SessionManager.KEY_FB_TOKEN)) != null) {
                    q.g(qVar, string, response.getJSONObject("user").getString(SessionManager.KEY_UID), qVar.Z);
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    qVar.F.i(LoginLoading.HIDE_LOADING);
                    qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(SocialSignupModel socialSignupModel, ls.d<? super m> dVar) {
            super(2, dVar);
            this.f17928w = socialSignupModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new m(this.f17928w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Bundle loginUser;
            NavigationScreenName navigationScreenName;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17926u;
            SocialSignupModel socialSignupModel = this.f17928w;
            boolean z10 = true;
            q qVar = q.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    qVar.F.i(LoginLoading.SHOW_LOADING);
                    hn.b bVar = qVar.C;
                    Context applicationContext = qVar.f2382x.getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                    this.f17926u = 1;
                    obj = bVar.d(socialSignupModel, applicationContext, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                SocialSignupResponse socialSignupResponse = (SocialSignupResponse) obj;
                if (socialSignupResponse.getSuccess()) {
                    ta.v.H(kc.f.H(qVar), null, 0, new a(socialSignupResponse, qVar, null), 3);
                } else {
                    String error = socialSignupResponse.getError();
                    if (error != null) {
                        qVar.H.i(error);
                        qVar.F.i(LoginLoading.HIDE_LOADING);
                    }
                    LoginSignupFlow loginSignupFlow = LoginSignupFlow.SIGN_UP_FACEBOOK;
                    boolean Q1 = is.k.Q1(qVar.Z, new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, loginSignupFlow});
                    androidx.lifecycle.w<LoginLoading> wVar = qVar.F;
                    if (Q1 && (loginUser = socialSignupResponse.getLoginUser()) != null) {
                        wVar.i(LoginLoading.HIDE_LOADING);
                        if (socialSignupModel.getType() == loginSignupFlow) {
                            navigationScreenName = NavigationScreenName.SIGNUP_TO_LOGIN;
                        } else {
                            navigationScreenName = NavigationScreenName.LOGIN_TO_SIGNUP;
                        }
                        qVar.m(navigationScreenName, loginUser);
                    }
                    Boolean showEmailDialog = socialSignupResponse.getShowEmailDialog();
                    if (showEmailDialog != null) {
                        boolean booleanValue = showEmailDialog.booleanValue();
                        wVar.i(LoginLoading.HIDE_LOADING);
                        androidx.lifecycle.w<Boolean> wVar2 = qVar.G;
                        if (!booleanValue) {
                            z10 = false;
                        }
                        wVar2.i(Boolean.valueOf(z10));
                    }
                }
            } catch (Exception e10) {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                LogHelper.INSTANCE.e(qVar.f17891y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f17891y = LogHelper.INSTANCE.makeLogTag("LoginSignupReworkViewModel");
        this.f17892z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new hn.b();
        this.E = sp.b.O(h.f17904u);
        this.F = new androidx.lifecycle.w<>();
        this.G = new androidx.lifecycle.w<>();
        this.H = new androidx.lifecycle.w<>();
        this.I = new androidx.lifecycle.w<>();
        this.J = new androidx.lifecycle.w<>();
        this.K = new androidx.lifecycle.w<>();
        this.L = new androidx.lifecycle.w<>();
        this.M = new androidx.lifecycle.w<>();
        this.N = 5;
        this.P = new androidx.lifecycle.w<>();
        this.S = sp.b.O(new d());
        this.T = sp.b.O(c.f17896u);
        this.U = new androidx.lifecycle.w<>();
        this.V = new androidx.lifecycle.w<>();
        this.W = new androidx.lifecycle.w<>();
        this.X = new androidx.lifecycle.w<>();
        this.Z = LoginSignupFlow.SIGN_UP_EMAIL;
        this.f17889a0 = new androidx.lifecycle.w<>();
        this.f17890b0 = "variant_a";
        this.c0 = new androidx.lifecycle.w<>();
        String experimentVariant = ApplicationPersistence.getInstance().getStringValue(Constants.LOGIN_SCREEN_EXPERIMENT);
        if (!kotlin.jvm.internal.i.b(experimentVariant, "variant_a") && !kotlin.jvm.internal.i.b(experimentVariant, "variant_b")) {
            experimentVariant = "default";
        } else {
            kotlin.jvm.internal.i.f(experimentVariant, "experimentVariant");
        }
        this.f17890b0 = experimentVariant;
        ta.v.H(kc.f.H(this), o0.f23642c, 0, new a(null), 2);
    }

    public static final Object e(q qVar, ls.d dVar) {
        qVar.getClass();
        return ta.v.S(o0.f23642c, new r(qVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(q qVar, ls.d dVar) {
        w wVar;
        int i6;
        String str;
        int i10;
        qVar.getClass();
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i11 = wVar.f17948x;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wVar.f17948x = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wVar.f17946v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = wVar.f17948x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        qVar = wVar.f17945u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    ApplicationPersistence.getInstance().setBooleanValueAsync(Constants.USER_SIGN_UP_SESSION, true);
                    MyApplication.a aVar2 = MyApplication.V;
                    o3.a aVar3 = (o3.a) aVar2.a().J.getValue();
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null) {
                        str = fVar.j0();
                    } else {
                        str = null;
                    }
                    aVar3.getClass();
                    ta.v.H(aVar3.f33768c, aVar3.f33769d, 0, new u3.d(aVar3, str, null), 2);
                    lg.f d10 = aVar2.a().d();
                    fd.f fVar2 = FirebaseAuth.getInstance().f;
                    kotlin.jvm.internal.i.d(fVar2);
                    String j02 = fVar2.j0();
                    lg.i iVar = d10.f24326g;
                    String b10 = iVar.b();
                    if (!d10.h()) {
                        if (b10 == null) {
                            b10 = iVar.b();
                        }
                        if (j02.equals(b10)) {
                            kotlin.jvm.internal.b0.u("MixpanelAPI.API", "Attempted to alias identical distinct_ids " + j02 + ". Alias message will not be sent.");
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(SessionManager.ALIAS, j02);
                                jSONObject.put("distinct_id", b10);
                                d10.n(jSONObject, "$create_alias");
                            } catch (JSONException e10) {
                                kotlin.jvm.internal.b0.n("MixpanelAPI.API", "Failed to alias", e10);
                            }
                            d10.c();
                        }
                    }
                    fd.f fVar3 = FirebaseAuth.getInstance().f;
                    kotlin.jvm.internal.i.d(fVar3);
                    d10.i(fVar3.j0());
                    fd.f fVar4 = FirebaseAuth.getInstance().f;
                    kotlin.jvm.internal.i.d(fVar4);
                    d10.f.c(fVar4.j0());
                    fd.f fVar5 = FirebaseAuth.getInstance().f;
                    kotlin.jvm.internal.i.d(fVar5);
                    Bugsnag.setUser(fVar5.j0(), "null", "null");
                    kotlinx.coroutines.flow.b bVar = qVar.C.f17792d;
                    wVar.f17945u = qVar;
                    wVar.f17948x = 1;
                    obj = ta.v.M(bVar, wVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                i10 = b.f17895a[((InitFirebaseResponses) obj).ordinal()];
                if (i10 == 1) {
                    if (i10 == 2) {
                        qVar.F.i(LoginLoading.HIDE_LOADING);
                        Utils.INSTANCE.clearPersistence();
                        qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.loginParseError));
                    }
                } else {
                    qVar.n();
                }
                return hs.k.f19476a;
            }
        }
        wVar = new w(qVar, dVar);
        Object obj2 = wVar.f17946v;
        ms.a aVar4 = ms.a.COROUTINE_SUSPENDED;
        i6 = wVar.f17948x;
        if (i6 == 0) {
        }
        i10 = b.f17895a[((InitFirebaseResponses) obj2).ordinal()];
        if (i10 == 1) {
        }
        return hs.k.f19476a;
    }

    public static final void g(q qVar, String str, String str2, LoginSignupFlow loginSignupFlow) {
        ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new y(qVar, str, loginSignupFlow, str2, null), 2);
    }

    public static final void h(q qVar, LoginModel loginModel) {
        qVar.getClass();
        if (loginModel.getUserName() != null && loginModel.getPassword() != null) {
            ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new b0(qVar, loginModel, null), 2);
        }
    }

    public static final void i(q qVar) {
        qVar.getClass();
        try {
            e0 e0Var = qVar.O;
            if (e0Var != null) {
                e0Var.cancel();
                qVar.O = null;
            }
            e0 e0Var2 = new e0(qVar);
            qVar.O = e0Var2;
            e0Var2.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(qVar.f17891y, e10);
        }
    }

    public final void j() {
        this.N = 3;
        this.W.i(new SingleUseEvent<>(3));
    }

    public final boolean k() {
        boolean isConnected = ConnectionStatusReceiver.isConnected();
        if (!isConnected) {
            this.H.i(this.f2382x.getApplicationContext().getString(R.string.signUpNetworkError));
        }
        return isConnected;
    }

    public final boolean l() {
        return is.k.Q1(this.Z, new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_EMAIL, LoginSignupFlow.SIGN_UP_FACEBOOK, LoginSignupFlow.SIGN_UP_PHONE, LoginSignupFlow.SIGN_UP_GOOGLE});
    }

    public final void m(NavigationScreenName navigationScreenName, Bundle bundle) {
        this.L.i(new SingleUseEvent<>(new hs.f(navigationScreenName, bundle)));
    }

    public final void n() {
        String str;
        boolean z10;
        fk.g gVar = new fk.g();
        fd.f fVar = FirebaseAuth.getInstance().f;
        String str2 = (fVar == null || (str2 = fVar.j0()) == null) ? "" : "";
        Application application = this.f2382x;
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
        UtilsKt.logError$default(gVar.f15128a, null, new fk.c(applicationContext, str2), 2, null);
        kotlinx.coroutines.d0 H = kc.f.H(this);
        kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
        ta.v.H(H, bVar, 0, new e(null), 2);
        boolean z11 = true;
        if (is.k.Q1(this.Z, new LoginSignupFlow[]{LoginSignupFlow.SIGN_IN_FACEBOOK, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
            ta.v.H(kc.f.H(this), bVar, 0, new f(null), 2);
        }
        if (!this.Y) {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getVersion();
            } else {
                str = null;
            }
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (l() && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
                    Uri parse = Uri.parse(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK));
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.NOTIFICATION_URL, parse.toString());
                    bundle.putString("code", parse.getPathSegments().get(1));
                    gk.a.b(bundle, "deeplink_signup");
                }
                gk.a.b(null, "signup_initialise_complete");
                if (new gk.e().a()) {
                    AppsFlyerLib.getInstance().logEvent(application.getApplicationContext(), "signup_initialise_complete", new HashMap());
                }
                this.Y = true;
            }
        }
        String stringValue = ApplicationPersistence.getInstance().getStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL);
        if (stringValue != null && !gv.n.B0(stringValue)) {
            z11 = false;
        }
        if (!z11) {
            JSONObject jSONObject = new JSONObject(ApplicationPersistence.getInstance().getStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL));
            Bundle bundle2 = new Bundle();
            String optString = jSONObject.optString("dynamic_url");
            if (optString == null) {
                optString = "";
            }
            bundle2.putString(Constants.NOTIFICATION_URL, optString);
            bundle2.putString("utm_source", jSONObject.optString("dynamic_utm_source"));
            bundle2.putString("utm_medium", jSONObject.optString("dynamic_utm_medium"));
            bundle2.putString("utm_campaign", jSONObject.optString("dynamic_utm_campaign"));
            bundle2.putString("code", jSONObject.optString("dynamic_code"));
            if (l()) {
                gk.a.b(bundle2, "dynamic_link_app_signup");
            } else {
                gk.a.b(bundle2, "dynamic_link_app_login");
            }
            ApplicationPersistence.getInstance().setStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL, "");
        }
        ta.v.H(kc.f.H(this), null, 0, new t(this, null), 3);
    }

    public final void o(ReworkSignupEvents event) {
        boolean z10;
        ExpandedState expandedState;
        ReworkLoginState reworkLoginState;
        ExpandedState expandedState2;
        ReworkLoginState reworkLoginState2;
        ExpandedState expandedState3;
        ExpandedState expandedState4;
        ReworkLoginState reworkLoginState3;
        ExpandedState expandedState5;
        ReworkLoginState reworkLoginState4;
        ExpandedState expandedState6;
        ExpandedState expandedState7;
        ReworkLoginState reworkLoginState5;
        ExpandedState expandedState8;
        ExpandedState expandedState9;
        ReworkLoginState reworkLoginState6;
        ExpandedState expandedState10;
        ExpandedState expandedState11;
        ReworkLoginState reworkLoginState7;
        kotlin.jvm.internal.i.g(event, "event");
        if (this.N == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !is.k.Q1(event, new ReworkSignupEvents[]{ReworkSignupEvents.SwitchFlow.INSTANCE, ReworkSignupEvents.SSOCtaClick.INSTANCE})) {
            j();
        }
        String str = this.f17890b0;
        boolean b10 = kotlin.jvm.internal.i.b(str, "variant_a");
        androidx.lifecycle.w<ReworkLoginState> wVar = this.B;
        if (b10) {
            if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
                ReworkLoginState d10 = wVar.d();
                if (d10 != null) {
                    expandedState10 = d10.getExpandedState();
                } else {
                    expandedState10 = null;
                }
                if (expandedState10 == ExpandedState.ALL_COLLAPSED) {
                    ReworkLoginState d11 = wVar.d();
                    if (d11 != null) {
                        reworkLoginState7 = ReworkLoginState.copy$default(d11, ExpandedState.BOTTOM_EXPANDED, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState7 = null;
                    }
                    wVar.i(reworkLoginState7);
                    return;
                }
                ReworkLoginState d12 = wVar.d();
                if (d12 != null) {
                    expandedState11 = d12.getExpandedState();
                } else {
                    expandedState11 = null;
                }
                if (expandedState11 == ExpandedState.BOTTOM_EXPANDED) {
                    ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick = (ReworkSignupEvents.EmailMainCtaClick) event;
                    r(emailMainCtaClick.getEmail(), emailMainCtaClick.getPassword(), emailMainCtaClick.isGoogleOAuthLogin());
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle, "variant", "type", SessionManager.KEY_EMAIL);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "login_click");
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE)) {
                ReworkLoginState d13 = wVar.d();
                if (d13 != null) {
                    expandedState9 = d13.getExpandedState();
                } else {
                    expandedState9 = null;
                }
                ExpandedState expandedState12 = ExpandedState.BOTTOM_EXPANDED;
                if (expandedState9 != expandedState12) {
                    ReworkLoginState d14 = wVar.d();
                    if (d14 != null) {
                        reworkLoginState6 = ReworkLoginState.copy$default(d14, expandedState12, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState6 = null;
                    }
                    wVar.i(reworkLoginState6);
                }
            } else if (event instanceof ReworkSignupEvents.PhoneMainCtaClick) {
                ReworkLoginState d15 = wVar.d();
                if (d15 != null) {
                    expandedState8 = d15.getExpandedState();
                } else {
                    expandedState8 = null;
                }
                if (expandedState8 == ExpandedState.TOP_EXPANDED) {
                    String str3 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle2, "variant", "type", "phone");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "login_click");
                    t(((ReworkSignupEvents.PhoneMainCtaClick) event).getPhone(), null);
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE)) {
                ReworkLoginState d16 = wVar.d();
                if (d16 != null) {
                    expandedState7 = d16.getExpandedState();
                } else {
                    expandedState7 = null;
                }
                ExpandedState expandedState13 = ExpandedState.TOP_EXPANDED;
                if (expandedState7 != expandedState13) {
                    ReworkLoginState d17 = wVar.d();
                    if (d17 != null) {
                        reworkLoginState5 = ReworkLoginState.copy$default(d17, expandedState13, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState5 = null;
                    }
                    wVar.i(reworkLoginState5);
                }
            } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
                String str4 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle3, "variant", "type", "google");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, "login_click");
                q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
                String str5 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle4, "variant", "type", "facebook");
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle4, "login_click");
                q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
                m(NavigationScreenName.LOGIN_TO_SSO, null);
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
                String str6 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(bundle5, "login_route_to_signup");
                m(NavigationScreenName.LOGIN_TO_SIGNUP, null);
            } else if (event instanceof ReworkSignupEvents.ForgotPassword) {
                gk.a.b(null, "show_fp_click");
                NavigationScreenName navigationScreenName = NavigationScreenName.LOGIN_TO_FORGOT_PASSWORD;
                Bundle bundle6 = new Bundle();
                bundle6.putString(SessionManager.KEY_EMAIL, ((ReworkSignupEvents.ForgotPassword) event).getEmail());
                hs.k kVar6 = hs.k.f19476a;
                m(navigationScreenName, bundle6);
            } else if (event instanceof ReworkSignupEvents.ResendOTP) {
                String str7 = gk.a.f16573a;
                Bundle a10 = r1.b0.a("source", "auth_screen");
                hs.k kVar7 = hs.k.f19476a;
                gk.a.b(a10, "auth_verify_otp_resend");
                t(((ReworkSignupEvents.ResendOTP) event).getPhone(), null);
            } else if (event instanceof ReworkSignupEvents.VerifyOTP) {
                ReworkSignupEvents.VerifyOTP verifyOTP = (ReworkSignupEvents.VerifyOTP) event;
                t(verifyOTP.getPhone(), verifyOTP.getEnteredOTP());
            }
        } else if (kotlin.jvm.internal.i.b(str, "variant_b")) {
            if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
                ReworkLoginState d18 = wVar.d();
                if (d18 != null) {
                    expandedState6 = d18.getExpandedState();
                } else {
                    expandedState6 = null;
                }
                if (expandedState6 == ExpandedState.TOP_EXPANDED) {
                    ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick2 = (ReworkSignupEvents.EmailMainCtaClick) event;
                    r(emailMainCtaClick2.getEmail(), emailMainCtaClick2.getPassword(), emailMainCtaClick2.isGoogleOAuthLogin());
                    String str8 = gk.a.f16573a;
                    Bundle bundle7 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle7, "variant", "type", SessionManager.KEY_EMAIL);
                    hs.k kVar8 = hs.k.f19476a;
                    gk.a.b(bundle7, "login_click");
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE)) {
                ReworkLoginState d19 = wVar.d();
                if (d19 != null) {
                    expandedState5 = d19.getExpandedState();
                } else {
                    expandedState5 = null;
                }
                ExpandedState expandedState14 = ExpandedState.TOP_EXPANDED;
                if (expandedState5 != expandedState14) {
                    ReworkLoginState d20 = wVar.d();
                    if (d20 != null) {
                        reworkLoginState4 = ReworkLoginState.copy$default(d20, expandedState14, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState4 = null;
                    }
                    wVar.i(reworkLoginState4);
                }
            } else if (event instanceof ReworkSignupEvents.PhoneMainCtaClick) {
                ReworkLoginState d21 = wVar.d();
                if (d21 != null) {
                    expandedState3 = d21.getExpandedState();
                } else {
                    expandedState3 = null;
                }
                if (expandedState3 == ExpandedState.ALL_COLLAPSED) {
                    ReworkLoginState d22 = wVar.d();
                    if (d22 != null) {
                        reworkLoginState3 = ReworkLoginState.copy$default(d22, ExpandedState.BOTTOM_EXPANDED, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState3 = null;
                    }
                    wVar.i(reworkLoginState3);
                    return;
                }
                ReworkLoginState d23 = wVar.d();
                if (d23 != null) {
                    expandedState4 = d23.getExpandedState();
                } else {
                    expandedState4 = null;
                }
                if (expandedState4 == ExpandedState.BOTTOM_EXPANDED) {
                    String str9 = gk.a.f16573a;
                    Bundle bundle8 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle8, "variant", "type", "phone");
                    hs.k kVar9 = hs.k.f19476a;
                    gk.a.b(bundle8, "login_click");
                    t(((ReworkSignupEvents.PhoneMainCtaClick) event).getPhone(), null);
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE)) {
                ReworkLoginState d24 = wVar.d();
                if (d24 != null) {
                    expandedState2 = d24.getExpandedState();
                } else {
                    expandedState2 = null;
                }
                ExpandedState expandedState15 = ExpandedState.BOTTOM_EXPANDED;
                if (expandedState2 != expandedState15) {
                    ReworkLoginState d25 = wVar.d();
                    if (d25 != null) {
                        reworkLoginState2 = ReworkLoginState.copy$default(d25, expandedState15, null, null, null, false, null, null, false, 254, null);
                    } else {
                        reworkLoginState2 = null;
                    }
                    wVar.i(reworkLoginState2);
                }
            } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
                String str10 = gk.a.f16573a;
                Bundle bundle9 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle9, "variant", "type", "google");
                hs.k kVar10 = hs.k.f19476a;
                gk.a.b(bundle9, "login_click");
                q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
                String str11 = gk.a.f16573a;
                Bundle bundle10 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle10, "variant", "type", "facebook");
                hs.k kVar11 = hs.k.f19476a;
                gk.a.b(bundle10, "login_click");
                q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
                m(NavigationScreenName.LOGIN_TO_SSO, null);
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
                String str12 = gk.a.f16573a;
                Bundle bundle11 = new Bundle();
                bundle11.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                hs.k kVar12 = hs.k.f19476a;
                gk.a.b(bundle11, "login_route_to_signup");
                m(NavigationScreenName.LOGIN_TO_SIGNUP, null);
            } else if (event instanceof ReworkSignupEvents.ForgotPassword) {
                gk.a.b(null, "show_fp_click");
                NavigationScreenName navigationScreenName2 = NavigationScreenName.LOGIN_TO_FORGOT_PASSWORD;
                Bundle bundle12 = new Bundle();
                bundle12.putString(SessionManager.KEY_EMAIL, ((ReworkSignupEvents.ForgotPassword) event).getEmail());
                hs.k kVar13 = hs.k.f19476a;
                m(navigationScreenName2, bundle12);
            } else if (event instanceof ReworkSignupEvents.ResendOTP) {
                String str13 = gk.a.f16573a;
                Bundle a11 = r1.b0.a("source", "auth_screen");
                hs.k kVar14 = hs.k.f19476a;
                gk.a.b(a11, "auth_verify_otp_resend");
                t(((ReworkSignupEvents.ResendOTP) event).getPhone(), null);
            } else if (event instanceof ReworkSignupEvents.VerifyOTP) {
                ReworkSignupEvents.VerifyOTP verifyOTP2 = (ReworkSignupEvents.VerifyOTP) event;
                t(verifyOTP2.getPhone(), verifyOTP2.getEnteredOTP());
            }
        } else if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
            ReworkLoginState d26 = wVar.d();
            if (d26 != null) {
                expandedState = d26.getExpandedState();
            } else {
                expandedState = null;
            }
            ExpandedState expandedState16 = ExpandedState.BOTTOM_EXPANDED;
            if (expandedState != expandedState16) {
                ReworkLoginState d27 = wVar.d();
                if (d27 != null) {
                    reworkLoginState = ReworkLoginState.copy$default(d27, expandedState16, null, null, null, false, null, null, false, 254, null);
                } else {
                    reworkLoginState = null;
                }
                wVar.i(reworkLoginState);
                return;
            }
            String str14 = gk.a.f16573a;
            Bundle bundle13 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle13, "variant", "type", SessionManager.KEY_EMAIL);
            hs.k kVar15 = hs.k.f19476a;
            gk.a.b(bundle13, "login_click");
            ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick3 = (ReworkSignupEvents.EmailMainCtaClick) event;
            r(emailMainCtaClick3.getEmail(), emailMainCtaClick3.getPassword(), emailMainCtaClick3.isGoogleOAuthLogin());
        } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
            String str15 = gk.a.f16573a;
            Bundle bundle14 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle14, "variant", "type", "google");
            hs.k kVar16 = hs.k.f19476a;
            gk.a.b(bundle14, "login_click");
            q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
        } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
            String str16 = gk.a.f16573a;
            Bundle bundle15 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle15, "variant", "type", "facebook");
            hs.k kVar17 = hs.k.f19476a;
            gk.a.b(bundle15, "login_click");
            q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
        } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
            m(NavigationScreenName.LOGIN_TO_SSO, null);
        } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
            String str17 = gk.a.f16573a;
            Bundle bundle16 = new Bundle();
            bundle16.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
            hs.k kVar18 = hs.k.f19476a;
            gk.a.b(bundle16, "login_route_to_signup");
            m(NavigationScreenName.LOGIN_TO_SIGNUP, null);
        } else if (event instanceof ReworkSignupEvents.ForgotPassword) {
            gk.a.b(null, "show_fp_click");
            NavigationScreenName navigationScreenName3 = NavigationScreenName.LOGIN_TO_FORGOT_PASSWORD;
            Bundle bundle17 = new Bundle();
            bundle17.putString(SessionManager.KEY_EMAIL, ((ReworkSignupEvents.ForgotPassword) event).getEmail());
            hs.k kVar19 = hs.k.f19476a;
            m(navigationScreenName3, bundle17);
        }
    }

    public final void p(ReworkSignupEvents event) {
        boolean z10;
        ExpandedState expandedState;
        ReworkSignupState reworkSignupState;
        ExpandedState expandedState2;
        ReworkSignupState reworkSignupState2;
        ExpandedState expandedState3;
        ExpandedState expandedState4;
        ReworkSignupState reworkSignupState3;
        ExpandedState expandedState5;
        ReworkSignupState reworkSignupState4;
        ExpandedState expandedState6;
        ExpandedState expandedState7;
        ReworkSignupState reworkSignupState5;
        ExpandedState expandedState8;
        ExpandedState expandedState9;
        ReworkSignupState reworkSignupState6;
        ExpandedState expandedState10;
        ExpandedState expandedState11;
        ReworkSignupState reworkSignupState7;
        kotlin.jvm.internal.i.g(event, "event");
        if (this.N == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !is.k.Q1(event, new ReworkSignupEvents[]{ReworkSignupEvents.SwitchFlow.INSTANCE, ReworkSignupEvents.SSOCtaClick.INSTANCE})) {
            j();
        }
        String str = this.f17890b0;
        boolean b10 = kotlin.jvm.internal.i.b(str, "variant_a");
        androidx.lifecycle.w<ReworkSignupState> wVar = this.A;
        if (b10) {
            if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
                ReworkSignupState d10 = wVar.d();
                if (d10 != null) {
                    expandedState10 = d10.getExpandedState();
                } else {
                    expandedState10 = null;
                }
                if (expandedState10 == ExpandedState.ALL_COLLAPSED) {
                    ReworkSignupState d11 = wVar.d();
                    if (d11 != null) {
                        reworkSignupState7 = d11.copy((r28 & 1) != 0 ? d11.expandedState : ExpandedState.BOTTOM_EXPANDED, (r28 & 2) != 0 ? d11.phoneNameInputError : null, (r28 & 4) != 0 ? d11.emailNameInputError : null, (r28 & 8) != 0 ? d11.emailInputError : null, (r28 & 16) != 0 ? d11.passwordInputError : null, (r28 & 32) != 0 ? d11.phoneInputError : null, (r28 & 64) != 0 ? d11.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d11.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d11.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d11.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d11.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d11.signupTextOverride : null, (r28 & 4096) != 0 ? d11.isDisableLogin : false);
                    } else {
                        reworkSignupState7 = null;
                    }
                    wVar.i(reworkSignupState7);
                    return;
                }
                ReworkSignupState d12 = wVar.d();
                if (d12 != null) {
                    expandedState11 = d12.getExpandedState();
                } else {
                    expandedState11 = null;
                }
                if (expandedState11 == ExpandedState.BOTTOM_EXPANDED) {
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle, "variant", "type", SessionManager.KEY_EMAIL);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "signup_click");
                    ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick = (ReworkSignupEvents.EmailMainCtaClick) event;
                    s(emailMainCtaClick.getEmail(), emailMainCtaClick.getPassword(), emailMainCtaClick.getName());
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE)) {
                ReworkSignupState d13 = wVar.d();
                if (d13 != null) {
                    expandedState9 = d13.getExpandedState();
                } else {
                    expandedState9 = null;
                }
                ExpandedState expandedState12 = ExpandedState.BOTTOM_EXPANDED;
                if (expandedState9 != expandedState12) {
                    ReworkSignupState d14 = wVar.d();
                    if (d14 != null) {
                        reworkSignupState6 = d14.copy((r28 & 1) != 0 ? d14.expandedState : expandedState12, (r28 & 2) != 0 ? d14.phoneNameInputError : null, (r28 & 4) != 0 ? d14.emailNameInputError : null, (r28 & 8) != 0 ? d14.emailInputError : null, (r28 & 16) != 0 ? d14.passwordInputError : null, (r28 & 32) != 0 ? d14.phoneInputError : null, (r28 & 64) != 0 ? d14.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d14.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d14.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d14.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d14.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d14.signupTextOverride : null, (r28 & 4096) != 0 ? d14.isDisableLogin : false);
                    } else {
                        reworkSignupState6 = null;
                    }
                    wVar.i(reworkSignupState6);
                }
            } else if (event instanceof ReworkSignupEvents.PhoneMainCtaClick) {
                ReworkSignupState d15 = wVar.d();
                if (d15 != null) {
                    expandedState8 = d15.getExpandedState();
                } else {
                    expandedState8 = null;
                }
                if (expandedState8 == ExpandedState.TOP_EXPANDED) {
                    String str3 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle2, "variant", "type", "phone");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "signup_click");
                    ReworkSignupEvents.PhoneMainCtaClick phoneMainCtaClick = (ReworkSignupEvents.PhoneMainCtaClick) event;
                    u(phoneMainCtaClick.getPhone(), phoneMainCtaClick.getName(), null);
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE)) {
                ReworkSignupState d16 = wVar.d();
                if (d16 != null) {
                    expandedState7 = d16.getExpandedState();
                } else {
                    expandedState7 = null;
                }
                ExpandedState expandedState13 = ExpandedState.TOP_EXPANDED;
                if (expandedState7 != expandedState13) {
                    ReworkSignupState d17 = wVar.d();
                    if (d17 != null) {
                        reworkSignupState5 = d17.copy((r28 & 1) != 0 ? d17.expandedState : expandedState13, (r28 & 2) != 0 ? d17.phoneNameInputError : null, (r28 & 4) != 0 ? d17.emailNameInputError : null, (r28 & 8) != 0 ? d17.emailInputError : null, (r28 & 16) != 0 ? d17.passwordInputError : null, (r28 & 32) != 0 ? d17.phoneInputError : null, (r28 & 64) != 0 ? d17.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d17.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d17.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d17.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d17.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d17.signupTextOverride : null, (r28 & 4096) != 0 ? d17.isDisableLogin : false);
                    } else {
                        reworkSignupState5 = null;
                    }
                    wVar.i(reworkSignupState5);
                }
            } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
                String str4 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle3, "variant", "type", "google");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, "signup_click");
                q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
                String str5 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle4, "variant", "type", "facebook");
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle4, "signup_click");
                q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
                m(NavigationScreenName.SIGNUP_TO_SSO, null);
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
                String str6 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(bundle5, "signup_route_to_login");
                m(NavigationScreenName.SIGNUP_TO_LOGIN, null);
            } else if (!(event instanceof ReworkSignupEvents.ForgotPassword)) {
                if (event instanceof ReworkSignupEvents.ResendOTP) {
                    String str7 = gk.a.f16573a;
                    Bundle a10 = r1.b0.a("source", "auth_screen");
                    hs.k kVar6 = hs.k.f19476a;
                    gk.a.b(a10, "auth_verify_otp_resend");
                    ReworkSignupEvents.ResendOTP resendOTP = (ReworkSignupEvents.ResendOTP) event;
                    u(resendOTP.getPhone(), resendOTP.getName(), null);
                } else if (event instanceof ReworkSignupEvents.VerifyOTP) {
                    ReworkSignupEvents.VerifyOTP verifyOTP = (ReworkSignupEvents.VerifyOTP) event;
                    u(verifyOTP.getPhone(), verifyOTP.getName(), verifyOTP.getEnteredOTP());
                }
            }
        } else if (kotlin.jvm.internal.i.b(str, "variant_b")) {
            if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
                ReworkSignupState d18 = wVar.d();
                if (d18 != null) {
                    expandedState6 = d18.getExpandedState();
                } else {
                    expandedState6 = null;
                }
                if (expandedState6 == ExpandedState.TOP_EXPANDED) {
                    String str8 = gk.a.f16573a;
                    Bundle bundle6 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle6, "variant", "type", SessionManager.KEY_EMAIL);
                    hs.k kVar7 = hs.k.f19476a;
                    gk.a.b(bundle6, "signup_click");
                    ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick2 = (ReworkSignupEvents.EmailMainCtaClick) event;
                    s(emailMainCtaClick2.getEmail(), emailMainCtaClick2.getPassword(), emailMainCtaClick2.getName());
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE)) {
                ReworkSignupState d19 = wVar.d();
                if (d19 != null) {
                    expandedState5 = d19.getExpandedState();
                } else {
                    expandedState5 = null;
                }
                ExpandedState expandedState14 = ExpandedState.TOP_EXPANDED;
                if (expandedState5 != expandedState14) {
                    ReworkSignupState d20 = wVar.d();
                    if (d20 != null) {
                        reworkSignupState4 = d20.copy((r28 & 1) != 0 ? d20.expandedState : expandedState14, (r28 & 2) != 0 ? d20.phoneNameInputError : null, (r28 & 4) != 0 ? d20.emailNameInputError : null, (r28 & 8) != 0 ? d20.emailInputError : null, (r28 & 16) != 0 ? d20.passwordInputError : null, (r28 & 32) != 0 ? d20.phoneInputError : null, (r28 & 64) != 0 ? d20.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d20.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d20.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d20.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d20.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d20.signupTextOverride : null, (r28 & 4096) != 0 ? d20.isDisableLogin : false);
                    } else {
                        reworkSignupState4 = null;
                    }
                    wVar.i(reworkSignupState4);
                }
            } else if (event instanceof ReworkSignupEvents.PhoneMainCtaClick) {
                ReworkSignupState d21 = wVar.d();
                if (d21 != null) {
                    expandedState3 = d21.getExpandedState();
                } else {
                    expandedState3 = null;
                }
                if (expandedState3 == ExpandedState.ALL_COLLAPSED) {
                    ReworkSignupState d22 = wVar.d();
                    if (d22 != null) {
                        reworkSignupState3 = d22.copy((r28 & 1) != 0 ? d22.expandedState : ExpandedState.BOTTOM_EXPANDED, (r28 & 2) != 0 ? d22.phoneNameInputError : null, (r28 & 4) != 0 ? d22.emailNameInputError : null, (r28 & 8) != 0 ? d22.emailInputError : null, (r28 & 16) != 0 ? d22.passwordInputError : null, (r28 & 32) != 0 ? d22.phoneInputError : null, (r28 & 64) != 0 ? d22.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d22.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d22.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d22.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d22.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d22.signupTextOverride : null, (r28 & 4096) != 0 ? d22.isDisableLogin : false);
                    } else {
                        reworkSignupState3 = null;
                    }
                    wVar.i(reworkSignupState3);
                    return;
                }
                ReworkSignupState d23 = wVar.d();
                if (d23 != null) {
                    expandedState4 = d23.getExpandedState();
                } else {
                    expandedState4 = null;
                }
                if (expandedState4 == ExpandedState.BOTTOM_EXPANDED) {
                    String str9 = gk.a.f16573a;
                    Bundle bundle7 = new Bundle();
                    defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle7, "variant", "type", "phone");
                    hs.k kVar8 = hs.k.f19476a;
                    gk.a.b(bundle7, "signup_click");
                    ReworkSignupEvents.PhoneMainCtaClick phoneMainCtaClick2 = (ReworkSignupEvents.PhoneMainCtaClick) event;
                    u(phoneMainCtaClick2.getPhone(), phoneMainCtaClick2.getName(), null);
                }
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE)) {
                ReworkSignupState d24 = wVar.d();
                if (d24 != null) {
                    expandedState2 = d24.getExpandedState();
                } else {
                    expandedState2 = null;
                }
                ExpandedState expandedState15 = ExpandedState.BOTTOM_EXPANDED;
                if (expandedState2 != expandedState15) {
                    ReworkSignupState d25 = wVar.d();
                    if (d25 != null) {
                        reworkSignupState2 = d25.copy((r28 & 1) != 0 ? d25.expandedState : expandedState15, (r28 & 2) != 0 ? d25.phoneNameInputError : null, (r28 & 4) != 0 ? d25.emailNameInputError : null, (r28 & 8) != 0 ? d25.emailInputError : null, (r28 & 16) != 0 ? d25.passwordInputError : null, (r28 & 32) != 0 ? d25.phoneInputError : null, (r28 & 64) != 0 ? d25.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d25.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d25.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d25.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d25.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d25.signupTextOverride : null, (r28 & 4096) != 0 ? d25.isDisableLogin : false);
                    } else {
                        reworkSignupState2 = null;
                    }
                    wVar.i(reworkSignupState2);
                }
            } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
                String str10 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle8, "variant", "type", "google");
                hs.k kVar9 = hs.k.f19476a;
                gk.a.b(bundle8, "signup_click");
                q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
                String str11 = gk.a.f16573a;
                Bundle bundle9 = new Bundle();
                defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle9, "variant", "type", "facebook");
                hs.k kVar10 = hs.k.f19476a;
                gk.a.b(bundle9, "signup_click");
                q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
            } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
                m(NavigationScreenName.SIGNUP_TO_SSO, null);
            } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
                String str12 = gk.a.f16573a;
                Bundle bundle10 = new Bundle();
                bundle10.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                hs.k kVar11 = hs.k.f19476a;
                gk.a.b(bundle10, "signup_route_to_login");
                m(NavigationScreenName.SIGNUP_TO_LOGIN, null);
            } else if (!(event instanceof ReworkSignupEvents.ForgotPassword)) {
                if (event instanceof ReworkSignupEvents.ResendOTP) {
                    String str13 = gk.a.f16573a;
                    Bundle a11 = r1.b0.a("source", "auth_screen");
                    hs.k kVar12 = hs.k.f19476a;
                    gk.a.b(a11, "auth_verify_otp_resend");
                    ReworkSignupEvents.ResendOTP resendOTP2 = (ReworkSignupEvents.ResendOTP) event;
                    u(resendOTP2.getPhone(), resendOTP2.getName(), null);
                } else if (event instanceof ReworkSignupEvents.VerifyOTP) {
                    ReworkSignupEvents.VerifyOTP verifyOTP2 = (ReworkSignupEvents.VerifyOTP) event;
                    u(verifyOTP2.getPhone(), verifyOTP2.getName(), verifyOTP2.getEnteredOTP());
                }
            }
        } else if (event instanceof ReworkSignupEvents.EmailMainCtaClick) {
            ReworkSignupState d26 = wVar.d();
            if (d26 != null) {
                expandedState = d26.getExpandedState();
            } else {
                expandedState = null;
            }
            ExpandedState expandedState16 = ExpandedState.BOTTOM_EXPANDED;
            if (expandedState != expandedState16) {
                ReworkSignupState d27 = wVar.d();
                if (d27 != null) {
                    reworkSignupState = d27.copy((r28 & 1) != 0 ? d27.expandedState : expandedState16, (r28 & 2) != 0 ? d27.phoneNameInputError : null, (r28 & 4) != 0 ? d27.emailNameInputError : null, (r28 & 8) != 0 ? d27.emailInputError : null, (r28 & 16) != 0 ? d27.passwordInputError : null, (r28 & 32) != 0 ? d27.phoneInputError : null, (r28 & 64) != 0 ? d27.isEnforcePasswordRules : false, (r28 & 128) != 0 ? d27.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? d27.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? d27.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? d27.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? d27.signupTextOverride : null, (r28 & 4096) != 0 ? d27.isDisableLogin : false);
                } else {
                    reworkSignupState = null;
                }
                wVar.i(reworkSignupState);
                return;
            }
            String str14 = gk.a.f16573a;
            Bundle bundle11 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle11, "variant", "type", SessionManager.KEY_EMAIL);
            hs.k kVar13 = hs.k.f19476a;
            gk.a.b(bundle11, "signup_click");
            ReworkSignupEvents.EmailMainCtaClick emailMainCtaClick3 = (ReworkSignupEvents.EmailMainCtaClick) event;
            s(emailMainCtaClick3.getEmail(), emailMainCtaClick3.getPassword(), emailMainCtaClick3.getName());
        } else if (event instanceof ReworkSignupEvents.GoogleCtaClick) {
            String str15 = gk.a.f16573a;
            Bundle bundle12 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle12, "variant", "type", "google");
            hs.k kVar14 = hs.k.f19476a;
            gk.a.b(bundle12, "signup_click");
            q(((ReworkSignupEvents.GoogleCtaClick) event).getLoginSignupFlow());
        } else if (event instanceof ReworkSignupEvents.FacebookCtaClick) {
            String str16 = gk.a.f16573a;
            Bundle bundle13 = new Bundle();
            defpackage.d.o(Constants.ONBOARDING_EXPERIMENT, bundle13, "variant", "type", "facebook");
            hs.k kVar15 = hs.k.f19476a;
            gk.a.b(bundle13, "signup_click");
            q(((ReworkSignupEvents.FacebookCtaClick) event).getLoginSignupFlow());
        } else if (event instanceof ReworkSignupEvents.SSOCtaClick) {
            m(NavigationScreenName.SIGNUP_TO_SSO, null);
        } else if (kotlin.jvm.internal.i.b(event, ReworkSignupEvents.SwitchFlow.INSTANCE)) {
            String str17 = gk.a.f16573a;
            Bundle bundle14 = new Bundle();
            bundle14.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
            hs.k kVar16 = hs.k.f19476a;
            gk.a.b(bundle14, "signup_route_to_login");
            m(NavigationScreenName.SIGNUP_TO_LOGIN, null);
        }
    }

    public final void q(LoginSignupFlow loginSignupFlow) {
        if (!k()) {
            return;
        }
        this.F.l(LoginLoading.SHOW_LOADING);
        ta.v.H(kc.f.H(this), null, 0, new g(loginSignupFlow, null), 3);
    }

    public final void r(String str, String str2, boolean z10) {
        boolean z11;
        androidx.lifecycle.w<ReworkLoginState> wVar = this.B;
        ReworkLoginState d10 = wVar.d();
        if (d10 == null) {
            d10 = new ReworkLoginState(null, null, null, null, false, null, null, false, 255, null);
        }
        ReworkLoginState copy$default = ReworkLoginState.copy$default(d10, null, null, null, null, false, null, null, false, 243, null);
        hs.f<Boolean, String> w10 = w(str);
        Boolean bool = w10.f19464u;
        if (!bool.booleanValue()) {
            copy$default = ReworkLoginState.copy$default(copy$default, null, null, w10.f19465v, null, false, null, null, false, 251, null);
        }
        ReworkLoginState reworkLoginState = copy$default;
        hs.f<Boolean, String> y10 = y(str2);
        Boolean bool2 = y10.f19464u;
        if (!bool2.booleanValue()) {
            reworkLoginState = ReworkLoginState.copy$default(reworkLoginState, null, null, null, y10.f19465v, false, null, null, false, 247, null);
        }
        if (bool.booleanValue() && bool2.booleanValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean valueOf = Boolean.valueOf(z11);
        kotlin.jvm.internal.i.d(reworkLoginState);
        wVar.i(reworkLoginState);
        if (!valueOf.booleanValue() || !k()) {
            return;
        }
        ta.v.H(kc.f.H(this), null, 0, new i(str, str2, z10, null), 3);
    }

    public final void s(String str, String str2, String str3) {
        ReworkSignupState reworkSignupState;
        ReworkSignupState copy;
        boolean z10;
        String str4;
        boolean z11;
        String str5;
        androidx.lifecycle.w<ReworkSignupState> wVar = this.A;
        ReworkSignupState d10 = wVar.d();
        if (d10 == null) {
            reworkSignupState = new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null);
        } else {
            reworkSignupState = d10;
        }
        copy = reworkSignupState.copy((r28 & 1) != 0 ? reworkSignupState.expandedState : null, (r28 & 2) != 0 ? reworkSignupState.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState.isDisableLogin : false);
        hs.f<Boolean, String> w10 = w(str);
        Boolean bool = w10.f19464u;
        if (!bool.booleanValue()) {
            copy = copy.copy((r28 & 1) != 0 ? copy.expandedState : null, (r28 & 2) != 0 ? copy.phoneNameInputError : null, (r28 & 4) != 0 ? copy.emailNameInputError : null, (r28 & 8) != 0 ? copy.emailInputError : w10.f19465v, (r28 & 16) != 0 ? copy.passwordInputError : null, (r28 & 32) != 0 ? copy.phoneInputError : null, (r28 & 64) != 0 ? copy.isEnforcePasswordRules : false, (r28 & 128) != 0 ? copy.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? copy.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? copy.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.signupTextOverride : null, (r28 & 4096) != 0 ? copy.isDisableLogin : false);
        }
        ReworkSignupState reworkSignupState2 = copy;
        hs.f<Boolean, String> x10 = x(str3);
        Boolean bool2 = x10.f19464u;
        if (!bool2.booleanValue()) {
            reworkSignupState2 = reworkSignupState2.copy((r28 & 1) != 0 ? reworkSignupState2.expandedState : null, (r28 & 2) != 0 ? reworkSignupState2.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState2.emailNameInputError : x10.f19465v, (r28 & 8) != 0 ? reworkSignupState2.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState2.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState2.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState2.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState2.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState2.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState2.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState2.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState2.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState2.isDisableLogin : false);
        }
        ReworkSignupState reworkSignupState3 = reworkSignupState2;
        hs.f<Boolean, String> y10 = y(str2);
        Boolean bool3 = y10.f19464u;
        if (!bool3.booleanValue()) {
            reworkSignupState3 = reworkSignupState3.copy((r28 & 1) != 0 ? reworkSignupState3.expandedState : null, (r28 & 2) != 0 ? reworkSignupState3.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState3.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState3.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState3.passwordInputError : y10.f19465v, (r28 & 32) != 0 ? reworkSignupState3.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState3.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState3.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState3.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState3.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState3.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState3.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState3.isDisableLogin : false);
        }
        ReworkSignupState reworkSignupState4 = reworkSignupState3;
        boolean z12 = true;
        if (d10 != null && d10.isEnforcePasswordRules()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean isPasswordCharacterRequirementFulfilled = d10.isPasswordCharacterRequirementFulfilled();
            Application application = this.f2382x;
            if (!isPasswordCharacterRequirementFulfilled) {
                str5 = application.getApplicationContext().getString(R.string.b2bPasswordCharRuleError);
                z11 = false;
            } else {
                str5 = null;
                z11 = true;
            }
            if (!d10.isPasswordCaseRequirementFulfilled()) {
                str4 = application.getApplicationContext().getString(R.string.b2bPasswordCaseRuleError);
                z11 = false;
            } else {
                str4 = str5;
            }
        } else {
            str4 = null;
            z11 = true;
        }
        Boolean valueOf = Boolean.valueOf(z11);
        if (!valueOf.booleanValue()) {
            reworkSignupState4 = reworkSignupState4.copy((r28 & 1) != 0 ? reworkSignupState4.expandedState : null, (r28 & 2) != 0 ? reworkSignupState4.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState4.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState4.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState4.passwordInputError : str4, (r28 & 32) != 0 ? reworkSignupState4.phoneInputError : null, (r28 & 64) != 0 ? reworkSignupState4.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState4.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState4.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState4.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState4.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState4.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState4.isDisableLogin : false);
        }
        Boolean valueOf2 = Boolean.valueOf((bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue() && valueOf.booleanValue()) ? false : false);
        kotlin.jvm.internal.i.d(reworkSignupState4);
        wVar.i(reworkSignupState4);
        if (!valueOf2.booleanValue() || !k()) {
            return;
        }
        this.F.i(LoginLoading.SHOW_LOADING);
        ta.v.H(kc.f.H(this), null, 0, new j(str, str2, str3, null), 3);
    }

    public final void t(String str, String str2) {
        androidx.lifecycle.w<ReworkLoginState> wVar = this.B;
        ReworkLoginState d10 = wVar.d();
        if (d10 == null) {
            d10 = new ReworkLoginState(null, null, null, null, false, null, null, false, 255, null);
        }
        ReworkLoginState copy$default = ReworkLoginState.copy$default(d10, null, null, null, null, false, null, null, false, 253, null);
        hs.f<Boolean, String> z10 = z(str);
        Boolean bool = z10.f19464u;
        if (!bool.booleanValue()) {
            copy$default = ReworkLoginState.copy$default(copy$default, null, z10.f19465v, null, null, false, null, null, false, 253, null);
        }
        kotlin.jvm.internal.i.d(copy$default);
        wVar.i(copy$default);
        if (!bool.booleanValue() || !k()) {
            return;
        }
        ta.v.H(kc.f.H(this), null, 0, new k(str2, str, null), 3);
    }

    public final void u(String str, String str2, String str3) {
        ReworkSignupState copy;
        boolean z10;
        androidx.lifecycle.w<ReworkSignupState> wVar = this.A;
        ReworkSignupState d10 = wVar.d();
        if (d10 == null) {
            d10 = new ReworkSignupState(null, null, null, null, null, null, false, false, false, false, null, null, false, 8191, null);
        }
        copy = r23.copy((r28 & 1) != 0 ? r23.expandedState : null, (r28 & 2) != 0 ? r23.phoneNameInputError : null, (r28 & 4) != 0 ? r23.emailNameInputError : null, (r28 & 8) != 0 ? r23.emailInputError : null, (r28 & 16) != 0 ? r23.passwordInputError : null, (r28 & 32) != 0 ? r23.phoneInputError : null, (r28 & 64) != 0 ? r23.isEnforcePasswordRules : false, (r28 & 128) != 0 ? r23.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? r23.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? r23.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? r23.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? r23.signupTextOverride : null, (r28 & 4096) != 0 ? d10.isDisableLogin : false);
        hs.f<Boolean, String> x10 = x(str2);
        Boolean bool = x10.f19464u;
        if (!bool.booleanValue()) {
            copy = copy.copy((r28 & 1) != 0 ? copy.expandedState : null, (r28 & 2) != 0 ? copy.phoneNameInputError : x10.f19465v, (r28 & 4) != 0 ? copy.emailNameInputError : null, (r28 & 8) != 0 ? copy.emailInputError : null, (r28 & 16) != 0 ? copy.passwordInputError : null, (r28 & 32) != 0 ? copy.phoneInputError : null, (r28 & 64) != 0 ? copy.isEnforcePasswordRules : false, (r28 & 128) != 0 ? copy.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? copy.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? copy.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? copy.signupTextOverride : null, (r28 & 4096) != 0 ? copy.isDisableLogin : false);
        }
        ReworkSignupState reworkSignupState = copy;
        hs.f<Boolean, String> z11 = z(str);
        Boolean bool2 = z11.f19464u;
        if (!bool2.booleanValue()) {
            reworkSignupState = reworkSignupState.copy((r28 & 1) != 0 ? reworkSignupState.expandedState : null, (r28 & 2) != 0 ? reworkSignupState.phoneNameInputError : null, (r28 & 4) != 0 ? reworkSignupState.emailNameInputError : null, (r28 & 8) != 0 ? reworkSignupState.emailInputError : null, (r28 & 16) != 0 ? reworkSignupState.passwordInputError : null, (r28 & 32) != 0 ? reworkSignupState.phoneInputError : z11.f19465v, (r28 & 64) != 0 ? reworkSignupState.isEnforcePasswordRules : false, (r28 & 128) != 0 ? reworkSignupState.isPasswordCaseRequirementFulfilled : false, (r28 & 256) != 0 ? reworkSignupState.isPasswordCharacterRequirementFulfilled : false, (r28 & 512) != 0 ? reworkSignupState.isShowSocialOptions : false, (r28 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.brandingInfo : null, (r28 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? reworkSignupState.signupTextOverride : null, (r28 & 4096) != 0 ? reworkSignupState.isDisableLogin : false);
        }
        if (bool.booleanValue() && bool2.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        kotlin.jvm.internal.i.d(reworkSignupState);
        wVar.i(reworkSignupState);
        if (!valueOf.booleanValue() || !k()) {
            return;
        }
        ta.v.H(kc.f.H(this), null, 0, new l(str3, str2, str, null), 3);
    }

    public final void v(SocialSignupModel socialSignupModel) {
        this.Z = socialSignupModel.getType();
        this.D = socialSignupModel;
        ta.v.H(kc.f.H(this), null, 0, new m(socialSignupModel, null), 3);
    }

    public final hs.f<Boolean, String> w(String str) {
        boolean z10;
        String str2;
        boolean z11;
        boolean z12 = false;
        boolean z13 = true;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Application application = this.f2382x;
        if (z10) {
            str2 = application.getApplicationContext().getString(R.string.emptyEmailError);
            z11 = false;
        } else {
            str2 = null;
            z11 = true;
        }
        if (str != null && !gv.n.B0(str)) {
            z13 = false;
        }
        if (!z13 && !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            str2 = application.getApplicationContext().getString(R.string.invalidEmailError);
        } else {
            z12 = z11;
        }
        return new hs.f<>(Boolean.valueOf(z12), str2);
    }

    public final hs.f<Boolean, String> x(String input) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12 = false;
        boolean z13 = true;
        if (input != null && !gv.n.B0(input)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Application application = this.f2382x;
        if (z10) {
            str = application.getApplicationContext().getString(R.string.emptyNameError);
            z11 = false;
        } else {
            str = null;
            z11 = true;
        }
        if (input != null && !gv.n.B0(input)) {
            z13 = false;
        }
        if (!z13) {
            Pattern compile = Pattern.compile("^[^~!@#$%^&*()_+={}\\[\\]|\\\\:;“’<,>?๐฿]*$");
            kotlin.jvm.internal.i.f(compile, "compile(pattern)");
            kotlin.jvm.internal.i.g(input, "input");
            if (!compile.matcher(input).matches()) {
                str = application.getApplicationContext().getString(R.string.emptyNameError);
                return new hs.f<>(Boolean.valueOf(z12), str);
            }
        }
        z12 = z11;
        return new hs.f<>(Boolean.valueOf(z12), str);
    }

    public final hs.f<Boolean, String> y(String str) {
        boolean z10;
        String str2;
        boolean z11;
        boolean z12 = false;
        boolean z13 = true;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Application application = this.f2382x;
        if (z10) {
            str2 = application.getApplicationContext().getString(R.string.emptyPasswordError);
            z11 = false;
        } else {
            str2 = null;
            z11 = true;
        }
        if (str != null && !gv.n.B0(str)) {
            z13 = false;
        }
        if (!z13 && str.length() < 8) {
            str2 = application.getApplicationContext().getString(R.string.shortPasswordError);
        } else {
            z12 = z11;
        }
        return new hs.f<>(Boolean.valueOf(z12), str2);
    }

    public final hs.f<Boolean, String> z(String input) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12 = false;
        boolean z13 = true;
        if (input != null && !gv.n.B0(input)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Application application = this.f2382x;
        if (z10) {
            str = application.getApplicationContext().getString(R.string.emptyPhoneError);
            z11 = false;
        } else {
            str = null;
            z11 = true;
        }
        if (input != null && !gv.n.B0(input)) {
            z13 = false;
        }
        if (!z13) {
            Pattern compile = Pattern.compile("^\\d{10}$");
            kotlin.jvm.internal.i.f(compile, "compile(pattern)");
            kotlin.jvm.internal.i.g(input, "input");
            if (!compile.matcher(input).matches()) {
                str = application.getApplicationContext().getString(R.string.invalidPhoneError);
                return new hs.f<>(Boolean.valueOf(z12), str);
            }
        }
        z12 = z11;
        return new hs.f<>(Boolean.valueOf(z12), str);
    }
}
