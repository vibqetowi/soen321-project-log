package ir;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: UnderstandingThoughtsFragment.java */
/* loaded from: classes2.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f20635a;

    public k(j jVar) {
        this.f20635a = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        j jVar = this.f20635a;
        ViewGroup.LayoutParams layoutParams = jVar.K.getLayoutParams();
        layoutParams.height = intValue;
        jVar.K.setLayoutParams(layoutParams);
    }
}
