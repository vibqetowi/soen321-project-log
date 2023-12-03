package yl;

import com.theinnerhour.b2b.components.telecommunications.model.ProviderSearchResponseModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: ExpertCareRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<ProviderSearchResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f38677u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<List<? extends TherapistPackagesModel>> f38678v;

    public a(b bVar, h hVar) {
        this.f38677u = bVar;
        this.f38678v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<ProviderSearchResponseModel> call, Throwable t3) {
        b bVar = this.f38677u;
        i.g(call, "call");
        i.g(t3, "t");
        try {
            LogHelper.INSTANCE.e(bVar.f38679a, t3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(bVar.f38679a, e10);
        }
        this.f38678v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<ProviderSearchResponseModel> call, z<ProviderSearchResponseModel> response) {
        k kVar;
        List list;
        b bVar = this.f38677u;
        ls.d<List<? extends TherapistPackagesModel>> dVar = this.f38678v;
        i.g(call, "call");
        i.g(response, "response");
        try {
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                ProviderSearchResponseModel providerSearchResponseModel = response.f13696b;
                if (providerSearchResponseModel != null) {
                    ArrayList<TherapistPackagesModel> providerList = providerSearchResponseModel.getProviderList();
                    if (providerList != null) {
                        list = u.E2(providerList, 5);
                    } else {
                        list = null;
                    }
                    dVar.resumeWith(list);
                    kVar = k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    dVar.resumeWith(null);
                    return;
                }
                return;
            }
            LogHelper.INSTANCE.e(bVar.f38679a, "fetchProviderList response isSuccessful false");
            dVar.resumeWith(null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(bVar.f38679a, e10);
            dVar.resumeWith(null);
        }
    }
}
