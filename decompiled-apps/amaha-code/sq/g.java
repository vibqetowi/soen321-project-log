package sq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionTimeoutIntroFragment.kt */
/* loaded from: classes2.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f31884a;

    public g(h hVar) {
        this.f31884a = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        h hVar = this.f31884a;
        ((RobertoButton) hVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
        ((RobertoButton) hVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new f(hVar, 2));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        h hVar = this.f31884a;
        RobertoButton robertoButton = (RobertoButton) hVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new f(hVar, 3));
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
