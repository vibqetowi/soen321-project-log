package rp;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import org.json.JSONObject;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class o implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f30887u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f30888v;

    public o(a aVar, ls.h hVar) {
        this.f30887u = aVar;
        this.f30888v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30887u.f30847b, t3);
        this.f30888v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        String mVar;
        boolean z10;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<String> dVar = this.f30888v;
        if (a10) {
            try {
                sf.m mVar2 = response.f13696b;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    String tt2 = new JSONObject(mVar).optString("serialtoken", "");
                    kotlin.jvm.internal.i.f(tt2, "tt");
                    if (tt2.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        tt2 = null;
                    }
                    dVar.resumeWith(tt2);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f30887u.f30847b, e10);
                dVar.resumeWith(null);
                return;
            }
        }
        dVar.resumeWith(null);
    }
}
