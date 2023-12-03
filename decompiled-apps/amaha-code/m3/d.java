package m3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public final class d extends a implements Choreographer.FrameCallback {
    public a3.c D;

    /* renamed from: w  reason: collision with root package name */
    public float f24793w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    public boolean f24794x = false;

    /* renamed from: y  reason: collision with root package name */
    public long f24795y = 0;

    /* renamed from: z  reason: collision with root package name */
    public float f24796z = 0.0f;
    public int A = 0;
    public float B = -2.1474836E9f;
    public float C = 2.1474836E9f;
    public boolean E = false;

    public final float b() {
        a3.c cVar = this.D;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.C;
        if (f == 2.1474836E9f) {
            return cVar.f186l;
        }
        return f;
    }

    public final float c() {
        a3.c cVar = this.D;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.B;
        if (f == -2.1474836E9f) {
            return cVar.f185k;
        }
        return f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f24790v.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(true);
    }

    public final boolean d() {
        if (this.f24793w < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        boolean z10;
        float c10;
        float b10;
        if (this.E) {
            e(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        a3.c cVar = this.D;
        if (cVar != null && this.E) {
            long j11 = this.f24795y;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / cVar.f187m) / Math.abs(this.f24793w));
            float f = this.f24796z;
            if (d()) {
                abs = -abs;
            }
            float f2 = f + abs;
            this.f24796z = f2;
            float c11 = c();
            float b11 = b();
            PointF pointF = f.f24798a;
            if (f2 >= c11 && f2 <= b11) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            this.f24796z = f.b(this.f24796z, c(), b());
            this.f24795y = j10;
            Iterator it = this.f24789u.iterator();
            while (it.hasNext()) {
                ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
            }
            if (z11) {
                if (getRepeatCount() != -1 && this.A >= getRepeatCount()) {
                    if (this.f24793w < 0.0f) {
                        b10 = c();
                    } else {
                        b10 = b();
                    }
                    this.f24796z = b10;
                    e(true);
                    a(d());
                } else {
                    Iterator it2 = this.f24790v.iterator();
                    while (it2.hasNext()) {
                        ((Animator.AnimatorListener) it2.next()).onAnimationRepeat(this);
                    }
                    this.A++;
                    if (getRepeatMode() == 2) {
                        this.f24794x = !this.f24794x;
                        this.f24793w = -this.f24793w;
                    } else {
                        if (d()) {
                            c10 = b();
                        } else {
                            c10 = c();
                        }
                        this.f24796z = c10;
                    }
                    this.f24795y = j10;
                }
            }
            if (this.D != null) {
                float f10 = this.f24796z;
                if (f10 < this.B || f10 > this.C) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.B), Float.valueOf(this.C), Float.valueOf(this.f24796z)));
                }
            }
            hc.d.s();
        }
    }

    public final void e(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.E = false;
        }
    }

    public final void f(float f) {
        if (this.f24796z == f) {
            return;
        }
        this.f24796z = f.b(f, c(), b());
        this.f24795y = 0L;
        Iterator it = this.f24789u.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c10;
        float b10;
        float c11;
        if (this.D == null) {
            return 0.0f;
        }
        if (d()) {
            c10 = b() - this.f24796z;
            b10 = b();
            c11 = c();
        } else {
            c10 = this.f24796z - c();
            b10 = b();
            c11 = c();
        }
        return c10 / (b10 - c11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f;
        a3.c cVar = this.D;
        if (cVar == null) {
            f = 0.0f;
        } else {
            float f2 = this.f24796z;
            float f10 = cVar.f185k;
            f = (f2 - f10) / (cVar.f186l - f10);
        }
        return Float.valueOf(f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        a3.c cVar = this.D;
        if (cVar == null) {
            return 0L;
        }
        return cVar.b();
    }

    public final void h(float f, float f2) {
        float f10;
        float f11;
        if (f <= f2) {
            a3.c cVar = this.D;
            if (cVar == null) {
                f10 = -3.4028235E38f;
            } else {
                f10 = cVar.f185k;
            }
            if (cVar == null) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = cVar.f186l;
            }
            this.B = f.b(f, f10, f11);
            this.C = f.b(f2, f10, f11);
            f((int) f.b(this.f24796z, f, f2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.E;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i6) {
        super.setRepeatMode(i6);
        if (i6 != 2 && this.f24794x) {
            this.f24794x = false;
            this.f24793w = -this.f24793w;
        }
    }
}
