package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class v implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f20315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f20317c;

    public v(x xVar, ObjectAnimator objectAnimator, boolean z10) {
        this.f20315a = xVar;
        this.f20316b = objectAnimator;
        this.f20317c = z10;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        x xVar = this.f20315a;
        RobertoButton robertoButton = (RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setAlpha(1.0f);
        }
        u uVar = new u(this.f20317c, xVar, 0);
        RobertoButton robertoButton2 = (RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton2 != null) {
            robertoButton2.setOnClickListener(DebouncedOnClickListener.wrap(uVar));
        }
        ObjectAnimator objectAnimator = this.f20316b;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        boolean z10 = this.f20317c;
        x xVar = this.f20315a;
        u uVar = new u(z10, xVar, 1);
        RobertoButton robertoButton = (RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(DebouncedOnClickListener.wrap(uVar));
        }
        ObjectAnimator objectAnimator = this.f20316b;
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
