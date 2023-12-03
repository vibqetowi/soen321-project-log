package wo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileStatus;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import e4.l;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileRepository$saveProfile$2", f = "ExperimentEditProfileRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ n A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f36977u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f36978v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f36979w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f36980x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f36981y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f36982z;

    /* compiled from: ExperimentEditProfileRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CustomVolleyErrorListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ n f36983u;

        public a(n nVar) {
            this.f36983u = nVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            kotlin.jvm.internal.i.g(error, "error");
            n nVar = this.f36983u;
            nVar.f36961c.i(ApiNetworkStatus.ERROR);
            nVar.f36962d.i(EditProfileStatus.ERROR);
            super.onErrorResponse(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, String str3, String str4, String str5, String str6, n nVar, ls.d<? super p> dVar) {
        super(2, dVar);
        this.f36977u = str;
        this.f36978v = str2;
        this.f36979w = str3;
        this.f36980x = str4;
        this.f36981y = str5;
        this.f36982z = str6;
        this.A = nVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f36977u, this.f36978v, this.f36979w, this.f36980x, this.f36981y, this.f36982z, this.A, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f36982z;
        final String str2 = this.f36981y;
        String str3 = this.f36978v;
        String str4 = this.f36977u;
        final String str5 = this.f36980x;
        final String str6 = this.f36979w;
        final n nVar = this.A;
        sp.b.d0(obj);
        try {
            SessionManager.getInstance().setStringValue(SessionManager.KEY_MOBILE, str4);
            SessionManager.getInstance().setStringValue(SessionManager.KEY_COUNTRY_CODE, str3);
            SessionManager.getInstance().setStringValue(SessionManager.KEY_FIRSTNAME, str6);
            SessionManager.getInstance().setStringValue(SessionManager.KEY_LASTNAME, str5);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SessionManager.KEY_MOBILE, str4);
                jSONObject.put(SessionManager.KEY_COUNTRY_CODE, str3);
                jSONObject.put(SessionManager.KEY_EMAIL, str2);
                jSONObject.put("firstname", str6);
                jSONObject.put("lastname", str5);
                if (!kotlin.jvm.internal.i.b(str, "")) {
                    jSONObject.put("image", str);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
            StringBuilder sb2 = new StringBuilder("https://api.theinnerhour.com/v1/");
            EditProfileModel d10 = nVar.f36960b.d();
            kotlin.jvm.internal.i.d(d10);
            sb2.append(d10.getUserType());
            sb2.append("/profileinfo");
            CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(2, sb2.toString(), jSONObject, new l.b() { // from class: wo.o
                @Override // e4.l.b
                public final void a(Object obj2) {
                    n nVar2 = n.this;
                    String str7 = str2;
                    String str8 = str6;
                    String str9 = str5;
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        nVar2.f36961c.i(ApiNetworkStatus.SUCCESS);
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            user.setFirstName(str8);
                            user.setLastName(str9);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                        boolean b10 = kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_UID), str7);
                        androidx.lifecycle.w<EditProfileStatus> wVar = nVar2.f36962d;
                        if (b10) {
                            wVar.i(EditProfileStatus.UPDATED);
                            return;
                        }
                        FirebasePersistence.getInstance().getUser().setUserName(str7);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        SessionManager.getInstance().clearData();
                        FirebasePersistence.getInstance().logout();
                        wVar.i(EditProfileStatus.EMAIL_CHANGED);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(nVar2.f36959a, "exception", e11);
                        nVar2.f36961c.i(ApiNetworkStatus.EXCEPTION);
                    }
                }
            }, new a(nVar));
            nVar.f36961c.i(ApiNetworkStatus.LOADING);
            VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(nVar.f36959a, "Exception", e11);
        }
        return hs.k.f19476a;
    }
}
