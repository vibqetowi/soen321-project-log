package wo;

import android.app.Application;
import android.net.Uri;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileStatus;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileRepository$getAvatarAndThemes$2;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.io.File;
import java.util.HashMap;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
import wo.n;
/* compiled from: ExperimentEditProfileViewModel.kt */
/* loaded from: classes2.dex */
public final class v extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<ApiNetworkStatus> A;
    public final androidx.lifecycle.w<EditProfileStatus> B;
    public final androidx.lifecycle.w<ProfileAssetModel> C;
    public final n D;
    public final androidx.lifecycle.w<Boolean> E;
    public final androidx.lifecycle.w<Boolean> F;
    public androidx.lifecycle.w<String> G;
    public androidx.lifecycle.w<SingleUseEvent<Boolean>> H;
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> I;
    public androidx.lifecycle.w<SingleUseEvent<String>> J;
    public final androidx.lifecycle.w<SingleUseEvent<String>> K;

    /* renamed from: y  reason: collision with root package name */
    public final String f36994y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<EditProfileModel> f36995z;

    /* compiled from: ExperimentEditProfileViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileViewModel$1", f = "ExperimentEditProfileViewModel.kt", l = {R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36996u;

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
            Object obj2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36996u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                n nVar = v.this.D;
                this.f36996u = 1;
                nVar.getClass();
                Object S = ta.v.S(o0.f23642c, new ExperimentEditProfileRepository$getAvatarAndThemes$2(nVar, null), this);
                if (S != obj2) {
                    S = hs.k.f19476a;
                }
                if (S == obj2) {
                    return obj2;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentEditProfileViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileViewModel$saveProfile$1", f = "ExperimentEditProfileViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;
        public final /* synthetic */ String G;
        public final /* synthetic */ String H;

        /* renamed from: u  reason: collision with root package name */
        public kotlin.jvm.internal.x f36998u;

        /* renamed from: v  reason: collision with root package name */
        public kotlin.jvm.internal.x f36999v;

        /* renamed from: w  reason: collision with root package name */
        public int f37000w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Uri f37001x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v f37002y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f37003z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, v vVar, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f37001x = uri;
            this.f37002y = vVar;
            this.f37003z = z10;
            this.A = str;
            this.B = str2;
            this.C = str3;
            this.D = str4;
            this.E = str5;
            this.F = str6;
            this.G = str7;
            this.H = str8;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f37001x, this.f37002y, this.f37003z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x01e2, code lost:
            if (kotlin.jvm.internal.i.b(r10.f23469u, "") != false) goto L6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0218 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
        /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.x xVar;
            kotlin.jvm.internal.x xVar2;
            String str;
            boolean z10;
            boolean z11;
            String str2;
            EditProfileModel d10;
            String str3;
            Object S;
            String str4;
            String str5;
            String str6;
            String str7;
            T t3;
            EditProfileModel d11;
            Object obj2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f37000w;
            String str8 = this.D;
            boolean z12 = false;
            String str9 = null;
            v vVar = this.f37002y;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        d11 = vVar.f36995z.d();
                        if (d11 != null) {
                            str9 = d11.getEmail();
                        }
                        if (kotlin.jvm.internal.i.b(str8, str9)) {
                            vVar.F.i(Boolean.TRUE);
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = this.f36999v;
                kotlin.jvm.internal.x xVar3 = this.f36998u;
                sp.b.d0(obj);
                xVar2 = xVar3;
                t3 = obj;
            } else {
                sp.b.d0(obj);
                xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = "";
                Uri uri = this.f37001x;
                if (uri != null) {
                    n nVar = vVar.D;
                    this.f36998u = xVar;
                    this.f36999v = xVar;
                    this.f37000w = 1;
                    nVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    nVar.f36961c.i(ApiNetworkStatus.LOADING);
                    StorageReference child = FirebaseStorage.getInstance().getReference().child("users/" + FirebaseAuth.getInstance().a() + "/profile/profile.jpg");
                    kotlin.jvm.internal.i.f(child, "getInstance().reference.…id}/profile/profile.jpg\")");
                    child.putFile(uri).addOnFailureListener((ya.e) new r(nVar, hVar)).addOnSuccessListener((ya.f<? super UploadTask.TaskSnapshot>) new n.a(new t(child, nVar, hVar)));
                    Object b10 = hVar.b();
                    if (b10 == obj2) {
                        return obj2;
                    }
                    xVar2 = xVar;
                    t3 = b10;
                }
                kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
                xVar4.f23469u = "";
                User user = FirebasePersistence.getInstance().getUser();
                str = this.G;
                if (str == null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    user.setProfile_path(gv.n.F0(str, "https:", ""));
                    xVar4.f23469u = gv.n.F0(str, "https:", "");
                } else {
                    CharSequence charSequence = (CharSequence) xVar.f23469u;
                    if (charSequence != null && charSequence.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        user.setProfile_path(gv.n.F0((String) xVar.f23469u, "https:", ""));
                        xVar4.f23469u = gv.n.F0((String) xVar.f23469u, "https:", "");
                    }
                }
                str2 = this.H;
                if (!((str2 != null || str2.length() == 0) ? true : true)) {
                    HashMap<String, Object> appConfig = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig, "this.appConfig");
                    appConfig.put("profile_cover", str2);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                d10 = vVar.f36995z.d();
                if (d10 == null) {
                    str3 = d10.getFirstName();
                } else {
                    str3 = null;
                }
                if (kotlin.jvm.internal.i.b(this.B, str3)) {
                    androidx.lifecycle.w<EditProfileModel> wVar = vVar.f36995z;
                    EditProfileModel d12 = wVar.d();
                    if (d12 != null) {
                        str4 = d12.getLastName();
                    } else {
                        str4 = null;
                    }
                    if (kotlin.jvm.internal.i.b(this.C, str4)) {
                        EditProfileModel d13 = wVar.d();
                        if (d13 != null) {
                            str5 = d13.getEmail();
                        } else {
                            str5 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str8, str5)) {
                            EditProfileModel d14 = wVar.d();
                            if (d14 != null) {
                                str6 = d14.getEmail();
                            } else {
                                str6 = null;
                            }
                            if (kotlin.jvm.internal.i.b(this.E, str6)) {
                                EditProfileModel d15 = wVar.d();
                                if (d15 != null) {
                                    str7 = d15.getCountryCode();
                                } else {
                                    str7 = null;
                                }
                                if (kotlin.jvm.internal.i.b(this.F, str7)) {
                                }
                            }
                        }
                    }
                }
                String str10 = this.B;
                String str11 = this.C;
                String str12 = this.D;
                String str13 = this.E;
                String str14 = this.F;
                String str15 = (String) xVar4.f23469u;
                this.f36998u = null;
                this.f36999v = null;
                this.f37000w = 2;
                n nVar2 = vVar.D;
                nVar2.getClass();
                S = ta.v.S(o0.f23642c, new p(str13, str14, str10, str11, str12, str15, nVar2, null), this);
                if (S != obj2) {
                    S = hs.k.f19476a;
                }
                if (S == obj2) {
                    return obj2;
                }
                d11 = vVar.f36995z.d();
                if (d11 != null) {
                }
                if (kotlin.jvm.internal.i.b(str8, str9)) {
                }
                return hs.k.f19476a;
            }
            xVar.f23469u = t3;
            if (this.f37003z) {
                String str16 = this.A;
                kotlin.jvm.internal.i.d(str16);
                String str17 = vVar.f36994y;
                try {
                    if (new File(MyApplication.V.a().getFilesDir().toString() + '/' + str16).delete()) {
                        LogHelper.INSTANCE.i(str17, "file deleted");
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str17, "exception in deleting file", e10);
                }
            }
            xVar = xVar2;
            kotlin.jvm.internal.x xVar42 = new kotlin.jvm.internal.x();
            xVar42.f23469u = "";
            User user2 = FirebasePersistence.getInstance().getUser();
            str = this.G;
            if (str == null) {
            }
            z10 = true;
            if (z10) {
            }
            str2 = this.H;
            if (!((str2 != null || str2.length() == 0) ? true : true)) {
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            d10 = vVar.f36995z.d();
            if (d10 == null) {
            }
            if (kotlin.jvm.internal.i.b(this.B, str3)) {
            }
            String str102 = this.B;
            String str112 = this.C;
            String str122 = this.D;
            String str132 = this.E;
            String str142 = this.F;
            String str152 = (String) xVar42.f23469u;
            this.f36998u = null;
            this.f36999v = null;
            this.f37000w = 2;
            n nVar22 = vVar.D;
            nVar22.getClass();
            S = ta.v.S(o0.f23642c, new p(str132, str142, str102, str112, str122, str152, nVar22, null), this);
            if (S != obj2) {
            }
            if (S == obj2) {
            }
            d11 = vVar.f36995z.d();
            if (d11 != null) {
            }
            if (kotlin.jvm.internal.i.b(str8, str9)) {
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f36994y = LogHelper.INSTANCE.makeLogTag("EditProfileViewModel2");
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        n nVar = new n(application);
        this.D = nVar;
        androidx.lifecycle.w<Boolean> wVar = new androidx.lifecycle.w<>();
        this.E = wVar;
        this.F = new androidx.lifecycle.w<>();
        this.G = new androidx.lifecycle.w<>();
        this.H = new androidx.lifecycle.w<>();
        this.I = new androidx.lifecycle.w<>();
        this.J = new androidx.lifecycle.w<>();
        this.K = new androidx.lifecycle.w<>();
        this.f36995z = nVar.f36960b;
        this.A = nVar.f36961c;
        this.B = nVar.f36962d;
        this.C = nVar.f36963e;
        ta.v.H(kc.f.H(this), null, 0, new a(null), 3);
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_COMPONENT_VISIBILITY);
        if (stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "")) {
            try {
                JSONObject jSONObject = new JSONObject(stringValue);
                if (jSONObject.has("showaddmember") && jSONObject.getBoolean("showaddmember")) {
                    wVar.l(Boolean.TRUE);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
    }

    public final void e(String str, String str2, String email, String str3, String countryCode, String str4, Uri uri, boolean z10, String str5, String str6) {
        kotlin.jvm.internal.i.g(email, "email");
        kotlin.jvm.internal.i.g(countryCode, "countryCode");
        ta.v.H(kc.f.H(this), null, 0, new b(uri, this, z10, str4, str, str2, email, str3, countryCode, str5, str6, null), 3);
    }

    public final void f() {
        n nVar = this.D;
        this.G = nVar.f36965h;
        this.H = nVar.f36966i;
        this.J = nVar.f36968k;
        try {
            q qVar = nVar.f36967j;
            if (qVar != null) {
                qVar.cancel();
                nVar.f36967j = null;
            }
            q qVar2 = new q(nVar);
            nVar.f36967j = qVar2;
            qVar2.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(nVar.f36959a, e10);
        }
    }
}
