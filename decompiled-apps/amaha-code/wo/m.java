package wo;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import org.json.JSONObject;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class m implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36953u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f36954v;

    public m(n nVar, ls.h hVar) {
        this.f36953u = hVar;
        this.f36954v = nVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f36953u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        ls.d<Boolean> dVar = this.f36953u;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                Utils.parseLoginResponse$default(Utils.INSTANCE, new JSONObject(String.valueOf(response.f13696b)), false, 2, null);
                dVar.resumeWith(Boolean.TRUE);
            } else {
                dVar.resumeWith(Boolean.FALSE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36954v.f36959a, e10);
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
