package ab;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* compiled from: MotionTiming.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f463a;

    /* renamed from: b  reason: collision with root package name */
    public final long f464b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f465c;

    /* renamed from: d  reason: collision with root package name */
    public int f466d;

    /* renamed from: e  reason: collision with root package name */
    public int f467e;

    public h(long j10) {
        this.f463a = 0L;
        this.f464b = 300L;
        this.f465c = null;
        this.f466d = 0;
        this.f467e = 1;
        this.f463a = j10;
        this.f464b = 150L;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f463a);
        animator.setDuration(this.f464b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f466d);
            valueAnimator.setRepeatMode(this.f467e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f465c;
        if (timeInterpolator == null) {
            return a.f450b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f463a != hVar.f463a || this.f464b != hVar.f464b || this.f466d != hVar.f466d || this.f467e != hVar.f467e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f463a;
        long j11 = this.f464b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f466d) * 31) + this.f467e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f463a);
        sb2.append(" duration: ");
        sb2.append(this.f464b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f466d);
        sb2.append(" repeatMode: ");
        return pl.a.g(sb2, this.f467e, "}\n");
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f463a = 0L;
        this.f464b = 300L;
        this.f465c = null;
        this.f466d = 0;
        this.f467e = 1;
        this.f463a = j10;
        this.f464b = j11;
        this.f465c = timeInterpolator;
    }
}
