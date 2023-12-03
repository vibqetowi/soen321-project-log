package dl;

import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13079u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13080v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(V3DashboardActivity v3DashboardActivity, V3DashboardActivity v3DashboardActivity2) {
        super(1);
        this.f13079u = v3DashboardActivity;
        this.f13080v = v3DashboardActivity2;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar) {
        TherapistPackagesModel therapistPackagesModel;
        TherapistPackagesModel therapistPackagesModel2;
        hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar2 = fVar;
        V3DashboardActivity v3DashboardActivity = this.f13080v;
        V3DashboardActivity v3DashboardActivity2 = this.f13079u;
        if (fVar2 != null && (therapistPackagesModel2 = (TherapistPackagesModel) fVar2.f19464u) != null) {
            RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity2.n0(R.id.tvDashboardProviderAssignedTherapistName);
            if (robertoTextView != null) {
                robertoTextView.setText(v3DashboardActivity2.getString(R.string.profileNewSessionsName, therapistPackagesModel2.getFirstname(), therapistPackagesModel2.getLastname()));
            }
            com.bumptech.glide.f i6 = Glide.i(v3DashboardActivity);
            i6.p("https:" + therapistPackagesModel2.getImage()).B((AppCompatImageView) v3DashboardActivity2.n0(R.id.ivDashboardProviderAssignedTherapist));
        }
        if (fVar2 != null && (therapistPackagesModel = (TherapistPackagesModel) fVar2.f19465v) != null) {
            RobertoTextView robertoTextView2 = (RobertoTextView) v3DashboardActivity2.n0(R.id.tvDashboardProviderAssignedCouplesTherapistName);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(v3DashboardActivity2.getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname()));
            }
            com.bumptech.glide.f i10 = Glide.i(v3DashboardActivity);
            i10.p("https:" + therapistPackagesModel.getImage()).B((AppCompatImageView) v3DashboardActivity2.n0(R.id.ivDashboardProviderAssignedCouplesTherapist));
        }
        v3DashboardActivity2.f10741p0[0] = Boolean.TRUE;
        V3DashboardActivity.q0(v3DashboardActivity2);
        return hs.k.f19476a;
    }
}
