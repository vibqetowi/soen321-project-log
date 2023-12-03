package x6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import java.util.ArrayList;
import r6.n;
/* compiled from: YAxisRendererRadarChart.java */
/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: p  reason: collision with root package name */
    public final RadarChart f37665p;

    /* renamed from: q  reason: collision with root package name */
    public final Path f37666q;

    public m(y6.g gVar, q6.i iVar, RadarChart radarChart) {
        super(gVar, iVar, null);
        this.f37666q = new Path();
        this.f37665p = radarChart;
    }

    @Override // x6.a
    public final void e(float f, float f2) {
        double ceil;
        double f10;
        int i6;
        char c10;
        float f11 = f;
        q6.a aVar = this.f37610c;
        int i10 = aVar.f29186n;
        double abs = Math.abs(f2 - f11);
        if (i10 != 0 && abs > 0.0d && !Double.isInfinite(abs)) {
            double g5 = y6.f.g(abs / i10);
            if (aVar.f29188p) {
                double d10 = aVar.f29187o;
                if (g5 < d10) {
                    g5 = d10;
                }
            }
            double g10 = y6.f.g(Math.pow(10.0d, (int) Math.log10(g5)));
            if (((int) (g5 / g10)) > 5) {
                g5 = Math.floor(g10 * 10.0d);
            }
            if (aVar.f29189q) {
                float f12 = ((float) abs) / (i10 - 1);
                aVar.f29184l = i10;
                if (aVar.f29183k.length < i10) {
                    aVar.f29183k = new float[i10];
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    aVar.f29183k[i11] = f11;
                    f11 += f12;
                }
            } else {
                int i12 = (g5 > 0.0d ? 1 : (g5 == 0.0d ? 0 : -1));
                if (i12 == 0) {
                    ceil = 0.0d;
                } else {
                    ceil = Math.ceil(f11 / g5) * g5;
                }
                if (i12 == 0) {
                    f10 = 0.0d;
                } else {
                    f10 = y6.f.f(Math.floor(f2 / g5) * g5);
                }
                if (i12 != 0) {
                    i6 = 0;
                    for (double d11 = ceil; d11 <= f10; d11 += g5) {
                        i6++;
                    }
                } else {
                    i6 = 0;
                }
                int i13 = i6 + 1;
                aVar.f29184l = i13;
                if (aVar.f29183k.length < i13) {
                    aVar.f29183k = new float[i13];
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    aVar.f29183k[i14] = (float) ceil;
                    ceil += g5;
                }
                i10 = i13;
            }
            if (g5 < 1.0d) {
                aVar.f29185m = (int) Math.ceil(-Math.log10(g5));
                c10 = 0;
            } else {
                c10 = 0;
                aVar.f29185m = 0;
            }
            float[] fArr = aVar.f29183k;
            float f13 = fArr[c10];
            aVar.A = f13;
            float f14 = fArr[i10 - 1];
            aVar.f29197z = f14;
            aVar.B = Math.abs(f14 - f13);
            return;
        }
        aVar.f29183k = new float[0];
        aVar.f29184l = 0;
    }

    @Override // x6.l
    public final void m(Canvas canvas) {
        q6.i iVar = this.f37658i;
        if (iVar.f29198a && iVar.f29191t) {
            Paint paint = this.f;
            iVar.getClass();
            paint.setTypeface(null);
            paint.setTextSize(iVar.f29201d);
            paint.setColor(iVar.f29202e);
            RadarChart radarChart = this.f37665p;
            y6.c centerOffsets = radarChart.getCenterOffsets();
            y6.c b10 = y6.c.b(0.0f, 0.0f);
            float factor = radarChart.getFactor();
            int i6 = iVar.D ? iVar.f29184l : iVar.f29184l - 1;
            for (int i10 = !iVar.C ? 1 : 0; i10 < i6; i10++) {
                y6.f.d(centerOffsets, (iVar.f29183k[i10] - iVar.A) * factor, radarChart.getRotationAngle(), b10);
                canvas.drawText(iVar.b(i10), b10.f38276b + 10.0f, b10.f38277c, paint);
            }
            y6.c.d(centerOffsets);
            y6.c.d(b10);
        }
    }

    @Override // x6.l
    public final void p(Canvas canvas) {
        ArrayList arrayList = this.f37658i.f29192u;
        if (arrayList == null) {
            return;
        }
        RadarChart radarChart = this.f37665p;
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        y6.c centerOffsets = radarChart.getCenterOffsets();
        y6.c b10 = y6.c.b(0.0f, 0.0f);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (((q6.g) arrayList.get(i6)).f29198a) {
                Paint paint = this.f37614h;
                paint.setColor(0);
                paint.setPathEffect(null);
                paint.setStrokeWidth(0.0f);
                float yChartMin = (0.0f - radarChart.getYChartMin()) * factor;
                Path path = this.f37666q;
                path.reset();
                for (int i10 = 0; i10 < ((n) radarChart.getData()).f().c0(); i10++) {
                    y6.f.d(centerOffsets, yChartMin, radarChart.getRotationAngle() + (i10 * sliceAngle), b10);
                    if (i10 == 0) {
                        path.moveTo(b10.f38276b, b10.f38277c);
                    } else {
                        path.lineTo(b10.f38276b, b10.f38277c);
                    }
                }
                path.close();
                canvas.drawPath(path, paint);
            }
        }
        y6.c.d(centerOffsets);
        y6.c.d(b10);
    }
}
