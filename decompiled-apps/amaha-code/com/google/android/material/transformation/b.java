package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import jb.d;
/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f9342b;

    public b(d dVar, Drawable drawable) {
        this.f9341a = dVar;
        this.f9342b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9341a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9341a.setCircularRevealOverlayDrawable(this.f9342b);
    }
}
