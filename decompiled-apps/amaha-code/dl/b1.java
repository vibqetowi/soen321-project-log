package dl;

import android.content.Intent;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12982u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f12983v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel) {
        super(1);
        this.f12982u = v3DashboardActivity;
        this.f12983v = providerDetailHolderModel;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        pp.c cVar;
        bool.booleanValue();
        V3DashboardActivity v3DashboardActivity = this.f12982u;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f12983v;
        Intent putExtra = intent.putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid());
        String providerType = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
            cVar = pp.c.PROFILE;
        } else if (kotlin.jvm.internal.i.b(providerType, "psychiatrist")) {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        } else {
            cVar = pp.c.PROFILE_COUPLES_THERAPIST;
        }
        v3DashboardActivity.startActivity(putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra("is_prevent_recording", true));
        v3DashboardActivity.H0(providerDetailHolderModel, true);
        return hs.k.f19476a;
    }
}
