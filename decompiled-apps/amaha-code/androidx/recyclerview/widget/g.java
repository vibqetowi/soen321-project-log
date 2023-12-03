package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.d f2944a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2945b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2946c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2947d;

    public g(c cVar, c.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2947d = cVar;
        this.f2944a = dVar;
        this.f2945b = viewPropertyAnimator;
        this.f2946c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2945b.setListener(null);
        View view = this.f2946c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c.d dVar = this.f2944a;
        RecyclerView.c0 c0Var = dVar.f2902a;
        c cVar = this.f2947d;
        cVar.g(c0Var);
        cVar.r.remove(dVar.f2902a);
        cVar.o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f2944a.f2902a;
        this.f2947d.getClass();
    }
}
