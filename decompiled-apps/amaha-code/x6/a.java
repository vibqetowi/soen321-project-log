package x6;

import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: AxisRenderer.java */
/* loaded from: classes.dex */
public abstract class a extends g3.f {

    /* renamed from: c  reason: collision with root package name */
    public final q6.a f37610c;

    /* renamed from: d  reason: collision with root package name */
    public final y6.e f37611d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f37612e;
    public final Paint f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f37613g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f37614h;

    public a(y6.g gVar, y6.e eVar, q6.a aVar) {
        super(1, gVar);
        this.f37611d = eVar;
        this.f37610c = aVar;
        if (gVar != null) {
            this.f = new Paint(1);
            Paint paint = new Paint();
            this.f37612e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f37613g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f37614h = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void d(float f, float f2) {
        y6.g gVar = (y6.g) this.f16181b;
        if (gVar != null && gVar.a() > 10.0f && !gVar.c()) {
            RectF rectF = gVar.f38300b;
            float f10 = rectF.left;
            float f11 = rectF.top;
            y6.e eVar = this.f37611d;
            y6.b b10 = eVar.b(f10, f11);
            RectF rectF2 = gVar.f38300b;
            y6.b b11 = eVar.b(rectF2.left, rectF2.bottom);
            y6.b.c(b10);
            y6.b.c(b11);
            f = (float) b11.f38274c;
            f2 = (float) b10.f38274c;
        }
        e(f, f2);
    }

    public void e(float f, float f2) {
        double ceil;
        double f10;
        int i6;
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
                g5 = ((float) abs) / (i10 - 1);
                aVar.f29184l = i10;
                if (aVar.f29183k.length < i10) {
                    aVar.f29183k = new float[i10];
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    aVar.f29183k[i11] = f11;
                    f11 = (float) (f11 + g5);
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
                aVar.f29184l = i6;
                if (aVar.f29183k.length < i6) {
                    aVar.f29183k = new float[i6];
                }
                for (int i13 = 0; i13 < i6; i13++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    aVar.f29183k[i13] = (float) ceil;
                    ceil += g5;
                }
            }
            if (g5 < 1.0d) {
                aVar.f29185m = (int) Math.ceil(-Math.log10(g5));
                return;
            } else {
                aVar.f29185m = 0;
                return;
            }
        }
        aVar.f29183k = new float[0];
        aVar.f29184l = 0;
    }
}
