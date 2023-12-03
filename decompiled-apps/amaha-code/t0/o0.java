package t0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f32342a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public o0(View view) {
        this.f32342a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.f32342a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.f32342a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f32342a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(p0 p0Var) {
        View view = this.f32342a.get();
        if (view != null) {
            if (p0Var != null) {
                view.animate().setListener(new n0(p0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = this.f32342a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
