package rp;

import com.theinnerhour.b2b.network.model.ProviderPrescriptionList;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class c implements CustomRetrofitCallback<ProviderPrescriptionList> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f30869u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ProviderPrescriptionList> f30870v;

    public c(a aVar, ls.h hVar) {
        this.f30869u = aVar;
        this.f30870v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ProviderPrescriptionList> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30869u.f30847b, t3);
        this.f30870v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ProviderPrescriptionList> call, z<ProviderPrescriptionList> response) {
        ls.d<ProviderPrescriptionList> dVar = this.f30870v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                dVar.resumeWith(response.f13696b);
            } else {
                dVar.resumeWith(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30869u.f30847b, e10);
            dVar.resumeWith(null);
        }
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
    }
}
