package c3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import s1.s;
/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f4820o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4821p;

    /* renamed from: q  reason: collision with root package name */
    public final t.e<LinearGradient> f4822q;
    public final t.e<RadialGradient> r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f4823s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4824t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4825u;

    /* renamed from: v  reason: collision with root package name */
    public final d3.a<h3.c, h3.c> f4826v;

    /* renamed from: w  reason: collision with root package name */
    public final d3.a<PointF, PointF> f4827w;

    /* renamed from: x  reason: collision with root package name */
    public final d3.a<PointF, PointF> f4828x;

    /* renamed from: y  reason: collision with root package name */
    public d3.m f4829y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(a3.j jVar, i3.b bVar, h3.e eVar) {
        super(jVar, bVar, r3, r4, eVar.f17100j, eVar.f17095d, eVar.f17097g, eVar.f17101k, eVar.f17102l);
        Paint.Cap cap;
        Paint.Join join;
        Paint.Join join2;
        int i6 = eVar.f17098h;
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.ROUND;
                }
            } else {
                cap = Paint.Cap.BUTT;
            }
            Paint.Cap cap2 = cap;
            int i11 = eVar.f17099i;
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            join2 = null;
                            this.f4822q = new t.e<>();
                            this.r = new t.e<>();
                            this.f4823s = new RectF();
                            this.f4820o = eVar.f17092a;
                            this.f4824t = eVar.f17093b;
                            this.f4821p = eVar.f17103m;
                            this.f4825u = (int) (jVar.f207v.b() / 32.0f);
                            d3.a<h3.c, h3.c> k10 = eVar.f17094c.k();
                            this.f4826v = k10;
                            k10.a(this);
                            bVar.f(k10);
                            d3.a<PointF, PointF> k11 = eVar.f17096e.k();
                            this.f4827w = k11;
                            k11.a(this);
                            bVar.f(k11);
                            d3.a<PointF, PointF> k12 = eVar.f.k();
                            this.f4828x = k12;
                            k12.a(this);
                            bVar.f(k12);
                            return;
                        }
                        join = Paint.Join.BEVEL;
                    } else {
                        join = Paint.Join.ROUND;
                    }
                } else {
                    join = Paint.Join.MITER;
                }
                join2 = join;
                this.f4822q = new t.e<>();
                this.r = new t.e<>();
                this.f4823s = new RectF();
                this.f4820o = eVar.f17092a;
                this.f4824t = eVar.f17093b;
                this.f4821p = eVar.f17103m;
                this.f4825u = (int) (jVar.f207v.b() / 32.0f);
                d3.a<h3.c, h3.c> k102 = eVar.f17094c.k();
                this.f4826v = k102;
                k102.a(this);
                bVar.f(k102);
                d3.a<PointF, PointF> k112 = eVar.f17096e.k();
                this.f4827w = k112;
                k112.a(this);
                bVar.f(k112);
                d3.a<PointF, PointF> k122 = eVar.f.k();
                this.f4828x = k122;
                k122.a(this);
                bVar.f(k122);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // c3.a, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        if (obj == a3.o.D) {
            i3.b bVar = this.f;
            if (sVar == null) {
                d3.m mVar = this.f4829y;
                if (mVar != null) {
                    bVar.m(mVar);
                }
                this.f4829y = null;
                return;
            }
            d3.m mVar2 = new d3.m(sVar, null);
            this.f4829y = mVar2;
            mVar2.a(this);
            bVar.f(this.f4829y);
        }
    }

    public final int[] f(int[] iArr) {
        d3.m mVar = this.f4829y;
        if (mVar != null) {
            Integer[] numArr = (Integer[]) mVar.f();
            int i6 = 0;
            if (iArr.length == numArr.length) {
                while (i6 < iArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i6 < numArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c3.a, c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        Shader shader;
        float f;
        float f2;
        if (this.f4821p) {
            return;
        }
        e(this.f4823s, matrix, false);
        int i10 = this.f4824t;
        d3.a<h3.c, h3.c> aVar = this.f4826v;
        d3.a<PointF, PointF> aVar2 = this.f4828x;
        d3.a<PointF, PointF> aVar3 = this.f4827w;
        if (i10 == 1) {
            long h10 = h();
            t.e<LinearGradient> eVar = this.f4822q;
            shader = (LinearGradient) eVar.e(h10, null);
            if (shader == null) {
                PointF f10 = aVar3.f();
                PointF f11 = aVar2.f();
                h3.c f12 = aVar.f();
                shader = new LinearGradient(f10.x, f10.y, f11.x, f11.y, f(f12.f17084b), f12.f17083a, Shader.TileMode.CLAMP);
                eVar.h(h10, shader);
            }
        } else {
            long h11 = h();
            t.e<RadialGradient> eVar2 = this.r;
            shader = (RadialGradient) eVar2.e(h11, null);
            if (shader == null) {
                PointF f13 = aVar3.f();
                PointF f14 = aVar2.f();
                h3.c f15 = aVar.f();
                int[] f16 = f(f15.f17084b);
                float[] fArr = f15.f17083a;
                shader = new RadialGradient(f13.x, f13.y, (float) Math.hypot(f14.x - f, f14.y - f2), f16, fArr, Shader.TileMode.CLAMP);
                eVar2.h(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.f4770i.setShader(shader);
        super.g(canvas, matrix, i6);
    }

    @Override // c3.b
    public final String getName() {
        return this.f4820o;
    }

    public final int h() {
        int i6;
        float f = this.f4827w.f12141d;
        int i10 = this.f4825u;
        int round = Math.round(f * i10);
        int round2 = Math.round(this.f4828x.f12141d * i10);
        int round3 = Math.round(this.f4826v.f12141d * i10);
        if (round != 0) {
            i6 = 527 * round;
        } else {
            i6 = 17;
        }
        if (round2 != 0) {
            i6 = i6 * 31 * round2;
        }
        if (round3 != 0) {
            return i6 * 31 * round3;
        }
        return i6;
    }
}
