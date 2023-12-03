package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class y implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f20342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f20343b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20344c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20345d;

    public y(x xVar, boolean z10, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        this.f20342a = xVar;
        this.f20343b = z10;
        this.f20344c = objectAnimator;
        this.f20345d = objectAnimator2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        int i6 = x.K;
        x xVar = this.f20342a;
        xVar.K(false);
        if (this.f20343b) {
            RobertoTextView robertoTextView = (RobertoTextView) xVar._$_findCachedViewById(R.id.header);
            if (robertoTextView != null) {
                robertoTextView.setText(xVar.getString(R.string.exptPlanLoadingFailureText));
            }
            RobertoButton robertoButton = (RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA);
            if (robertoButton != null) {
                robertoButton.setText(xVar.getString(R.string.retry_now));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) xVar._$_findCachedViewById(R.id.subheader);
            if (robertoTextView2 != null) {
                Extensions.INSTANCE.gone(robertoTextView2);
            }
        } else {
            xVar.M();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) xVar._$_findCachedViewById(R.id.header), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) xVar._$_findCachedViewById(R.id.subheader), "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat.start();
        ofFloat2.start();
        this.f20344c.removeListener(this);
        this.f20345d.removeListener(this);
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
