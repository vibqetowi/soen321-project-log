package h2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class d extends a0 {

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f17030a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17031b = false;

        public a(View view) {
            this.f17030a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v vVar = t.f17072a;
            View view = this.f17030a;
            vVar.F(view, 1.0f);
            if (this.f17031b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            View view = this.f17030a;
            if (d0.d.h(view) && view.getLayerType() == 0) {
                this.f17031b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public d(int i6) {
        if ((i6 & (-4)) == 0) {
            this.R = i6;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator N(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        t.f17072a.F(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f17073b, f2);
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    @Override // h2.k
    public final void h(r rVar) {
        L(rVar);
        rVar.f17068a.put("android:fade:transitionAlpha", Float.valueOf(t.f17072a.E(rVar.f17069b)));
    }

    public d() {
    }
}
