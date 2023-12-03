package p6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import q6.h;
import q6.i;
import r6.d;
import r6.j;
import x6.l;
import y6.e;
import y6.f;
import y6.g;
/* compiled from: BarLineChartBase.java */
/* loaded from: classes.dex */
public abstract class a<T extends r6.d<? extends v6.b<? extends j>>> extends b<T> implements u6.b {
    public final y6.b A0;
    public final float[] B0;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27906a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27907b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f27908d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f27909f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f27910g0;

    /* renamed from: h0  reason: collision with root package name */
    public Paint f27911h0;

    /* renamed from: i0  reason: collision with root package name */
    public Paint f27912i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f27913j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f27914k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f27915l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f27916m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f27917n0;

    /* renamed from: o0  reason: collision with root package name */
    public i f27918o0;

    /* renamed from: p0  reason: collision with root package name */
    public i f27919p0;

    /* renamed from: q0  reason: collision with root package name */
    public l f27920q0;

    /* renamed from: r0  reason: collision with root package name */
    public l f27921r0;

    /* renamed from: s0  reason: collision with root package name */
    public e f27922s0;

    /* renamed from: t0  reason: collision with root package name */
    public e f27923t0;

    /* renamed from: u0  reason: collision with root package name */
    public x6.j f27924u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f27925v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f27926w0;

    /* renamed from: x0  reason: collision with root package name */
    public final RectF f27927x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Matrix f27928y0;

