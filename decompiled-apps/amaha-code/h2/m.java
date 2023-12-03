package h2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17055a;

    public m(k kVar) {
        this.f17055a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17055a.n();
        animator.removeListener(this);
    }
}
