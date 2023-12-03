package wo;

import android.app.Application;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileStatus;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f36959a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.w<EditProfileModel> f36960b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.w<ApiNetworkStatus> f36961c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.w<EditProfileStatus> f36962d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.w<ProfileAssetModel> f36963e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36964g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.w<String> f36965h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> f36966i;

    /* renamed from: j  reason: collision with root package name */
    public q f36967j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<String>> f36968k;

    /* compiled from: ExperimentEditProfileRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ya.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ss.l f36969a;

        public a(ss.l lVar) {
            this.f36969a = lVar;
        }

        @Override // ya.f
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f36969a.invoke(obj);
        }
    }

    public n(Application application) {
        boolean z10;
        kotlin.jvm.internal.i.g(application, "application");
        this.f36959a = LogHelper.INSTANCE.makeLogTag(n.class);
        androidx.lifecycle.w<EditProfileModel> wVar = new androidx.lifecycle.w<>();
        this.f36960b = wVar;
        androidx.lifecycle.w<ApiNetworkStatus> wVar2 = new androidx.lifecycle.w<>();
        this.f36961c = wVar2;
        this.f36962d = new androidx.lifecycle.w<>();
        this.f36963e = new androidx.lifecycle.w<>();
        this.f36965h = new androidx.lifecycle.w<>();
        this.f36966i = new androidx.lifecycle.w<>();
        this.f36968k = new androidx.lifecycle.w<>();
        wVar2.l(ApiNetworkStatus.SUCCESS);
        SessionManager sessionManager = SessionManager.getInstance();
        EditProfileModel editProfileModel = new EditProfileModel(null, null, null, null, null, null, 63, null);
        editProfileModel.setFirstName(sessionManager.getStringValue(SessionManager.KEY_FIRSTNAME));
        editProfileModel.setLastName(sessionManager.getStringValue(SessionManager.KEY_LASTNAME));
        editProfileModel.setEmail(sessionManager.getStringValue(SessionManager.KEY_UID));
        editProfileModel.setMobile(sessionManager.getStringValue(SessionManager.KEY_MOBILE));
        editProfileModel.setCountryCode(sessionManager.getStringValue(SessionManager.KEY_COUNTRY_CODE));
        String stringValue = sessionManager.getStringValue(SessionManager.KEY_USERTYPE);
        if (stringValue != null && stringValue.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        editProfileModel.setUserType(z10 ? "organisation" : stringValue);
        wVar.l(editProfileModel);
        try {
            try {
                new JSONObject().put("id", SessionManager.getInstance().getStringValue(SessionManager.KEY_UUID));
                StringBuilder sb2 = new StringBuilder("https://api.theinnerhour.com/v1/");
                EditProfileModel d10 = wVar.d();
                kotlin.jvm.internal.i.d(d10);
                sb2.append(d10.getUserType());
                sb2.append("/profileinfo");
                CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(0, sb2.toString(), null, new k(this, 0), new l(this));
                wVar2.l(ApiNetworkStatus.LOADING);
                VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EditProfileModel a(JSONObject jSONObject) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        boolean z10;
        EditProfileModel editProfileModel = new EditProfileModel(null, null, null, null, null, null, 63, null);
        try {
            String str = "";
            if (kotlin.jvm.internal.i.b(jSONObject.optString("firstname"), "null")) {
                optString = "";
            } else {
                optString = jSONObject.optString("firstname");
            }
            editProfileModel.setFirstName(optString);
            if (kotlin.jvm.internal.i.b(jSONObject.optString("lastname"), "null")) {
                optString2 = "";
            } else {
                optString2 = jSONObject.optString("lastname");
            }
            editProfileModel.setLastName(optString2);
            if (kotlin.jvm.internal.i.b(jSONObject.optString(SessionManager.KEY_MOBILE), "null")) {
                optString3 = "";
            } else {
                optString3 = jSONObject.optString(SessionManager.KEY_MOBILE);
            }
            editProfileModel.setMobile(optString3);
            if (kotlin.jvm.internal.i.b(jSONObject.optString(SessionManager.KEY_EMAIL), "null")) {
                optString4 = "";
            } else {
                optString4 = jSONObject.optString(SessionManager.KEY_EMAIL);
            }
            editProfileModel.setEmail(optString4);
            if (!kotlin.jvm.internal.i.b(jSONObject.optString(SessionManager.KEY_COUNTRY_CODE), "null")) {
                str = jSONObject.optString(SessionManager.KEY_COUNTRY_CODE);
            }
            editProfileModel.setCountryCode(str);
            SessionManager.getInstance().setStringValue(SessionManager.KEY_MOBILE, editProfileModel.getMobile());
            SessionManager.getInstance().setStringValue(SessionManager.KEY_FIRSTNAME, editProfileModel.getFirstName());
            SessionManager.getInstance().setStringValue(SessionManager.KEY_LASTNAME, editProfileModel.getLastName());
            SessionManager.getInstance().setStringValue(SessionManager.KEY_COUNTRY_CODE, editProfileModel.getCountryCode());
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE);
            if (stringValue != null && stringValue.length() != 0) {
                z10 = false;
                if (z10) {
                    stringValue = "organisation";
                }
                editProfileModel.setUserType(stringValue);
                return editProfileModel;
            }
            z10 = true;
            if (z10) {
            }
            editProfileModel.setUserType(stringValue);
            return editProfileModel;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36959a, "exception", e10);
            return editProfileModel;
        }
    }
}
