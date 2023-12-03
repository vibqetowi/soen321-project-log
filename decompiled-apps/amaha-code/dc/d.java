package dc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12739a;

    public d(e eVar) {
        this.f12739a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12739a.f12765b.g(false);
    }
}
