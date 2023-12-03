package p001do;

import com.theinnerhour.b2b.components.telecommunications.model.ProviderSearchResponseFilterModel;
import com.theinnerhour.b2b.components.telecommunications.model.ProviderSearchResponseModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import hs.f;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ls.d;
import ls.h;
/* compiled from: MatchingFlowRepository.kt */
/* renamed from: do.b  reason: invalid package */
/* loaded from: classes2.dex */
public final class b implements CustomRetrofitCallback<ProviderSearchResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f13185u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d<f<? extends ArrayList<TherapistPackagesModel>, ? extends ArrayList<ProviderSearchResponseFilterModel>>> f13186v;

    public b(a aVar, h hVar) {
        this.f13185u = aVar;
        this.f13186v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ProviderSearchResponseModel> call, Throwable t3) {
        a aVar = this.f13185u;
        i.g(call, "call");
        i.g(t3, "t");
        try {
            LogHelper.INSTANCE.e(aVar.f13174a, t3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(aVar.f13174a, e10);
        }
        this.f13186v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ProviderSearchResponseModel> call, z<ProviderSearchResponseModel> response) {
        a aVar = this.f13185u;
        d<f<? extends ArrayList<TherapistPackagesModel>, ? extends ArrayList<ProviderSearchResponseFilterModel>>> dVar = this.f13186v;
        i.g(call, "call");
        i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                ProviderSearchResponseModel providerSearchResponseModel = response.f13696b;
                if (providerSearchResponseModel != null) {
                    dVar.resumeWith(new f(providerSearchResponseModel.getProviderList(), providerSearchResponseModel.getFiltersList()));
                }
            } else {
                LogHelper.INSTANCE.e(aVar.f13174a, "fetchProviderList response isSuccessful false");
                dVar.resumeWith(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(aVar.f13174a, e10);
            dVar.resumeWith(null);
        }
    }
}
