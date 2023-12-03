package dl;

import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13140u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13141v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel) {
        super(0);
        this.f13140u = v3DashboardActivity;
        this.f13141v = providerDetailHolderModel;
    }

    @Override // ss.a
    public final hs.k invoke() {
        Bundle bundle;
        int i6 = V3DashboardActivity.f10714r1;
        V3DashboardActivity v3DashboardActivity = this.f13140u;
        v3DashboardActivity.G0();
        String str = gk.a.f16573a;
        km.d dVar = v3DashboardActivity.Y0;
        if (dVar != null) {
            bundle = dVar.i(this.f13141v);
        } else {
            bundle = null;
        }
        gk.a.b(bundle, "in_app_resume_booking_sheet_dismiss");
        return hs.k.f19476a;
    }
}
