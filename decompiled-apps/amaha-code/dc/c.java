package dc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12738a;

    public c(e eVar) {
        this.f12738a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12738a.f12765b.g(true);
    }
}
