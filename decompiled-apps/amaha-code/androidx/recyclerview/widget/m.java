package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.k;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.f f3042a;

    public m(k.f fVar) {
        this.f3042a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3042a.f3038m = valueAnimator.getAnimatedFraction();
    }
}
