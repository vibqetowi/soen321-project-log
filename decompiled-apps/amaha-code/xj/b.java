package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import hs.k;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/* compiled from: Spotlight.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f37805a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final i f37806b;

    /* renamed from: c  reason: collision with root package name */
    public final j[] f37807c;

    /* renamed from: d  reason: collision with root package name */
    public final long f37808d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f37809e;
    public final ViewGroup f;

    /* renamed from: g  reason: collision with root package name */
    public final xj.a f37810g;

    /* compiled from: Spotlight.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: g  reason: collision with root package name */
        public static final long f37811g = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: h  reason: collision with root package name */
        public static final DecelerateInterpolator f37812h = new DecelerateInterpolator(2.0f);

        /* renamed from: i  reason: collision with root package name */
        public static final int f37813i = 100663296;

        /* renamed from: a  reason: collision with root package name */
        public j[] f37814a;

        /* renamed from: b  reason: collision with root package name */
        public long f37815b;

        /* renamed from: c  reason: collision with root package name */
        public TimeInterpolator f37816c;

        /* renamed from: d  reason: collision with root package name */
        public int f37817d;

        /* renamed from: e  reason: collision with root package name */
        public xj.a f37818e;
        public final Activity f;

        public a(Activity activity) {
            kotlin.jvm.internal.i.g(activity, "activity");
            this.f = activity;
            this.f37815b = f37811g;
            this.f37816c = f37812h;
            this.f37817d = f37813i;
        }

        public final b a() {
            int i6 = this.f37817d;
            Activity activity = this.f;
            i iVar = new i(activity, i6);
            j[] jVarArr = this.f37814a;
            if (jVarArr != null) {
                Window window = activity.getWindow();
                kotlin.jvm.internal.i.f(window, "activity.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    return new b(iVar, jVarArr, this.f37815b, this.f37816c, (ViewGroup) decorView, this.f37818e);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new IllegalArgumentException("targets should not be null. ".toString());
        }

        public final void b(j... jVarArr) {
            boolean z10;
            if (jVarArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f37814a = (j[]) Arrays.copyOf(jVarArr, jVarArr.length);
                return;
            }
            throw new IllegalArgumentException("targets should not be empty. ".toString());
        }
    }

    /* compiled from: Spotlight.kt */
    /* renamed from: xj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0635b extends AnimatorListenerAdapter {
        public C0635b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            b bVar = b.this;
            i iVar = bVar.f37806b;
            ValueAnimator valueAnimator = iVar.f37833z;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = iVar.f37833z;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = iVar.f37833z;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            iVar.f37833z = null;
            ValueAnimator valueAnimator4 = iVar.f37832y;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllListeners();
            }
            ValueAnimator valueAnimator5 = iVar.f37832y;
            if (valueAnimator5 != null) {
                valueAnimator5.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator6 = iVar.f37832y;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            iVar.f37832y = null;
            iVar.removeAllViews();
            bVar.f.removeView(bVar.f37806b);
            xj.a aVar = bVar.f37810g;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    /* compiled from: Spotlight.kt */
    /* loaded from: classes.dex */
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f37821b;

        public c(int i6) {
            this.f37821b = i6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            b bVar = b.this;
            bVar.f37807c[bVar.f37805a].getClass();
            j[] jVarArr = bVar.f37807c;
            int length = jVarArr.length;
            int i6 = this.f37821b;
            if (i6 < length) {
                j jVar = jVarArr[i6];
                bVar.f37805a = i6;
                bVar.f37806b.a(jVar);
                return;
            }
            bVar.a();
        }
    }

    public b(i iVar, j[] jVarArr, long j10, TimeInterpolator timeInterpolator, ViewGroup viewGroup, xj.a aVar) {
        this.f37806b = iVar;
        this.f37807c = jVarArr;
        this.f37808d = j10;
        this.f37809e = timeInterpolator;
        this.f = viewGroup;
        this.f37810g = aVar;
        viewGroup.addView(iVar, -1, -1);
    }

    public final void a() {
        C0635b c0635b = new C0635b();
        i iVar = this.f37806b;
        iVar.getClass();
        TimeInterpolator interpolator = this.f37809e;
        kotlin.jvm.internal.i.g(interpolator, "interpolator");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(this.f37808d);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addListener(c0635b);
        ofFloat.start();
    }

    public final void b() {
        c(this.f37805a + 1);
    }

    public final void c(int i6) {
        ValueAnimator valueAnimator;
        Object animatedValue;
        int i10 = this.f37805a;
        i iVar = this.f37806b;
        if (i10 == -1) {
            j jVar = this.f37807c[i6];
            this.f37805a = i6;
            iVar.a(jVar);
            return;
        }
        c cVar = new c(i6);
        iVar.getClass();
        j jVar2 = iVar.A;
        if (jVar2 != null && (valueAnimator = iVar.f37832y) != null && (animatedValue = valueAnimator.getAnimatedValue()) != null) {
            ValueAnimator valueAnimator2 = iVar.f37832y;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = iVar.f37832y;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator4 = iVar.f37832y;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) animatedValue).floatValue(), 0.0f);
            zj.c cVar2 = jVar2.f37837b;
            ofFloat.setDuration(cVar2.getDuration());
            ofFloat.setInterpolator(cVar2.a());
            ofFloat.addUpdateListener(iVar.f37831x);
            ofFloat.addListener(cVar);
            ofFloat.addListener(new f(ofFloat));
            k kVar = k.f19476a;
            iVar.f37832y = ofFloat;
            ValueAnimator valueAnimator5 = iVar.f37833z;
            if (valueAnimator5 != null) {
                valueAnimator5.removeAllListeners();
            }
            ValueAnimator valueAnimator6 = iVar.f37833z;
            if (valueAnimator6 != null) {
                valueAnimator6.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator7 = iVar.f37833z;
            if (valueAnimator7 != null) {
                valueAnimator7.cancel();
            }
            iVar.f37833z = null;
            ValueAnimator valueAnimator8 = iVar.f37832y;
            if (valueAnimator8 != null) {
                valueAnimator8.start();
            }
        }
    }

    public final void d() {
        xj.c cVar = new xj.c(this);
        i iVar = this.f37806b;
        iVar.getClass();
        TimeInterpolator interpolator = this.f37809e;
        kotlin.jvm.internal.i.g(interpolator, "interpolator");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(this.f37808d);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addListener(cVar);
        ofFloat.start();
    }
}
