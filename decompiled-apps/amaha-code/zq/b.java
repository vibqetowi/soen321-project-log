package zq;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
/* compiled from: ProblemSolvingExampleFragment.java */
/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f39817a;

    public b(a aVar) {
        this.f39817a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        a aVar = this.f39817a;
        ViewGroup.LayoutParams layoutParams = aVar.G.getLayoutParams();
        layoutParams.height = intValue;
        aVar.G.setLayoutParams(layoutParams);
    }
}
