package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int K = ViewConfiguration.getTapTimeout();
    public int A;
    public int B;
    public final float[] C;
    public final float[] D;
    public final float[] E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: u  reason: collision with root package name */
    public final C0028a f1972u;

    /* renamed from: v  reason: collision with root package name */
    public final AccelerateInterpolator f1973v;

    /* renamed from: w  reason: collision with root package name */
    public final View f1974w;

    /* renamed from: x  reason: collision with root package name */
    public b f1975x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f1976y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f1977z;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028a {

        /* renamed from: a  reason: collision with root package name */
        public int f1978a;

        /* renamed from: b  reason: collision with root package name */
        public int f1979b;

        /* renamed from: c  reason: collision with root package name */
        public float f1980c;

        /* renamed from: d  reason: collision with root package name */
        public float f1981d;

        /* renamed from: h  reason: collision with root package name */
        public float f1984h;

        /* renamed from: i  reason: collision with root package name */
        public int f1985i;

        /* renamed from: e  reason: collision with root package name */
        public long f1982e = Long.MIN_VALUE;

        /* renamed from: g  reason: collision with root package name */
        public long f1983g = -1;
        public long f = 0;

        public final float a(long j10) {
            long j11 = this.f1982e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f1983g;
            if (j12 >= 0 && j10 >= j12) {
                float f = this.f1984h;
                return (a.b(((float) (j10 - j12)) / this.f1985i, 0.0f, 1.0f) * f) + (1.0f - f);
            }
            return a.b(((float) (j10 - j11)) / this.f1978a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (!aVar.I) {
                return;
            }
            boolean z11 = aVar.G;
            C0028a c0028a = aVar.f1972u;
            if (z11) {
                aVar.G = false;
                c0028a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0028a.f1982e = currentAnimationTimeMillis;
                c0028a.f1983g = -1L;
                c0028a.f = currentAnimationTimeMillis;
                c0028a.f1984h = 0.5f;
            }
            if (c0028a.f1983g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0028a.f1983g + c0028a.f1985i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && aVar.e()) {
                boolean z12 = aVar.H;
                View view = aVar.f1974w;
                if (z12) {
                    aVar.H = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0028a.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0028a.a(currentAnimationTimeMillis2);
                    c0028a.f = currentAnimationTimeMillis2;
                    ListView listView = ((h) aVar).L;
                    i.b(listView, (int) (((float) (currentAnimationTimeMillis2 - c0028a.f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0028a.f1981d));
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.I = false;
        }
    }

    public a(View view) {
        C0028a c0028a = new C0028a();
        this.f1972u = c0028a;
        this.f1973v = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1976y = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1977z = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.C = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.D = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.E = fArr5;
        this.f1974w = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f10 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.A = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.B = K;
        c0028a.f1978a = 500;
        c0028a.f1979b = 500;
    }

    public static float b(float f, float f2, float f10) {
        if (f > f10) {
            return f10;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i6, float f, float f2, float f10) {
        float f11;
        float interpolation;
        int i10;
        float b10 = b(this.f1976y[i6] * f2, 0.0f, this.f1977z[i6]);
        float c10 = c(f2 - f, b10) - c(f, b10);
        AccelerateInterpolator accelerateInterpolator = this.f1973v;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else if (c10 > 0.0f) {
            interpolation = accelerateInterpolator.getInterpolation(c10);
        } else {
            f11 = 0.0f;
            i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                return 0.0f;
            }
            float f12 = this.C[i6];
            float f13 = this.D[i6];
            float f14 = this.E[i6];
            float f15 = f12 * f10;
            if (i10 > 0) {
                return b(f11 * f15, f13, f14);
            }
            return -b((-f11) * f15, f13, f14);
        }
        f11 = b(interpolation, -1.0f, 1.0f);
        i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.A;
        if (i6 != 0 && i6 != 1) {
            if (i6 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.I && i6 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i6 = 0;
        if (this.G) {
            this.I = false;
            return;
        }
        C0028a c0028a = this.f1972u;
        c0028a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - c0028a.f1982e);
        int i11 = c0028a.f1979b;
        if (i10 > i11) {
            i6 = i11;
        } else if (i10 >= 0) {
            i6 = i10;
        }
        c0028a.f1985i = i6;
        c0028a.f1984h = c0028a.a(currentAnimationTimeMillis);
        c0028a.f1983g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean z10;
        C0028a c0028a = this.f1972u;
        float f = c0028a.f1981d;
        int abs = (int) (f / Math.abs(f));
        float f2 = c0028a.f1980c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs == 0) {
            return false;
        }
        ListView listView = ((h) this).L;
        int count = listView.getCount();
        if (count != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i6 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i6 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                z10 = true;
                if (z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i6;
        if (!this.J) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.H = true;
        this.F = false;
        View view2 = this.f1974w;
        float a10 = a(0, motionEvent.getX(), view.getWidth(), view2.getWidth());
        float a11 = a(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
        C0028a c0028a = this.f1972u;
        c0028a.f1980c = a10;
        c0028a.f1981d = a11;
        if (!this.I && e()) {
            if (this.f1975x == null) {
                this.f1975x = new b();
            }
            this.I = true;
            this.G = true;
            if (!this.F && (i6 = this.B) > 0) {
                b bVar = this.f1975x;
                long j10 = i6;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.n(view2, bVar, j10);
            } else {
                this.f1975x.run();
            }
            this.F = true;
        }
        return false;
    }
}
