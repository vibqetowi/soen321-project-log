package rq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionThoughtsWaitScreen2Fragment.kt */
/* loaded from: classes2.dex */
public final class s implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f30989a;

    public s(t tVar) {
        this.f30989a = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        t tVar = this.f30989a;
        ((RobertoButton) tVar._$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(1.0f);
        ((RobertoButton) tVar._$_findCachedViewById(R.id.a4ButtonCTA)).setOnClickListener(new r(tVar, 4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        t tVar = this.f30989a;
        RobertoButton robertoButton = (RobertoButton) tVar._$_findCachedViewById(R.id.a4ButtonCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new r(tVar, 5));
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
