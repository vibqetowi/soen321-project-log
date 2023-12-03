package dl;

import android.content.Intent;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class a1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12969u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f12970v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel) {
        super(1);
        this.f12969u = v3DashboardActivity;
        this.f12970v = providerDetailHolderModel;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        pp.c cVar;
        bool.booleanValue();
        V3DashboardActivity v3DashboardActivity = this.f12969u;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f12970v;
        Intent putExtra = intent.putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid());
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "couplestherapist")) {
            cVar = pp.c.PROVIDER_PACKAGE_COUPLES;
        } else {
            cVar = pp.c.PROVIDER_PACKAGE;
        }
        v3DashboardActivity.startActivity(putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra("type", providerDetailHolderModel.getProviderType()).putExtra("is_prevent_recording", true));
        v3DashboardActivity.H0(providerDetailHolderModel, true);
        return hs.k.f19476a;
    }
}
