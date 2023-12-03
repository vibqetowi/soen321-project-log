package rr;

import android.animation.ValueAnimator;
import android.view.View;
import com.theinnerhour.b2b.widgets.LoadingDots;
/* compiled from: LoadingDots.java */
/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoadingDots f31000a;

    public e(LoadingDots loadingDots) {
        this.f31000a = loadingDots;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        LoadingDots loadingDots = this.f31000a;
        int size = loadingDots.f11839u.size();
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue < loadingDots.D) {
            return;
        }
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) loadingDots.f11839u.get(i6);
            int i10 = loadingDots.H[i6];
            if (intValue >= i10) {
                if (intValue < loadingDots.I[i6]) {
                    f = (intValue - i10) / loadingDots.G;
                } else if (intValue < loadingDots.J[i6]) {
                    int i11 = loadingDots.G;
                    f = 1.0f - (((intValue - i10) - i11) / i11);
                }
                view.setTranslationY(((-loadingDots.F) - 0) * f);
            }
            f = 0.0f;
            view.setTranslationY(((-loadingDots.F) - 0) * f);
        }
    }
}
