package bb;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f4229a;

    public g(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f4229a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4229a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
