package yb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f38488a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f38489b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f38490c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f38491d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f38492e;
    @Deprecated
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f38493g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f38494h = new ArrayList();

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final c f38495c;

        public a(c cVar) {
            this.f38495c = cVar;
        }

        @Override // yb.l.f
        public final void a(Matrix matrix, xb.a aVar, int i6, Canvas canvas) {
            boolean z10;
            c cVar = this.f38495c;
            float f = cVar.f;
            float f2 = cVar.f38504g;
            RectF rectF = new RectF(cVar.f38500b, cVar.f38501c, cVar.f38502d, cVar.f38503e);
            aVar.getClass();
            if (f2 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar.f37719g;
            int[] iArr = xb.a.f37712k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f;
                iArr[2] = aVar.f37718e;
                iArr[3] = aVar.f37717d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f10 = -i6;
                rectF.inset(f10, f10);
                iArr[0] = 0;
                iArr[1] = aVar.f37717d;
                iArr[2] = aVar.f37718e;
                iArr[3] = aVar.f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f11 = 1.0f - (i6 / width);
                float[] fArr = xb.a.f37713l;
                fArr[1] = f11;
                fArr[2] = ((1.0f - f11) / 2.0f) + f11;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar.f37715b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f37720h);
                }
                canvas.drawArc(rectF, f, f2, true, paint);
                canvas.restore();
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public final d f38496c;

        /* renamed from: d  reason: collision with root package name */
        public final float f38497d;

        /* renamed from: e  reason: collision with root package name */
        public final float f38498e;

        public b(d dVar, float f, float f2) {
            this.f38496c = dVar;
            this.f38497d = f;
            this.f38498e = f2;
        }

        @Override // yb.l.f
        public final void a(Matrix matrix, xb.a aVar, int i6, Canvas canvas) {
            d dVar = this.f38496c;
            float f = dVar.f38506c;
            float f2 = this.f38498e;
            float f10 = dVar.f38505b;
            float f11 = this.f38497d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f10 - f11), 0.0f);
            Matrix matrix2 = this.f38509a;
            matrix2.set(matrix);
            matrix2.preTranslate(f11, f2);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i6;
            rectF.offset(0.0f, -i6);
            int[] iArr = xb.a.f37710i;
            iArr[0] = aVar.f;
            iArr[1] = aVar.f37718e;
            iArr[2] = aVar.f37717d;
            Paint paint = aVar.f37716c;
            float f12 = rectF.left;
            paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, xb.a.f37711j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f38496c;
            return (float) Math.toDegrees(Math.atan((dVar.f38506c - this.f38498e) / (dVar.f38505b - this.f38497d)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f38499h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f38500b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f38501c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f38502d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f38503e;
        @Deprecated
        public float f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f38504g;

        public c(float f, float f2, float f10, float f11) {
            this.f38500b = f;
            this.f38501c = f2;
            this.f38502d = f10;
            this.f38503e = f11;
        }

        @Override // yb.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f38507a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f38499h;
            rectF.set(this.f38500b, this.f38501c, this.f38502d, this.f38503e);
            path.arcTo(rectF, this.f, this.f38504g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f38505b;

        /* renamed from: c  reason: collision with root package name */
        public float f38506c;

        @Override // yb.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f38507a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f38505b, this.f38506c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f38507a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f38508b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f38509a = new Matrix();

        public abstract void a(Matrix matrix, xb.a aVar, int i6, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2, float f10, float f11, float f12, float f13, float f14) {
        boolean z10;
        float f15;
        c cVar = new c(f2, f10, f11, f12);
        cVar.f = f13;
        cVar.f38504g = f14;
        this.f38493g.add(cVar);
        a aVar = new a(cVar);
        float f16 = f13 + f14;
        if (f14 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        if (z10) {
            f15 = (180.0f + f16) % 360.0f;
        } else {
            f15 = f16;
        }
        b(f13);
        this.f38494h.add(aVar);
        this.f38492e = f15;
        double d10 = f16;
        this.f38490c = (((f11 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f2 + f11) * 0.5f);
        this.f38491d = (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
    }

    public final void b(float f2) {
        float f10 = this.f38492e;
        if (f10 == f2) {
            return;
        }
        float f11 = ((f2 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f38490c;
        float f13 = this.f38491d;
        c cVar = new c(f12, f13, f12, f13);
        cVar.f = this.f38492e;
        cVar.f38504g = f11;
        this.f38494h.add(new a(cVar));
        this.f38492e = f2;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f38493g;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) arrayList.get(i6)).a(matrix, path);
        }
    }

    public final void d(float f2, float f10) {
        d dVar = new d();
        dVar.f38505b = f2;
        dVar.f38506c = f10;
        this.f38493g.add(dVar);
        b bVar = new b(dVar, this.f38490c, this.f38491d);
        b(bVar.b() + 270.0f);
        this.f38494h.add(bVar);
        this.f38492e = bVar.b() + 270.0f;
        this.f38490c = f2;
        this.f38491d = f10;
    }

    public final void e(float f2, float f10, float f11) {
        this.f38488a = 0.0f;
        this.f38489b = f2;
        this.f38490c = 0.0f;
        this.f38491d = f2;
        this.f38492e = f10;
        this.f = (f10 + f11) % 360.0f;
        this.f38493g.clear();
        this.f38494h.clear();
    }
}
