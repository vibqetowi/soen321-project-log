package tp;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: TopicalGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class j implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f33412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f33413b;

    public j(Dialog dialog, LottieAnimationView lottieAnimationView) {
        this.f33412a = dialog;
        this.f33413b = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f33412a.dismiss();
        this.f33413b.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f33412a.dismiss();
        this.f33413b.i();
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
