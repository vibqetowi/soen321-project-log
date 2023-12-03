package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.appsflyer.R;
import p6.d;
import q6.h;
import q6.i;
import r6.n;
import t6.g;
import x6.k;
import x6.m;
import y6.f;
/* loaded from: classes.dex */
public class RadarChart extends d<n> {

    /* renamed from: d0  reason: collision with root package name */
    public float f6143d0;
    public float e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f6144f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6145g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6146h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6147i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f6148j0;

    /* renamed from: k0  reason: collision with root package name */
    public i f6149k0;

    /* renamed from: l0  reason: collision with root package name */
    public m f6150l0;

    /* renamed from: m0  reason: collision with root package name */
    public k f6151m0;

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6143d0 = 2.5f;
        this.e0 = 1.5f;
        this.f6144f0 = Color.rgb((int) R.styleable.AppCompatTheme_windowFixedWidthMajor, (int) R.styleable.AppCompatTheme_windowFixedWidthMajor, (int) R.styleable.AppCompatTheme_windowFixedWidthMajor);
        this.f6145g0 = Color.rgb((int) R.styleable.AppCompatTheme_windowFixedWidthMajor, (int) R.styleable.AppCompatTheme_windowFixedWidthMajor, (int) R.styleable.AppCompatTheme_windowFixedWidthMajor);
        this.f6146h0 = 150;
        this.f6147i0 = true;
        this.f6148j0 = 0;
    }

    public float getFactor() {
        RectF rectF = this.L.f38300b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) / this.f6149k0.B;
    }

    @Override // p6.d
    public float getRadius() {
        RectF rectF = this.L.f38300b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // p6.d
    public float getRequiredBaseOffset() {
        h hVar = this.C;
        if (hVar.f29198a && hVar.f29191t) {
            return hVar.C;
        }
        return f.c(10.0f);
    }

    @Override // p6.d
    public float getRequiredLegendOffset() {
        return this.I.f37624c.getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f6148j0;
    }

    public float getSliceAngle() {
        return 360.0f / ((n) this.f27931v).f().c0();
    }

    public int getWebAlpha() {
        return this.f6146h0;
    }

    public int getWebColor() {
        return this.f6144f0;
    }

    public int getWebColorInner() {
        return this.f6145g0;
    }

    public float getWebLineWidth() {
        return this.f6143d0;
    }

    public float getWebLineWidthInner() {
        return this.e0;
    }

    public i getYAxis() {
        return this.f6149k0;
    }

    @Override // p6.d, p6.b
    public float getYChartMax() {
        return this.f6149k0.f29197z;
    }

    @Override // p6.d, p6.b
    public float getYChartMin() {
        return this.f6149k0.A;
    }

    public float getYRange() {
        return this.f6149k0.B;
    }

    @Override // p6.d, p6.b
    public final void j() {
        super.j();
        this.f6149k0 = new i(i.a.LEFT);
        this.f6143d0 = f.c(1.5f);
        this.e0 = f.c(0.75f);
        this.J = new x6.i(this, this.M, this.L);
        this.f6150l0 = new m(this.L, this.f6149k0, this);
        this.f6151m0 = new k(this.L, this.C, this);
        this.K = new g(this);
    }

    @Override // p6.d, p6.b
    public final void k() {
        if (this.f27931v == 0) {
            return;
        }
        n();
        m mVar = this.f6150l0;
        i iVar = this.f6149k0;
        mVar.d(iVar.A, iVar.f29197z);
        k kVar = this.f6151m0;
        h hVar = this.C;
        kVar.d(hVar.A, hVar.f29197z);
        if (this.F != null) {
            this.I.d(this.f27931v);
        }
        f();
    }

    @Override // p6.d
    public final void n() {
        i iVar = this.f6149k0;
        i.a aVar = i.a.LEFT;
        iVar.a(((n) this.f27931v).h(aVar), ((n) this.f27931v).g(aVar));
        this.C.a(0.0f, ((n) this.f27931v).f().c0());
    }

    @Override // p6.b, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f27931v == 0) {
            return;
        }
        h hVar = this.C;
        if (hVar.f29198a) {
            this.f6151m0.d(hVar.A, hVar.f29197z);
        }
        this.f6151m0.n(canvas);
        if (this.f6147i0) {
            this.J.f(canvas);
        }
        boolean z10 = this.f6149k0.f29198a;
        this.J.e(canvas);
        if (m()) {
            this.J.g(canvas, this.S);
        }
        if (this.f6149k0.f29198a) {
            this.f6150l0.p(canvas);
        }
        this.f6150l0.m(canvas);
        this.J.i(canvas);
        this.I.f(canvas);
        g(canvas);
    }

    @Override // p6.d
    public final int q(float f) {
        float rotationAngle = f - getRotationAngle();
        DisplayMetrics displayMetrics = f.f38290a;
        while (rotationAngle < 0.0f) {
            rotationAngle += 360.0f;
        }
        float f2 = rotationAngle % 360.0f;
        float sliceAngle = getSliceAngle();
        int c0 = ((n) this.f27931v).f().c0();
        int i6 = 0;
        while (i6 < c0) {
            int i10 = i6 + 1;
            if ((i10 * sliceAngle) - (sliceAngle / 2.0f) > f2) {
                return i6;
            }
            i6 = i10;
        }
        return 0;
    }

    public void setDrawWeb(boolean z10) {
        this.f6147i0 = z10;
    }

    public void setSkipWebLineCount(int i6) {
        this.f6148j0 = Math.max(0, i6);
    }

    public void setWebAlpha(int i6) {
        this.f6146h0 = i6;
    }

    public void setWebColor(int i6) {
        this.f6144f0 = i6;
    }

    public void setWebColorInner(int i6) {
        this.f6145g0 = i6;
    }

    public void setWebLineWidth(float f) {
        this.f6143d0 = f.c(f);
    }

    public void setWebLineWidthInner(float f) {
        this.e0 = f.c(f);
    }
}
