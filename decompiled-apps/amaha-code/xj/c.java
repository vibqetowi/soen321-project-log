package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: Spotlight.kt */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f37822a;

    public c(b bVar) {
        this.f37822a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        this.f37822a.c(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        a aVar = this.f37822a.f37810g;
        if (aVar != null) {
            aVar.a();
        }
    }
}
