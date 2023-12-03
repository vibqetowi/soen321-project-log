package wo;

import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class e<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36880u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36881v;

    public e(g gVar, ls.h hVar) {
        this.f36880u = gVar;
        this.f36881v = hVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        ls.d<ApiNetworkStatus> dVar = this.f36881v;
        g gVar = this.f36880u;
        try {
            if (!kotlin.jvm.internal.i.b(jSONObject.optString("message"), "")) {
                gVar.f36893c.i(jSONObject.optString("message"));
            } else {
                gVar.f36893c.i(jSONObject.optString("msg"));
            }
            dVar.resumeWith(ApiNetworkStatus.SUCCESS);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(gVar.f36891a, "exception", e10);
            dVar.resumeWith(ApiNetworkStatus.EXCEPTION);
        }
    }
}
