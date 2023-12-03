package d3;

import a3.o;
import android.graphics.Matrix;
import android.graphics.PointF;
import d3.a;
import java.util.Collections;
import s1.s;
/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f12164a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f12165b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f12166c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f12167d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f12168e;
    public a<PointF, PointF> f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f12169g;

    /* renamed from: h  reason: collision with root package name */
    public a<n3.c, n3.c> f12170h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f12171i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f12172j;

    /* renamed from: k  reason: collision with root package name */
    public c f12173k;

    /* renamed from: l  reason: collision with root package name */
    public c f12174l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f12175m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f12176n;

    public l(g3.d dVar) {
        a<PointF, PointF> k10;
        a<PointF, PointF> k11;
        a<n3.c, n3.c> k12;
        a<Float, Float> k13;
        c cVar;
        c cVar2;
        k1.c cVar3 = dVar.f16172a;
        if (cVar3 == null) {
            k10 = null;
        } else {
            k10 = cVar3.k();
        }
        this.f = k10;
        g3.e<PointF, PointF> eVar = dVar.f16173b;
        if (eVar == null) {
            k11 = null;
        } else {
            k11 = eVar.k();
        }
        this.f12169g = k11;
        g3.a aVar = dVar.f16174c;
        if (aVar == null) {
            k12 = null;
        } else {
            k12 = aVar.k();
        }
        this.f12170h = k12;
        g3.b bVar = dVar.f16175d;
        if (bVar == null) {
            k13 = null;
        } else {
            k13 = bVar.k();
        }
        this.f12171i = k13;
        g3.b bVar2 = dVar.f;
        if (bVar2 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar2.k();
        }
        this.f12173k = cVar;
        if (cVar != null) {
            this.f12165b = new Matrix();
            this.f12166c = new Matrix();
            this.f12167d = new Matrix();
            this.f12168e = new float[9];
        } else {
            this.f12165b = null;
            this.f12166c = null;
            this.f12167d = null;
            this.f12168e = null;
        }
        g3.b bVar3 = dVar.f16177g;
        if (bVar3 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar3.k();
        }
        this.f12174l = cVar2;
        g3.a aVar2 = dVar.f16176e;
        if (aVar2 != null) {
            this.f12172j = aVar2.k();
        }
        g3.b bVar4 = dVar.f16178h;
        if (bVar4 != null) {
            this.f12175m = bVar4.k();
        } else {
            this.f12175m = null;
        }
        g3.b bVar5 = dVar.f16179i;
        if (bVar5 != null) {
            this.f12176n = bVar5.k();
        } else {
            this.f12176n = null;
        }
    }

    public final void a(i3.b bVar) {
        bVar.f(this.f12172j);
        bVar.f(this.f12175m);
        bVar.f(this.f12176n);
        bVar.f(this.f);
        bVar.f(this.f12169g);
        bVar.f(this.f12170h);
        bVar.f(this.f12171i);
        bVar.f(this.f12173k);
        bVar.f(this.f12174l);
    }

    public final void b(a.InterfaceC0183a interfaceC0183a) {
        a<Integer, Integer> aVar = this.f12172j;
        if (aVar != null) {
            aVar.a(interfaceC0183a);
        }
        a<?, Float> aVar2 = this.f12175m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0183a);
        }
        a<?, Float> aVar3 = this.f12176n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0183a);
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0183a);
        }
        a<?, PointF> aVar5 = this.f12169g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0183a);
        }
        a<n3.c, n3.c> aVar6 = this.f12170h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0183a);
        }
        a<Float, Float> aVar7 = this.f12171i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0183a);
        }
        c cVar = this.f12173k;
        if (cVar != null) {
            cVar.a(interfaceC0183a);
        }
        c cVar2 = this.f12174l;
        if (cVar2 != null) {
            cVar2.a(interfaceC0183a);
        }
    }

    public final boolean c(s sVar, Object obj) {
        c cVar;
        c cVar2;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (obj == o.f248e) {
            a<PointF, PointF> aVar3 = this.f;
            if (aVar3 == null) {
                this.f = new m(sVar, new PointF());
                return true;
            }
            aVar3.j(sVar);
            return true;
        } else if (obj == o.f) {
            a<?, PointF> aVar4 = this.f12169g;
            if (aVar4 == null) {
                this.f12169g = new m(sVar, new PointF());
                return true;
            }
            aVar4.j(sVar);
            return true;
        } else if (obj == o.f253k) {
            a<n3.c, n3.c> aVar5 = this.f12170h;
            if (aVar5 == null) {
                this.f12170h = new m(sVar, new n3.c());
                return true;
            }
            aVar5.j(sVar);
            return true;
        } else if (obj == o.f254l) {
            a<Float, Float> aVar6 = this.f12171i;
            if (aVar6 == null) {
                this.f12171i = new m(sVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.j(sVar);
            return true;
        } else if (obj == o.f246c) {
            a<Integer, Integer> aVar7 = this.f12172j;
            if (aVar7 == null) {
                this.f12172j = new m(sVar, 100);
                return true;
            }
            aVar7.j(sVar);
            return true;
        } else if (obj == o.f266y && (aVar2 = this.f12175m) != null) {
            if (aVar2 == null) {
                this.f12175m = new m(sVar, 100);
                return true;
            }
            aVar2.j(sVar);
            return true;
        } else if (obj == o.f267z && (aVar = this.f12176n) != null) {
            if (aVar == null) {
                this.f12176n = new m(sVar, 100);
                return true;
            }
            aVar.j(sVar);
            return true;
        } else if (obj == o.f255m && (cVar2 = this.f12173k) != null) {
            if (cVar2 == null) {
                this.f12173k = new c(Collections.singletonList(new n3.a(Float.valueOf(0.0f))));
            }
            this.f12173k.j(sVar);
            return true;
        } else if (obj == o.f256n && (cVar = this.f12174l) != null) {
            if (cVar == null) {
                this.f12174l = new c(Collections.singletonList(new n3.a(Float.valueOf(0.0f))));
            }
            this.f12174l.j(sVar);
            return true;
        } else {
            return false;
        }
    }

    public final Matrix d() {
        float cos;
        float sin;
        float[] fArr;
        float k10;
        Matrix matrix = this.f12164a;
        matrix.reset();
        a<?, PointF> aVar = this.f12169g;
        if (aVar != null) {
            PointF f = aVar.f();
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                matrix.preTranslate(f2, f.y);
            }
        }
        a<Float, Float> aVar2 = this.f12171i;
        if (aVar2 != null) {
            if (aVar2 instanceof m) {
                k10 = aVar2.f().floatValue();
            } else {
                k10 = ((c) aVar2).k();
            }
            if (k10 != 0.0f) {
                matrix.preRotate(k10);
            }
        }
        if (this.f12173k != null) {
            c cVar = this.f12174l;
            if (cVar == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-cVar.k()) + 90.0f));
            }
            c cVar2 = this.f12174l;
            if (cVar2 == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-cVar2.k()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(this.f12173k.k()));
            int i6 = 0;
            while (true) {
                fArr = this.f12168e;
                if (i6 >= 9) {
                    break;
                }
                fArr[i6] = 0.0f;
                i6++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f10 = -sin;
            fArr[3] = f10;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f12165b;
            matrix2.setValues(fArr);
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f12166c;
            matrix3.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f10;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f12167d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<n3.c, n3.c> aVar3 = this.f12170h;
        if (aVar3 != null) {
            n3.c f11 = aVar3.f();
            float f12 = f11.f25876a;
            if (f12 != 1.0f || f11.f25877b != 1.0f) {
                matrix.preScale(f12, f11.f25877b);
            }
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            PointF f13 = aVar4.f();
            float f14 = f13.x;
            if (f14 != 0.0f || f13.y != 0.0f) {
                matrix.preTranslate(-f14, -f13.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        PointF f2;
        n3.c f10;
        float f11;
        a<?, PointF> aVar = this.f12169g;
        PointF pointF = null;
        if (aVar == null) {
            f2 = null;
        } else {
            f2 = aVar.f();
        }
        a<n3.c, n3.c> aVar2 = this.f12170h;
        if (aVar2 == null) {
            f10 = null;
        } else {
            f10 = aVar2.f();
        }
        Matrix matrix = this.f12164a;
        matrix.reset();
        if (f2 != null) {
            matrix.preTranslate(f2.x * f, f2.y * f);
        }
        if (f10 != null) {
            double d10 = f;
            matrix.preScale((float) Math.pow(f10.f25876a, d10), (float) Math.pow(f10.f25877b, d10));
        }
        a<Float, Float> aVar3 = this.f12171i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            float f12 = floatValue * f;
            float f13 = 0.0f;
            if (pointF == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF.x;
            }
            if (pointF != null) {
                f13 = pointF.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return matrix;
    }
}
