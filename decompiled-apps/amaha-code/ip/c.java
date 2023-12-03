package ip;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import jp.d;
import kotlin.jvm.internal.i;
/* compiled from: SplashScreenActivity.kt */
/* loaded from: classes2.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreenActivity f20508a;

    public c(SplashScreenActivity splashScreenActivity) {
        this.f20508a = splashScreenActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        i.g(animation, "animation");
        SplashScreenActivity splashScreenActivity = this.f20508a;
        d dVar = splashScreenActivity.B;
        if (dVar != null) {
            dVar.F = true;
            dVar.g();
            splashScreenActivity.D = false;
            ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).i();
            return;
        }
        i.q("splashScreenViewModel");
        throw null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        i.g(animation, "animation");
        SplashScreenActivity splashScreenActivity = this.f20508a;
        d dVar = splashScreenActivity.B;
        if (dVar != null) {
            dVar.F = true;
            dVar.g();
            splashScreenActivity.D = false;
            ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).i();
            return;
        }
        i.q("splashScreenViewModel");
        throw null;
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
