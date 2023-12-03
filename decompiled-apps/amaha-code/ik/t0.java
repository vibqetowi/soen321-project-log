package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: InitialAssessmentBuildingNewFragment.kt */
/* loaded from: classes2.dex */
public final class t0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f20306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f20307b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20308c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20309d;

    public t0(s0 s0Var, boolean z10, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        this.f20306a = s0Var;
        this.f20307b = z10;
        this.f20308c = objectAnimator;
        this.f20309d = objectAnimator2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        s0 s0Var = this.f20306a;
        s0.M(s0Var, false);
        if (this.f20307b) {
            RobertoTextView robertoTextView = (RobertoTextView) s0Var._$_findCachedViewById(R.id.header);
            if (robertoTextView != null) {
                robertoTextView.setText(s0Var.getString(R.string.something_went_wrong));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) s0Var._$_findCachedViewById(R.id.subheader);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(s0Var.getString(R.string.retryMessage));
            }
            RobertoButton robertoButton = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
            if (robertoButton != null) {
                robertoButton.setText(s0Var.getString(R.string.retry));
            }
        } else {
            s0Var.P();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.header), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) s0Var._$_findCachedViewById(R.id.subheader), "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat.start();
        ofFloat2.start();
        this.f20308c.removeListener(this);
        this.f20309d.removeListener(this);
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
