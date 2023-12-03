package ac;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f469a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f469a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f469a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f469a;
        h hVar = baseTransientBottomBar.f9145j;
        int i6 = baseTransientBottomBar.f9139c;
        int i10 = baseTransientBottomBar.f9137a;
        int i11 = i6 - i10;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f9165u.setAlpha(0.0f);
        long j10 = i10;
        ViewPropertyAnimator duration = snackbarContentLayout.f9165u.animate().alpha(1.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f9167w;
        long j11 = i11;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f9166v.getVisibility() == 0) {
            snackbarContentLayout.f9166v.setAlpha(0.0f);
            snackbarContentLayout.f9166v.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
