package dc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12751a;

    public j(k kVar) {
        this.f12751a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f12751a;
        kVar.q();
        kVar.r.start();
    }
}
