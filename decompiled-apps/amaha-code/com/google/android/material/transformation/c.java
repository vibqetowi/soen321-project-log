package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import jb.d;
/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9343a;

    public c(d dVar) {
        this.f9343a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f9343a;
        d.C0325d revealInfo = dVar.getRevealInfo();
        revealInfo.f21779c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
