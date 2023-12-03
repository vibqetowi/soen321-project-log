package ml;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: DashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class v implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u f25603u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25604v;

    public v(u uVar, ls.h hVar) {
        this.f25603u = uVar;
        this.f25604v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f25603u.f25590a, t3);
        this.f25604v.resumeWith(null);
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
        ls.d<Boolean> dVar = this.f25604v;
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
                LogHelper.INSTANCE.e(this.f25603u.f25590a, e10);
                dVar.resumeWith(Boolean.FALSE);
                return;
            }
        }
        dVar.resumeWith(Boolean.FALSE);
    }
}
