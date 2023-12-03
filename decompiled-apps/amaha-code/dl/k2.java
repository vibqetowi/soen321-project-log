package dl;

import android.animation.Animator;
import android.app.Dialog;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.utils.Extensions;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class k2 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f13060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13061b;

    public k2(LottieAnimationView lottieAnimationView, V3DashboardActivity v3DashboardActivity) {
        this.f13060a = lottieAnimationView;
        this.f13061b = v3DashboardActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        LottieAnimationView lottieAnimationView = this.f13060a;
        if (lottieAnimationView != null) {
            lottieAnimationView.i();
        }
        Dialog dialog = this.f13061b.f10729j0;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            kotlin.jvm.internal.i.q("planLoadingDialog");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        V3DashboardActivity v3DashboardActivity = this.f13061b;
        int i6 = v3DashboardActivity.f10731k0 + 1;
        v3DashboardActivity.f10731k0 = i6;
        LottieAnimationView lottieAnimationView = this.f13060a;
        if (i6 < 6) {
            if (lottieAnimationView != null) {
                lottieAnimationView.h();
                return;
            }
            return;
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.i();
        }
        Dialog dialog = v3DashboardActivity.f10729j0;
        if (dialog != null) {
            dialog.dismiss();
            if (v3DashboardActivity.f10752x != null) {
                if ((v3DashboardActivity.N0().getAssessments().size() == 1 && v3DashboardActivity.N0().getPlanV3().size() == 1) || (v3DashboardActivity.N0().getAssessments().size() == 2 && v3DashboardActivity.N0().getPlanV3().size() == 16)) {
                    Extensions extensions = Extensions.INSTANCE;
                    V3DashboardActivity v3DashboardActivity2 = this.f13061b;
                    String string = v3DashboardActivity2.getString(R.string.planLoadingDialogFailure);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.planLoadingDialogFailure)");
                    Extensions.toast$default(extensions, v3DashboardActivity2, string, 0, 2, null);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.i.q("planLoadingDialog");
        throw null;
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
