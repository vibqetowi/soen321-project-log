package dl;

import android.view.View;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13137u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13138v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13139w;

    public /* synthetic */ z(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel, int i6) {
        this.f13137u = i6;
        this.f13138v = v3DashboardActivity;
        this.f13139w = providerDetailHolderModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f13137u;
        ProviderDetailHolderModel provider = this.f13139w;
        V3DashboardActivity this$0 = this.f13138v;
        switch (i6) {
            case 0:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.H0(provider, true);
                return;
            default:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(provider, "$provider");
                this$0.H0(provider, false);
                return;
        }
    }
}
