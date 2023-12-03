package wk;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: CommunityDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class c implements CustomRetrofitCallback<vk.a> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<vk.a> f36745u;

    public c(h hVar) {
        this.f36745u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<vk.a> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f36745u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<vk.a> call, z<vk.a> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<vk.a> dVar = this.f36745u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
