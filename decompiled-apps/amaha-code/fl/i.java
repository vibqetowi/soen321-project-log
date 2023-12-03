package fl;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
import dl.d0;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class i implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15141u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f15142v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f15143w;

    public i(CustomDashboardActivity customDashboardActivity, int i6, kotlin.jvm.internal.v vVar) {
        this.f15141u = customDashboardActivity;
        this.f15142v = i6;
        this.f15143w = vVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ConstraintLayout constraintLayout;
        yp.c cVar;
        RobertoButton robertoButton;
        yp.c cVar2;
        ConstraintLayout constraintLayout2;
        yp.c cVar3;
        CustomDashboardActivity customDashboardActivity = this.f15141u;
        v.c cVar4 = customDashboardActivity.A;
        if (cVar4 != null && (cVar3 = (yp.c) cVar4.f34632w) != null) {
            constraintLayout = cVar3.f38735b;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        int i6 = this.f15143w.f23467u;
        customDashboardActivity.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(customDashboardActivity, R.anim.slide_fade_in_right);
        loadAnimation.setAnimationListener(new j(customDashboardActivity));
        v.c cVar5 = customDashboardActivity.A;
        if (cVar5 != null && (cVar2 = (yp.c) cVar5.f34632w) != null && (constraintLayout2 = cVar2.f38736c) != null) {
            constraintLayout2.startAnimation(loadAnimation);
        }
        v.c cVar6 = customDashboardActivity.A;
        if (cVar6 != null && (cVar = (yp.c) cVar6.f34632w) != null && (robertoButton = cVar.f38742j) != null) {
            robertoButton.setOnClickListener(new d0(customDashboardActivity, this.f15142v, i6, 1));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
