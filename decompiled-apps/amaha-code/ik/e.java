package ik;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
/* loaded from: classes2.dex */
public final class e implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f20164b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f20165c;

    public e(d dVar, boolean z10, ObjectAnimator objectAnimator) {
        this.f20163a = dVar;
        this.f20164b = z10;
        this.f20165c = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        d dVar = this.f20163a;
        ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCareLoaderContainer);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCarePostLoadContainer);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCarePostLoadAnim);
        if (lottieAnimationView != null) {
            lottieAnimationView.h();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCarePostLoadContainer), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
        if (this.f20164b) {
            RobertoButton robertoButton = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareSuccessButton);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new c(dVar, 1));
            }
        } else {
            RobertoButton robertoButton2 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new c(dVar, 2));
            }
        }
        this.f20165c.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }
}
