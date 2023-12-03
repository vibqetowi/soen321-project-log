package sq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionTimeoutTimerFragment.kt */
/* loaded from: classes2.dex */
public final class t implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f31918a;

    public t(u uVar) {
        this.f31918a = uVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        u uVar = this.f31918a;
        RobertoButton robertoButton = (RobertoButton) uVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setVisibility(8);
        }
        RobertoButton robertoButton2 = (RobertoButton) uVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton2 != null) {
            robertoButton2.setTranslationY(-60.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }
}
