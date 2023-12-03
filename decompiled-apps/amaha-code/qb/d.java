package qb;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.appsflyer.R;
import java.util.WeakHashMap;
import qb.p;
import r0.f;
import t0.d0;
import t0.o0;
import ub.a;
/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes.dex */
public final class d {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public ub.a D;
    public ub.a E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f29413a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f29414a0;

    /* renamed from: b  reason: collision with root package name */
    public float f29415b;

    /* renamed from: b0  reason: collision with root package name */
    public float f29416b0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f29417c;
    public float c0;

    /* renamed from: d  reason: collision with root package name */
    public float f29418d;

    /* renamed from: d0  reason: collision with root package name */
    public float f29419d0;

    /* renamed from: e  reason: collision with root package name */
    public float f29420e;
    public ColorStateList e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public float f29421f0;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f29422g;

    /* renamed from: g0  reason: collision with root package name */
    public float f29423g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f29424h;

    /* renamed from: h0  reason: collision with root package name */
    public float f29425h0;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f29426i;

    /* renamed from: i0  reason: collision with root package name */
    public StaticLayout f29427i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f29429j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f29431k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f29433l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f29435m0;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f29436n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f29438o;

    /* renamed from: p  reason: collision with root package name */
    public int f29440p;

    /* renamed from: q  reason: collision with root package name */
    public float f29442q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public float f29444s;

    /* renamed from: t  reason: collision with root package name */
    public float f29445t;

    /* renamed from: u  reason: collision with root package name */
    public float f29446u;

    /* renamed from: v  reason: collision with root package name */
    public float f29447v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f29448w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f29449x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f29450y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f29451z;

    /* renamed from: j  reason: collision with root package name */
    public int f29428j = 16;

    /* renamed from: k  reason: collision with root package name */
    public int f29430k = 16;

    /* renamed from: l  reason: collision with root package name */
    public float f29432l = 15.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f29434m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;

    /* renamed from: n0  reason: collision with root package name */
    public int f29437n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public float f29439o0 = 0.0f;

    /* renamed from: p0  reason: collision with root package name */
    public float f29441p0 = 1.0f;

