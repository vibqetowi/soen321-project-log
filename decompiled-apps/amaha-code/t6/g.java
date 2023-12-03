package t6;

import com.github.mikephil.charting.charts.RadarChart;
import java.util.ArrayList;
import r6.n;
import v6.h;
/* compiled from: RadarHighlighter.java */
/* loaded from: classes.dex */
public final class g extends f<RadarChart> {
    public g(RadarChart radarChart) {
        super(radarChart);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [r6.j, r6.g] */
    @Override // t6.f
    public final c b(float f, float f2, int i6) {
        ArrayList arrayList = this.f32427b;
        arrayList.clear();
        RadarChart radarChart = (RadarChart) this.f32426a;
        radarChart.getAnimator().getClass();
        radarChart.getAnimator().getClass();
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        y6.c b10 = y6.c.b(0.0f, 0.0f);
        for (int i10 = 0; i10 < ((n) radarChart.getData()).c(); i10++) {
            h b11 = ((n) radarChart.getData()).b(i10);
            ?? x10 = b11.x(i6);
            float f10 = i6;
            y6.f.d(radarChart.getCenterOffsets(), (x10.a() - radarChart.getYChartMin()) * factor * 1.0f, radarChart.getRotationAngle() + (sliceAngle * f10 * 1.0f), b10);
            arrayList.add(new c(f10, x10.a(), b10.f38276b, b10.f38277c, i10, b11.a0()));
        }
        float o10 = radarChart.o(f, f2) / radarChart.getFactor();
        c cVar = null;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar2 = (c) arrayList.get(i11);
            float abs = Math.abs(cVar2.f32420b - o10);
            if (abs < f11) {
                cVar = cVar2;
                f11 = abs;
            }
        }
        return cVar;
    }
}
