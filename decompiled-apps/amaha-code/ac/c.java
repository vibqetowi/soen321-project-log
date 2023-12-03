package ac;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f470a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i6) {
        this.f470a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f470a.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f470a;
        h hVar = baseTransientBottomBar.f9145j;
        int i6 = baseTransientBottomBar.f9138b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f9165u.setAlpha(1.0f);
        long j10 = i6;
        ViewPropertyAnimator duration = snackbarContentLayout.f9165u.animate().alpha(0.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f9167w;
        long j11 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f9166v.getVisibility() == 0) {
            snackbarContentLayout.f9166v.setAlpha(1.0f);
            snackbarContentLayout.f9166v.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
