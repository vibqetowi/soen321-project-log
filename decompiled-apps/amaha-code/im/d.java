package im;

import com.theinnerhour.b2b.network.model.ProviderAboutResponseModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: InAppPromptRepository.kt */
/* loaded from: classes2.dex */
public final class d implements CustomRetrofitCallback<ProviderAboutResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<ProviderAboutResponseModel> f20406u;

    public d(h hVar) {
        this.f20406u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ProviderAboutResponseModel> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f20406u.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ProviderAboutResponseModel> call, z<ProviderAboutResponseModel> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<ProviderAboutResponseModel> dVar = this.f20406u;
        if (a10) {
            dVar.resumeWith(response.f13696b);
        } else {
            dVar.resumeWith(null);
        }
    }
}
