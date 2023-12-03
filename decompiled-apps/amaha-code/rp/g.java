package rp;

import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class g implements CustomRetrofitCallback<TelecommunicationsHomeworkResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<TelecommunicationsHomeworkResponseModel> f30876u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f30877v;

    public g(a aVar, ls.h hVar) {
        this.f30876u = hVar;
        this.f30877v = aVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<TelecommunicationsHomeworkResponseModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30877v.f30847b, t3);
        this.f30876u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<TelecommunicationsHomeworkResponseModel> call, z<TelecommunicationsHomeworkResponseModel> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<TelecommunicationsHomeworkResponseModel> dVar = this.f30876u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
