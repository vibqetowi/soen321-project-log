package wk;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: CommunityDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class d implements CustomRetrofitCallback<vk.d> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<vk.d> f36746u;

    public d(h hVar) {
        this.f36746u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<vk.d> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f36746u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<vk.d> call, z<vk.d> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<vk.d> dVar = this.f36746u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
