package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: InitialAssessmentBuildingNewFragment.kt */
/* loaded from: classes2.dex */
public final class u0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f20313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20314b;

    public u0(s0 s0Var, ObjectAnimator objectAnimator) {
        this.f20313a = s0Var;
        this.f20314b = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        RobertoTextView robertoTextView = (RobertoTextView) this.f20313a._$_findCachedViewById(R.id.lateHeader);
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        ObjectAnimator objectAnimator = this.f20314b;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this);
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
