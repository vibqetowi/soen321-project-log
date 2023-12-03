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
public final class x0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13127u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13128v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel) {
        super(0);
        this.f13127u = v3DashboardActivity;
        this.f13128v = providerDetailHolderModel;
    }

    @Override // ss.a
    public final hs.k invoke() {
        pp.c cVar;
        String str;
        Bundle bundle;
        V3DashboardActivity v3DashboardActivity = this.f13127u;
        androidx.activity.result.c<Intent> cVar2 = v3DashboardActivity.H0;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f13128v;
        Intent putExtra = intent.putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid());
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "couplestherapist")) {
            cVar = pp.c.PROVIDER_PACKAGE_COUPLES;
        } else {
            cVar = pp.c.PROVIDER_PACKAGE;
        }
        cVar2.a(putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra("type", providerDetailHolderModel.getProviderType()).putExtra("is_prevent_recording", true));
        String str2 = gk.a.f16573a;
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
            str = "psychiatrist_list_book";
        } else {
            str = "therapist_list_book";
        }
        km.d dVar = v3DashboardActivity.Y0;
        if (dVar != null) {
            bundle = dVar.i(providerDetailHolderModel);
        } else {
            bundle = null;
        }
        gk.a.b(bundle, str);
        return hs.k.f19476a;
    }
}
