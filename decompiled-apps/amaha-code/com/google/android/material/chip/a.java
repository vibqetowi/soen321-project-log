package com.google.android.material.chip;

import ab.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.theinnerhour.b2b.R;
import j0.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k0.a;
import k0.c;
import qb.q;
import qb.w;
import ub.e;
import yb.f;
import yb.j;
/* compiled from: ChipDrawable.java */
/* loaded from: classes.dex */
public final class a extends f implements Drawable.Callback, q.b {

    /* renamed from: a1  reason: collision with root package name */
    public static final int[] f8895a1 = {16842910};
    public static final ShapeDrawable b1 = new ShapeDrawable(new OvalShape());
    public final Paint.FontMetrics A0;
    public final RectF B0;
    public final PointF C0;
    public final Path D0;
    public final q E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public int M0;
    public int N0;
    public ColorFilter O0;
    public PorterDuffColorFilter P0;
    public ColorStateList Q0;
    public ColorStateList R;
    public PorterDuff.Mode R0;
    public ColorStateList S;
    public int[] S0;
    public float T;
    public boolean T0;
    public float U;
    public ColorStateList U0;
    public ColorStateList V;
    public WeakReference<InterfaceC0146a> V0;
    public float W;
    public TextUtils.TruncateAt W0;
    public ColorStateList X;
    public boolean X0;
    public CharSequence Y;
    public int Y0;
    public boolean Z;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f8896a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f8897b0;
    public float c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f8898d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f8899f0;

    /* renamed from: g0  reason: collision with root package name */
    public RippleDrawable f8900g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f8901h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f8902i0;

    /* renamed from: j0  reason: collision with root package name */
    public SpannableStringBuilder f8903j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8904k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8905l0;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f8906m0;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f8907n0;

    /* renamed from: o0  reason: collision with root package name */
    public g f8908o0;

