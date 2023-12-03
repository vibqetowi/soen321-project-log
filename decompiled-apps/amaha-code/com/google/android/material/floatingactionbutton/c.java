package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f9038b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f9039c;

    public c(d dVar, boolean z10, a aVar) {
        this.f9039c = dVar;
        this.f9037a = z10;
        this.f9038b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f9039c;
        dVar.r = 0;
        dVar.f9050l = null;
        d.g gVar = this.f9038b;
        if (gVar != null) {
            ((a) gVar).f9031a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f9039c;
        dVar.f9059v.b(0, this.f9037a);
        dVar.r = 2;
        dVar.f9050l = animator;
    }
}
