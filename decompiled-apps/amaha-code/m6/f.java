package m6;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import m6.b;
/* compiled from: TapTargetView.java */
/* loaded from: classes.dex */
public final class f extends View {
    public final int A;
    public final ValueAnimator A0;
    public final int B;
    public final ValueAnimator B0;
    public final int C;
    public final ValueAnimator[] C0;
    public final int D;
    public final m6.g D0;
    public final int E;
    public final int F;
    public final ViewManager G;
    public final m6.c H;
    public final Rect I;
    public final TextPaint J;
    public final TextPaint K;
    public final Paint L;
    public final Paint M;
    public final Paint N;
    public final CharSequence O;
    public StaticLayout P;
    public final CharSequence Q;
    public StaticLayout R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public SpannableStringBuilder f24870a0;

    /* renamed from: b0  reason: collision with root package name */
    public DynamicLayout f24871b0;
    public TextPaint c0;

    /* renamed from: d0  reason: collision with root package name */
    public Paint f24872d0;
    public final Rect e0;

    /* renamed from: f0  reason: collision with root package name */
    public Rect f24873f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Path f24874g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f24875h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f24876i0;

    /* renamed from: j0  reason: collision with root package name */
    public int[] f24877j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f24878k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f24879l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f24880m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f24881n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f24882o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f24883p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f24884q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f24885r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f24886s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f24887t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f24888u;

    /* renamed from: u0  reason: collision with root package name */
    public int f24889u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f24890v;

    /* renamed from: v0  reason: collision with root package name */
    public Bitmap f24891v0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f24892w;

    /* renamed from: w0  reason: collision with root package name */
    public final i f24893w0;

    /* renamed from: x  reason: collision with root package name */
    public final int f24894x;

    /* renamed from: x0  reason: collision with root package name */
    public final a f24895x0;

    /* renamed from: y  reason: collision with root package name */
    public final int f24896y;

    /* renamed from: y0  reason: collision with root package name */
    public final ValueAnimator f24897y0;

    /* renamed from: z  reason: collision with root package name */
    public final int f24898z;

