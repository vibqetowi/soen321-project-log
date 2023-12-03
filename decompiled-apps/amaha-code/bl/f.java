package bl;

import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: DailyPlanDetailFragment.kt */
/* loaded from: classes2.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f4350u;

    public f(ConstraintLayout constraintLayout) {
        this.f4350u = constraintLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f4350u.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
