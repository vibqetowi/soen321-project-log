package rp;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class b implements CustomRetrofitCallback<sf.m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<sf.m> f30867u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f30868v;

    public b(a aVar, ls.h hVar) {
        this.f30867u = hVar;
        this.f30868v = aVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<sf.m> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f30867u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<sf.m> call, z<sf.m> response) {
        hs.k kVar;
        ls.d<sf.m> dVar = this.f30867u;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                sf.m mVar = response.f13696b;
                if (mVar != null) {
                    dVar.resumeWith(mVar);
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    dVar.resumeWith(null);
                    return;
                }
                return;
            }
            dVar.resumeWith(null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30868v.f30847b, e10);
            dVar.resumeWith(null);
        }
    }
}
