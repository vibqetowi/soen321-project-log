package m6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* compiled from: FloatValueAnimatorBuilder.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f24858a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0403b f24859b;

    /* compiled from: FloatValueAnimatorBuilder.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b.this.f24859b.a();
        }
    }

    /* compiled from: FloatValueAnimatorBuilder.java */
    /* renamed from: m6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0403b {
        void a();
    }

    /* compiled from: FloatValueAnimatorBuilder.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(float f);
    }

    public b(boolean z10) {
        if (z10) {
            this.f24858a = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            this.f24858a = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
    }

    public final ValueAnimator a() {
        InterfaceC0403b interfaceC0403b = this.f24859b;
        ValueAnimator valueAnimator = this.f24858a;
        if (interfaceC0403b != null) {
            valueAnimator.addListener(new a());
        }
        return valueAnimator;
    }
}
