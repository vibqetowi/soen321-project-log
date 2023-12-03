package fl;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class j implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15144u;

    public j(CustomDashboardActivity customDashboardActivity) {
        this.f15144u = customDashboardActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ConstraintLayout constraintLayout;
        yp.c cVar;
        yp.c cVar2;
        CustomDashboardActivity customDashboardActivity = this.f15144u;
        v.c cVar3 = customDashboardActivity.A;
        ConstraintLayout constraintLayout2 = null;
        if (cVar3 != null && (cVar2 = (yp.c) cVar3.f34632w) != null) {
            constraintLayout = cVar2.f38735b;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        v.c cVar4 = customDashboardActivity.A;
        if (cVar4 != null && (cVar = (yp.c) cVar4.f34632w) != null) {
            constraintLayout2 = cVar.f38736c;
        }
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
