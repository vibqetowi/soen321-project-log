package kq;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
/* compiled from: StressRelaxingActivityFragment.kt */
/* loaded from: classes2.dex */
public final class j implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ com.theinnerhour.b2b.fragment.coping.a f23805u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Animation f23806v;

    public j(com.theinnerhour.b2b.fragment.coping.a aVar, Animation animation) {
        this.f23805u = aVar;
        this.f23806v = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        com.theinnerhour.b2b.fragment.coping.a aVar = this.f23805u;
        ((ConstraintLayout) aVar._$_findCachedViewById(R.id.feedbackQuestionLayout)).setVisibility(8);
        ((ConstraintLayout) aVar._$_findCachedViewById(R.id.feedbackPlayStoreLayout)).startAnimation(this.f23806v);
        ((ConstraintLayout) aVar._$_findCachedViewById(R.id.feedbackPlayStoreLayout)).setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }
}
