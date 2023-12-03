package x6;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.charts.RadarChart;
import r6.n;
/* compiled from: XAxisRendererRadarChart.java */
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: q  reason: collision with root package name */
    public final RadarChart f37657q;

    public k(y6.g gVar, q6.h hVar, RadarChart radarChart) {
        super(gVar, hVar, null);
        this.f37657q = radarChart;
    }

    @Override // x6.j
    public final void n(Canvas canvas) {
        q6.h hVar = this.f37649i;
        if (hVar.f29198a && hVar.f29191t) {
            y6.c b10 = y6.c.b(0.5f, 0.25f);
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(hVar.f29201d);
            paint.setColor(hVar.f29202e);
            RadarChart radarChart = this.f37657q;
            float sliceAngle = radarChart.getSliceAngle();
            float factor = radarChart.getFactor();
            y6.c centerOffsets = radarChart.getCenterOffsets();
            y6.c b11 = y6.c.b(0.0f, 0.0f);
            for (int i6 = 0; i6 < ((n) radarChart.getData()).f().c0(); i6++) {
                float f = i6;
                String a10 = hVar.d().a(f, hVar);
                y6.f.d(centerOffsets, (hVar.C / 2.0f) + (radarChart.getYRange() * factor), (radarChart.getRotationAngle() + (f * sliceAngle)) % 360.0f, b11);
                h(canvas, a10, b11.f38276b, b11.f38277c - (hVar.D / 2.0f), b10);
            }
            y6.c.d(centerOffsets);
            y6.c.d(b11);
            y6.c.d(b10);
        }
    }

    @Override // x6.j
    public final void p(Canvas canvas) {
    }
}
