package rp;

import com.theinnerhour.b2b.components.telecommunications.model.MatchedCompletedProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import java.util.ArrayList;
/* compiled from: TelecommunicationsBookingRepository.kt */
/* loaded from: classes2.dex */
public final class r implements CustomRetrofitCallback<MatchedCompletedProviderListModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<ArrayList<TherapistPackagesModel>> f30898u;

    public r(ls.h hVar) {
        this.f30898u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<MatchedCompletedProviderListModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f30898u.resumeWith(new ArrayList());
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<MatchedCompletedProviderListModel> call, z<MatchedCompletedProviderListModel> response) {
        ArrayList<TherapistPackagesModel> arrayList;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<ArrayList<TherapistPackagesModel>> dVar = this.f30898u;
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
