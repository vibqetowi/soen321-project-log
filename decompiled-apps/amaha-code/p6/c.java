package p6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.List;
import q6.h;
import r6.l;
import t6.e;
import v6.g;
import y6.f;
/* compiled from: PieChart.java */
/* loaded from: classes.dex */
public final class c extends d<l> {

    /* renamed from: d0  reason: collision with root package name */
    public boolean f27937d0;
    public float[] e0;

    /* renamed from: f0  reason: collision with root package name */
    public float[] f27938f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f27939g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f27940h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27941i0;

    /* renamed from: j0  reason: collision with root package name */
    public CharSequence f27942j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f27943k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f27944l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f27945m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f27946n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f27947o0;

    @Override // p6.d, p6.b
    public final void f() {
        super.f();
        if (this.f27931v == 0) {
            return;
        }
        getDiameter();
        y6.c centerOffsets = getCenterOffsets();
        ((l) this.f27931v).i().S();
        float f = centerOffsets.f38276b;
        throw null;
    }

    public float[] getAbsoluteAngles() {
        return this.f27938f0;
    }

    public y6.c getCenterCircleBox() {
        throw null;
    }

    public CharSequence getCenterText() {
        return this.f27942j0;
    }

    public y6.c getCenterTextOffset() {
        throw null;
    }

    public float getCenterTextRadiusPercent() {
        return this.f27946n0;
    }

    public RectF getCircleBox() {
        return null;
    }

    public float[] getDrawAngles() {
        return this.e0;
    }

    public float getHoleRadius() {
        return this.f27943k0;
    }

    public float getMaxAngle() {
        return this.f27947o0;
    }

    @Override // p6.d
    public float getRadius() {
        return 0.0f;
    }

    @Override // p6.d
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // p6.d
    public float getRequiredLegendOffset() {
        return this.I.f37624c.getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f27944l0;
    }

    @Override // p6.b
    @Deprecated
    public h getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // p6.d, p6.b
    public final void j() {
        super.j();
        this.J = new x6.h(this, this.M, this.L);
        this.C = null;
        this.K = new e(this);
    }

    @Override // p6.d
    public final void n() {
        int d10 = ((l) this.f27931v).d();
        if (this.e0.length != d10) {
            this.e0 = new float[d10];
        } else {
            for (int i6 = 0; i6 < d10; i6++) {
                this.e0[i6] = 0.0f;
            }
        }
        if (this.f27938f0.length != d10) {
            this.f27938f0 = new float[d10];
        } else {
            for (int i10 = 0; i10 < d10; i10++) {
                this.f27938f0[i10] = 0.0f;
            }
        }
        float j10 = ((l) this.f27931v).j();
        List<T> list = ((l) this.f27931v).f30512i;
        int i11 = 0;
        for (int i12 = 0; i12 < ((l) this.f27931v).c(); i12++) {
            g gVar = (g) list.get(i12);
            for (int i13 = 0; i13 < gVar.c0(); i13++) {
                this.e0[i11] = (Math.abs(gVar.x(i13).f30503u) / j10) * this.f27947o0;
                if (i11 == 0) {
                    this.f27938f0[i11] = this.e0[i11];
                } else {
                    float[] fArr = this.f27938f0;
                    fArr[i11] = fArr[i11 - 1] + this.e0[i11];
                }
                i11++;
            }
        }
    }

    @Override // p6.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x6.d dVar = this.J;
        if (dVar != null && (dVar instanceof x6.h)) {
            x6.h hVar = (x6.h) dVar;
            Canvas canvas = hVar.r;
            if (canvas != null) {
                canvas.setBitmap(null);
                hVar.r = null;
            }
            WeakReference<Bitmap> weakReference = hVar.f37640q;
            if (weakReference != null) {
                weakReference.get().recycle();
                hVar.f37640q.clear();
                hVar.f37640q = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // p6.b, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f27931v == 0) {
            return;
        }
        this.J.e(canvas);
        if (m()) {
            this.J.g(canvas, this.S);
        }
        this.J.f(canvas);
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
        int i6 = 0;
        while (true) {
            float[] fArr = this.f27938f0;
            if (i6 < fArr.length) {
                if (fArr[i6] > f2) {
                    return i6;
                }
                i6++;
            } else {
                return -1;
            }
        }
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f27942j0 = "";
        } else {
            this.f27942j0 = charSequence;
        }
    }

    public void setCenterTextColor(int i6) {
        ((x6.h) this.J).f37634k.setColor(i6);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.f27946n0 = f;
    }

    public void setCenterTextSize(float f) {
        ((x6.h) this.J).f37634k.setTextSize(f.c(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((x6.h) this.J).f37634k.setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((x6.h) this.J).f37634k.setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z10) {
        this.f27945m0 = z10;
    }

    public void setDrawEntryLabels(boolean z10) {
        this.f27937d0 = z10;
    }

    public void setDrawHoleEnabled(boolean z10) {
        this.f27939g0 = z10;
    }

    @Deprecated
    public void setDrawSliceText(boolean z10) {
        this.f27937d0 = z10;
    }

    public void setDrawSlicesUnderHole(boolean z10) {
        this.f27940h0 = z10;
    }

    public void setEntryLabelColor(int i6) {
        ((x6.h) this.J).f37635l.setColor(i6);
    }

    public void setEntryLabelTextSize(float f) {
        ((x6.h) this.J).f37635l.setTextSize(f.c(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((x6.h) this.J).f37635l.setTypeface(typeface);
    }

    public void setHoleColor(int i6) {
        ((x6.h) this.J).f37631h.setColor(i6);
    }

    public void setHoleRadius(float f) {
        this.f27943k0 = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.f27947o0 = f;
    }

    public void setTransparentCircleAlpha(int i6) {
        ((x6.h) this.J).f37632i.setAlpha(i6);
    }

    public void setTransparentCircleColor(int i6) {
        Paint paint = ((x6.h) this.J).f37632i;
        int alpha = paint.getAlpha();
        paint.setColor(i6);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.f27944l0 = f;
    }

    public void setUsePercentValues(boolean z10) {
        this.f27941i0 = z10;
    }
}
