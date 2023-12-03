package wo;

import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentProfileActivityRepository.kt */
/* loaded from: classes2.dex */
public final class c0 implements CustomRetrofitCallback<UpcomingSessionsModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e0 f36874u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<UpcomingSessionsModel> f36875v;

    public c0(e0 e0Var, ls.h hVar) {
        this.f36874u = e0Var;
        this.f36875v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<UpcomingSessionsModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f36874u.f36882a, t3);
        this.f36875v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<UpcomingSessionsModel> call, dw.z<UpcomingSessionsModel> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<UpcomingSessionsModel> dVar = this.f36875v;
        if (a10) {
            try {
                dVar.resumeWith(response.f13696b);
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f36874u.f36882a, e10);
                dVar.resumeWith(null);
                return;
            }
        }
        dVar.resumeWith(null);
    }
}
