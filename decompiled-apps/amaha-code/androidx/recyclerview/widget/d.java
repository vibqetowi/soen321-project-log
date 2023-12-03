package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2917a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2918b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2919c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2920d;

    public d(View view, ViewPropertyAnimator viewPropertyAnimator, c cVar, RecyclerView.c0 c0Var) {
        this.f2920d = cVar;
        this.f2917a = c0Var;
        this.f2918b = viewPropertyAnimator;
        this.f2919c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2918b.setListener(null);
        this.f2919c.setAlpha(1.0f);
        c cVar = this.f2920d;
        RecyclerView.c0 c0Var = this.f2917a;
        cVar.g(c0Var);
        cVar.f2895q.remove(c0Var);
        cVar.o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2920d.getClass();
    }
}
