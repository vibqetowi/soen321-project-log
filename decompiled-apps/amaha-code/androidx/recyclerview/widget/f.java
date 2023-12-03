package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2933a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2934b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2935c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2936d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2937e;
    public final /* synthetic */ c f;

    public f(c cVar, RecyclerView.c0 c0Var, int i6, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = cVar;
        this.f2933a = c0Var;
        this.f2934b = i6;
        this.f2935c = view;
        this.f2936d = i10;
        this.f2937e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i6 = this.f2934b;
        View view = this.f2935c;
        if (i6 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2936d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2937e.setListener(null);
        c cVar = this.f;
        RecyclerView.c0 c0Var = this.f2933a;
        cVar.g(c0Var);
        cVar.f2894p.remove(c0Var);
        cVar.o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