    /* renamed from: p0  reason: collision with root package name */
    public g f8909p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f8910q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f8911r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f8912s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f8913t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f8914u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f8915v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f8916w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f8917x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Context f8918y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Paint f8919z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0146a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132083821);
        this.U = -1.0f;
        this.f8919z0 = new Paint(1);
        this.A0 = new Paint.FontMetrics();
        this.B0 = new RectF();
        this.C0 = new PointF();
        this.D0 = new Path();
        this.N0 = 255;
        this.R0 = PorterDuff.Mode.SRC_IN;
        this.V0 = new WeakReference<>(null);
        i(context);
        this.f8918y0 = context;
        q qVar = new q(this);
        this.E0 = qVar;
        this.Y = "";
        qVar.f29502a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8895a1;
        setState(iArr);
        if (!Arrays.equals(this.S0, iArr)) {
            this.S0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.X0 = true;
        int[] iArr2 = vb.b.f34969a;
        b1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean u(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10) {
        boolean z11;
        if (this.f8905l0 != z10) {
            boolean R = R();
            this.f8905l0 = z10;
            boolean R2 = R();
            if (R != R2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (R2) {
                    o(this.f8906m0);
                } else {
                    U(this.f8906m0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f) {
        if (this.U != f) {
            this.U = f;
            setShapeAppearanceModel(this.f38424u.f38431a.e(f));
        }
    }

    public final void C(Drawable drawable) {
        Drawable drawable2 = this.f8896a0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof c) {
                drawable2 = ((c) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable3 = k0.a.g(drawable).mutate();
            }
            this.f8896a0 = drawable3;
            float q11 = q();
            U(drawable2);
            if (S()) {
                o(this.f8896a0);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f) {
        if (this.c0 != f) {
            float q10 = q();
            this.c0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f8898d0 = true;
        if (this.f8897b0 != colorStateList) {
            this.f8897b0 = colorStateList;
            if (S()) {
                a.b.h(this.f8896a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        boolean z11;
        if (this.Z != z10) {
            boolean S = S();
            this.Z = z10;
            boolean S2 = S();
            if (S != S2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (S2) {
                    o(this.f8896a0);
                } else {
                    U(this.f8896a0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.Z0) {
                f.b bVar = this.f38424u;
                if (bVar.f38434d != colorStateList) {
                    bVar.f38434d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f) {
        if (this.W != f) {
            this.W = f;
            this.f8919z0.setStrokeWidth(f);
            if (this.Z0) {
                this.f38424u.f38440k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.f8899f0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof c) {
                drawable2 = ((c) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r = r();
            if (drawable != null) {
                drawable3 = k0.a.g(drawable).mutate();
            }
            this.f8899f0 = drawable3;
            int[] iArr = vb.b.f34969a;
            this.f8900g0 = new RippleDrawable(vb.b.c(this.X), this.f8899f0, b1);
            float r10 = r();
            U(drawable2);
            if (T()) {
                o(this.f8899f0);
            }
            invalidateSelf();
            if (r != r10) {
                v();
            }
        }
    }

    public final void J(float f) {
        if (this.f8916w0 != f) {
            this.f8916w0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f) {
        if (this.f8902i0 != f) {
            this.f8902i0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f) {
        if (this.f8915v0 != f) {
            this.f8915v0 = f;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f8901h0 != colorStateList) {
            this.f8901h0 = colorStateList;
            if (T()) {
                a.b.h(this.f8899f0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        boolean z11;
        if (this.e0 != z10) {
            boolean T = T();
            this.e0 = z10;
            boolean T2 = T();
            if (T != T2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (T2) {
                    o(this.f8899f0);
                } else {
                    U(this.f8899f0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f) {
        if (this.f8912s0 != f) {
            float q10 = q();
            this.f8912s0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f) {
        if (this.f8911r0 != f) {
            float q10 = q();
            this.f8911r0 = f;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.T0) {
                colorStateList2 = vb.b.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.U0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        if (this.f8905l0 && this.f8906m0 != null && this.L0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.Z && this.f8896a0 != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.e0 && this.f8899f0 != null) {
            return true;
        }
        return false;
    }

    @Override // qb.q.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i6;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i6 = this.N0) != 0) {
            if (i6 < 255) {
                float f = bounds.left;
                float f2 = bounds.top;
                float f10 = bounds.right;
                float f11 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f10, f11, i6);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f, f2, f10, f11, i6, 31);
                }
                i10 = saveLayerAlpha;
            } else {
                i10 = 0;
            }
            boolean z11 = this.Z0;
            Paint paint = this.f8919z0;
            RectF rectF2 = this.B0;
            if (!z11) {
                paint.setColor(this.F0);
                paint.setStyle(Paint.Style.FILL);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, s(), s(), paint);
            }
            if (!this.Z0) {
                paint.setColor(this.G0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.O0;
                if (colorFilter == null) {
                    colorFilter = this.P0;
                }
                paint.setColorFilter(colorFilter);
                rectF2.set(bounds);
                canvas.drawRoundRect(rectF2, s(), s(), paint);
            }
            if (this.Z0) {
                super.draw(canvas);
            }
            if (this.W > 0.0f && !this.Z0) {
                paint.setColor(this.I0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.Z0) {
                    ColorFilter colorFilter2 = this.O0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.P0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f12 = this.W / 2.0f;
                rectF2.set(bounds.left + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
                float f13 = this.U - (this.W / 2.0f);
                canvas.drawRoundRect(rectF2, f13, f13, paint);
            }
            paint.setColor(this.J0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            if (!this.Z0) {
                canvas.drawRoundRect(rectF2, s(), s(), paint);
                i11 = 0;
            } else {
                RectF rectF3 = new RectF(bounds);
                Path path = this.D0;
                j jVar = this.L;
                f.b bVar = this.f38424u;
                jVar.a(bVar.f38431a, bVar.f38439j, rectF3, this.K, path);
                i11 = 0;
                f(canvas, paint, path, this.f38424u.f38431a, h());
            }
            if (S()) {
                p(bounds, rectF2);
                float f14 = rectF2.left;
                float f15 = rectF2.top;
                canvas.translate(f14, f15);
                this.f8896a0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
                this.f8896a0.draw(canvas);
                canvas.translate(-f14, -f15);
            }
            if (R()) {
                p(bounds, rectF2);
                float f16 = rectF2.left;
                float f17 = rectF2.top;
                canvas.translate(f16, f17);
                this.f8906m0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
                this.f8906m0.draw(canvas);
                canvas.translate(-f16, -f17);
            }
            if (this.X0 && this.Y != null) {
                PointF pointF = this.C0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.Y;
                q qVar = this.E0;
                if (charSequence != null) {
                    float q10 = q() + this.f8910q0 + this.f8913t0;
                    if (k0.a.b(this) == 0) {
                        pointF.x = bounds.left + q10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - q10;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = qVar.f29502a;
                    Paint.FontMetrics fontMetrics = this.A0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF2.setEmpty();
                if (this.Y != null) {
                    float q11 = q() + this.f8910q0 + this.f8913t0;
                    float r = r() + this.f8917x0 + this.f8914u0;
                    if (k0.a.b(this) == 0) {
                        rectF2.left = bounds.left + q11;
                        rectF2.right = bounds.right - r;
                    } else {
                        rectF2.left = bounds.left + r;
                        rectF2.right = bounds.right - q11;
                    }
                    rectF2.top = bounds.top;
                    rectF2.bottom = bounds.bottom;
                }
                e eVar = qVar.f;
                TextPaint textPaint2 = qVar.f29502a;
                if (eVar != null) {
                    textPaint2.drawableState = getState();
                    qVar.f.e(this.f8918y0, textPaint2, qVar.f29503b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(qVar.a(this.Y.toString())) > Math.round(rectF2.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i14 = canvas.save();
                    canvas.clipRect(rectF2);
                } else {
                    i14 = 0;
                }
                CharSequence charSequence2 = this.Y;
                if (z10 && this.W0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF2.width(), this.W0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f18 = pointF.x;
                float f19 = pointF.y;
                i13 = 255;
                rectF = rectF2;
                i12 = i10;
                canvas.drawText(charSequence3, 0, length, f18, f19, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i14);
                }
            } else {
                rectF = rectF2;
                i12 = i10;
                i13 = 255;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f20 = this.f8917x0 + this.f8916w0;
                    if (k0.a.b(this) == 0) {
                        float f21 = bounds.right - f20;
                        rectF.right = f21;
                        rectF.left = f21 - this.f8902i0;
                    } else {
                        float f22 = bounds.left + f20;
                        rectF.left = f22;
                        rectF.right = f22 + this.f8902i0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f23 = this.f8902i0;
                    float f24 = exactCenterY - (f23 / 2.0f);
                    rectF.top = f24;
                    rectF.bottom = f24 + f23;
                }
                float f25 = rectF.left;
                float f26 = rectF.top;
                canvas.translate(f25, f26);
                this.f8899f0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = vb.b.f34969a;
                this.f8900g0.setBounds(this.f8899f0.getBounds());
                this.f8900g0.jumpToCurrentState();
                this.f8900g0.draw(canvas);
                canvas.translate(-f25, -f26);
            }
            if (this.N0 < i13) {
                canvas.restoreToCount(i12);
            }
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.T;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.E0.a(this.Y.toString()) + q() + this.f8910q0 + this.f8913t0 + this.f8914u0 + this.f8917x0), this.Y0);
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.Z0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.U);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.T, this.U);
        }
        outline.setAlpha(this.N0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (t(this.R) || t(this.S) || t(this.V)) {
            return true;
        }
        if (this.T0 && t(this.U0)) {
            return true;
        }
        e eVar = this.E0.f;
        if (eVar != null && (colorStateList = eVar.f33987j) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f8905l0 && this.f8906m0 != null && this.f8904k0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || u(this.f8896a0) || u(this.f8906m0) || t(this.Q0)) {
            return true;
        }
        return false;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        k0.a.c(drawable, k0.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f8899f0) {
            if (drawable.isStateful()) {
                drawable.setState(this.S0);
            }
            a.b.h(drawable, this.f8901h0);
            return;
        }
        Drawable drawable2 = this.f8896a0;
        if (drawable == drawable2 && this.f8898d0) {
            a.b.h(drawable2, this.f8897b0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (S()) {
            onLayoutDirectionChanged |= k0.a.c(this.f8896a0, i6);
        }
        if (R()) {
            onLayoutDirectionChanged |= k0.a.c(this.f8906m0, i6);
        }
        if (T()) {
            onLayoutDirectionChanged |= k0.a.c(this.f8899f0, i6);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean onLevelChange = super.onLevelChange(i6);
        if (S()) {
            onLevelChange |= this.f8896a0.setLevel(i6);
        }
        if (R()) {
            onLevelChange |= this.f8906m0.setLevel(i6);
        }
        if (T()) {
            onLevelChange |= this.f8899f0.setLevel(i6);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // yb.f, android.graphics.drawable.Drawable, qb.q.b
    public final boolean onStateChange(int[] iArr) {
        if (this.Z0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.S0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f8910q0 + this.f8911r0;
            if (this.L0) {
                drawable = this.f8906m0;
            } else {
                drawable = this.f8896a0;
            }
            float f10 = this.c0;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            if (k0.a.b(this) == 0) {
                float f11 = rect.left + f2;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = rect.right - f2;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            if (this.L0) {
                drawable2 = this.f8906m0;
            } else {
                drawable2 = this.f8896a0;
            }
            float f13 = this.c0;
            if (f13 <= 0.0f && drawable2 != null) {
                f13 = (float) Math.ceil(w.b(24, this.f8918y0));
                if (drawable2.getIntrinsicHeight() <= f13) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f13;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.f8911r0;
        if (this.L0) {
            drawable = this.f8906m0;
        } else {
            drawable = this.f8896a0;
        }
        float f2 = this.c0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f8912s0;
    }

    public final float r() {
        if (T()) {
            return this.f8915v0 + this.f8902i0 + this.f8916w0;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.Z0) {
            return this.f38424u.f38431a.f38456e.a(h());
        }
        return this.U;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.N0 != i6) {
            this.N0 = i6;
            invalidateSelf();
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.O0 != colorFilter) {
            this.O0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // yb.f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.R0 != mode) {
            this.R0 = mode;
            ColorStateList colorStateList = this.Q0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.P0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S()) {
            visible |= this.f8896a0.setVisible(z10, z11);
        }
        if (R()) {
            visible |= this.f8906m0.setVisible(z10, z11);
        }
        if (T()) {
            visible |= this.f8899f0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC0146a interfaceC0146a = this.V0.get();
        if (interfaceC0146a != null) {
            interfaceC0146a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(int[] iArr, int[] iArr2) {
        int i6;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        ColorStateList colorStateList;
        int i14;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.R;
        if (colorStateList3 != null) {
            i6 = colorStateList3.getColorForState(iArr, this.F0);
        } else {
            i6 = 0;
        }
        int d10 = d(i6);
        boolean z15 = true;
        if (this.F0 != d10) {
            this.F0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.S;
        if (colorStateList4 != null) {
            i10 = colorStateList4.getColorForState(iArr, this.G0);
        } else {
            i10 = 0;
        }
        int d11 = d(i10);
        if (this.G0 != d11) {
            this.G0 = d11;
            onStateChange = true;
        }
        int f = d.f(d11, d10);
        if (this.H0 != f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38424u.f38433c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.H0 = f;
            k(ColorStateList.valueOf(f));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.V;
        if (colorStateList5 != null) {
            i11 = colorStateList5.getColorForState(iArr, this.I0);
        } else {
            i11 = 0;
        }
        if (this.I0 != i11) {
            this.I0 = i11;
            onStateChange = true;
        }
        if (this.U0 != null && vb.b.d(iArr)) {
            i12 = this.U0.getColorForState(iArr, this.J0);
        } else {
            i12 = 0;
        }
        if (this.J0 != i12) {
            this.J0 = i12;
            if (this.T0) {
                onStateChange = true;
            }
        }
        e eVar = this.E0.f;
        if (eVar != null && (colorStateList2 = eVar.f33987j) != null) {
            i13 = colorStateList2.getColorForState(iArr, this.K0);
        } else {
            i13 = 0;
        }
        if (this.K0 != i13) {
            this.K0 = i13;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i15 : state) {
                if (i15 == 16842912) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12 && this.f8904k0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.L0 != z13 && this.f8906m0 != null) {
            float q10 = q();
            this.L0 = z13;
            if (q10 != q()) {
                onStateChange = true;
                z14 = true;
                colorStateList = this.Q0;
                if (colorStateList == null) {
                    i14 = colorStateList.getColorForState(iArr, this.M0);
                } else {
                    i14 = 0;
                }
                if (this.M0 == i14) {
                    this.M0 = i14;
                    ColorStateList colorStateList6 = this.Q0;
                    PorterDuff.Mode mode = this.R0;
                    if (colorStateList6 != null && mode != null) {
                        porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                    } else {
                        porterDuffColorFilter = null;
                    }
                    this.P0 = porterDuffColorFilter;
                } else {
                    z15 = onStateChange;
                }
                if (u(this.f8896a0)) {
                    z15 |= this.f8896a0.setState(iArr);
                }
                if (u(this.f8906m0)) {
                    z15 |= this.f8906m0.setState(iArr);
                }
                if (u(this.f8899f0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z15 |= this.f8899f0.setState(iArr3);
                }
                int[] iArr4 = vb.b.f34969a;
                if (u(this.f8900g0)) {
                    z15 |= this.f8900g0.setState(iArr2);
                }
                if (z15) {
                    invalidateSelf();
                }
                if (z14) {
                    v();
                }
                return z15;
            }
            onStateChange = true;
        }
        z14 = false;
        colorStateList = this.Q0;
        if (colorStateList == null) {
        }
        if (this.M0 == i14) {
        }
        if (u(this.f8896a0)) {
        }
        if (u(this.f8906m0)) {
        }
        if (u(this.f8899f0)) {
        }
        int[] iArr42 = vb.b.f34969a;
        if (u(this.f8900g0)) {
        }
        if (z15) {
        }
        if (z14) {
        }
        return z15;
    }

    public final void x(boolean z10) {
        if (this.f8904k0 != z10) {
            this.f8904k0 = z10;
            float q10 = q();
            if (!z10 && this.L0) {
                this.L0 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f8906m0 != drawable) {
            float q10 = q();
            this.f8906m0 = drawable;
            float q11 = q();
            U(this.f8906m0);
            o(this.f8906m0);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        boolean z10;
        if (this.f8907n0 != colorStateList) {
            this.f8907n0 = colorStateList;
            if (this.f8905l0 && this.f8906m0 != null && this.f8904k0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b.h(this.f8906m0, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
