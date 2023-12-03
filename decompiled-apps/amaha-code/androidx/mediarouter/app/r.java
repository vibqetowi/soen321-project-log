package androidx.mediarouter.app;

import android.view.animation.Animation;
import androidx.mediarouter.app.p;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class r implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p.h f2669u;

    public r(p.h hVar) {
        this.f2669u = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        p pVar = p.this;
        pVar.R = false;
        pVar.m();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        p.this.R = true;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
