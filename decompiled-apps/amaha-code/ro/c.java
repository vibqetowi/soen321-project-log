package ro;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.i;
/* compiled from: ProMultiTrackerActivity.kt */
/* loaded from: classes2.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f30840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f30841b;

    public c(Dialog dialog, LottieAnimationView lottieAnimationView) {
        this.f30840a = dialog;
        this.f30841b = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        i.g(animation, "animation");
        this.f30840a.dismiss();
        this.f30841b.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        i.g(animation, "animation");
        this.f30840a.dismiss();
        this.f30841b.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        i.g(animation, "animation");
    }
}
