package qq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionPleasurableIntroFragment.kt */
/* loaded from: classes2.dex */
public final class k implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f30044a;

    public k(l lVar) {
        this.f30044a = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        l lVar = this.f30044a;
        RobertoButton robertoButton = (RobertoButton) lVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new j(lVar, 2));
        }
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
