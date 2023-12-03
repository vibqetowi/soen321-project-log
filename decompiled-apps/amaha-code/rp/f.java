package rp;

import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class f implements CustomRetrofitCallback<UpcomingSessionsModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f30874u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<UpcomingSessionsModel> f30875v;

    public f(a aVar, ls.h hVar) {
        this.f30874u = aVar;
        this.f30875v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<UpcomingSessionsModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30874u.f30847b, t3);
        this.f30875v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<UpcomingSessionsModel> call, z<UpcomingSessionsModel> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<UpcomingSessionsModel> dVar = this.f30875v;
        if (a10) {
            try {
                dVar.resumeWith(response.f13696b);
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f30874u.f30847b, e10);
                dVar.resumeWith(null);
                return;
            }
        }
        dVar.resumeWith(null);
    }
}
