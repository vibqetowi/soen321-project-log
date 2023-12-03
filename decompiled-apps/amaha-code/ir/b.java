package ir;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: ChallengeThoughtsFragment.java */
/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f20581a;

    public b(a aVar) {
        this.f20581a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        a aVar = this.f20581a;
        ViewGroup.LayoutParams layoutParams = aVar.O.getLayoutParams();
        layoutParams.height = intValue;
        aVar.O.setLayoutParams(layoutParams);
    }
}
