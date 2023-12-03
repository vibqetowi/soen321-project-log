package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f9174u;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f9174u = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f9174u;
        BaseTransientBottomBar.e eVar = baseTransientBottomBar.f9144i;
        if (eVar == null) {
            return;
        }
        ViewParent parent = eVar.getParent();
        BaseTransientBottomBar.e eVar2 = baseTransientBottomBar.f9144i;
        if (parent != null) {
            eVar2.setVisibility(0);
        }
        if (eVar2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.f9140d);
            ofFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f);
            ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f9137a);
            animatorSet.addListener(new ac.g(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = eVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = eVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        eVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f9141e);
        valueAnimator.setDuration(baseTransientBottomBar.f9139c);
        valueAnimator.addListener(new ac.b(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
