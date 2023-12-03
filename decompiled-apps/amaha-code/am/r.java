package am;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class r implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f660a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f661b;

    public r(Dialog dialog, LottieAnimationView lottieAnimationView) {
        this.f660a = dialog;
        this.f661b = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f660a.dismiss();
        this.f661b.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f660a.dismiss();
        this.f661b.i();
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
