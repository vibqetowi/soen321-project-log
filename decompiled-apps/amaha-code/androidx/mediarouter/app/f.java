package androidx.mediarouter.app;

import android.view.animation.Animation;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f2546u;

    public f(g gVar) {
        this.f2546u = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2546u.i(true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
