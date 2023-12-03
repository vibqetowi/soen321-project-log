package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: InitialAssessmentBuildingNewFragment.kt */
/* loaded from: classes2.dex */
public final class r0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f20288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f20290c;

    public r0(s0 s0Var, ObjectAnimator objectAnimator, boolean z10) {
        this.f20288a = s0Var;
        this.f20289b = objectAnimator;
        this.f20290c = z10;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        s0 s0Var = this.f20288a;
        RobertoButton robertoButton = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setAlpha(1.0f);
        }
        q0 q0Var = new q0(this.f20290c, s0Var, 1);
        RobertoButton robertoButton2 = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton2 != null) {
            robertoButton2.setOnClickListener(DebouncedOnClickListener.wrap(q0Var));
        }
        ObjectAnimator objectAnimator = this.f20289b;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        boolean z10 = this.f20290c;
        s0 s0Var = this.f20288a;
        q0 q0Var = new q0(z10, s0Var, 0);
        RobertoButton robertoButton = (RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(DebouncedOnClickListener.wrap(q0Var));
        }
        ObjectAnimator objectAnimator = this.f20289b;
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