    /* renamed from: q0  reason: collision with root package name */
    public int f29443q0 = p.f29487m;

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0567a {
        public a() {
        }

        @Override // ub.a.InterfaceC0567a
        public final void a(Typeface typeface) {
            d dVar = d.this;
            if (dVar.m(typeface)) {
                dVar.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0567a {
        public b() {
        }

        @Override // ub.a.InterfaceC0567a
        public final void a(Typeface typeface) {
            d dVar = d.this;
            if (dVar.o(typeface)) {
                dVar.i(false);
            }
        }
    }

    public d(View view) {
        this.f29413a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f29424h = new Rect();
        this.f29422g = new Rect();
        this.f29426i = new RectF();
        float f = this.f29418d;
        this.f29420e = defpackage.e.e(1.0f, f, 0.5f, f);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i6, int i10) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i10) * f) + (Color.alpha(i6) * f2)), Math.round((Color.red(i10) * f) + (Color.red(i6) * f2)), Math.round((Color.green(i10) * f) + (Color.green(i6) * f2)), Math.round((Color.blue(i10) * f) + (Color.blue(i6) * f2)));
    }

    public static float g(float f, float f2, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        LinearInterpolator linearInterpolator = ab.a.f449a;
        return defpackage.e.e(f2, f, f10, f);
    }

    public final boolean b(CharSequence charSequence) {
        f.d dVar;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        boolean z10 = true;
        if (d0.e.d(this.f29413a) != 1) {
            z10 = false;
        }
        if (this.J) {
            if (z10) {
                dVar = r0.f.f30180d;
            } else {
                dVar = r0.f.f30179c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f, boolean z10) {
        boolean z11;
        boolean z12;
        float f2;
        float f10;
        Typeface typeface;
        boolean z13;
        boolean z14;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z15;
        boolean z16;
        boolean z17;
        StaticLayout staticLayout2;
        boolean z18;
        boolean z19;
        if (this.G == null) {
            return;
        }
        float width = this.f29424h.width();
        float width2 = this.f29422g.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f2 = this.f29434m;
            f10 = this.f29421f0;
            this.L = 1.0f;
            typeface = this.f29448w;
        } else {
            float f11 = this.f29432l;
            float f12 = this.f29423g0;
            Typeface typeface2 = this.f29451z;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                this.L = 1.0f;
            } else {
                this.L = g(this.f29432l, this.f29434m, f, this.W) / this.f29432l;
            }
            float f13 = this.f29434m / this.f29432l;
            float f14 = width2 * f13;
            if (!z10 && f14 > width) {
                width = Math.min(width / f13, width2);
            } else {
                width = width2;
            }
            f2 = f11;
            f10 = f12;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (width > 0.0f) {
            if (this.M != f2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f29425h0 != f10) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.C != typeface) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.f29427i0 != null && width != staticLayout2.getWidth()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z15 && !z16 && !z18 && !z17 && !this.S) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.M = f2;
            this.f29425h0 = f10;
            this.C = typeface;
            this.S = false;
            if (this.L != 1.0f) {
                z19 = true;
            } else {
                z19 = false;
            }
            textPaint.setLinearText(z19);
        } else {
            z13 = false;
        }
        if (this.H == null || z13) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.f29425h0);
            boolean b10 = b(this.G);
            this.I = b10;
            int i6 = this.f29437n0;
            if (i6 > 1 && (!b10 || this.f29417c)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i6 = 1;
            }
            try {
                if (i6 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f29428j, b10 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.I) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.I) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                p pVar = new p(this.G, textPaint, (int) width);
                pVar.f29501l = this.F;
                pVar.f29500k = b10;
                pVar.f29495e = alignment;
                pVar.f29499j = false;
                pVar.f = i6;
                float f15 = this.f29439o0;
                float f16 = this.f29441p0;
                pVar.f29496g = f15;
                pVar.f29497h = f16;
                pVar.f29498i = this.f29443q0;
                staticLayout = pVar.a();
            } catch (p.a e10) {
                Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                staticLayout = null;
            }
            staticLayout.getClass();
            this.f29427i0 = staticLayout;
            this.H = staticLayout.getText();
        }
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.f29426i;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.T;
                textPaint.setTextSize(this.M);
                float f = this.f29446u;
                float f2 = this.f29447v;
                float f10 = this.L;
                if (f10 != 1.0f && !this.f29417c) {
                    canvas.scale(f10, f10, f, f2);
                }
                boolean z10 = true;
                if (this.f29437n0 <= 1 || (this.I && !this.f29417c)) {
                    z10 = false;
                }
                if (z10 && (!this.f29417c || this.f29415b > this.f29420e)) {
                    int alpha = textPaint.getAlpha();
                    canvas.translate(this.f29446u - this.f29427i0.getLineStart(0), f2);
                    float f11 = alpha;
                    textPaint.setAlpha((int) (this.f29433l0 * f11));
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 31) {
                        float f12 = this.N;
                        float f13 = this.O;
                        float f14 = this.P;
                        int i10 = this.Q;
                        textPaint.setShadowLayer(f12, f13, f14, j0.d.h(i10, (Color.alpha(i10) * textPaint.getAlpha()) / 255));
                    }
                    this.f29427i0.draw(canvas);
                    textPaint.setAlpha((int) (this.f29431k0 * f11));
                    if (i6 >= 31) {
                        float f15 = this.N;
                        float f16 = this.O;
                        float f17 = this.P;
                        int i11 = this.Q;
                        textPaint.setShadowLayer(f15, f16, f17, j0.d.h(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = this.f29427i0.getLineBaseline(0);
                    CharSequence charSequence = this.f29435m0;
                    float f18 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                    if (i6 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                    }
                    if (!this.f29417c) {
                        String trim = this.f29435m0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(this.f29427i0.getLineEnd(0), str.length()), 0.0f, f18, (Paint) textPaint);
                    }
                } else {
                    canvas.translate(f, f2);
                    this.f29427i0.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f29434m);
        textPaint.setTypeface(this.f29448w);
        textPaint.setLetterSpacing(this.f29421f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f29450y;
            if (typeface != null) {
                this.f29449x = ub.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = ub.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f29449x;
            if (typeface3 == null) {
                typeface3 = this.f29450y;
            }
            this.f29448w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f29451z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float f;
        float f2;
        int i6;
        float f10;
        float a10;
        StaticLayout staticLayout;
        View view = this.f29413a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.H;
            TextPaint textPaint = this.T;
            if (charSequence != null && (staticLayout = this.f29427i0) != null) {
                this.f29435m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
            }
            CharSequence charSequence2 = this.f29435m0;
            if (charSequence2 != null) {
                this.f29429j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f29429j0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f29430k, this.I ? 1 : 0);
            int i10 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Rect rect = this.f29424h;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.r = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.r = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f29445t = rect.left;
                } else {
                    this.f29445t = rect.right - this.f29429j0;
                }
            } else {
                this.f29445t = rect.centerX() - (this.f29429j0 / 2.0f);
            }
            c(0.0f, z10);
            StaticLayout staticLayout2 = this.f29427i0;
            if (staticLayout2 != null) {
                f = staticLayout2.getHeight();
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout3 = this.f29427i0;
            if (staticLayout3 != null && this.f29437n0 > 1) {
                f2 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.H;
                if (charSequence3 != null) {
                    f2 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f2 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f29427i0;
            if (staticLayout4 != null) {
                i6 = staticLayout4.getLineCount();
            } else {
                i6 = 0;
            }
            this.f29440p = i6;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f29428j, this.I ? 1 : 0);
            int i12 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Rect rect2 = this.f29422g;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f29442q = rect2.centerY() - (f / 2.0f);
                } else {
                    this.f29442q = textPaint.descent() + (rect2.bottom - f);
                }
            } else {
                this.f29442q = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f29444s = rect2.left;
                } else {
                    this.f29444s = rect2.right - f2;
                }
            } else {
                this.f29444s = rect2.centerX() - (f2 / 2.0f);
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.f29415b);
            float f11 = this.f29415b;
            boolean z11 = this.f29417c;
            RectF rectF = this.f29426i;
            if (z11) {
                if (f11 < this.f29420e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f11, this.V);
                rectF.top = g(this.f29442q, this.r, f11, this.V);
                rectF.right = g(rect2.right, rect.right, f11, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, f11, this.V);
            }
            if (this.f29417c) {
                if (f11 < this.f29420e) {
                    this.f29446u = this.f29444s;
                    this.f29447v = this.f29442q;
                    q(0.0f);
                    f10 = 0.0f;
                } else {
                    this.f29446u = this.f29445t;
                    this.f29447v = this.r - Math.max(0, this.f);
                    q(1.0f);
                    f10 = 1.0f;
                }
            } else {
                this.f29446u = g(this.f29444s, this.f29445t, f11, this.V);
                this.f29447v = g(this.f29442q, this.r, f11, this.V);
                q(f11);
                f10 = f11;
            }
            i1.b bVar = ab.a.f450b;
            this.f29431k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f11, bVar);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(view);
            this.f29433l0 = g(1.0f, 0.0f, f11, bVar);
            d0.d.k(view);
            ColorStateList colorStateList = this.f29438o;
            ColorStateList colorStateList2 = this.f29436n;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, f(colorStateList2), f(this.f29438o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f12 = this.f29421f0;
            float f13 = this.f29423g0;
            if (f12 != f13) {
                textPaint.setLetterSpacing(g(f13, f12, f11, bVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.N = g(this.f29416b0, this.X, f11, null);
            this.O = g(this.c0, this.Y, f11, null);
            this.P = g(this.f29419d0, this.Z, f11, null);
            int a11 = a(f11, f(this.e0), f(this.f29414a0));
            this.Q = a11;
            textPaint.setShadowLayer(this.N, this.O, this.P, a11);
            if (this.f29417c) {
                int alpha = textPaint.getAlpha();
                float f14 = this.f29420e;
                if (f11 <= f14) {
                    a10 = ab.a.a(1.0f, 0.0f, this.f29418d, f14, f11);
                } else {
                    a10 = ab.a.a(0.0f, 1.0f, f14, 1.0f, f11);
                }
                textPaint.setAlpha((int) (a10 * alpha));
            }
            d0.d.k(view);
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f29438o != colorStateList || this.f29436n != colorStateList) {
            this.f29438o = colorStateList;
            this.f29436n = colorStateList;
            i(false);
        }
    }

    public final void k(int i6) {
        View view = this.f29413a;
        ub.e eVar = new ub.e(view.getContext(), i6);
        ColorStateList colorStateList = eVar.f33987j;
        if (colorStateList != null) {
            this.f29438o = colorStateList;
        }
        float f = eVar.f33988k;
        if (f != 0.0f) {
            this.f29434m = f;
        }
        ColorStateList colorStateList2 = eVar.f33979a;
        if (colorStateList2 != null) {
            this.f29414a0 = colorStateList2;
        }
        this.Y = eVar.f33983e;
        this.Z = eVar.f;
        this.X = eVar.f33984g;
        this.f29421f0 = eVar.f33986i;
        ub.a aVar = this.E;
        if (aVar != null) {
            aVar.f33978x = true;
        }
        a aVar2 = new a();
        eVar.a();
        this.E = new ub.a(aVar2, eVar.f33991n);
        eVar.c(view.getContext(), this.E);
        i(false);
    }

    public final void l(int i6) {
        if (this.f29430k != i6) {
            this.f29430k = i6;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        ub.a aVar = this.E;
        if (aVar != null) {
            aVar.f33978x = true;
        }
        if (this.f29450y != typeface) {
            this.f29450y = typeface;
            Typeface a10 = ub.g.a(this.f29413a.getContext().getResources().getConfiguration(), typeface);
            this.f29449x = a10;
            if (a10 == null) {
                a10 = this.f29450y;
            }
            this.f29448w = a10;
            return true;
        }
        return false;
    }

    public final void n(int i6) {
        View view = this.f29413a;
        ub.e eVar = new ub.e(view.getContext(), i6);
        ColorStateList colorStateList = eVar.f33987j;
        if (colorStateList != null) {
            this.f29436n = colorStateList;
        }
        float f = eVar.f33988k;
        if (f != 0.0f) {
            this.f29432l = f;
        }
        ColorStateList colorStateList2 = eVar.f33979a;
        if (colorStateList2 != null) {
            this.e0 = colorStateList2;
        }
        this.c0 = eVar.f33983e;
        this.f29419d0 = eVar.f;
        this.f29416b0 = eVar.f33984g;
        this.f29423g0 = eVar.f33986i;
        ub.a aVar = this.D;
        if (aVar != null) {
            aVar.f33978x = true;
        }
        b bVar = new b();
        eVar.a();
        this.D = new ub.a(bVar, eVar.f33991n);
        eVar.c(view.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        ub.a aVar = this.D;
        if (aVar != null) {
            aVar.f33978x = true;
        }
        if (this.B != typeface) {
            this.B = typeface;
            Typeface a10 = ub.g.a(this.f29413a.getContext().getResources().getConfiguration(), typeface);
            this.A = a10;
            if (a10 == null) {
                a10 = this.B;
            }
            this.f29451z = a10;
            return true;
        }
        return false;
    }

    public final void p(float f) {
        float f2;
        float a10;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f29415b) {
            this.f29415b = f;
            boolean z10 = this.f29417c;
            RectF rectF = this.f29426i;
            Rect rect = this.f29424h;
            Rect rect2 = this.f29422g;
            if (z10) {
                if (f < this.f29420e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f, this.V);
                rectF.top = g(this.f29442q, this.r, f, this.V);
                rectF.right = g(rect2.right, rect.right, f, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, f, this.V);
            }
            if (this.f29417c) {
                if (f < this.f29420e) {
                    this.f29446u = this.f29444s;
                    this.f29447v = this.f29442q;
                    q(0.0f);
                    f2 = 0.0f;
                } else {
                    this.f29446u = this.f29445t;
                    this.f29447v = this.r - Math.max(0, this.f);
                    q(1.0f);
                    f2 = 1.0f;
                }
            } else {
                this.f29446u = g(this.f29444s, this.f29445t, f, this.V);
                this.f29447v = g(this.f29442q, this.r, f, this.V);
                q(f);
                f2 = f;
            }
            i1.b bVar = ab.a.f450b;
            this.f29431k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f, bVar);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            View view = this.f29413a;
            d0.d.k(view);
            this.f29433l0 = g(1.0f, 0.0f, f, bVar);
            d0.d.k(view);
            ColorStateList colorStateList = this.f29438o;
            ColorStateList colorStateList2 = this.f29436n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f2, f(colorStateList2), f(this.f29438o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f10 = this.f29421f0;
            float f11 = this.f29423g0;
            if (f10 != f11) {
                textPaint.setLetterSpacing(g(f11, f10, f, bVar));
            } else {
                textPaint.setLetterSpacing(f10);
            }
            this.N = g(this.f29416b0, this.X, f, null);
            this.O = g(this.c0, this.Y, f, null);
            this.P = g(this.f29419d0, this.Z, f, null);
            int a11 = a(f, f(this.e0), f(this.f29414a0));
            this.Q = a11;
            textPaint.setShadowLayer(this.N, this.O, this.P, a11);
            if (this.f29417c) {
                int alpha = textPaint.getAlpha();
                float f12 = this.f29420e;
                if (f <= f12) {
                    a10 = ab.a.a(1.0f, 0.0f, this.f29418d, f12, f);
                } else {
                    a10 = ab.a.a(0.0f, 1.0f, f12, 1.0f, f);
                }
                textPaint.setAlpha((int) (a10 * alpha));
            }
            d0.d.k(view);
        }
    }

    public final void q(float f) {
        c(f, false);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.k(this.f29413a);
    }

    public final boolean r(int[] iArr) {
        ColorStateList colorStateList;
        boolean z10;
        this.R = iArr;
        ColorStateList colorStateList2 = this.f29438o;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f29436n) != null && colorStateList.isStateful())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        i(false);
        return true;
    }
}
