package a3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import l3.c;
/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class j extends Drawable implements Drawable.Callback, Animatable {
    public final ArrayList<n> A;
    public ImageView.ScaleType B;
    public e3.b C;
    public String D;
    public e3.a E;
    public boolean F;
    public i3.c G;
    public int H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public boolean L;

    /* renamed from: u  reason: collision with root package name */
    public final Matrix f206u = new Matrix();

    /* renamed from: v  reason: collision with root package name */
    public a3.c f207v;

    /* renamed from: w  reason: collision with root package name */
    public final m3.d f208w;

    /* renamed from: x  reason: collision with root package name */
    public float f209x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f210y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f211z;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f212a;

        public a(String str) {
            this.f212a = str;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.k(this.f212a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class b implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f214a;

        public b(int i6) {
            this.f214a = i6;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.g(this.f214a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class c implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f216a;

        public c(float f) {
            this.f216a = f;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.o(this.f216a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class d implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f3.e f218a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f219b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s1.s f220c;

        public d(f3.e eVar, Object obj, s1.s sVar) {
            this.f218a = eVar;
            this.f219b = obj;
            this.f220c = sVar;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.a(this.f218a, this.f219b, this.f220c);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            j jVar = j.this;
            i3.c cVar = jVar.G;
            if (cVar != null) {
                m3.d dVar = jVar.f208w;
                a3.c cVar2 = dVar.D;
                if (cVar2 == null) {
                    f = 0.0f;
                } else {
                    float f2 = dVar.f24796z;
                    float f10 = cVar2.f185k;
                    f = (f2 - f10) / (cVar2.f186l - f10);
                }
                cVar.o(f);
            }
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class f implements n {
        public f() {
        }

        @Override // a3.j.n
        public final void run() {
            j.this.e();
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class g implements n {
        public g() {
        }

        @Override // a3.j.n
        public final void run() {
            j.this.f();
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class h implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f225a;

        public h(int i6) {
            this.f225a = i6;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.l(this.f225a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class i implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f227a;

        public i(float f) {
            this.f227a = f;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.n(this.f227a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: a3.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0006j implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f229a;

        public C0006j(int i6) {
            this.f229a = i6;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.h(this.f229a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class k implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f231a;

        public k(float f) {
            this.f231a = f;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.j(this.f231a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class l implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f233a;

        public l(String str) {
            this.f233a = str;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.m(this.f233a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class m implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f235a;

        public m(String str) {
            this.f235a = str;
        }

        @Override // a3.j.n
        public final void run() {
            j.this.i(this.f235a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface n {
        void run();
    }

    public j() {
        m3.d dVar = new m3.d();
        this.f208w = dVar;
        this.f209x = 1.0f;
        this.f210y = true;
        this.f211z = false;
        new HashSet();
        this.A = new ArrayList<>();
        e eVar = new e();
        this.H = 255;
        this.K = true;
        this.L = false;
        dVar.addUpdateListener(eVar);
    }

    public final <T> void a(f3.e eVar, T t3, s1.s sVar) {
        float f2;
        if (this.G == null) {
            this.A.add(new d(eVar, t3, sVar));
            return;
        }
        f3.f fVar = eVar.f14776b;
        boolean z10 = true;
        if (fVar != null) {
            fVar.d(sVar, t3);
        } else {
            ArrayList arrayList = new ArrayList();
            this.G.a(eVar, 0, arrayList, new f3.e(new String[0]));
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((f3.e) arrayList.get(i6)).f14776b.d(sVar, t3);
            }
            z10 = true ^ arrayList.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t3 == o.A) {
                m3.d dVar = this.f208w;
                a3.c cVar = dVar.D;
                if (cVar == null) {
                    f2 = 0.0f;
                } else {
                    float f10 = dVar.f24796z;
                    float f11 = cVar.f185k;
                    f2 = (f10 - f11) / (cVar.f186l - f11);
                }
                o(f2);
            }
        }
    }

    public final void b() {
        a3.c cVar = this.f207v;
        c.a aVar = k3.o.f22798a;
        Rect rect = cVar.f184j;
        i3.e eVar = new i3.e(Collections.emptyList(), cVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new g3.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false);
        a3.c cVar2 = this.f207v;
        this.G = new i3.c(this, eVar, cVar2.f183i, cVar2);
    }

    public final void c() {
        m3.d dVar = this.f208w;
        if (dVar.E) {
            dVar.cancel();
        }
        this.f207v = null;
        this.G = null;
        this.C = null;
        dVar.D = null;
        dVar.B = -2.1474836E9f;
        dVar.C = 2.1474836E9f;
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        float f2;
        float f10;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        ImageView.ScaleType scaleType2 = this.B;
        Matrix matrix = this.f206u;
        int i6 = -1;
        if (scaleType == scaleType2) {
            if (this.G != null) {
                Rect bounds = getBounds();
                float width = bounds.width() / this.f207v.f184j.width();
                float height = bounds.height() / this.f207v.f184j.height();
                if (this.K) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f10 = 1.0f / min;
                        width /= f10;
                        height /= f10;
                    } else {
                        f10 = 1.0f;
                    }
                    if (f10 > 1.0f) {
                        i6 = canvas.save();
                        float width2 = bounds.width() / 2.0f;
                        float height2 = bounds.height() / 2.0f;
                        float f11 = width2 * min;
                        float f12 = min * height2;
                        canvas.translate(width2 - f11, height2 - f12);
                        canvas.scale(f10, f10, f11, f12);
                    }
                }
                matrix.reset();
                matrix.preScale(width, height);
                this.G.g(canvas, matrix, this.H);
                if (i6 > 0) {
                    canvas.restoreToCount(i6);
                }
            }
        } else if (this.G != null) {
            float f13 = this.f209x;
            float min2 = Math.min(canvas.getWidth() / this.f207v.f184j.width(), canvas.getHeight() / this.f207v.f184j.height());
            if (f13 > min2) {
                f2 = this.f209x / min2;
            } else {
                min2 = f13;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i6 = canvas.save();
                float width3 = this.f207v.f184j.width() / 2.0f;
                float height3 = this.f207v.f184j.height() / 2.0f;
                float f14 = width3 * min2;
                float f15 = height3 * min2;
                float f16 = this.f209x;
                canvas.translate((width3 * f16) - f14, (f16 * height3) - f15);
                canvas.scale(f2, f2, f14, f15);
            }
            matrix.reset();
            matrix.preScale(min2, min2);
            this.G.g(canvas, matrix, this.H);
            if (i6 > 0) {
                canvas.restoreToCount(i6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.L = false;
        if (this.f211z) {
            try {
                d(canvas);
            } catch (Throwable unused) {
                m3.c.f24792a.getClass();
            }
        } else {
            d(canvas);
        }
        hc.d.s();
    }

    public final void e() {
        float c10;
        float b10;
        if (this.G == null) {
            this.A.add(new f());
            return;
        }
        boolean z10 = this.f210y;
        m3.d dVar = this.f208w;
        if (z10 || dVar.getRepeatCount() == 0) {
            dVar.E = true;
            boolean d10 = dVar.d();
            Iterator it = dVar.f24790v.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, d10);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            if (dVar.d()) {
                c10 = dVar.b();
            } else {
                c10 = dVar.c();
            }
            dVar.f((int) c10);
            dVar.f24795y = 0L;
            dVar.A = 0;
            if (dVar.E) {
                dVar.e(false);
                Choreographer.getInstance().postFrameCallback(dVar);
            }
        }
        if (!this.f210y) {
            if (dVar.f24793w < 0.0f) {
                b10 = dVar.c();
            } else {
                b10 = dVar.b();
            }
            g((int) b10);
            dVar.e(true);
            dVar.a(dVar.d());
        }
    }

    public final void f() {
        float b10;
        if (this.G == null) {
            this.A.add(new g());
            return;
        }
        boolean z10 = this.f210y;
        m3.d dVar = this.f208w;
        if (z10 || dVar.getRepeatCount() == 0) {
            dVar.E = true;
            dVar.e(false);
            Choreographer.getInstance().postFrameCallback(dVar);
            dVar.f24795y = 0L;
            if (dVar.d() && dVar.f24796z == dVar.c()) {
                dVar.f24796z = dVar.b();
            } else if (!dVar.d() && dVar.f24796z == dVar.b()) {
                dVar.f24796z = dVar.c();
            }
        }
        if (!this.f210y) {
            if (dVar.f24793w < 0.0f) {
                b10 = dVar.c();
            } else {
                b10 = dVar.b();
            }
            g((int) b10);
            dVar.e(true);
            dVar.a(dVar.d());
        }
    }

    public final void g(int i6) {
        if (this.f207v == null) {
            this.A.add(new b(i6));
        } else {
            this.f208w.f(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            return -1;
        }
        return (int) (cVar.f184j.height() * this.f209x);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            return -1;
        }
        return (int) (cVar.f184j.width() * this.f209x);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i6) {
        if (this.f207v == null) {
            this.A.add(new C0006j(i6));
            return;
        }
        m3.d dVar = this.f208w;
        dVar.h(dVar.B, i6 + 0.99f);
    }

    public final void i(String str) {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            this.A.add(new m(str));
            return;
        }
        f3.h c10 = cVar.c(str);
        if (c10 != null) {
            h((int) (c10.f14780b + c10.f14781c));
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.L) {
            return;
        }
        this.L = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        m3.d dVar = this.f208w;
        if (dVar == null) {
            return false;
        }
        return dVar.E;
    }

    public final void j(float f2) {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            this.A.add(new k(f2));
            return;
        }
        float f10 = cVar.f185k;
        float f11 = cVar.f186l;
        PointF pointF = m3.f.f24798a;
        h((int) defpackage.e.e(f11, f10, f2, f10));
    }

    public final void k(String str) {
        a3.c cVar = this.f207v;
        ArrayList<n> arrayList = this.A;
        if (cVar == null) {
            arrayList.add(new a(str));
            return;
        }
        f3.h c10 = cVar.c(str);
        if (c10 != null) {
            int i6 = (int) c10.f14780b;
            int i10 = ((int) c10.f14781c) + i6;
            if (this.f207v == null) {
                arrayList.add(new a3.k(this, i6, i10));
                return;
            }
            this.f208w.h(i6, i10 + 0.99f);
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("Cannot find marker with name ", str, "."));
    }

    public final void l(int i6) {
        if (this.f207v == null) {
            this.A.add(new h(i6));
            return;
        }
        m3.d dVar = this.f208w;
        dVar.h(i6, (int) dVar.C);
    }

    public final void m(String str) {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            this.A.add(new l(str));
            return;
        }
        f3.h c10 = cVar.c(str);
        if (c10 != null) {
            l((int) c10.f14780b);
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("Cannot find marker with name ", str, "."));
    }

    public final void n(float f2) {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            this.A.add(new i(f2));
            return;
        }
        float f10 = cVar.f185k;
        float f11 = cVar.f186l;
        PointF pointF = m3.f.f24798a;
        l((int) defpackage.e.e(f11, f10, f2, f10));
    }

    public final void o(float f2) {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            this.A.add(new c(f2));
            return;
        }
        float f10 = cVar.f185k;
        float f11 = cVar.f186l;
        PointF pointF = m3.f.f24798a;
        this.f208w.f(defpackage.e.e(f11, f10, f2, f10));
        hc.d.s();
    }

    public final void p() {
        a3.c cVar = this.f207v;
        if (cVar == null) {
            return;
        }
        float f2 = this.f209x;
        setBounds(0, 0, (int) (cVar.f184j.width() * f2), (int) (this.f207v.f184j.height() * f2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.H = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        m3.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A.clear();
        m3.d dVar = this.f208w;
        dVar.e(true);
        dVar.a(dVar.d());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
