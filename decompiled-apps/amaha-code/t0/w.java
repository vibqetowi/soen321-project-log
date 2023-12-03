package t0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final View f32385u;

    /* renamed from: v  reason: collision with root package name */
    public ViewTreeObserver f32386v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f32387w;

    public w(ViewGroup viewGroup, Runnable runnable) {
        this.f32385u = viewGroup;
        this.f32386v = viewGroup.getViewTreeObserver();
        this.f32387w = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup != null) {
            if (runnable != null) {
                w wVar = new w(viewGroup, runnable);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
                viewGroup.addOnAttachStateChangeListener(wVar);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f32386v.isAlive();
        View view = this.f32385u;
        if (isAlive) {
            this.f32386v.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f32387w.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f32386v = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f32386v.isAlive();
        View view2 = this.f32385u;
        if (isAlive) {
            this.f32386v.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
