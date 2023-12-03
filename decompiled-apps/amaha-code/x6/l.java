package x6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import q6.i;
/* compiled from: YAxisRenderer.java */
/* loaded from: classes.dex */
public class l extends a {

    /* renamed from: i  reason: collision with root package name */
    public final q6.i f37658i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f37659j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f37660k;

    /* renamed from: l  reason: collision with root package name */
    public float[] f37661l;

    /* renamed from: m  reason: collision with root package name */
    public final Path f37662m;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f37663n;

    /* renamed from: o  reason: collision with root package name */
    public final RectF f37664o;

    public l(y6.g gVar, q6.i iVar, y6.e eVar) {
        super(gVar, eVar, iVar);
        this.f37659j = new Path();
        this.f37660k = new RectF();
        this.f37661l = new float[2];
        new Path();
        new RectF();
        this.f37662m = new Path();
        this.f37663n = new float[2];
        this.f37664o = new RectF();
        this.f37658i = iVar;
        if (gVar != null) {
            this.f.setColor(-16777216);
            this.f.setTextSize(y6.f.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void f(Canvas canvas, float f, float[] fArr, float f2) {
        q6.i iVar = this.f37658i;
        int i6 = iVar.D ? iVar.f29184l : iVar.f29184l - 1;
        for (int i10 = !iVar.C ? 1 : 0; i10 < i6; i10++) {
            canvas.drawText(iVar.b(i10), f, fArr[(i10 * 2) + 1] + f2, this.f);
        }
    }

    public RectF g() {
        RectF rectF = this.f37660k;
        rectF.set(((y6.g) this.f16181b).f38300b);
        rectF.inset(0.0f, -this.f37610c.f29180h);
        return rectF;
    }

    public float[] h() {
        int length = this.f37661l.length;
        q6.i iVar = this.f37658i;
        int i6 = iVar.f29184l;
        if (length != i6 * 2) {
            this.f37661l = new float[i6 * 2];
        }
        float[] fArr = this.f37661l;
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            fArr[i10 + 1] = iVar.f29183k[i10 / 2];
        }
        this.f37611d.e(fArr);
        return fArr;
    }

    public Path i(Path path, int i6, float[] fArr) {
        y6.g gVar = (y6.g) this.f16181b;
        int i10 = i6 + 1;
        path.moveTo(gVar.f38300b.left, fArr[i10]);
        path.lineTo(gVar.f38300b.right, fArr[i10]);
        return path;
    }

    public void m(Canvas canvas) {
        float f;
        float f2;
        float f10;
        q6.i iVar = this.f37658i;
        if (iVar.f29198a && iVar.f29191t) {
            float[] h10 = h();
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(iVar.f29201d);
            paint.setColor(iVar.f29202e);
            float f11 = iVar.f29199b;
            float a10 = (y6.f.a(paint, "A") / 2.5f) + iVar.f29200c;
            i.a aVar = i.a.LEFT;
            i.a aVar2 = iVar.H;
            int i6 = iVar.G;
            Object obj = this.f16181b;
            if (aVar2 == aVar) {
                if (i6 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = ((y6.g) obj).f38300b.left;
                    f10 = f - f11;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = ((y6.g) obj).f38300b.left;
                    f10 = f2 + f11;
                }
            } else if (i6 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = ((y6.g) obj).f38300b.right;
                f10 = f2 + f11;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = ((y6.g) obj).f38300b.right;
                f10 = f - f11;
            }
            f(canvas, f10, h10, a10);
        }
    }

    public void n(Canvas canvas) {
        q6.i iVar = this.f37658i;
        if (iVar.f29198a && iVar.f29190s) {
            Paint paint = this.f37613g;
            paint.setColor(iVar.f29181i);
            paint.setStrokeWidth(iVar.f29182j);
            i.a aVar = iVar.H;
            i.a aVar2 = i.a.LEFT;
            Object obj = this.f16181b;
            if (aVar == aVar2) {
                canvas.drawLine(((y6.g) obj).f38300b.left, ((y6.g) obj).f38300b.top, ((y6.g) obj).f38300b.left, ((y6.g) obj).f38300b.bottom, paint);
            } else {
                canvas.drawLine(((y6.g) obj).f38300b.right, ((y6.g) obj).f38300b.top, ((y6.g) obj).f38300b.right, ((y6.g) obj).f38300b.bottom, paint);
            }
        }
    }

    public final void o(Canvas canvas) {
        q6.i iVar = this.f37658i;
        if (iVar.f29198a && iVar.r) {
            int save = canvas.save();
            canvas.clipRect(g());
            float[] h10 = h();
            Paint paint = this.f37612e;
            paint.setColor(iVar.f29179g);
            paint.setStrokeWidth(iVar.f29180h);
            paint.setPathEffect(null);
            Path path = this.f37659j;
            path.reset();
            for (int i6 = 0; i6 < h10.length; i6 += 2) {
                canvas.drawPath(i(path, i6, h10), paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
    }

    public void p(Canvas canvas) {
        ArrayList arrayList = this.f37658i.f29192u;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f37663n;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f37662m;
            path.reset();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (((q6.g) arrayList.get(i6)).f29198a) {
                    int save = canvas.save();
                    RectF rectF = this.f37664o;
                    y6.g gVar = (y6.g) this.f16181b;
                    rectF.set(gVar.f38300b);
                    rectF.inset(0.0f, -0.0f);
                    canvas.clipRect(rectF);
                    Paint paint = this.f37614h;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(0);
                    paint.setStrokeWidth(0.0f);
                    paint.setPathEffect(null);
                    fArr[1] = 0.0f;
                    this.f37611d.e(fArr);
                    path.moveTo(gVar.f38300b.left, fArr[1]);
                    path.lineTo(gVar.f38300b.right, fArr[1]);
                    canvas.drawPath(path, paint);
                    path.reset();
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
