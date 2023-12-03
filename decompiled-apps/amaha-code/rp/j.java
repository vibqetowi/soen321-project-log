package rp;

import com.theinnerhour.b2b.network.model.SuggestedSessionsResponseModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class j implements CustomRetrofitCallback<SuggestedSessionsResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f30880u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<SuggestedSessionsResponseModel> f30881v;

    public j(a aVar, ls.h hVar) {
        this.f30880u = aVar;
        this.f30881v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<SuggestedSessionsResponseModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30880u.f30847b, t3);
        this.f30881v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<SuggestedSessionsResponseModel> call, z<SuggestedSessionsResponseModel> response) {
        SuggestedSessionsResponseModel suggestedSessionsResponseModel;
        ls.d<SuggestedSessionsResponseModel> dVar = this.f30881v;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                suggestedSessionsResponseModel = response.f13696b;
            } else {
                suggestedSessionsResponseModel = null;
            }
            dVar.resumeWith(suggestedSessionsResponseModel);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30880u.f30847b, e10);
            dVar.resumeWith(null);
        }
    }
}
