package ik;

import android.animation.ObjectAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f20319u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f20320v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, boolean z10) {
        super(0);
        this.f20319u = z10;
        this.f20320v = xVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        LottieAnimationView lottieAnimationView;
        x xVar = this.f20320v;
        boolean z10 = this.f20319u;
        if (z10 && (lottieAnimationView = (LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)) != null) {
            lottieAnimationView.i();
        }
        RobertoButton robertoButton = (RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA);
        if (robertoButton != null) {
            robertoButton.setVisibility(0);
            robertoButton.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA), "alpha", 0.0f, 1.0f);
        if (ofFloat != null) {
            ofFloat.setDuration(600L);
        }
        if (ofFloat != null) {
            ofFloat.setStartDelay(1000L);
        }
        if (ofFloat != null) {
            ofFloat.addListener(new v(xVar, ofFloat, z10));
        }
        if (ofFloat != null) {
            ofFloat.start();
        }
        return hs.k.f19476a;
    }
}
