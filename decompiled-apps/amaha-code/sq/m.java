package sq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionTimeoutSeparatorPromptFragment.kt */
/* loaded from: classes2.dex */
public final class m implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f31899a;

    public m(n nVar) {
        this.f31899a = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        n nVar = this.f31899a;
        ((RobertoButton) nVar._$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(1.0f);
        RobertoButton robertoButton = (RobertoButton) nVar._$_findCachedViewById(R.id.a4ButtonCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new l(nVar, 4));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        n nVar = this.f31899a;
        RobertoButton robertoButton = (RobertoButton) nVar._$_findCachedViewById(R.id.a4ButtonCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new l(nVar, 3));
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