    /* renamed from: z0  reason: collision with root package name */
    public final ValueAnimator f24899z0;

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class a implements b.c {
        public a() {
        }

        @Override // m6.b.c
        public final void a(float f) {
            boolean z10;
            float f2;
            f fVar = f.this;
            float f10 = fVar.f24876i0 * f;
            if (f10 > fVar.f24875h0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                fVar.a();
            }
            fVar.H.getClass();
            fVar.f24875h0 = f10;
            float f11 = 1.5f * f;
            fVar.f24878k0 = (int) Math.min(244.79999f, f11 * 244.79999f);
            Path path = fVar.f24874g0;
            path.reset();
            int[] iArr = fVar.f24877j0;
            path.addCircle(iArr[0], iArr[1], fVar.f24875h0, Path.Direction.CW);
            fVar.f24882o0 = (int) Math.min(255.0f, f11 * 255.0f);
            int i6 = fVar.f24896y;
            if (z10) {
                fVar.f24881n0 = Math.min(1.0f, f11) * i6;
            } else {
                fVar.f24881n0 = i6 * f;
                fVar.f24879l0 *= f;
            }
            if (f < 0.7f) {
                f2 = 0.0f;
            } else {
                f2 = (f - 0.7f) / 0.3f;
            }
            fVar.f24883p0 = (int) (f2 * 255.0f);
            if (z10) {
                fVar.a();
            }
            fVar.invalidate(fVar.e0);
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0403b {
        public b() {
        }

        @Override // m6.b.InterfaceC0403b
        public final void a() {
            f fVar = f.this;
            fVar.f24899z0.start();
            fVar.f24892w = true;
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class c implements b.c {
        public c() {
        }

        @Override // m6.b.c
        public final void a(float f) {
            f.this.f24895x0.a(f);
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class d implements b.c {
        public d() {
        }

        @Override // m6.b.c
        public final void a(float f) {
            float f2;
            float f10;
            f fVar = f.this;
            fVar.getClass();
            int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            if (i6 < 0) {
                f2 = 0.0f;
            } else {
                f2 = (f - 0.5f) / 0.5f;
            }
            float f11 = fVar.f24896y;
            fVar.f24879l0 = (f2 + 1.0f) * f11;
            fVar.f24880m0 = (int) ((1.0f - f2) * 255.0f);
            if (i6 < 0) {
                f10 = f / 0.5f;
            } else {
                f10 = (1.0f - f) / 0.5f;
            }
            fVar.f24881n0 = (f10 * fVar.f24898z) + f11;
            float f12 = fVar.f24875h0;
            float f13 = fVar.f24876i0;
            if (f12 != f13) {
                fVar.f24875h0 = f13;
            }
            fVar.a();
            fVar.invalidate(fVar.e0);
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0403b {
        public e() {
        }

        @Override // m6.b.InterfaceC0403b
        public final void a() {
            f fVar = f.this;
            fVar.e();
            ViewManager viewManager = fVar.G;
            if (viewManager != null) {
                try {
                    viewManager.removeView(fVar);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: TapTargetView.java */
    /* renamed from: m6.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0404f implements b.c {
        public C0404f() {
        }

        @Override // m6.b.c
        public final void a(float f) {
            f.this.f24895x0.a(f);
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class g implements b.InterfaceC0403b {
        public g() {
        }

        @Override // m6.b.InterfaceC0403b
        public final void a() {
            f fVar = f.this;
            fVar.e();
            ViewManager viewManager = fVar.G;
            if (viewManager != null) {
                try {
                    viewManager.removeView(fVar);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public class h implements b.c {
        public h() {
        }

        @Override // m6.b.c
        public final void a(float f) {
            float min = Math.min(1.0f, 2.0f * f);
            f fVar = f.this;
            fVar.f24875h0 = ((0.2f * min) + 1.0f) * fVar.f24876i0;
            float f2 = 1.0f - min;
            fVar.H.getClass();
            fVar.f24878k0 = (int) (0.96f * f2 * 255.0f);
            Path path = fVar.f24874g0;
            path.reset();
            int[] iArr = fVar.f24877j0;
            path.addCircle(iArr[0], iArr[1], fVar.f24875h0, Path.Direction.CW);
            float f10 = 1.0f - f;
            float f11 = fVar.f24896y;
            fVar.f24881n0 = f11 * f10;
            fVar.f24882o0 = (int) (f10 * 255.0f);
            fVar.f24879l0 = (f + 1.0f) * f11;
            fVar.f24880m0 = (int) (f10 * fVar.f24880m0);
            fVar.f24883p0 = (int) (f2 * 255.0f);
            fVar.a();
            fVar.invalidate(fVar.e0);
        }
    }

    /* compiled from: TapTargetView.java */
    /* loaded from: classes.dex */
    public static class i {
        public void a(f fVar) {
            fVar.b(true);
        }
    }

    public f(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, j jVar, i iVar) {
        super(context);
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f24888u = false;
        this.f24890v = false;
        this.f24892w = true;
        this.f24895x0 = new a();
        m6.b bVar = new m6.b(false);
        ValueAnimator valueAnimator = bVar.f24858a;
        valueAnimator.setDuration(250L);
        valueAnimator.setStartDelay(250L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new m6.a(new c()));
        bVar.f24859b = new b();
        ValueAnimator a10 = bVar.a();
        this.f24897y0 = a10;
        m6.b bVar2 = new m6.b(false);
        ValueAnimator valueAnimator2 = bVar2.f24858a;
        valueAnimator2.setDuration(1000L);
        valueAnimator2.setRepeatCount(-1);
        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator2.addUpdateListener(new m6.a(new d()));
        ValueAnimator a11 = bVar2.a();
        this.f24899z0 = a11;
        m6.b bVar3 = new m6.b(true);
        ValueAnimator valueAnimator3 = bVar3.f24858a;
        valueAnimator3.setDuration(250L);
        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator3.addUpdateListener(new m6.a(new C0404f()));
        bVar3.f24859b = new e();
        ValueAnimator a12 = bVar3.a();
        this.A0 = a12;
        m6.b bVar4 = new m6.b(false);
        ValueAnimator valueAnimator4 = bVar4.f24858a;
        valueAnimator4.setDuration(250L);
        valueAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator4.addUpdateListener(new m6.a(new h()));
        bVar4.f24859b = new g();
        ValueAnimator a13 = bVar4.a();
        this.B0 = a13;
        this.C0 = new ValueAnimator[]{a10, a11, a13, a12};
        this.H = jVar;
        this.G = viewGroup;
        this.f24893w0 = iVar;
        this.O = jVar.f24861a;
        this.Q = jVar.f24862b;
        this.f24894x = m6.h.a(20, context);
        this.E = m6.h.a(40, context);
        int a14 = m6.h.a(44, context);
        this.f24896y = a14;
        this.A = m6.h.a(40, context);
        this.B = m6.h.a(8, context);
        this.C = m6.h.a(360, context);
        this.D = m6.h.a(20, context);
        this.F = m6.h.a(88, context);
        m6.h.a(8, context);
        int a15 = m6.h.a(1, context);
        this.f24898z = (int) (a14 * 0.1f);
        this.f24874g0 = new Path();
        this.I = new Rect();
        this.e0 = new Rect();
        TextPaint textPaint = new TextPaint();
        this.J = textPaint;
        textPaint.setTextSize((int) TypedValue.applyDimension(2, jVar.f, context.getResources().getDisplayMetrics()));
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.K = textPaint2;
        textPaint2.setTextSize((int) TypedValue.applyDimension(2, jVar.f24866g, context.getResources().getDisplayMetrics()));
        textPaint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        textPaint2.setAntiAlias(true);
        textPaint2.setAlpha(137);
        Paint paint = new Paint();
        this.L = paint;
        paint.setAntiAlias(true);
        paint.setAlpha((int) 244.79999f);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setAlpha(50);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(a15);
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.M = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.N = paint4;
        paint4.setAntiAlias(true);
        this.U = true;
        this.V = jVar.f24867h;
        setLayerType(2, null);
        Resources.Theme theme = context.getTheme();
        if (m6.h.b(context, "isLightTheme") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = z10;
        Integer a16 = m6.c.a(context, jVar.f24865e);
        if (a16 != null) {
            paint.setColor(a16.intValue());
        } else if (theme != null) {
            paint.setColor(m6.h.b(context, "colorPrimary"));
        } else {
            paint.setColor(-1);
        }
        Integer a17 = m6.c.a(context, -1);
        if (a17 != null) {
            paint3.setColor(a17.intValue());
        } else {
            if (this.S) {
                i6 = -16777216;
            } else {
                i6 = -1;
            }
            paint3.setColor(i6);
        }
        paint4.setColor(paint3.getColor());
        Integer a18 = m6.c.a(context, -1);
        if (a18 != null) {
            int intValue = a18.intValue();
            this.f24884q0 = (intValue & 16777215) | (((int) ((intValue >>> 24) * 0.3f)) << 24);
        } else {
            this.f24884q0 = -1;
        }
        Integer a19 = m6.c.a(context, -1);
        if (a19 != null) {
            textPaint.setColor(a19.intValue());
        } else {
            textPaint.setColor(this.S ? -16777216 : -1);
        }
        Integer a20 = m6.c.a(context, -1);
        if (a20 != null) {
            textPaint2.setColor(a20.intValue());
        } else {
            textPaint2.setColor(textPaint.getColor());
        }
        if (context instanceof Activity) {
            int i10 = ((Activity) context).getWindow().getAttributes().flags;
            if ((67108864 & i10) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((134217728 & i10) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = (i10 & 512) != 0;
            z12 = z15;
            z11 = z14;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
        }
        m6.g gVar = new m6.g(this, jVar, viewGroup2, context, z11, z12, z13);
        this.D0 = gVar;
        getViewTreeObserver().addOnGlobalLayoutListener(gVar);
        setFocusableInTouchMode(true);
        setClickable(true);
        setOnClickListener(new m6.d(this));
        setOnLongClickListener(new m6.e(this));
    }

    public static double c(int i6, int i10, int i11, int i12) {
        return Math.sqrt(Math.pow(i12 - i10, 2.0d) + Math.pow(i11 - i6, 2.0d));
    }

    public static int d(Rect rect, int i6, int i10) {
        return (int) Math.max(c(i6, i10, rect.left, rect.top), Math.max(c(i6, i10, rect.right, rect.top), Math.max(c(i6, i10, rect.left, rect.bottom), c(i6, i10, rect.right, rect.bottom))));
    }

    public static void f(Activity activity, j jVar, i iVar) {
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            viewGroup.addView(new f(activity, viewGroup, (ViewGroup) viewGroup.findViewById(16908290), jVar, iVar), new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        throw new IllegalArgumentException("Activity is null");
    }

    public final void a() {
        int[] iArr = this.f24877j0;
        if (iArr == null) {
            return;
        }
        Rect rect = this.e0;
        rect.left = (int) Math.max(0.0f, iArr[0] - this.f24875h0);
        rect.top = (int) Math.min(0.0f, this.f24877j0[1] - this.f24875h0);
        float f = this.f24877j0[0] + this.f24875h0;
        int i6 = this.E;
        rect.right = (int) Math.min(getWidth(), f + i6);
        rect.bottom = (int) Math.min(getHeight(), this.f24877j0[1] + this.f24875h0 + i6);
    }

    public final void b(boolean z10) {
        this.f24890v = true;
        this.f24899z0.cancel();
        this.f24897y0.cancel();
        if (this.W && this.f24877j0 != null) {
            if (z10) {
                this.B0.start();
                return;
            } else {
                this.A0.start();
                return;
            }
        }
        e();
        ViewManager viewManager = this.G;
        if (viewManager != null) {
            try {
                viewManager.removeView(this);
            } catch (Exception unused) {
            }
        }
    }

    public final void e() {
        ValueAnimator[] valueAnimatorArr;
        if (this.f24888u) {
            return;
        }
        this.f24890v = false;
        this.f24888u = true;
        for (ValueAnimator valueAnimator : this.C0) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.D0);
        this.W = false;
    }

    public int[] getOuterCircleCenterPoint() {
        boolean z10;
        boolean z11;
        int height;
        int centerY;
        Rect rect = this.I;
        int centerY2 = rect.centerY();
        int i6 = this.f24889u0;
        int i10 = this.F;
        if (i6 <= 0 ? !(centerY2 < i10 || centerY2 > getHeight() - i10) : !(centerY2 < i10 || centerY2 > i6 - i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new int[]{rect.centerX(), rect.centerY()};
        }
        int i11 = this.f24894x;
        int max = (Math.max(rect.width(), rect.height()) / 2) + i11;
        int totalTextHeight = getTotalTextHeight();
        int centerY3 = rect.centerY();
        int i12 = this.f24896y;
        if (((centerY3 - i12) - i11) - totalTextHeight > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(this.f24873f0.left, rect.left - max);
        int max2 = Math.max(this.f24873f0.right, rect.right + max);
        StaticLayout staticLayout = this.P;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight();
        }
        if (z11) {
            centerY = ((rect.centerY() - i12) - i11) - totalTextHeight;
        } else {
            centerY = rect.centerY() + i12 + i11;
        }
        return new int[]{(min + max2) / 2, centerY + height};
    }

    public Rect getTextBounds() {
        int totalTextHeight = getTotalTextHeight();
        int totalTextWidth = getTotalTextWidth();
        Rect rect = this.I;
        int centerY = rect.centerY();
        int i6 = this.f24896y;
        int i10 = this.f24894x;
        int i11 = ((centerY - i6) - i10) - totalTextHeight;
        if (i11 <= this.f24887t0) {
            i11 = rect.centerY() + i6 + i10;
        }
        int width = (getWidth() / 2) - rect.centerX();
        int i12 = this.D;
        if (width < 0) {
            i12 = -i12;
        }
        int i13 = this.A;
        int max = Math.max(i13, (rect.centerX() - i12) - totalTextWidth);
        return new Rect(max, i11, Math.min(getWidth() - i13, totalTextWidth + max), totalTextHeight + i11);
    }

    public int getTotalTextHeight() {
        StaticLayout staticLayout = this.P;
        if (staticLayout == null) {
            return 0;
        }
        StaticLayout staticLayout2 = this.R;
        int i6 = this.B;
        if (staticLayout2 == null) {
            return staticLayout.getHeight() + i6;
        }
        return this.R.getHeight() + staticLayout.getHeight() + i6;
    }

    public int getTotalTextWidth() {
        StaticLayout staticLayout = this.P;
        if (staticLayout == null) {
            return 0;
        }
        if (this.R == null) {
            return staticLayout.getWidth();
        }
        return Math.max(staticLayout.getWidth(), this.R.getWidth());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        if (!this.f24888u && this.f24877j0 != null) {
            int i6 = this.f24887t0;
            if (i6 > 0 && this.f24889u0 > 0) {
                canvas.clipRect(0, i6, getWidth(), this.f24889u0);
            }
            int i10 = this.f24884q0;
            if (i10 != -1) {
                canvas.drawColor(i10);
            }
            Paint paint = this.L;
            paint.setAlpha(this.f24878k0);
            int[] iArr = this.f24877j0;
            canvas.drawCircle(iArr[0], iArr[1], this.f24875h0, paint);
            Paint paint2 = this.M;
            paint2.setAlpha(this.f24882o0);
            int i11 = this.f24880m0;
            Rect rect = this.I;
            if (i11 > 0) {
                Paint paint3 = this.N;
                paint3.setAlpha(i11);
                canvas.drawCircle(rect.centerX(), rect.centerY(), this.f24879l0, paint3);
            }
            canvas.drawCircle(rect.centerX(), rect.centerY(), this.f24881n0, paint2);
            int save = canvas.save();
            Rect rect2 = this.f24873f0;
            canvas.translate(rect2.left, rect2.top);
            this.J.setAlpha(this.f24883p0);
            StaticLayout staticLayout2 = this.P;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            StaticLayout staticLayout3 = this.R;
            m6.c cVar = this.H;
            if (staticLayout3 != null && (staticLayout = this.P) != null) {
                canvas.translate(0.0f, staticLayout.getHeight() + this.B);
                TextPaint textPaint = this.K;
                cVar.getClass();
                textPaint.setAlpha((int) (this.f24883p0 * 0.54f));
                this.R.draw(canvas);
            }
            canvas.restoreToCount(save);
            int save2 = canvas.save();
            if (this.f24891v0 != null) {
                canvas.translate(rect.centerX() - (this.f24891v0.getWidth() / 2), rect.centerY() - (this.f24891v0.getHeight() / 2));
                canvas.drawBitmap(this.f24891v0, 0.0f, 0.0f, paint2);
            } else if (cVar.f24864d != null) {
                canvas.translate(rect.centerX() - (cVar.f24864d.getBounds().width() / 2), rect.centerY() - (cVar.f24864d.getBounds().height() / 2));
                cVar.f24864d.setAlpha(paint2.getAlpha());
                cVar.f24864d.draw(canvas);
            }
            canvas.restoreToCount(save2);
            if (this.T) {
                if (this.f24872d0 == null) {
                    Paint paint4 = new Paint();
                    this.f24872d0 = paint4;
                    paint4.setARGB(255, 255, 0, 0);
                    this.f24872d0.setStyle(Paint.Style.STROKE);
                    this.f24872d0.setStrokeWidth(m6.h.a(1, getContext()));
                }
                if (this.c0 == null) {
                    TextPaint textPaint2 = new TextPaint();
                    this.c0 = textPaint2;
                    textPaint2.setColor(-65536);
                    this.c0.setTextSize((int) TypedValue.applyDimension(2, 16, getContext().getResources().getDisplayMetrics()));
                }
                this.f24872d0.setStyle(Paint.Style.STROKE);
                canvas.drawRect(this.f24873f0, this.f24872d0);
                canvas.drawRect(rect, this.f24872d0);
                int[] iArr2 = this.f24877j0;
                canvas.drawCircle(iArr2[0], iArr2[1], 10.0f, this.f24872d0);
                int[] iArr3 = this.f24877j0;
                canvas.drawCircle(iArr3[0], iArr3[1], this.f24876i0 - this.E, this.f24872d0);
                canvas.drawCircle(rect.centerX(), rect.centerY(), this.f24896y + this.f24894x, this.f24872d0);
                this.f24872d0.setStyle(Paint.Style.FILL);
                String str = "Text bounds: " + this.f24873f0.toShortString() + "\nTarget bounds: " + rect.toShortString() + "\nCenter: " + this.f24877j0[0] + " " + this.f24877j0[1] + "\nView size: " + getWidth() + " " + getHeight() + "\nTarget bounds: " + rect.toShortString();
                SpannableStringBuilder spannableStringBuilder = this.f24870a0;
                if (spannableStringBuilder == null) {
                    this.f24870a0 = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.clear();
                    this.f24870a0.append((CharSequence) str);
                }
                if (this.f24871b0 == null) {
                    this.f24871b0 = new DynamicLayout(str, this.c0, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                int save3 = canvas.save();
                this.f24872d0.setARGB(220, 0, 0, 0);
                canvas.translate(0.0f, this.f24887t0);
                canvas.drawRect(0.0f, 0.0f, this.f24871b0.getWidth(), this.f24871b0.getHeight(), this.f24872d0);
                this.f24872d0.setARGB(255, 255, 0, 0);
                this.f24871b0.draw(canvas);
                canvas.restoreToCount(save3);
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z10;
        if (!this.f24888u && this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !this.V || i6 != 4) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        boolean z10;
        if (!this.f24888u && this.W) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !this.f24892w || !this.V || i6 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        this.f24892w = false;
        if (this.f24893w0 != null) {
            b(false);
        } else {
            new i();
            b(false);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f24885r0 = motionEvent.getX();
        this.f24886s0 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setDrawDebug(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            postInvalidate();
        }
    }
}
