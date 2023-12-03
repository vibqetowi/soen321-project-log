package ik;

import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AnimUtils;
/* compiled from: ExptInitialAssessmentHealthQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f20273u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(0);
        this.f20273u = rVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        r rVar = this.f20273u;
        ConstraintLayout constraintLayout = (ConstraintLayout) rVar._$_findCachedViewById(R.id.healthAssessmentSubLayout);
        constraintLayout.setAlpha(0.0f);
        constraintLayout.setScaleX(0.8f);
        constraintLayout.setScaleY(0.8f);
        constraintLayout.setVisibility(0);
        AnimUtils animUtils = AnimUtils.INSTANCE;
        ViewPropertyAnimator animate = constraintLayout.animate();
        kotlin.jvm.internal.i.f(animate, "animate()");
        ViewPropertyAnimator onEnd = animUtils.onEnd(animate, new p(rVar));
        onEnd.alpha(1.0f);
        onEnd.scaleX(1.0f);
        onEnd.scaleY(1.0f);
        onEnd.start();
        return hs.k.f19476a;
    }
}
