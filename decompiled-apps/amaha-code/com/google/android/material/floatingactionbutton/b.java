package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9034b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f9035c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f9036d;

    public b(d dVar, boolean z10, a aVar) {
        this.f9036d = dVar;
        this.f9034b = z10;
        this.f9035c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9033a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6;
        d dVar = this.f9036d;
        dVar.r = 0;
        dVar.f9050l = null;
        if (!this.f9033a) {
            boolean z10 = this.f9034b;
            if (z10) {
                i6 = 8;
            } else {
                i6 = 4;
            }
            dVar.f9059v.b(i6, z10);
            d.g gVar = this.f9035c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f9031a.a(aVar.f9032b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f9036d;
        dVar.f9059v.b(0, this.f9034b);
        dVar.r = 1;
        dVar.f9050l = animator;
        this.f9033a = false;
    }
}
