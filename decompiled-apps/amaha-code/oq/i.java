package oq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionHopePart1Fragment.kt */
/* loaded from: classes2.dex */
public final class i implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f27735a;

    public i(j jVar) {
        this.f27735a = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        j jVar = this.f27735a;
        ((RobertoButton) jVar._$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(1.0f);
        ((RobertoButton) jVar._$_findCachedViewById(R.id.a4ButtonCTA)).setOnClickListener(new h(jVar, 4));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        j jVar = this.f27735a;
        RobertoButton robertoButton = (RobertoButton) jVar._$_findCachedViewById(R.id.a4ButtonCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new h(jVar, 5));
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
