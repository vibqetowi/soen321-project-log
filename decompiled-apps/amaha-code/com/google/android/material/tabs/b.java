package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: TabLayout.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f9235b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TabLayout.f f9236c;

    public b(TabLayout.f fVar, View view, View view2) {
        this.f9236c = fVar;
        this.f9234a = view;
        this.f9235b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9236c.c(this.f9234a, this.f9235b, valueAnimator.getAnimatedFraction());
    }
}
