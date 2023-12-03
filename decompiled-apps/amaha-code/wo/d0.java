package wo;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: ExperimentProfileActivityRepository.kt */
/* loaded from: classes2.dex */
public final class d0 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e0 f36878u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<JSONObject> f36879v;

    public d0(e0 e0Var, ls.h hVar) {
        this.f36878u = e0Var;
        this.f36879v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f36878u.f36882a, t3);
        this.f36879v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        String mVar;
        ls.d<JSONObject> dVar = this.f36879v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                sf.m mVar2 = response.f13696b;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    dVar.resumeWith(new JSONObject(mVar));
                }
            } else {
                dVar.resumeWith(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36878u.f36882a, e10);
            dVar.resumeWith(null);
        }
    }
}
