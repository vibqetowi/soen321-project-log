package sb;

import android.animation.ValueAnimator;
/* compiled from: NavigationBarItemView.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f31392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f31393b;

    public b(a aVar, float f) {
        this.f31393b = aVar;
        this.f31392a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f31393b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f31392a);
    }
}
