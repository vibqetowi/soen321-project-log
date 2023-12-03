package hl;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.utils.Extensions;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class h0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f17696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f17697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Course f17698c;

    public h0(LottieAnimationView lottieAnimationView, s sVar, Course course) {
        this.f17696a = lottieAnimationView;
        this.f17697b = sVar;
        this.f17698c = course;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        LottieAnimationView lottieAnimationView = this.f17696a;
        if (lottieAnimationView != null) {
            lottieAnimationView.i();
        }
        Dialog dialog = this.f17697b.f17736x;
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
        s sVar = this.f17697b;
        int i6 = sVar.f17737y + 1;
        sVar.f17737y = i6;
        LottieAnimationView lottieAnimationView = this.f17696a;
        if (i6 < 10) {
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
        Dialog dialog = sVar.f17736x;
        if (dialog != null) {
            dialog.dismiss();
            Course course = this.f17698c;
            if (course != null && course.getAssessments().size() == 1 && course.getPlanV3().size() == 1) {
                Extensions extensions = Extensions.INSTANCE;
                Context requireContext = sVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                String string = sVar.getString(R.string.planLoadingDialogFailure);
                kotlin.jvm.internal.i.f(string, "getString(R.string.planLoadingDialogFailure)");
                extensions.toast(requireContext, string, 1);
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
