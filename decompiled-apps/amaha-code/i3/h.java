package i3;

import a3.j;
import a3.o;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import d3.m;
import s1.s;
/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public final class h extends b {
    public m A;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f19792v;

    /* renamed from: w  reason: collision with root package name */
    public final b3.a f19793w;

    /* renamed from: x  reason: collision with root package name */
    public final float[] f19794x;

    /* renamed from: y  reason: collision with root package name */
    public final Path f19795y;

    /* renamed from: z  reason: collision with root package name */
    public final e f19796z;

    public h(j jVar, e eVar) {
        super(jVar, eVar);
        this.f19792v = new RectF();
        b3.a aVar = new b3.a();
        this.f19793w = aVar;
        this.f19794x = new float[8];
        this.f19795y = new Path();
        this.f19796z = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f19781l);
    }

    @Override // i3.b, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        if (obj == o.C) {
            if (sVar == null) {
                this.A = null;
            } else {
                this.A = new m(sVar, null);
            }
        }
    }

    @Override // i3.b, c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        RectF rectF2 = this.f19792v;
        e eVar = this.f19796z;
        rectF2.set(0.0f, 0.0f, eVar.f19779j, eVar.f19780k);
        this.f19753l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // i3.b
    public final void j(Canvas canvas, Matrix matrix, int i6) {
        int intValue;
        e eVar = this.f19796z;
        int alpha = Color.alpha(eVar.f19781l);
        if (alpha == 0) {
            return;
        }
        d3.a<Integer, Integer> aVar = this.f19760t.f12172j;
        if (aVar == null) {
            intValue = 100;
        } else {
            intValue = aVar.f().intValue();
        }
        int i10 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i6 / 255.0f) * 255.0f);
        b3.a aVar2 = this.f19793w;
        aVar2.setAlpha(i10);
        m mVar = this.A;
        if (mVar != null) {
            aVar2.setColorFilter((ColorFilter) mVar.f());
        }
        if (i10 > 0) {
            float[] fArr = this.f19794x;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = eVar.f19779j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = eVar.f19780k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.f19795y;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
