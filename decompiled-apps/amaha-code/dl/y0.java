package dl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13134u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13135v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel) {
        super(0);
        this.f13134u = v3DashboardActivity;
        this.f13135v = providerDetailHolderModel;
    }

    @Override // ss.a
    public final hs.k invoke() {
        pp.c cVar;
        Bundle bundle;
        V3DashboardActivity v3DashboardActivity = this.f13134u;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f13135v;
        String providerType = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
            cVar = pp.c.PROFILE;
        } else if (kotlin.jvm.internal.i.b(providerType, "psychiatrist")) {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        } else {
            cVar = pp.c.PROFILE_COUPLES_THERAPIST;
        }
        v3DashboardActivity.startActivity(intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid()).putExtra("is_prevent_recording", true));
        String str = gk.a.f16573a;
        km.d dVar = v3DashboardActivity.Y0;
        if (dVar != null) {
            bundle = dVar.i(providerDetailHolderModel);
        } else {
            bundle = null;
        }
        gk.a.b(bundle, "therapy_psychiatry_profile_card_click");
        return hs.k.f19476a;
    }
}
