package nq;

import android.animation.Animator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionGoodthingsImportanceFragment.kt */
/* loaded from: classes2.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f26730a;

    public g(h hVar) {
        this.f26730a = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        h hVar = this.f26730a;
        RobertoButton robertoButton = (RobertoButton) hVar._$_findCachedViewById(R.id.a4ButtonCTA);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new f(hVar, 0));
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
