package wo;

import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36940u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f36941v;

    public /* synthetic */ k(n nVar, int i6) {
        this.f36940u = i6;
        this.f36941v = nVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        int i6 = this.f36940u;
        n this$0 = this.f36941v;
        switch (i6) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.lifecycle.w<ApiNetworkStatus> wVar = this$0.f36961c;
                try {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = this$0.f36959a;
                    logHelper.i(str, "reponse from api " + jSONObject);
                    JSONObject data = jSONObject.getJSONObject("user");
                    androidx.lifecycle.w<EditProfileModel> wVar2 = this$0.f36960b;
                    kotlin.jvm.internal.i.f(data, "data");
                    wVar2.l(this$0.a(data));
                    this$0.f = true;
                    if (this$0.f36964g) {
                        wVar.l(ApiNetworkStatus.SUCCESS);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    wVar.l(ApiNetworkStatus.EXCEPTION);
                    LogHelper.INSTANCE.e(e10);
                    return;
                }
            default:
                JSONObject jSONObject2 = (JSONObject) obj;
                try {
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    String str2 = this$0.f36959a;
                    logHelper2.i(str2, " " + jSONObject2);
                    this$0.f36963e.i((ProfileAssetModel) new sf.i().c(jSONObject2.toString(), new TypeToken<ProfileAssetModel>() { // from class: com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentEditProfileRepository$getAvatarAndThemes$2$request$1$typeToken$1
                    }.getType()));
                    this$0.f36964g = true;
                    if (this$0.f) {
                        this$0.f36961c.l(ApiNetworkStatus.SUCCESS);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f36959a, "exception", e11);
                    this$0.f36961c.i(ApiNetworkStatus.EXCEPTION);
                    return;
                }
        }
    }
}
