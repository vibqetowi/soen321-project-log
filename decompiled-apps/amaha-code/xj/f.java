package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* compiled from: SpotlightView.kt */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f37825a;

    public f(ValueAnimator valueAnimator) {
        this.f37825a = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        ValueAnimator valueAnimator = this.f37825a;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        ValueAnimator valueAnimator = this.f37825a;
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
    }
}
