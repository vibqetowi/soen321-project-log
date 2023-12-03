package x6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import com.appsflyer.R;
import com.github.mikephil.charting.charts.RadarChart;
import r6.n;
import r6.p;
/* compiled from: RadarChartRenderer.java */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: h  reason: collision with root package name */
    public final RadarChart f37646h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f37647i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f37648j;

    public i(RadarChart radarChart, n6.a aVar, y6.g gVar) {
        super(aVar, gVar);
        this.f37648j = new Path();
        new Path();
        this.f37646h = radarChart;
        Paint paint = new Paint(1);
        this.f37623e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f37623e.setStrokeWidth(2.0f);
        this.f37623e.setColor(Color.rgb(255, 187, (int) R.styleable.AppCompatTheme_tooltipFrameBackground));
        Paint paint2 = new Paint(1);
        this.f37647i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        new Paint(1);
    }

    @Override // x6.d
    public final void e(Canvas canvas) {
        Paint paint;
        RadarChart radarChart = this.f37646h;
        n nVar = (n) radarChart.getData();
        int c0 = nVar.f().c0();
        for (T t3 : nVar.f30512i) {
            if (t3.isVisible()) {
                this.f37621c.getClass();
                float sliceAngle = radarChart.getSliceAngle();
                float factor = radarChart.getFactor();
                y6.c centerOffsets = radarChart.getCenterOffsets();
                y6.c b10 = y6.c.b(0.0f, 0.0f);
                Path path = this.f37648j;
                path.reset();
                int i6 = 0;
                boolean z10 = false;
                while (true) {
                    int c02 = t3.c0();
                    paint = this.f37622d;
                    if (i6 >= c02) {
                        break;
                    }
                    paint.setColor(t3.B(i6));
                    y6.f.d(centerOffsets, (((p) t3.x(i6)).f30503u - radarChart.getYChartMin()) * factor * 1.0f, radarChart.getRotationAngle() + (i6 * sliceAngle * 1.0f), b10);
                    if (!Float.isNaN(b10.f38276b)) {
                        if (!z10) {
                            path.moveTo(b10.f38276b, b10.f38277c);
                            z10 = true;
                        } else {
                            path.lineTo(b10.f38276b, b10.f38277c);
                        }
                    }
                    i6++;
                }
                if (t3.c0() > c0) {
                    path.lineTo(centerOffsets.f38276b, centerOffsets.f38277c);
                }
                path.close();
                if (t3.y()) {
                    t3.s();
                    int c10 = (t3.c() & 16777215) | (t3.e() << 24);
                    DisplayMetrics displayMetrics = y6.f.f38290a;
                    int save = canvas.save();
                    canvas.clipPath(path);
                    canvas.drawColor(c10);
                    canvas.restoreToCount(save);
                }
                paint.setStrokeWidth(t3.h());
                paint.setStyle(Paint.Style.STROKE);
                if (!t3.y() || t3.e() < 255) {
                    canvas.drawPath(path, paint);
                }
                y6.c.d(centerOffsets);
                y6.c.d(b10);
            }
        }
    }

    @Override // x6.d
    public final void f(Canvas canvas) {
        RadarChart radarChart = this.f37646h;
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        float rotationAngle = radarChart.getRotationAngle();
        y6.c centerOffsets = radarChart.getCenterOffsets();
        Paint paint = this.f37647i;
        paint.setStrokeWidth(radarChart.getWebLineWidth());
        paint.setColor(radarChart.getWebColor());
        paint.setAlpha(radarChart.getWebAlpha());
        int skipWebLineCount = radarChart.getSkipWebLineCount() + 1;
        int c0 = ((n) radarChart.getData()).f().c0();
        y6.c b10 = y6.c.b(0.0f, 0.0f);
        int i6 = 0;
        while (i6 < c0) {
            y6.f.d(centerOffsets, radarChart.getYRange() * factor, (i6 * sliceAngle) + rotationAngle, b10);
            canvas.drawLine(centerOffsets.f38276b, centerOffsets.f38277c, b10.f38276b, b10.f38277c, paint);
            i6 += skipWebLineCount;
            b10 = b10;
        }
        y6.c.d(b10);
        paint.setStrokeWidth(radarChart.getWebLineWidthInner());
        paint.setColor(radarChart.getWebColorInner());
        paint.setAlpha(radarChart.getWebAlpha());
        int i10 = radarChart.getYAxis().f29184l;
        y6.c b11 = y6.c.b(0.0f, 0.0f);
        y6.c b12 = y6.c.b(0.0f, 0.0f);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = 0;
            while (i12 < ((n) radarChart.getData()).d()) {
                float yChartMin = (radarChart.getYAxis().f29183k[i11] - radarChart.getYChartMin()) * factor;
                y6.f.d(centerOffsets, yChartMin, (i12 * sliceAngle) + rotationAngle, b11);
                int i13 = i12 + 1;
                y6.f.d(centerOffsets, yChartMin, (i13 * sliceAngle) + rotationAngle, b12);
                canvas.drawLine(b11.f38276b, b11.f38277c, b12.f38276b, b12.f38277c, paint);
                i11 = i11;
                i12 = i13;
            }
            i11++;
        }
        y6.c.d(b11);
        y6.c.d(b12);
    }

    @Override // x6.d
    public final void g(Canvas canvas, t6.c[] cVarArr) {
        RadarChart radarChart;
        t6.c[] cVarArr2 = cVarArr;
        RadarChart radarChart2 = this.f37646h;
        float sliceAngle = radarChart2.getSliceAngle();
        float factor = radarChart2.getFactor();
        y6.c centerOffsets = radarChart2.getCenterOffsets();
        y6.c b10 = y6.c.b(0.0f, 0.0f);
        n nVar = (n) radarChart2.getData();
        int length = cVarArr2.length;
        int i6 = 0;
        while (i6 < length) {
            t6.c cVar = cVarArr2[i6];
            v6.h b11 = nVar.b(cVar.f);
            if (b11 != null && b11.f0()) {
                float f = cVar.f32419a;
                r6.j jVar = (p) b11.x((int) f);
                if (o(jVar, b11)) {
                    this.f37621c.getClass();
                    y6.f.d(centerOffsets, (jVar.f30503u - radarChart2.getYChartMin()) * factor * 1.0f, radarChart2.getRotationAngle() + (f * sliceAngle * 1.0f), b10);
                    float f2 = b10.f38276b;
                    float f10 = b10.f38277c;
                    this.f37623e.setColor(b11.Z());
                    this.f37623e.setStrokeWidth(b11.q());
                    Paint paint = this.f37623e;
                    b11.K();
                    paint.setPathEffect(null);
                    boolean g02 = b11.g0();
                    Path path = this.f37629g;
                    Object obj = this.f16181b;
                    if (g02) {
                        path.reset();
                        y6.g gVar = (y6.g) obj;
                        radarChart = radarChart2;
                        path.moveTo(f2, gVar.f38300b.top);
                        path.lineTo(f2, gVar.f38300b.bottom);
                        canvas.drawPath(path, this.f37623e);
                    } else {
                        radarChart = radarChart2;
                    }
                    if (b11.i0()) {
                        path.reset();
                        y6.g gVar2 = (y6.g) obj;
                        path.moveTo(gVar2.f38300b.left, f10);
                        path.lineTo(gVar2.f38300b.right, f10);
                        canvas.drawPath(path, this.f37623e);
                    }
                    b11.l();
                    i6++;
                    cVarArr2 = cVarArr;
                    radarChart2 = radarChart;
                }
            }
            radarChart = radarChart2;
            i6++;
            cVarArr2 = cVarArr;
            radarChart2 = radarChart;
        }
        y6.c.d(centerOffsets);
        y6.c.d(b10);
    }

    @Override // x6.d
    public final void i(Canvas canvas) {
        int i6;
        int i10;
        y6.c cVar;
        v6.h hVar;
        int i11;
        this.f37621c.getClass();
        RadarChart radarChart = this.f37646h;
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        y6.c centerOffsets = radarChart.getCenterOffsets();
        y6.c b10 = y6.c.b(0.0f, 0.0f);
        y6.c b11 = y6.c.b(0.0f, 0.0f);
        float c10 = y6.f.c(5.0f);
        int i12 = 0;
        while (i12 < ((n) radarChart.getData()).c()) {
            v6.h b12 = ((n) radarChart.getData()).b(i12);
            if (!c.p(b12)) {
                i6 = i12;
            } else {
                d(b12);
                y6.c c11 = y6.c.c(b12.d0());
                c11.f38276b = y6.f.c(c11.f38276b);
                c11.f38277c = y6.f.c(c11.f38277c);
                int i13 = 0;
                while (i13 < b12.c0()) {
                    r6.j jVar = (p) b12.x(i13);
                    y6.f.d(centerOffsets, (jVar.f30503u - radarChart.getYChartMin()) * factor * 1.0f, radarChart.getRotationAngle() + (i13 * sliceAngle * 1.0f), b10);
                    if (b12.W()) {
                        int J = b12.J(i13);
                        i10 = i13;
                        cVar = c11;
                        hVar = b12;
                        i11 = i12;
                        h(canvas, b12.u(), jVar.f30503u, jVar, i12, b10.f38276b, b10.f38277c - c10, J);
                    } else {
                        i10 = i13;
                        cVar = c11;
                        hVar = b12;
                        i11 = i12;
                    }
                    i13 = i10 + 1;
                    i12 = i11;
                    b12 = hVar;
                    c11 = cVar;
                }
                i6 = i12;
                y6.c.d(c11);
            }
            i12 = i6 + 1;
        }
        y6.c.d(centerOffsets);
        y6.c.d(b10);
        y6.c.d(b11);
    }

    @Override // x6.d
    public final void m() {
    }
}
