package y6;

import android.graphics.Matrix;
/* compiled from: Transformer.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public final g f38287c;

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f38285a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f38286b = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f38288d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    public final float[] f38289e = new float[2];

    public e(g gVar) {
        new Matrix();
        new Matrix();
        this.f38287c = gVar;
    }

    public final b a(float f, float f2) {
        float[] fArr = this.f38289e;
        fArr[0] = f;
        fArr[1] = f2;
        e(fArr);
        return b.b(fArr[0], fArr[1]);
    }

    public final b b(float f, float f2) {
        b b10 = b.b(0.0d, 0.0d);
        c(f, f2, b10);
        return b10;
    }

    public final void c(float f, float f2, b bVar) {
        float[] fArr = this.f38289e;
        fArr[0] = f;
        fArr[1] = f2;
        d(fArr);
        bVar.f38273b = fArr[0];
        bVar.f38274c = fArr[1];
    }

    public final void d(float[] fArr) {
        Matrix matrix = this.f38288d;
        matrix.reset();
        this.f38286b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f38287c.f38299a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f38285a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void e(float[] fArr) {
        this.f38285a.mapPoints(fArr);
        this.f38287c.f38299a.mapPoints(fArr);
        this.f38286b.mapPoints(fArr);
    }

    public void f() {
        Matrix matrix = this.f38286b;
        matrix.reset();
        g gVar = this.f38287c;
        matrix.postTranslate(gVar.f38300b.left, gVar.f38302d - gVar.i());
    }

    public final void g(float f, float f2, float f10, float f11) {
        g gVar = this.f38287c;
        float a10 = gVar.a() / f2;
        float height = gVar.f38300b.height() / f10;
        if (Float.isInfinite(a10)) {
            a10 = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        Matrix matrix = this.f38285a;
        matrix.reset();
        matrix.postTranslate(-f, -f11);
        matrix.postScale(a10, -height);
    }
}
