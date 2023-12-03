package gp;

import com.theinnerhour.b2b.components.resources.model.ResourcesResponse;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import kotlin.jvm.internal.i;
import ls.d;
import ls.h;
/* compiled from: ResourceRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<ResourcesResponse> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f16673u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d<ResourcesResponse> f16674v;

    public a(c cVar, h hVar) {
        this.f16673u = cVar;
        this.f16674v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ResourcesResponse> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f16673u.f16677a, t3);
        this.f16674v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ResourcesResponse> call, z<ResourcesResponse> response) {
        d<ResourcesResponse> dVar = this.f16674v;
        i.g(call, "call");
        i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                dVar.resumeWith(response.f13696b);
            } else {
                dVar.resumeWith(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16673u.f16677a, "getDashboardResources Exception", e10);
            dVar.resumeWith(null);
        }
    }
}