    /* renamed from: z0  reason: collision with root package name */
    public final y6.b f27929z0;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = 100;
        this.f27906a0 = false;
        this.f27907b0 = false;
        this.c0 = true;
        this.f27908d0 = true;
        this.e0 = true;
        this.f27909f0 = true;
        this.f27910g0 = true;
        this.f27913j0 = false;
        this.f27914k0 = false;
        this.f27915l0 = false;
        this.f27916m0 = 15.0f;
        this.f27917n0 = false;
        this.f27925v0 = 0L;
        this.f27926w0 = 0L;
        this.f27927x0 = new RectF();
        this.f27928y0 = new Matrix();
        new Matrix();
        this.f27929z0 = y6.b.b(0.0d, 0.0d);
        this.A0 = y6.b.b(0.0d, 0.0d);
        this.B0 = new float[2];
    }

    @Override // u6.b
    public final e c(i.a aVar) {
        if (aVar == i.a.LEFT) {
            return this.f27922s0;
        }
        return this.f27923t0;
    }

    @Override // android.view.View
    public final void computeScroll() {
        w6.b bVar = this.G;
        if (bVar instanceof w6.a) {
            w6.a aVar = (w6.a) bVar;
            y6.c cVar = aVar.J;
            if (cVar.f38276b != 0.0f || cVar.f38277c != 0.0f) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = cVar.f38276b;
                View view = aVar.f36569x;
                a aVar2 = (a) view;
                cVar.f38276b = aVar2.getDragDecelerationFrictionCoef() * f;
                float dragDecelerationFrictionCoef = aVar2.getDragDecelerationFrictionCoef() * cVar.f38277c;
                cVar.f38277c = dragDecelerationFrictionCoef;
                float f2 = ((float) (currentAnimationTimeMillis - aVar.H)) / 1000.0f;
                float f10 = cVar.f38276b * f2;
                float f11 = dragDecelerationFrictionCoef * f2;
                y6.c cVar2 = aVar.I;
                float f12 = cVar2.f38276b + f10;
                cVar2.f38276b = f12;
                float f13 = cVar2.f38277c + f11;
                cVar2.f38277c = f13;
                MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f12, f13, 0);
                aVar.c(obtain);
                obtain.recycle();
                g viewPortHandler = aVar2.getViewPortHandler();
                Matrix matrix = aVar.f36564y;
                viewPortHandler.j(matrix, view, false);
                aVar.f36564y = matrix;
                aVar.H = currentAnimationTimeMillis;
                if (Math.abs(cVar.f38276b) < 0.01d && Math.abs(cVar.f38277c) < 0.01d) {
                    aVar2.f();
                    aVar2.postInvalidate();
                    y6.c cVar3 = aVar.J;
                    cVar3.f38276b = 0.0f;
                    cVar3.f38277c = 0.0f;
                    return;
                }
                DisplayMetrics displayMetrics = f.f38290a;
                view.postInvalidateOnAnimation();
            }
        }
    }

    @Override // u6.b
    public final void d(i.a aVar) {
        i iVar;
        if (aVar == i.a.LEFT) {
            iVar = this.f27918o0;
        } else {
            iVar = this.f27919p0;
        }
        iVar.getClass();
    }

    @Override // p6.b
    public void f() {
        boolean z10;
        RectF rectF = this.f27927x0;
        o(rectF);
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f10 = rectF.right + 0.0f;
        float f11 = rectF.bottom + 0.0f;
        i iVar = this.f27918o0;
        boolean z11 = false;
        if (iVar.f29198a && iVar.f29191t && iVar.G == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f += iVar.e(this.f27920q0.f);
        }
        i iVar2 = this.f27919p0;
        if (iVar2.f29198a && iVar2.f29191t && iVar2.G == 1) {
            z11 = true;
        }
        if (z11) {
            f10 += iVar2.e(this.f27921r0.f);
        }
        h hVar = this.C;
        if (hVar.f29198a && hVar.f29191t) {
            float f12 = hVar.D + hVar.f29200c;
            int i6 = hVar.E;
            if (i6 == 2) {
                f11 += f12;
            } else {
                if (i6 != 1) {
                    if (i6 == 3) {
                        f11 += f12;
                    }
                }
                f2 += f12;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f2;
        float extraRightOffset = getExtraRightOffset() + f10;
        float extraBottomOffset = getExtraBottomOffset() + f11;
        float extraLeftOffset = getExtraLeftOffset() + f;
        float c10 = f.c(this.f27916m0);
        g gVar = this.L;
        gVar.f38300b.set(Math.max(c10, extraLeftOffset), Math.max(c10, extraTopOffset), gVar.f38301c - Math.max(c10, extraRightOffset), gVar.f38302d - Math.max(c10, extraBottomOffset));
        if (this.f27930u) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder("Content: ");
            sb2.append(this.L.f38300b.toString());
            Log.i("MPAndroidChart", sb2.toString());
        }
        e eVar = this.f27923t0;
        this.f27919p0.getClass();
        eVar.f();
        e eVar2 = this.f27922s0;
        this.f27918o0.getClass();
        eVar2.f();
        p();
    }

    public i getAxisLeft() {
        return this.f27918o0;
    }

    public i getAxisRight() {
        return this.f27919p0;
    }

    @Override // p6.b, u6.c, u6.b
    public /* bridge */ /* synthetic */ r6.d getData() {
        return (r6.d) super.getData();
    }

    public w6.e getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        e c10 = c(i.a.LEFT);
        RectF rectF = this.L.f38300b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        y6.b bVar = this.A0;
        c10.c(f, f2, bVar);
        return (float) Math.min(this.C.f29197z, bVar.f38273b);
    }

    public float getLowestVisibleX() {
        e c10 = c(i.a.LEFT);
        RectF rectF = this.L.f38300b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        y6.b bVar = this.f27929z0;
        c10.c(f, f2, bVar);
        return (float) Math.max(this.C.A, bVar.f38273b);
    }

    @Override // p6.b, u6.c
    public int getMaxVisibleCount() {
        return this.W;
    }

    public float getMinOffset() {
        return this.f27916m0;
    }

    public l getRendererLeftYAxis() {
        return this.f27920q0;
    }

    public l getRendererRightYAxis() {
        return this.f27921r0;
    }

    public x6.j getRendererXAxis() {
        return this.f27924u0;
    }

    @Override // android.view.View
    public float getScaleX() {
        g gVar = this.L;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f38306i;
    }

    @Override // android.view.View
    public float getScaleY() {
        g gVar = this.L;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f38307j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // p6.b
    public float getYChartMax() {
        return Math.max(this.f27918o0.f29197z, this.f27919p0.f29197z);
    }

    @Override // p6.b
    public float getYChartMin() {
        return Math.min(this.f27918o0.A, this.f27919p0.A);
    }

    @Override // p6.b
    public void j() {
        super.j();
        this.f27918o0 = new i(i.a.LEFT);
        this.f27919p0 = new i(i.a.RIGHT);
        this.f27922s0 = new e(this.L);
        this.f27923t0 = new e(this.L);
        this.f27920q0 = new l(this.L, this.f27918o0, this.f27922s0);
        this.f27921r0 = new l(this.L, this.f27919p0, this.f27923t0);
        this.f27924u0 = new x6.j(this.L, this.C, this.f27922s0);
        setHighlighter(new t6.b(this));
        this.G = new w6.a(this, this.L.f38299a);
        Paint paint = new Paint();
        this.f27911h0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f27911h0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f27912i0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f27912i0.setColor(-16777216);
        this.f27912i0.setStrokeWidth(f.c(1.0f));
    }

    @Override // p6.b
    public final void k() {
        if (this.f27931v == 0) {
            if (this.f27930u) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f27930u) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        x6.d dVar = this.J;
        if (dVar != null) {
            dVar.m();
        }
        n();
        l lVar = this.f27920q0;
        i iVar = this.f27918o0;
        lVar.d(iVar.A, iVar.f29197z);
        l lVar2 = this.f27921r0;
        i iVar2 = this.f27919p0;
        lVar2.d(iVar2.A, iVar2.f29197z);
        x6.j jVar = this.f27924u0;
        h hVar = this.C;
        jVar.d(hVar.A, hVar.f29197z);
        if (this.F != null) {
            this.I.d(this.f27931v);
        }
        f();
    }

    public void n() {
        h hVar = this.C;
        T t3 = this.f27931v;
        hVar.a(((r6.d) t3).f30508d, ((r6.d) t3).f30507c);
        i iVar = this.f27918o0;
        i.a aVar = i.a.LEFT;
        iVar.a(((r6.d) this.f27931v).h(aVar), ((r6.d) this.f27931v).g(aVar));
        i iVar2 = this.f27919p0;
        i.a aVar2 = i.a.RIGHT;
        iVar2.a(((r6.d) this.f27931v).h(aVar2), ((r6.d) this.f27931v).g(aVar2));
    }

    public final void o(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        q6.e eVar = this.F;
        if (eVar != null && eVar.f29198a) {
            int d10 = v.h.d(eVar.f29206i);
            if (d10 != 0) {
                if (d10 == 1) {
                    int d11 = v.h.d(this.F.f29204g);
                    if (d11 != 0) {
                        if (d11 != 1) {
                            if (d11 == 2) {
                                float f = rectF.right;
                                q6.e eVar2 = this.F;
                                rectF.right = Math.min(eVar2.r, this.L.f38301c * eVar2.f29214q) + this.F.f29199b + f;
                                return;
                            }
                            return;
                        }
                        int d12 = v.h.d(this.F.f29205h);
                        if (d12 != 0) {
                            if (d12 == 2) {
                                float f2 = rectF.bottom;
                                q6.e eVar3 = this.F;
                                rectF.bottom = Math.min(eVar3.f29215s, this.L.f38302d * eVar3.f29214q) + this.F.f29200c + f2;
                                return;
                            }
                            return;
                        }
                        float f10 = rectF.top;
                        q6.e eVar4 = this.F;
                        rectF.top = Math.min(eVar4.f29215s, this.L.f38302d * eVar4.f29214q) + this.F.f29200c + f10;
                        return;
                    }
                    float f11 = rectF.left;
                    q6.e eVar5 = this.F;
                    rectF.left = Math.min(eVar5.r, this.L.f38301c * eVar5.f29214q) + this.F.f29199b + f11;
                    return;
                }
                return;
            }
            int d13 = v.h.d(this.F.f29205h);
            if (d13 != 0) {
                if (d13 == 2) {
                    float f12 = rectF.bottom;
                    q6.e eVar6 = this.F;
                    rectF.bottom = Math.min(eVar6.f29215s, this.L.f38302d * eVar6.f29214q) + this.F.f29200c + f12;
                    if (getXAxis().f29198a && getXAxis().f29191t) {
                        rectF.bottom += getXAxis().D;
                        return;
                    }
                    return;
                }
                return;
            }
            float f13 = rectF.top;
            q6.e eVar7 = this.F;
            rectF.top = Math.min(eVar7.f29215s, this.L.f38302d * eVar7.f29214q) + this.F.f29200c + f13;
            if (getXAxis().f29198a && getXAxis().f29191t) {
                rectF.top += getXAxis().D;
            }
        }
    }

    @Override // p6.b, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f27931v == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f27913j0) {
            canvas.drawRect(this.L.f38300b, this.f27911h0);
        }
        if (this.f27914k0) {
            canvas.drawRect(this.L.f38300b, this.f27912i0);
        }
        if (this.f27906a0) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            r6.d dVar = (r6.d) this.f27931v;
            for (T t3 : dVar.f30512i) {
                t3.P(lowestVisibleX, highestVisibleX);
            }
            dVar.a();
            h hVar = this.C;
            r6.d dVar2 = (r6.d) this.f27931v;
            hVar.a(dVar2.f30508d, dVar2.f30507c);
            i iVar = this.f27918o0;
            if (iVar.f29198a) {
                i.a aVar = i.a.LEFT;
                iVar.a(((r6.d) this.f27931v).h(aVar), ((r6.d) this.f27931v).g(aVar));
            }
            i iVar2 = this.f27919p0;
            if (iVar2.f29198a) {
                i.a aVar2 = i.a.RIGHT;
                iVar2.a(((r6.d) this.f27931v).h(aVar2), ((r6.d) this.f27931v).g(aVar2));
            }
            f();
        }
        i iVar3 = this.f27918o0;
        if (iVar3.f29198a) {
            this.f27920q0.d(iVar3.A, iVar3.f29197z);
        }
        i iVar4 = this.f27919p0;
        if (iVar4.f29198a) {
            this.f27921r0.d(iVar4.A, iVar4.f29197z);
        }
        h hVar2 = this.C;
        if (hVar2.f29198a) {
            this.f27924u0.d(hVar2.A, hVar2.f29197z);
        }
        this.f27924u0.o(canvas);
        this.f27920q0.n(canvas);
        this.f27921r0.n(canvas);
        x6.j jVar = this.f27924u0;
        h hVar3 = jVar.f37649i;
        if (hVar3.r && hVar3.f29198a) {
            int save = canvas.save();
            canvas.clipRect(jVar.m());
            if (jVar.f37651k.length != jVar.f37610c.f29184l * 2) {
                jVar.f37651k = new float[hVar3.f29184l * 2];
            }
            float[] fArr = jVar.f37651k;
            for (int i6 = 0; i6 < fArr.length; i6 += 2) {
                float[] fArr2 = hVar3.f29183k;
                int i10 = i6 / 2;
                fArr[i6] = fArr2[i10];
                fArr[i6 + 1] = fArr2[i10];
            }
            jVar.f37611d.e(fArr);
            Paint paint = jVar.f37612e;
            paint.setColor(hVar3.f29179g);
            paint.setStrokeWidth(hVar3.f29180h);
            paint.setPathEffect(null);
            Path path = jVar.f37650j;
            path.reset();
            for (int i11 = 0; i11 < fArr.length; i11 += 2) {
                jVar.g(canvas, fArr[i11], fArr[i11 + 1], path);
            }
            canvas.restoreToCount(save);
        }
        this.f27920q0.o(canvas);
        this.f27921r0.o(canvas);
        boolean z10 = this.C.f29198a;
        boolean z11 = this.f27918o0.f29198a;
        boolean z12 = this.f27919p0.f29198a;
        int save2 = canvas.save();
        canvas.clipRect(this.L.f38300b);
        this.J.e(canvas);
        if (m()) {
            this.J.g(canvas, this.S);
        }
        canvas.restoreToCount(save2);
        this.J.f(canvas);
        if (this.C.f29198a) {
            this.f27924u0.p(canvas);
        }
        if (this.f27918o0.f29198a) {
            this.f27920q0.p(canvas);
        }
        if (this.f27919p0.f29198a) {
            this.f27921r0.p(canvas);
        }
        this.f27924u0.n(canvas);
        this.f27920q0.m(canvas);
        this.f27921r0.m(canvas);
        if (this.f27915l0) {
            int save3 = canvas.save();
            canvas.clipRect(this.L.f38300b);
            this.J.i(canvas);
            canvas.restoreToCount(save3);
        } else {
            this.J.i(canvas);
        }
        this.I.f(canvas);
        g(canvas);
        if (this.f27930u) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j10 = this.f27925v0 + currentTimeMillis2;
            this.f27925v0 = j10;
            long j11 = this.f27926w0 + 1;
            this.f27926w0 = j11;
            Log.i("MPAndroidChart", "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j10 / j11) + " ms, cycles: " + this.f27926w0);
        }
    }

    @Override // p6.b, android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        float[] fArr = this.B0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z10 = this.f27917n0;
        i.a aVar = i.a.LEFT;
        if (z10) {
            RectF rectF = this.L.f38300b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            c(aVar).d(fArr);
        }
        super.onSizeChanged(i6, i10, i11, i12);
        if (this.f27917n0) {
            c(aVar).e(fArr);
            g gVar = this.L;
            Matrix matrix = gVar.f38311n;
            matrix.reset();
            matrix.set(gVar.f38299a);
            float f = fArr[0];
            RectF rectF2 = gVar.f38300b;
            matrix.postTranslate(-(f - rectF2.left), -(fArr[1] - rectF2.top));
            gVar.j(matrix, this, true);
            return;
        }
        g gVar2 = this.L;
        gVar2.j(gVar2.f38299a, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        w6.b bVar = this.G;
        if (bVar == null || this.f27931v == 0 || !this.D) {
            return false;
        }
        return bVar.onTouch(this, motionEvent);
    }

    public void p() {
        if (this.f27930u) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.C.A + ", xmax: " + this.C.f29197z + ", xdelta: " + this.C.B);
        }
        e eVar = this.f27923t0;
        h hVar = this.C;
        float f = hVar.A;
        float f2 = hVar.B;
        i iVar = this.f27919p0;
        eVar.g(f, f2, iVar.B, iVar.A);
        e eVar2 = this.f27922s0;
        h hVar2 = this.C;
        float f10 = hVar2.A;
        float f11 = hVar2.B;
        i iVar2 = this.f27918o0;
        eVar2.g(f10, f11, iVar2.B, iVar2.A);
    }

    public void setAutoScaleMinMaxEnabled(boolean z10) {
        this.f27906a0 = z10;
    }

    public void setBorderColor(int i6) {
        this.f27912i0.setColor(i6);
    }

    public void setBorderWidth(float f) {
        this.f27912i0.setStrokeWidth(f.c(f));
    }

    public void setClipValuesToContent(boolean z10) {
        this.f27915l0 = z10;
    }

    public void setDoubleTapToZoomEnabled(boolean z10) {
        this.c0 = z10;
    }

    public void setDragEnabled(boolean z10) {
        this.e0 = z10;
    }

    public void setDragOffsetX(float f) {
        g gVar = this.L;
        gVar.getClass();
        gVar.f38309l = f.c(f);
    }

    public void setDragOffsetY(float f) {
        g gVar = this.L;
        gVar.getClass();
        gVar.f38310m = f.c(f);
    }

    public void setDrawBorders(boolean z10) {
        this.f27914k0 = z10;
    }

    public void setDrawGridBackground(boolean z10) {
        this.f27913j0 = z10;
    }

    public void setGridBackgroundColor(int i6) {
        this.f27911h0.setColor(i6);
    }

    public void setHighlightPerDragEnabled(boolean z10) {
        this.f27908d0 = z10;
    }

    public void setKeepPositionOnRotation(boolean z10) {
        this.f27917n0 = z10;
    }

    public void setMaxVisibleValueCount(int i6) {
        this.W = i6;
    }

    public void setMinOffset(float f) {
        this.f27916m0 = f;
    }

    public void setPinchZoom(boolean z10) {
        this.f27907b0 = z10;
    }

    public void setRendererLeftYAxis(l lVar) {
        this.f27920q0 = lVar;
    }

    public void setRendererRightYAxis(l lVar) {
        this.f27921r0 = lVar;
    }

    public void setScaleEnabled(boolean z10) {
        this.f27909f0 = z10;
        this.f27910g0 = z10;
    }

    public void setScaleXEnabled(boolean z10) {
        this.f27909f0 = z10;
    }

    public void setScaleYEnabled(boolean z10) {
        this.f27910g0 = z10;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.C.B / f;
        g gVar = this.L;
        gVar.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        gVar.f38304g = f2;
        gVar.h(gVar.f38299a, gVar.f38300b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.C.B / f;
        g gVar = this.L;
        gVar.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        gVar.f38305h = f2;
        gVar.h(gVar.f38299a, gVar.f38300b);
    }

    public void setXAxisRenderer(x6.j jVar) {
        this.f27924u0 = jVar;
    }

    public void setOnDrawListener(w6.e eVar) {
    }
}
