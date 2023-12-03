package jl;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class p0 implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u0 f22291u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22292v;

    public p0(u0 u0Var, ls.h hVar) {
        this.f22291u = u0Var;
        this.f22292v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f22291u.f22359a, t3);
        this.f22292v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
        hs.k kVar;
        String mVar;
        boolean z10;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<Boolean> dVar = this.f22292v;
        if (a10) {
            try {
                sf.m mVar2 = response.f13696b;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    JSONObject optJSONObject = new JSONObject(mVar).optJSONObject("data");
                    if (optJSONObject != null) {
                        z10 = optJSONObject.optBoolean("onboarding_complete");
                    } else {
                        z10 = false;
                    }
                    dVar.resumeWith(Boolean.valueOf(z10));
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    dVar.resumeWith(Boolean.FALSE);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f22291u.f22359a, e10);
                dVar.resumeWith(Boolean.FALSE);
                return;
            }
        }
        dVar.resumeWith(Boolean.FALSE);
    }
}
