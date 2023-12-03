package h2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.b f17053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f17054b;

    public l(k kVar, t.b bVar) {
        this.f17054b = kVar;
        this.f17053a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17053a.remove(animator);
        this.f17054b.G.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17054b.G.add(animator);
    }
}
