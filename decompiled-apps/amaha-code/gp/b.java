package gp;

import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponse;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import kotlin.jvm.internal.i;
import ls.d;
import ls.h;
/* compiled from: ResourceRepository.kt */
/* loaded from: classes2.dex */
public final class b implements CustomRetrofitCallback<ResourceDetailResponse> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f16675u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d<ResourceDetailResponse> f16676v;

    public b(c cVar, h hVar) {
        this.f16675u = cVar;
        this.f16676v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ResourceDetailResponse> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f16675u.f16677a, t3);
        this.f16676v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ResourceDetailResponse> call, z<ResourceDetailResponse> response) {
        d<ResourceDetailResponse> dVar = this.f16676v;
        i.g(call, "call");
        i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            dVar.resumeWith(response.f13696b);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16675u.f16677a, "getDashboardResources Exception", e10);
            dVar.resumeWith(null);
        }
    }
}
