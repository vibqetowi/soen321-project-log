package jl;

import com.theinnerhour.b2b.components.telecommunications.model.MatchedCompletedProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import java.util.ArrayList;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class n0 implements CustomRetrofitCallback<MatchedCompletedProviderListModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<ArrayList<TherapistPackagesModel>> f22275u;

    public n0(ls.h hVar) {
        this.f22275u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<MatchedCompletedProviderListModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22275u.resumeWith(new ArrayList());
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<MatchedCompletedProviderListModel> call, dw.z<MatchedCompletedProviderListModel> response) {
        ArrayList<TherapistPackagesModel> arrayList;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<ArrayList<TherapistPackagesModel>> dVar = this.f22275u;
        if (a10) {
            MatchedCompletedProviderListModel matchedCompletedProviderListModel = response.f13696b;
            if (matchedCompletedProviderListModel == null || (arrayList = matchedCompletedProviderListModel.getList()) == null) {
                arrayList = new ArrayList<>();
            }
            dVar.resumeWith(arrayList);
            return;
        }
        dVar.resumeWith(new ArrayList());
    }
}
