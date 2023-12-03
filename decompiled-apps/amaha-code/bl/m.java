package bl;

import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: DailyPlanDetailFragmentV3.kt */
/* loaded from: classes2.dex */
public final class m implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f4375u;

    public m(ConstraintLayout constraintLayout) {
        this.f4375u = constraintLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f4375u.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
