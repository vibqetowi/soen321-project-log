package xj;

import android.animation.ValueAnimator;
/* compiled from: SpotlightView.kt */
/* loaded from: classes.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f37826a;

    public g(i iVar) {
        this.f37826a = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f37826a.invalidate();
    }
}
