package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.d f2948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2949b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2950c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2951d;

    public h(c cVar, c.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2951d = cVar;
        this.f2948a = dVar;
        this.f2949b = viewPropertyAnimator;
        this.f2950c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2949b.setListener(null);
        View view = this.f2950c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c.d dVar = this.f2948a;
        RecyclerView.c0 c0Var = dVar.f2903b;
        c cVar = this.f2951d;
        cVar.g(c0Var);
        cVar.r.remove(dVar.f2903b);
        cVar.o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.c0 c0Var = this.f2948a.f2903b;
        this.f2951d.getClass();
    }
}
