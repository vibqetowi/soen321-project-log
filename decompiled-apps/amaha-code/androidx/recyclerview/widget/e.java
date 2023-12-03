package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2923b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2924c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2925d;

    public e(View view, ViewPropertyAnimator viewPropertyAnimator, c cVar, RecyclerView.c0 c0Var) {
        this.f2925d = cVar;
        this.f2922a = c0Var;
        this.f2923b = view;
        this.f2924c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2923b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2924c.setListener(null);
        c cVar = this.f2925d;
        RecyclerView.c0 c0Var = this.f2922a;
        cVar.g(c0Var);
        cVar.f2893o.remove(c0Var);
        cVar.o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2925d.getClass();
    }
}
