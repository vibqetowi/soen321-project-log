package hn;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.login.model.InitFirebaseResponses;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.SocialSignupModel;
import com.theinnerhour.b2b.components.login.model.SocialSignupResponse;
import com.theinnerhour.b2b.model.LoginInterface;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.CustomVolleyStringRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f17789a = LogHelper.INSTANCE.makeLogTag("LoginSignupReworkRepository");

    /* renamed from: b  reason: collision with root package name */
    public final kotlinx.coroutines.flow.b f17790b = ta.v.k(new C0285b(null));

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.flow.b f17791c = ta.v.k(new a(null));

    /* renamed from: d  reason: collision with root package name */
    public final kotlinx.coroutines.flow.b f17792d = ta.v.k(new c(null));

    /* compiled from: LoginSignupReworkRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository$attemptFirebaseConnectivity$1", f = "LoginSignupReworkRepository.kt", l = {R.styleable.AppCompatTheme_switchStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<iv.q<? super Boolean>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17793u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f17794v;

        /* compiled from: LoginSignupReworkRepository.kt */
        /* renamed from: hn.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0284a implements ValueEventListener {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ iv.q<Boolean> f17795u;

            /* JADX WARN: Multi-variable type inference failed */
            public C0284a(iv.q<? super Boolean> qVar) {
                this.f17795u = qVar;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError p02) {
                kotlin.jvm.internal.i.g(p02, "p0");
                Boolean bool = Boolean.FALSE;
                iv.q<Boolean> qVar = this.f17795u;
                qVar.q(bool);
                qVar.J().f(null);
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                Boolean bool = (Boolean) snapshot.getValue(Boolean.TYPE);
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Boolean valueOf = Boolean.valueOf(bool.booleanValue());
                iv.q<Boolean> qVar = this.f17795u;
                qVar.q(valueOf);
                qVar.J().f(null);
            }
        }

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f17794v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(iv.q<? super Boolean> qVar, ls.d<? super hs.k> dVar) {
            return ((a) create(qVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17793u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                iv.q qVar = (iv.q) this.f17794v;
                FirebaseDatabase.getInstance().getReference("connectionCheck").addValueEventListener(new C0284a(qVar));
                this.f17793u = 1;
                if (iv.n.a(qVar, iv.o.f20761u, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository$checkFirebaseConnectivity$1", f = "LoginSignupReworkRepository.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingRight}, m = "invokeSuspend")
    /* renamed from: hn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0285b extends ns.i implements ss.p<iv.q<? super Boolean>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17796u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f17797v;

        /* compiled from: LoginSignupReworkRepository.kt */
        /* renamed from: hn.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ iv.q<Boolean> f17798u;

            /* JADX WARN: Multi-variable type inference failed */
            public a(iv.q<? super Boolean> qVar) {
                this.f17798u = qVar;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError p02) {
                kotlin.jvm.internal.i.g(p02, "p0");
                Boolean bool = Boolean.FALSE;
                iv.q<Boolean> qVar = this.f17798u;
                qVar.q(bool);
                qVar.J().f(null);
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                Boolean bool = (Boolean) snapshot.getValue(Boolean.TYPE);
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Boolean valueOf = Boolean.valueOf(bool.booleanValue());
                iv.q<Boolean> qVar = this.f17798u;
                qVar.q(valueOf);
                qVar.J().f(null);
            }
        }

        public C0285b(ls.d<? super C0285b> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            C0285b c0285b = new C0285b(dVar);
            c0285b.f17797v = obj;
            return c0285b;
        }

        @Override // ss.p
        public final Object invoke(iv.q<? super Boolean> qVar, ls.d<? super hs.k> dVar) {
            return ((C0285b) create(qVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17796u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                iv.q qVar = (iv.q) this.f17797v;
                FirebaseDatabase.getInstance().getReference(".info/connected").addListenerForSingleValueEvent(new a(qVar));
                this.f17796u = 1;
                if (iv.n.a(qVar, iv.o.f20761u, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository$initFirebase$1", f = "LoginSignupReworkRepository.kt", l = {529}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<iv.q<? super InitFirebaseResponses>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17799u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f17800v;

        /* compiled from: LoginSignupReworkRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements LoginInterface {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ iv.q<InitFirebaseResponses> f17801a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(iv.q<? super InitFirebaseResponses> qVar) {
                this.f17801a = qVar;
            }

            @Override // com.theinnerhour.b2b.model.LoginInterface
            public final void apiError(VolleyError volleyError) {
                LoginInterface.DefaultImpls.apiError(this, volleyError);
            }

            @Override // com.theinnerhour.b2b.model.LoginInterface
            public final void apiFailure() {
                LoginInterface.DefaultImpls.apiFailure(this);
            }

            @Override // com.theinnerhour.b2b.model.LoginInterface
            public final void firebaseFailure() {
                InitFirebaseResponses initFirebaseResponses = InitFirebaseResponses.ERROR;
                iv.q<InitFirebaseResponses> qVar = this.f17801a;
                qVar.q(initFirebaseResponses);
                qVar.J().f(null);
            }

            @Override // com.theinnerhour.b2b.model.LoginInterface
            public final void firebaseSuccess() {
                InitFirebaseResponses initFirebaseResponses = InitFirebaseResponses.INITIALISE_COMPLETE;
                iv.q<InitFirebaseResponses> qVar = this.f17801a;
                qVar.q(initFirebaseResponses);
                qVar.J().f(null);
            }

            @Override // com.theinnerhour.b2b.model.LoginInterface
            public final void notPermitted() {
                LoginInterface.DefaultImpls.notPermitted(this);
            }
        }

        public c(ls.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f17800v = obj;
            return cVar;
        }

        @Override // ss.p
        public final Object invoke(iv.q<? super InitFirebaseResponses> qVar, ls.d<? super hs.k> dVar) {
            return ((c) create(qVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17799u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                iv.q qVar = (iv.q) this.f17800v;
                FirebasePersistence.getInstance().initFirebase(new a(qVar));
                this.f17799u = 1;
                if (iv.n.a(qVar, iv.o.f20761u, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository", f = "LoginSignupReworkRepository.kt", l = {497}, m = "logInWithToken")
    /* loaded from: classes2.dex */
    public static final class d extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public b f17802u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f17803v;

        /* renamed from: x  reason: collision with root package name */
        public int f17805x;

        public d(ls.d<? super d> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f17803v = obj;
            this.f17805x |= LinearLayoutManager.INVALID_OFFSET;
            return b.this.b(null, this);
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e extends CustomVolleyStringRequest {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ SocialSignupModel f17806u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SocialSignupModel socialSignupModel, String str, f fVar, g gVar) {
            super(1, str, fVar, gVar);
            this.f17806u = socialSignupModel;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyStringRequest, e4.j
        public final Map<String, String> getHeaders() {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            return hashMap;
        }

        @Override // e4.j
        public final Map<String, String> getParams() {
            HashMap hashMap = new HashMap();
            LoginSignupFlow[] loginSignupFlowArr = {LoginSignupFlow.SIGN_UP_FACEBOOK, LoginSignupFlow.SIGN_IN_FACEBOOK};
            SocialSignupModel socialSignupModel = this.f17806u;
            String str = "";
            if (!is.k.Q1(socialSignupModel.getType(), loginSignupFlowArr)) {
                hashMap.put("token_type", "Bearer");
                if (socialSignupModel.getIdToken() != null) {
                    hashMap.put("id_token", socialSignupModel.getIdToken());
                }
                String userEnteredEmail = socialSignupModel.getUserEnteredEmail();
                if (userEnteredEmail == null) {
                    userEnteredEmail = "";
                }
                hashMap.put(SessionManager.KEY_EMAIL, userEnteredEmail);
                String serverAuthCode = socialSignupModel.getServerAuthCode();
                if (serverAuthCode != null) {
                    str = serverAuthCode;
                }
                hashMap.put("code", str);
                hashMap.put("flow_type", "otc");
                hashMap.put("resource_class", "Customer");
                hashMap.put("omniauth_window_type", "application");
                hashMap.put("namespace_name", "api");
            } else {
                if (socialSignupModel.getUserEnteredEmail() != null) {
                    hashMap.put(SessionManager.KEY_EMAIL, socialSignupModel.getUserEnteredEmail());
                }
                String serverAuthCode2 = socialSignupModel.getServerAuthCode();
                if (serverAuthCode2 != null) {
                    str = serverAuthCode2;
                }
                hashMap.put(SessionManager.KEY_ACCESS, str);
            }
            String id2 = TimeZone.getDefault().getID();
            kotlin.jvm.internal.i.f(id2, "getDefault().id");
            hashMap.put("timezone", id2);
            hashMap.put("origin", "app");
            return hashMap;
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    /* loaded from: classes2.dex */
    public static final class f<T> implements l.b {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b f17807u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ SocialSignupModel f17808v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<SocialSignupResponse> f17809w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Context f17810x;

        /* compiled from: LoginSignupReworkRepository.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17811a;

            static {
                int[] iArr = new int[LoginSignupFlow.values().length];
                try {
                    iArr[LoginSignupFlow.SIGN_UP_GOOGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoginSignupFlow.SIGN_UP_FACEBOOK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoginSignupFlow.SIGN_IN_GOOGLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LoginSignupFlow.SIGN_IN_FACEBOOK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17811a = iArr;
            }
        }

        public f(Context context, SocialSignupModel socialSignupModel, b bVar, kotlinx.coroutines.k kVar) {
            this.f17807u = bVar;
            this.f17808v = socialSignupModel;
            this.f17809w = kVar;
            this.f17810x = context;
        }

        @Override // e4.l.b
        public final void a(Object obj) {
            String string;
            String string2;
            String str = (String) obj;
            b bVar = this.f17807u;
            Context context = this.f17810x;
            SocialSignupModel socialSignupModel = this.f17808v;
            kotlinx.coroutines.j<SocialSignupResponse> jVar = this.f17809w;
            try {
                LogHelper.INSTANCE.i(bVar.f17789a, "sign up response", str.toString());
                JSONObject jSONObject = new JSONObject(str);
                String res = jSONObject.getString("status");
                Bundle bundle = new Bundle();
                bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                kotlin.jvm.internal.i.f(res, "res");
                if (gv.r.J0(res, "success")) {
                    ApplicationPersistence.getInstance().clearData();
                    JSONObject optJSONObject = jSONObject.optJSONObject("user");
                    if (optJSONObject != null) {
                        Utils.INSTANCE.parseLoginResponse(optJSONObject, true);
                    }
                    int i6 = a.f17811a[socialSignupModel.getType().ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 4) {
                                    gk.a.b(bundle, "facebook_login_success");
                                }
                            } else {
                                gk.a.b(bundle, "google_login_success");
                            }
                        } else {
                            gk.a.b(bundle, "facebook_signup_success");
                        }
                    } else {
                        gk.a.b(bundle, "google_signup_success");
                    }
                    if (jVar.a()) {
                        jVar.resumeWith(new SocialSignupResponse(true, jSONObject, null, null, null));
                        return;
                    }
                    return;
                }
                int i10 = a.f17811a[socialSignupModel.getType().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                gk.a.b(bundle, "facebook_login_failure");
                            }
                        } else {
                            gk.a.b(bundle, "google_login_failure");
                        }
                    } else {
                        gk.a.b(bundle, "facebook_signup_failure");
                    }
                } else {
                    gk.a.b(bundle, "google_signup_failure");
                }
                if (jVar.a()) {
                    if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                        string2 = context.getString(com.theinnerhour.b2b.R.string.sign_up_failed_message);
                    } else {
                        string2 = context.getString(com.theinnerhour.b2b.R.string.login_failed_message);
                    }
                    jVar.resumeWith(new SocialSignupResponse(false, null, string2, null, null));
                }
            } catch (JSONException e10) {
                Utils.INSTANCE.clearPersistence();
                LogHelper.INSTANCE.e(bVar.f17789a, e10);
                if (jVar.a()) {
                    if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                        string = context.getString(com.theinnerhour.b2b.R.string.sign_up_failed_message);
                    } else {
                        string = context.getString(com.theinnerhour.b2b.R.string.login_failed_message);
                    }
                    jVar.resumeWith(new SocialSignupResponse(false, null, string, null, null));
                }
            }
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    /* loaded from: classes2.dex */
    public static final class g implements l.a {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ SocialSignupModel f17812u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Context f17813v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<SocialSignupResponse> f17814w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b f17815x;

        public g(Context context, SocialSignupModel socialSignupModel, b bVar, kotlinx.coroutines.k kVar) {
            this.f17812u = socialSignupModel;
            this.f17813v = context;
            this.f17814w = kVar;
            this.f17815x = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: Exception -> 0x028b, TryCatch #0 {Exception -> 0x028b, blocks: (B:3:0x000b, B:6:0x0020, B:8:0x0026, B:10:0x0056, B:12:0x005e, B:15:0x0068, B:17:0x0070, B:19:0x0076, B:25:0x0082, B:28:0x0094, B:30:0x009a, B:31:0x00a5, B:33:0x00b7, B:37:0x00c9, B:44:0x00df, B:46:0x00e5, B:54:0x0125), top: B:147:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: Exception -> 0x028b, TryCatch #0 {Exception -> 0x028b, blocks: (B:3:0x000b, B:6:0x0020, B:8:0x0026, B:10:0x0056, B:12:0x005e, B:15:0x0068, B:17:0x0070, B:19:0x0076, B:25:0x0082, B:28:0x0094, B:30:0x009a, B:31:0x00a5, B:33:0x00b7, B:37:0x00c9, B:44:0x00df, B:46:0x00e5, B:54:0x0125), top: B:147:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: Exception -> 0x028b, TryCatch #0 {Exception -> 0x028b, blocks: (B:3:0x000b, B:6:0x0020, B:8:0x0026, B:10:0x0056, B:12:0x005e, B:15:0x0068, B:17:0x0070, B:19:0x0076, B:25:0x0082, B:28:0x0094, B:30:0x009a, B:31:0x00a5, B:33:0x00b7, B:37:0x00c9, B:44:0x00df, B:46:0x00e5, B:54:0x0125), top: B:147:0x000b }] */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v33 */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v6 */
        @Override // e4.l.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onErrorResponse(VolleyError volleyError) {
            int i6;
            char c10;
            int i10;
            String string;
            boolean z10;
            char c11;
            boolean z11;
            boolean z12;
            String str;
            String str2;
            Bundle bundle;
            boolean z13;
            boolean z14;
            String string2;
            String str3;
            String str4;
            boolean z15;
            kotlinx.coroutines.j<SocialSignupResponse> jVar = this.f17814w;
            SocialSignupModel socialSignupModel = this.f17812u;
            Context context = this.f17813v;
            try {
                Bundle bundle2 = new Bundle();
                e4.i iVar = volleyError.f5870u;
                i6 = "errors";
                try {
                    if (iVar != null && iVar.f13768a == 300) {
                        byte[] bArr = iVar.f13769b;
                        kotlin.jvm.internal.i.f(bArr, "error.networkResponse.data");
                        JSONObject jSONObject = new JSONObject(new String(bArr, gv.a.f16927b));
                        Object obj = jSONObject.get("errors");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type org.json.JSONArray");
                        JSONArray jSONArray = (JSONArray) obj;
                        LoginSignupFlow loginSignupFlow = LoginSignupFlow.SIGN_UP_GOOGLE;
                        LoginSignupFlow loginSignupFlow2 = LoginSignupFlow.SIGN_UP_FACEBOOK;
                        if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{loginSignupFlow, loginSignupFlow2})) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (optJSONObject != null) {
                                str4 = optJSONObject.optString("last_provider");
                            } else {
                                str4 = null;
                            }
                            if (str4 != null && kotlin.jvm.internal.i.b(str4, "system")) {
                                String userEnteredEmail = socialSignupModel.getUserEnteredEmail();
                                if (userEnteredEmail != null && userEnteredEmail.length() != 0) {
                                    z15 = false;
                                    if (!z15) {
                                        bundle2.putBoolean("exists", true);
                                        bundle2.putString(SessionManager.KEY_EMAIL, socialSignupModel.getUserEnteredEmail());
                                    }
                                    z14 = true;
                                    if (jSONArray.length() > 0) {
                                        Object obj2 = jSONArray.get(0);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                        str3 = (String) obj2;
                                    } else {
                                        if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{loginSignupFlow, loginSignupFlow2})) {
                                            string2 = context.getString(com.theinnerhour.b2b.R.string.sign_up_failed_message);
                                            kotlin.jvm.internal.i.f(string2, "context.getString(R.string.sign_up_failed_message)");
                                        } else {
                                            i6 = com.theinnerhour.b2b.R.string.login_failed_message;
                                            try {
                                                string2 = context.getString(com.theinnerhour.b2b.R.string.login_failed_message);
                                                kotlin.jvm.internal.i.f(string2, "context.getString(R.string.login_failed_message)");
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (jVar.a()) {
                                                    int i11 = i6;
                                                    if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                                                        i11 = com.theinnerhour.b2b.R.string.sign_up_failed_message;
                                                    }
                                                    jVar.resumeWith(new SocialSignupResponse(false, null, context.getString(i11), null, null));
                                                }
                                                LogHelper.INSTANCE.e(this.f17815x.f17789a, "exception in error response", e);
                                                return;
                                            }
                                        }
                                        str3 = string2;
                                    }
                                    z11 = z14;
                                    z10 = true;
                                    string = str3;
                                    i6 = 2132019259;
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                z14 = true;
                                if (jSONArray.length() > 0) {
                                }
                                z11 = z14;
                                z10 = true;
                                string = str3;
                                i6 = 2132019259;
                            }
                        }
                        z14 = false;
                        if (jSONArray.length() > 0) {
                        }
                        z11 = z14;
                        z10 = true;
                        string = str3;
                        i6 = 2132019259;
                    } else {
                        if (iVar != null && iVar.f13768a == 401) {
                            byte[] bArr2 = iVar.f13769b;
                            kotlin.jvm.internal.i.f(bArr2, "error.networkResponse.data");
                            String str5 = new String(bArr2, gv.a.f16927b);
                            try {
                                if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                                    try {
                                        if (gv.n.H0(str5, "{")) {
                                            Object obj3 = new JSONObject(str5).get("errors");
                                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type org.json.JSONArray");
                                            JSONArray jSONArray2 = (JSONArray) obj3;
                                            if (jSONArray2.length() > 0) {
                                                Object obj4 = jSONArray2.get(0);
                                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                                str5 = (String) obj4;
                                            } else {
                                                str5 = context.getString(com.theinnerhour.b2b.R.string.sign_up_failed_message);
                                                kotlin.jvm.internal.i.f(str5, "context.getString(R.string.sign_up_failed_message)");
                                                string = str5;
                                                c10 = 2107;
                                            }
                                        }
                                        string = str5;
                                        c10 = 2107;
                                    } catch (Exception e11) {
                                        e = e11;
                                        i6 = com.theinnerhour.b2b.R.string.login_failed_message;
                                        if (jVar.a()) {
                                        }
                                        LogHelper.INSTANCE.e(this.f17815x.f17789a, "exception in error response", e);
                                        return;
                                    }
                                } else {
                                    if (str5.length() == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12 && gv.n.H0(str5, "{")) {
                                        Object obj5 = new JSONObject(str5).get("errors");
                                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type org.json.JSONArray");
                                        JSONArray jSONArray3 = (JSONArray) obj5;
                                        if (jSONArray3.length() > 0) {
                                            Object obj6 = jSONArray3.get(0);
                                            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                                            str = (String) obj6;
                                        } else {
                                            String string3 = context.getString(com.theinnerhour.b2b.R.string.login_failed_message);
                                            kotlin.jvm.internal.i.f(string3, "context.getString(R.string.login_failed_message)");
                                            str = string3;
                                        }
                                        string = str;
                                        c11 = 2107;
                                        z10 = true;
                                        z11 = false;
                                        i6 = c11;
                                    } else {
                                        c10 = 2107;
                                        string = context.getString(com.theinnerhour.b2b.R.string.login_failed_message);
                                        kotlin.jvm.internal.i.f(string, "{\n                      …                        }");
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } else {
                            c10 = 2107;
                            c10 = 2107;
                            c10 = 2107;
                            c10 = 2107;
                            c10 = 2107;
                            c10 = 2107;
                            c10 = 2107;
                            if (volleyError instanceof NetworkError) {
                                string = "Cannot connect to internet!Please check your connection";
                            } else if (volleyError instanceof AuthFailureError) {
                                string = "Authentication Failure! Please try again after some time";
                            } else if (volleyError instanceof ParseError) {
                                string = "Parsing error! Please try again after some time";
                            } else if (volleyError instanceof NoConnectionError) {
                                string = "Could not connect! Please check your connection and try again.";
                            } else if (volleyError instanceof TimeoutError) {
                                string = "Connection TimeOut! Please check your internet connection.";
                            } else if (volleyError instanceof ServerError) {
                                string = "The server could not be found! Please try again after some time.";
                            } else {
                                LogHelper.INSTANCE.e("SignUpErrorSocial", String.valueOf(volleyError.getMessage()));
                                if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                                    i10 = com.theinnerhour.b2b.R.string.sign_up_failed_message;
                                } else {
                                    i10 = com.theinnerhour.b2b.R.string.login_failed_message;
                                }
                                string = context.getString(i10);
                                kotlin.jvm.internal.i.f(string, "{\n                      …                        }");
                            }
                        }
                        z10 = false;
                        c11 = c10;
                        z11 = false;
                        i6 = c11;
                    }
                    Bundle bundle3 = new Bundle();
                    e4.i iVar2 = volleyError.f5870u;
                    if (iVar2 != null) {
                        bundle3.putInt("error_code", iVar2.f13768a);
                    }
                    bundle3.putBoolean("email_exists", z10);
                    bundle3.putString("error_msg", string);
                    if (is.k.Q1(socialSignupModel.getType(), new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                        bundle3.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                        gk.a.b(bundle3, "signup_error");
                    } else {
                        gk.a.b(bundle3, "login_error");
                    }
                    if (jVar.a()) {
                        if ((iVar2 != null && iVar2.f13768a == 422) || z11) {
                            str2 = null;
                        } else {
                            str2 = string;
                        }
                        if (z11) {
                            bundle = bundle2;
                        } else {
                            bundle = null;
                        }
                        if (iVar2 != null && iVar2.f13768a == 422) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        jVar.resumeWith(new SocialSignupResponse(false, null, str2, bundle, Boolean.valueOf(z13)));
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Exception e14) {
                e = e14;
                i6 = com.theinnerhour.b2b.R.string.login_failed_message;
            }
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository", f = "LoginSignupReworkRepository.kt", l = {510}, m = "updateEmail")
    /* loaded from: classes2.dex */
    public static final class h extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public b f17816u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f17817v;

        /* renamed from: x  reason: collision with root package name */
        public int f17819x;

        public h(ls.d<? super h> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f17817v = obj;
            this.f17819x |= LinearLayoutManager.INVALID_OFFSET;
            return b.this.e(null, null, this);
        }
    }

    /* compiled from: LoginSignupReworkRepository.kt */
    /* loaded from: classes2.dex */
    public static final class i extends CustomVolleyErrorListener {
        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            kotlin.jvm.internal.i.g(error, "error");
            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), error);
            super.onErrorResponse(error);
        }
    }

    public static void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SessionManager.KEY_MOBILE, SessionManager.getInstance().getStringValue(SessionManager.KEY_MOBILE));
                jSONObject.put(SessionManager.KEY_COUNTRY_CODE, SessionManager.getInstance().getStringValue(SessionManager.KEY_COUNTRY_CODE));
                jSONObject.put(SessionManager.KEY_EMAIL, SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
                jSONObject.put("firstname", SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME));
                jSONObject.put("lastname", SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME));
                jSONObject.put("timezone", str);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(2, "https://api.theinnerhour.com/v1/" + SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE) + "/profileinfo", jSONObject, new hn.a(0), new i()));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), "Exception", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ls.d<? super fd.c> dVar) {
        d dVar2;
        int i6;
        Exception e10;
        b bVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f17805x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar2.f17805x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar2.f17803v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = dVar2.f17805x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        bVar = dVar2.f17802u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(bVar.f17789a, e10);
                            return null;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        ya.v e12 = FirebaseAuth.getInstance().e(str);
                        kotlin.jvm.internal.i.f(e12, "getInstance()\n          …nInWithCustomToken(token)");
                        dVar2.f17802u = this;
                        dVar2.f17805x = 1;
                        obj = tr.r.g(e12, dVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        bVar = this;
                    } catch (Exception e13) {
                        e10 = e13;
                        bVar = this;
                        LogHelper.INSTANCE.e(bVar.f17789a, e10);
                        return null;
                    }
                }
                return (fd.c) obj;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f17803v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = dVar2.f17805x;
        if (i6 == 0) {
        }
        return (fd.c) obj2;
    }

    public final Object c(String str, ls.d dVar, boolean z10) {
        dw.b<sf.m> d10;
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        if (z10) {
            d10 = ((or.d) nr.b.a(or.d.class)).a("https://api.theinnerhour.com/v1/get_otp", str, "91");
        } else {
            d10 = ((or.d) nr.b.a(or.d.class)).d("https://api.theinnerhour.com/v1/get_otp", str, "yes");
        }
        d10.I(new hn.i(kVar, this));
        return kVar.s();
    }

    public final Object d(SocialSignupModel socialSignupModel, Context context, ls.d<? super SocialSignupResponse> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        try {
            e eVar = new e(socialSignupModel, socialSignupModel.getUrl(), new f(context, socialSignupModel, this, kVar), new g(context, socialSignupModel, this, kVar));
            eVar.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 0));
            VolleySingleton.getInstance().add(eVar);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17789a, e10);
        }
        return kVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, fd.f fVar, ls.d<? super hs.k> dVar) {
        h hVar;
        int i6;
        Exception e10;
        b bVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f17819x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f17819x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f17817v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = hVar.f17819x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        bVar = hVar.f17816u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(bVar.f17789a, e10);
                            return hs.k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    if (str != null && fVar != null) {
                        try {
                            ya.v l02 = fVar.l0(str);
                            kotlin.jvm.internal.i.f(l02, "user.updateEmail(email)");
                            hVar.f17816u = this;
                            hVar.f17819x = 1;
                            if (tr.r.g(l02, hVar) == aVar) {
                                return aVar;
                            }
                        } catch (Exception e12) {
                            e10 = e12;
                            bVar = this;
                            LogHelper.INSTANCE.e(bVar.f17789a, e10);
                            return hs.k.f19476a;
                        }
                    } else {
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.f17817v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = hVar.f17819x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }
}
