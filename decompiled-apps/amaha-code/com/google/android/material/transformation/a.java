package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9340a;

    public a(View view) {
        this.f9340a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9340a.invalidate();
    }
}
