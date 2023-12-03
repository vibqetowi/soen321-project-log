package ik;

import android.view.animation.Animation;
/* compiled from: InitialAssessmentBuildingFragment.kt */
/* loaded from: classes2.dex */
public final class o0 implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n0 f20261u;

    public o0(n0 n0Var) {
        this.f20261u = n0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        androidx.fragment.app.p activity = this.f20261u.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity).t0();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
