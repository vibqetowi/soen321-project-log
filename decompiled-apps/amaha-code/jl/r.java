package jl;

import com.theinnerhour.b2b.model.OrganizationExperimentOverrideData;
import com.theinnerhour.b2b.model.OrganizationExperimentOverrideEntry;
import com.theinnerhour.b2b.model.OrganizationExperimentOverrideList;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import java.util.HashMap;
import java.util.List;
/* compiled from: CustomDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class r implements CustomRetrofitCallback<OrganizationExperimentOverrideData> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<Boolean, ? extends HashMap<String, String>>> f22336u;

    public r(ls.h hVar) {
        this.f22336u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<OrganizationExperimentOverrideData> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        this.f22336u.resumeWith(new hs.f(Boolean.FALSE, null));
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<OrganizationExperimentOverrideData> call, dw.z<OrganizationExperimentOverrideData> response) {
        OrganizationExperimentOverrideList data;
        List<OrganizationExperimentOverrideEntry> list;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<hs.f<Boolean, ? extends HashMap<String, String>>> dVar = this.f22336u;
        if (a10) {
            HashMap hashMap = new HashMap();
            OrganizationExperimentOverrideData organizationExperimentOverrideData = response.f13696b;
            if (organizationExperimentOverrideData != null && (data = organizationExperimentOverrideData.getData()) != null && (list = data.getList()) != null) {
                for (OrganizationExperimentOverrideEntry organizationExperimentOverrideEntry : list) {
                    hashMap.put(organizationExperimentOverrideEntry.getExperimentName(), organizationExperimentOverrideEntry.getExperimentValue());
                }
            }
            dVar.resumeWith(new hs.f(Boolean.TRUE, hashMap));
            return;
        }
        dVar.resumeWith(new hs.f(Boolean.FALSE, null));
    }
}
