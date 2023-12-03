package xo;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import kotlin.jvm.internal.i;
/* compiled from: RecommendedActivitiesPlaybackActivity.kt */
/* loaded from: classes2.dex */
public final class d implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f37875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f37876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RecommendedActivitiesPlaybackActivity f37877c;

    public d(Dialog dialog, LottieAnimationView lottieAnimationView, RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity) {
        this.f37875a = dialog;
        this.f37876b = lottieAnimationView;
        this.f37877c = recommendedActivitiesPlaybackActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        i.g(animation, "animation");
        this.f37875a.dismiss();
        this.f37876b.i();
        this.f37877c.finish();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        i.g(animation, "animation");
        this.f37875a.dismiss();
        this.f37876b.i();
        this.f37877c.finish();
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
