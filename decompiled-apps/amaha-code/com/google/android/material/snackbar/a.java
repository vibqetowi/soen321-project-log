package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f9169a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f9169a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9169a.f9144i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
