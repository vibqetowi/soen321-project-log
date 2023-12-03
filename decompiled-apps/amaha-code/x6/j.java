package x6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
/* compiled from: XAxisRenderer.java */
/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: i  reason: collision with root package name */
    public final q6.h f37649i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f37650j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f37651k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f37652l;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f37653m;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f37654n;

    /* renamed from: o  reason: collision with root package name */
    public final float[] f37655o;

    /* renamed from: p  reason: collision with root package name */
    public final Path f37656p;

    public j(y6.g gVar, q6.h hVar, y6.e eVar) {
        super(gVar, eVar, hVar);
        this.f37650j = new Path();
        this.f37651k = new float[2];
        this.f37652l = new RectF();
        this.f37653m = new float[2];
        this.f37654n = new RectF();
        this.f37655o = new float[4];
        this.f37656p = new Path();
        this.f37649i = hVar;
        this.f.setColor(-16777216);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setTextSize(y6.f.c(10.0f));
    }

    @Override // x6.a
    public void d(float f, float f2) {
        y6.g gVar = (y6.g) this.f16181b;
        if (gVar.a() > 10.0f && !gVar.b()) {
            RectF rectF = gVar.f38300b;
            float f10 = rectF.left;
            float f11 = rectF.top;
            y6.e eVar = this.f37611d;
            y6.b b10 = eVar.b(f10, f11);
            RectF rectF2 = gVar.f38300b;
            y6.b b11 = eVar.b(rectF2.right, rectF2.top);
            y6.b.c(b10);
            y6.b.c(b11);
            f = (float) b10.f38273b;
            f2 = (float) b11.f38273b;
        }
        e(f, f2);
    }

    @Override // x6.a
    public final void e(float f, float f2) {
        super.e(f, f2);
        f();
    }

    public void f() {
        q6.h hVar = this.f37649i;
        String c10 = hVar.c();
        Paint paint = this.f;
        paint.setTypeface(null);
        paint.setTextSize(hVar.f29201d);
        y6.a b10 = y6.f.b(paint, c10);
        float f = b10.f38270b;
        float a10 = y6.f.a(paint, "Q");
        y6.a e10 = y6.f.e(f, a10);
        Math.round(f);
        Math.round(a10);
        hVar.C = Math.round(e10.f38270b);
        hVar.D = Math.round(e10.f38271c);
        y6.d<y6.a> dVar = y6.a.f38269d;
        dVar.c(e10);
        dVar.c(b10);
    }

    public void g(Canvas canvas, float f, float f2, Path path) {
        y6.g gVar = (y6.g) this.f16181b;
        path.moveTo(f, gVar.f38300b.bottom);
        path.lineTo(f, gVar.f38300b.top);
        canvas.drawPath(path, this.f37612e);
        path.reset();
    }

    public final void h(Canvas canvas, String str, float f, float f2, y6.c cVar) {
        Paint paint = this.f;
        Paint.FontMetrics fontMetrics = y6.f.f38298j;
        float fontMetrics2 = paint.getFontMetrics(fontMetrics);
        int length = str.length();
        Rect rect = y6.f.f38297i;
        paint.getTextBounds(str, 0, length, rect);
        float f10 = 0.0f - rect.left;
        float f11 = (-fontMetrics.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (cVar.f38276b != 0.0f || cVar.f38277c != 0.0f) {
            f10 -= rect.width() * cVar.f38276b;
            f11 -= fontMetrics2 * cVar.f38277c;
        }
        canvas.drawText(str, f10 + f, f11 + f2, paint);
        paint.setTextAlign(textAlign);
    }

    public void i(Canvas canvas, float f, y6.c cVar) {
        boolean z10;
        q6.a aVar = this.f37649i;
        aVar.getClass();
        int i6 = aVar.f29184l * 2;
        float[] fArr = new float[i6];
        for (int i10 = 0; i10 < i6; i10 += 2) {
            fArr[i10] = aVar.f29183k[i10 / 2];
        }
        this.f37611d.e(fArr);
        for (int i11 = 0; i11 < i6; i11 += 2) {
            float f2 = fArr[i11];
            y6.g gVar = (y6.g) this.f16181b;
            if (gVar.e(f2) && gVar.f(f2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h(canvas, aVar.d().a(aVar.f29183k[i11 / 2], aVar), f2, f, cVar);
            }
        }
    }

    public RectF m() {
        RectF rectF = this.f37652l;
        rectF.set(((y6.g) this.f16181b).f38300b);
        rectF.inset(-this.f37610c.f29180h, 0.0f);
        return rectF;
    }

    public void n(Canvas canvas) {
        q6.h hVar = this.f37649i;
        if (hVar.f29198a && hVar.f29191t) {
            float f = hVar.f29200c;
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(hVar.f29201d);
            paint.setColor(hVar.f29202e);
            y6.c b10 = y6.c.b(0.0f, 0.0f);
            int i6 = hVar.E;
            Object obj = this.f16181b;
            if (i6 == 1) {
                b10.f38276b = 0.5f;
                b10.f38277c = 1.0f;
                i(canvas, ((y6.g) obj).f38300b.top - f, b10);
            } else if (i6 == 4) {
                b10.f38276b = 0.5f;
                b10.f38277c = 1.0f;
                i(canvas, ((y6.g) obj).f38300b.top + f + hVar.D, b10);
            } else if (i6 == 2) {
                b10.f38276b = 0.5f;
                b10.f38277c = 0.0f;
                i(canvas, ((y6.g) obj).f38300b.bottom + f, b10);
            } else if (i6 == 5) {
                b10.f38276b = 0.5f;
                b10.f38277c = 0.0f;
                i(canvas, (((y6.g) obj).f38300b.bottom - f) - hVar.D, b10);
            } else {
                b10.f38276b = 0.5f;
                b10.f38277c = 1.0f;
                y6.g gVar = (y6.g) obj;
                i(canvas, gVar.f38300b.top - f, b10);
                b10.f38276b = 0.5f;
                b10.f38277c = 0.0f;
                i(canvas, gVar.f38300b.bottom + f, b10);
            }
            y6.c.d(b10);
        }
    }

    public void o(Canvas canvas) {
        q6.h hVar = this.f37649i;
        if (hVar.f29190s && hVar.f29198a) {
            Paint paint = this.f37613g;
            paint.setColor(hVar.f29181i);
            paint.setStrokeWidth(hVar.f29182j);
            paint.setPathEffect(null);
            int i6 = hVar.E;
            Object obj = this.f16181b;
            if (i6 == 1 || i6 == 4 || i6 == 3) {
                RectF rectF = ((y6.g) obj).f38300b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas.drawLine(f, f2, rectF.right, f2, paint);
            }
            int i10 = hVar.E;
            if (i10 == 2 || i10 == 5 || i10 == 3) {
                RectF rectF2 = ((y6.g) obj).f38300b;
                float f10 = rectF2.left;
                float f11 = rectF2.bottom;
                canvas.drawLine(f10, f11, rectF2.right, f11, paint);
            }
        }
    }

    public void p(Canvas canvas) {
        ArrayList arrayList = this.f37649i.f29192u;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f37653m;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (((q6.g) arrayList.get(i6)).f29198a) {
                    int save = canvas.save();
                    RectF rectF = this.f37654n;
                    y6.g gVar = (y6.g) this.f16181b;
                    rectF.set(gVar.f38300b);
                    rectF.inset(-0.0f, 0.0f);
                    canvas.clipRect(rectF);
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    this.f37611d.e(fArr);
                    float f = fArr[0];
                    float[] fArr2 = this.f37655o;
                    fArr2[0] = f;
                    RectF rectF2 = gVar.f38300b;
                    fArr2[1] = rectF2.top;
                    fArr2[2] = fArr[0];
                    fArr2[3] = rectF2.bottom;
                    Path path = this.f37656p;
                    path.reset();
                    path.moveTo(fArr2[0], fArr2[1]);
                    path.lineTo(fArr2[2], fArr2[3]);
                    Paint paint = this.f37614h;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(0);
                    paint.setStrokeWidth(0.0f);
                    paint.setPathEffect(null);
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
