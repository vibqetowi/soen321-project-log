package pq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionMasteryIntroFragment.kt */
/* loaded from: classes2.dex */
public final class h implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f28784a;

    public h(i iVar) {
        this.f28784a = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        i iVar = this.f28784a;
        ((RobertoButton) iVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
        ((RobertoButton) iVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new g(iVar, 2));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        i iVar = this.f28784a;
        RobertoButton robertoButton = (RobertoButton) iVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new g(iVar, 3));
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
