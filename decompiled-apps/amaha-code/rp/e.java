package rp;

import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkNotificationResponseModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import java.util.ArrayList;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class e implements CustomRetrofitCallback<TelecommunicationsHomeworkNotificationResponseModel> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f30872u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ArrayList<TelecommunicationHomeworkNotification>> f30873v;

    public e(a aVar, ls.h hVar) {
        this.f30872u = aVar;
        this.f30873v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<TelecommunicationsHomeworkNotificationResponseModel> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f30872u.f30847b, t3);
        this.f30873v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<TelecommunicationsHomeworkNotificationResponseModel> call, z<TelecommunicationsHomeworkNotificationResponseModel> response) {
        ArrayList<TelecommunicationHomeworkNotification> arrayList;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        if (response.a()) {
            TelecommunicationsHomeworkNotificationResponseModel telecommunicationsHomeworkNotificationResponseModel = response.f13696b;
            if (telecommunicationsHomeworkNotificationResponseModel != null) {
                arrayList = telecommunicationsHomeworkNotificationResponseModel.getNotificationList();
            } else {
                arrayList = null;
            }
            this.f30873v.resumeWith(arrayList);
        }
    }
}
