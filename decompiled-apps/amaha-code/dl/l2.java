package dl;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class l2 implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13070u;

    public l2(V3DashboardActivity v3DashboardActivity) {
        this.f13070u = v3DashboardActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        V3DashboardActivity v3DashboardActivity = this.f13070u;
        ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.weeksAndAssessmentContainer);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) v3DashboardActivity.n0(R.id.dayPlanContainer);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
