package nq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionGoodthingsIntroFragment.kt */
/* loaded from: classes2.dex */
public final class j implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f26736a;

    public j(k kVar) {
        this.f26736a = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        k kVar = this.f26736a;
        RobertoButton robertoButton = (RobertoButton) kVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new i(kVar, 2));
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
