package mq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionExerciseIntroFragment.kt */
/* loaded from: classes2.dex */
public final class i implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f25690a;

    public i(j jVar) {
        this.f25690a = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        j jVar = this.f25690a;
        ((RobertoButton) jVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
        ((RobertoButton) jVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new h(jVar, 2));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        j jVar = this.f25690a;
        RobertoButton robertoButton = (RobertoButton) jVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new h(jVar, 3));
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
