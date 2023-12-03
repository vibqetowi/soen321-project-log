package m6;

import android.animation.ValueAnimator;
import m6.b;
/* compiled from: FloatValueAnimatorBuilder.java */
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.c f24857a;

    public a(b.c cVar) {
        this.f24857a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f24857a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
