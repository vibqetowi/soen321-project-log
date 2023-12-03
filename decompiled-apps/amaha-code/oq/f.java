package oq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionHopeIntroductionFragment.kt */
/* loaded from: classes2.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f27729a;

    public f(g gVar) {
        this.f27729a = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        g gVar = this.f27729a;
        ((RobertoButton) gVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
        ((RobertoButton) gVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new e(gVar, 3));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        g gVar = this.f27729a;
        RobertoButton robertoButton = (RobertoButton) gVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new e(gVar, 4));
        }
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
