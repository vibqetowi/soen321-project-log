package tn;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: MoodTrackerFragment.kt */
/* loaded from: classes2.dex */
public final class d implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f33336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f33337b;

    public d(Dialog dialog, LottieAnimationView lottieAnimationView) {
        this.f33336a = dialog;
        this.f33337b = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f33336a.dismiss();
        this.f33337b.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f33336a.dismiss();
        this.f33337b.i();
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
