package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.theinnerhour.b2b.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f8794a;

    /* renamed from: b  reason: collision with root package name */
    public int f8795b;

    /* renamed from: c  reason: collision with root package name */
    public int f8796c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f8797d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f8798e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f8799g;

    /* renamed from: h  reason: collision with root package name */
    public int f8800h;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f8801i;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f8801i = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f8794a = new LinkedHashSet<>();
        this.f = 0;
        this.f8799g = 2;
        this.f8800h = 0;
    }

    public final void a(V v10, int i6, long j10, TimeInterpolator timeInterpolator) {
        this.f8801i = v10.animate().translationY(i6).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        this.f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f8795b = rb.a.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.f8796c = rb.a.c(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f8797d = rb.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f452d);
        this.f8798e = rb.a.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f451c);
        return super.onLayoutChild(coordinatorLayout, v10, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        LinkedHashSet<b> linkedHashSet = this.f8794a;
        boolean z10 = false;
        if (i10 > 0) {
            if (this.f8799g == 1) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f8801i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v10.clearAnimation();
                }
                this.f8799g = 1;
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                a(v10, this.f + this.f8800h, this.f8796c, this.f8798e);
            }
        } else if (i10 < 0) {
            if (this.f8799g == 2) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f8801i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    v10.clearAnimation();
                }
                this.f8799g = 2;
                Iterator<b> it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                a(v10, 0, this.f8795b, this.f8797d);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6, int i10) {
        if (i6 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8794a = new LinkedHashSet<>();
        this.f = 0;
        this.f8799g = 2;
        this.f8800h = 0;
    }
}
