package p6;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.RadarChart;
import q6.e;
import r6.h;
import r6.j;
import w6.f;
import y6.g;
/* compiled from: PieRadarChartBase.java */
/* loaded from: classes.dex */
public abstract class d<T extends h<? extends v6.d<? extends j>>> extends b<T> {
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public float f27948a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27949b0;
    public float c0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = 270.0f;
        this.f27948a0 = 270.0f;
        this.f27949b0 = true;
        this.c0 = 0.0f;
    }

    @Override // android.view.View
    public final void computeScroll() {
        w6.b bVar = this.G;
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            if (fVar.C != 0.0f) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = fVar.C;
                T t3 = fVar.f36569x;
                d dVar = (d) t3;
                fVar.C = dVar.getDragDecelerationFrictionCoef() * f;
                dVar.setRotationAngle((fVar.C * (((float) (currentAnimationTimeMillis - fVar.B)) / 1000.0f)) + dVar.getRotationAngle());
                fVar.B = currentAnimationTimeMillis;
                if (Math.abs(fVar.C) >= 0.001d) {
                    DisplayMetrics displayMetrics = y6.f.f38290a;
                    t3.postInvalidateOnAnimation();
                    return;
                }
                fVar.C = 0.0f;
            }
        }
    }

    @Override // p6.b
    public void f() {
        float f;
        float f2;
        float f10;
        float min;
        float f11;
        float f12;
        float c10;
        float f13;
        float f14;
        e eVar = this.F;
        float f15 = 0.0f;
        if (eVar != null && eVar.f29198a) {
            float min2 = Math.min(eVar.r, this.L.f38301c * eVar.f29214q);
            int d10 = v.h.d(this.F.f29206i);
            if (d10 != 0) {
                if (d10 == 1) {
                    e eVar2 = this.F;
                    int i6 = eVar2.f29204g;
                    if (i6 != 1 && i6 != 3) {
                        c10 = 0.0f;
                    } else if (eVar2.f29205h == 2) {
                        c10 = y6.f.c(13.0f) + min2;
                    } else {
                        c10 = y6.f.c(8.0f) + min2;
                        e eVar3 = this.F;
                        float f16 = eVar3.f29215s + eVar3.f29216t;
                        y6.c center = getCenter();
                        if (this.F.f29204g == 3) {
                            f13 = (getWidth() - c10) + 15.0f;
                        } else {
                            f13 = c10 - 15.0f;
                        }
                        float f17 = f16 + 15.0f;
                        float o10 = o(f13, f17);
                        float radius = getRadius();
                        float p10 = p(f13, f17);
                        y6.c b10 = y6.c.b(0.0f, 0.0f);
                        double d11 = radius;
                        double d12 = p10;
                        b10.f38276b = (float) (center.f38276b + (Math.cos(Math.toRadians(d12)) * d11));
                        float sin = (float) ((Math.sin(Math.toRadians(d12)) * d11) + center.f38277c);
                        b10.f38277c = sin;
                        float o11 = o(b10.f38276b, sin);
                        float c11 = y6.f.c(5.0f);
                        if (f17 < center.f38277c || getHeight() - c10 <= getWidth()) {
                            if (o10 < o11) {
                                c10 = (o11 - o10) + c11;
                            } else {
                                c10 = 0.0f;
                            }
                        }
                        y6.c.d(center);
                        y6.c.d(b10);
                    }
                    int d13 = v.h.d(this.F.f29204g);
                    if (d13 != 0) {
                        if (d13 != 1) {
                            if (d13 == 2) {
                                f12 = c10;
                                f14 = 0.0f;
                                c10 = 0.0f;
                                float f18 = c10;
                                f11 = f14;
                                min = f15;
                                f15 = f18;
                                float requiredBaseOffset = f15 + getRequiredBaseOffset();
                                f10 = f12 + getRequiredBaseOffset();
                                float requiredBaseOffset2 = min + getRequiredBaseOffset();
                                f2 = f11 + getRequiredBaseOffset();
                                f15 = requiredBaseOffset2;
                                f = requiredBaseOffset;
                            }
                        } else {
                            int d14 = v.h.d(this.F.f29205h);
                            if (d14 != 0) {
                                if (d14 == 2) {
                                    e eVar4 = this.F;
                                    f14 = Math.min(eVar4.f29215s, this.L.f38302d * eVar4.f29214q);
                                    c10 = 0.0f;
                                }
                            } else {
                                e eVar5 = this.F;
                                f15 = Math.min(eVar5.f29215s, this.L.f38302d * eVar5.f29214q);
                            }
                        }
                        f14 = 0.0f;
                        c10 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    f12 = 0.0f;
                    float f182 = c10;
                    f11 = f14;
                    min = f15;
                    f15 = f182;
                    float requiredBaseOffset3 = f15 + getRequiredBaseOffset();
                    f10 = f12 + getRequiredBaseOffset();
                    float requiredBaseOffset22 = min + getRequiredBaseOffset();
                    f2 = f11 + getRequiredBaseOffset();
                    f15 = requiredBaseOffset22;
                    f = requiredBaseOffset3;
                }
            } else {
                int i10 = this.F.f29205h;
                if (i10 == 1 || i10 == 3) {
                    float requiredLegendOffset = getRequiredLegendOffset();
                    e eVar6 = this.F;
                    min = Math.min(eVar6.f29215s + requiredLegendOffset, this.L.f38302d * eVar6.f29214q);
                    int d15 = v.h.d(this.F.f29205h);
                    if (d15 != 0) {
                        if (d15 == 2) {
                            f11 = min;
                            min = 0.0f;
                            f12 = 0.0f;
                            float requiredBaseOffset32 = f15 + getRequiredBaseOffset();
                            f10 = f12 + getRequiredBaseOffset();
                            float requiredBaseOffset222 = min + getRequiredBaseOffset();
                            f2 = f11 + getRequiredBaseOffset();
                            f15 = requiredBaseOffset222;
                            f = requiredBaseOffset32;
                        }
                    }
                    f11 = 0.0f;
                    f12 = 0.0f;
                    float requiredBaseOffset322 = f15 + getRequiredBaseOffset();
                    f10 = f12 + getRequiredBaseOffset();
                    float requiredBaseOffset2222 = min + getRequiredBaseOffset();
                    f2 = f11 + getRequiredBaseOffset();
                    f15 = requiredBaseOffset2222;
                    f = requiredBaseOffset322;
                }
            }
            min = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            float requiredBaseOffset3222 = f15 + getRequiredBaseOffset();
            f10 = f12 + getRequiredBaseOffset();
            float requiredBaseOffset22222 = min + getRequiredBaseOffset();
            f2 = f11 + getRequiredBaseOffset();
            f15 = requiredBaseOffset22222;
            f = requiredBaseOffset3222;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f10 = 0.0f;
        }
        float c12 = y6.f.c(this.c0);
        if (this instanceof RadarChart) {
            q6.h xAxis = getXAxis();
            if (xAxis.f29198a && xAxis.f29191t) {
                c12 = Math.max(c12, xAxis.C);
            }
        }
        float extraTopOffset = getExtraTopOffset() + f15;
        float extraRightOffset = getExtraRightOffset() + f10;
        float extraBottomOffset = getExtraBottomOffset() + f2;
        float max = Math.max(c12, getExtraLeftOffset() + f);
        float max2 = Math.max(c12, extraTopOffset);
        float max3 = Math.max(c12, extraRightOffset);
        float max4 = Math.max(c12, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        g gVar = this.L;
        gVar.f38300b.set(max, max2, gVar.f38301c - max3, gVar.f38302d - max4);
        if (this.f27930u) {
            Log.i("MPAndroidChart", "offsetLeft: " + max + ", offsetTop: " + max2 + ", offsetRight: " + max3 + ", offsetBottom: " + max4);
        }
    }

    public float getDiameter() {
        RectF rectF = this.L.f38300b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p6.b, u6.c
    public int getMaxVisibleCount() {
        return this.f27931v.d();
    }

    public float getMinOffset() {
        return this.c0;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.f27948a0;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.W;
    }

    @Override // p6.b
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // p6.b
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // p6.b
    public void j() {
        super.j();
        this.G = new f(this);
    }

    @Override // p6.b
    public void k() {
        if (this.f27931v == null) {
            return;
        }
        n();
        if (this.F != null) {
            this.I.d(this.f27931v);
        }
        f();
    }

    public final float o(float f, float f2) {
        float f10;
        float f11;
        y6.c centerOffsets = getCenterOffsets();
        float f12 = centerOffsets.f38276b;
        if (f > f12) {
            f10 = f - f12;
        } else {
            f10 = f12 - f;
        }
        float f13 = centerOffsets.f38277c;
        if (f2 > f13) {
            f11 = f2 - f13;
        } else {
            f11 = f13 - f2;
        }
        float sqrt = (float) Math.sqrt(Math.pow(f11, 2.0d) + Math.pow(f10, 2.0d));
        y6.c.d(centerOffsets);
        return sqrt;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w6.b bVar;
        if (this.D && (bVar = this.G) != null) {
            return bVar.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final float p(float f, float f2) {
        y6.c centerOffsets = getCenterOffsets();
        double d10 = f - centerOffsets.f38276b;
        double d11 = f2 - centerOffsets.f38277c;
        float degrees = (float) Math.toDegrees(Math.acos(d11 / Math.sqrt((d11 * d11) + (d10 * d10))));
        if (f > centerOffsets.f38276b) {
            degrees = 360.0f - degrees;
        }
        float f10 = degrees + 90.0f;
        if (f10 > 360.0f) {
            f10 -= 360.0f;
        }
        y6.c.d(centerOffsets);
        return f10;
    }

    public abstract int q(float f);

    public void setMinOffset(float f) {
        this.c0 = f;
    }

    public void setRotationAngle(float f) {
        this.f27948a0 = f;
        DisplayMetrics displayMetrics = y6.f.f38290a;
        while (f < 0.0f) {
            f += 360.0f;
        }
        this.W = f % 360.0f;
    }

    public void setRotationEnabled(boolean z10) {
        this.f27949b0 = z10;
    }

    public void n() {
    }
}
