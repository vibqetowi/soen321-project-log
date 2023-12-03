package dl;

import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.k implements ss.l<TherapistPackagesModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13083u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13084v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(V3DashboardActivity v3DashboardActivity, V3DashboardActivity v3DashboardActivity2) {
        super(1);
        this.f13083u = v3DashboardActivity;
        this.f13084v = v3DashboardActivity2;
    }

    @Override // ss.l
    public final hs.k invoke(TherapistPackagesModel therapistPackagesModel) {
        TherapistPackagesModel therapistPackagesModel2 = therapistPackagesModel;
        V3DashboardActivity v3DashboardActivity = this.f13083u;
        if (therapistPackagesModel2 != null) {
            RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedPsychiatristName);
            if (robertoTextView != null) {
                robertoTextView.setText(v3DashboardActivity.getString(R.string.profileNewSessionsName, therapistPackagesModel2.getFirstname(), therapistPackagesModel2.getLastname()));
            }
            com.bumptech.glide.f i6 = Glide.i(this.f13084v);
            i6.p("https:" + therapistPackagesModel2.getImage()).B((AppCompatImageView) v3DashboardActivity.n0(R.id.ivDashboardProviderAssignedPsychiatrist));
        }
        v3DashboardActivity.f10741p0[1] = Boolean.TRUE;
        V3DashboardActivity.q0(v3DashboardActivity);
        return hs.k.f19476a;
    }
}
