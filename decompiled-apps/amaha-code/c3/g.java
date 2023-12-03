package c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public final class g implements d, a.InterfaceC0183a, j {

    /* renamed from: a  reason: collision with root package name */
    public final String f4804a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4805b;

    /* renamed from: c  reason: collision with root package name */
    public final i3.b f4806c;

    /* renamed from: d  reason: collision with root package name */
    public final t.e<LinearGradient> f4807d = new t.e<>();

    /* renamed from: e  reason: collision with root package name */
    public final t.e<RadialGradient> f4808e = new t.e<>();
    public final Path f;

    /* renamed from: g  reason: collision with root package name */
    public final b3.a f4809g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f4810h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f4811i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4812j;

    /* renamed from: k  reason: collision with root package name */
    public final d3.a<h3.c, h3.c> f4813k;

    /* renamed from: l  reason: collision with root package name */
    public final d3.a<Integer, Integer> f4814l;

    /* renamed from: m  reason: collision with root package name */
    public final d3.a<PointF, PointF> f4815m;

    /* renamed from: n  reason: collision with root package name */
    public final d3.a<PointF, PointF> f4816n;

    /* renamed from: o  reason: collision with root package name */
    public d3.m f4817o;

    /* renamed from: p  reason: collision with root package name */
    public d3.m f4818p;

    /* renamed from: q  reason: collision with root package name */
    public final a3.j f4819q;
    public final int r;

    public g(a3.j jVar, i3.b bVar, h3.d dVar) {
        Path path = new Path();
        this.f = path;
        this.f4809g = new b3.a(1);
        this.f4810h = new RectF();
        this.f4811i = new ArrayList();
        this.f4806c = bVar;
        this.f4804a = dVar.f17090g;
        this.f4805b = dVar.f17091h;
        this.f4819q = jVar;
        this.f4812j = dVar.f17085a;
        path.setFillType(dVar.f17086b);
        this.r = (int) (jVar.f207v.b() / 32.0f);
        d3.a<h3.c, h3.c> k10 = dVar.f17087c.k();
        this.f4813k = k10;
        k10.a(this);
        bVar.f(k10);
        d3.a<Integer, Integer> k11 = dVar.f17088d.k();
        this.f4814l = k11;
        k11.a(this);
        bVar.f(k11);
        d3.a<PointF, PointF> k12 = dVar.f17089e.k();
        this.f4815m = k12;
        k12.a(this);
        bVar.f(k12);
        d3.a<PointF, PointF> k13 = dVar.f.k();
        this.f4816n = k13;
        k13.a(this);
        bVar.f(k13);
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4819q.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        for (int i6 = 0; i6 < list2.size(); i6++) {
            b bVar = list2.get(i6);
            if (bVar instanceof l) {
                this.f4811i.add((l) bVar);
            }
        }
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        if (obj == a3.o.f247d) {
            this.f4814l.j(sVar);
            return;
        }
        ColorFilter colorFilter = a3.o.C;
        i3.b bVar = this.f4806c;
        if (obj == colorFilter) {
            if (sVar == null) {
                this.f4817o = null;
                return;
            }
            d3.m mVar = new d3.m(sVar, null);
            this.f4817o = mVar;
            mVar.a(this);
            bVar.f(this.f4817o);
        } else if (obj == a3.o.D) {
            if (sVar == null) {
                d3.m mVar2 = this.f4818p;
                if (mVar2 != null) {
                    bVar.m(mVar2);
                }
                this.f4818p = null;
                return;
            }
            d3.m mVar3 = new d3.m(sVar, null);
            this.f4818p = mVar3;
            mVar3.a(this);
            bVar.f(this.f4818p);
        }
    }

    @Override // c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4811i;
            if (i6 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i6)).getPath(), matrix);
                i6++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] f(int[] iArr) {
        d3.m mVar = this.f4818p;
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
    @Override // c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        Shader shader;
        float f;
        if (this.f4805b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4811i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((l) arrayList.get(i10)).getPath(), matrix);
            i10++;
        }
        path.computeBounds(this.f4810h, false);
        int i11 = this.f4812j;
        d3.a<h3.c, h3.c> aVar = this.f4813k;
        d3.a<PointF, PointF> aVar2 = this.f4816n;
        d3.a<PointF, PointF> aVar3 = this.f4815m;
        if (i11 == 1) {
            long h10 = h();
            t.e<LinearGradient> eVar = this.f4807d;
            shader = (LinearGradient) eVar.e(h10, null);
            if (shader == null) {
                PointF f2 = aVar3.f();
                PointF f10 = aVar2.f();
                h3.c f11 = aVar.f();
                shader = new LinearGradient(f2.x, f2.y, f10.x, f10.y, f(f11.f17084b), f11.f17083a, Shader.TileMode.CLAMP);
                eVar.h(h10, shader);
            }
        } else {
            long h11 = h();
            t.e<RadialGradient> eVar2 = this.f4808e;
            shader = (RadialGradient) eVar2.e(h11, null);
            if (shader == null) {
                PointF f12 = aVar3.f();
                PointF f13 = aVar2.f();
                h3.c f14 = aVar.f();
                int[] f15 = f(f14.f17084b);
                float[] fArr = f14.f17083a;
                float f16 = f12.x;
                float f17 = f12.y;
                float hypot = (float) Math.hypot(f13.x - f16, f13.y - f17);
                if (hypot <= 0.0f) {
                    f = 0.001f;
                } else {
                    f = hypot;
                }
                shader = new RadialGradient(f16, f17, f, f15, fArr, Shader.TileMode.CLAMP);
                eVar2.h(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        b3.a aVar4 = this.f4809g;
        aVar4.setShader(shader);
        d3.m mVar = this.f4817o;
        if (mVar != null) {
            aVar4.setColorFilter((ColorFilter) mVar.f());
        }
        PointF pointF = m3.f.f24798a;
        aVar4.setAlpha(Math.max(0, Math.min(255, (int) ((((i6 / 255.0f) * this.f4814l.f().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar4);
        hc.d.s();
    }

    @Override // c3.b
    public final String getName() {
        return this.f4804a;
    }

    public final int h() {
        int i6;
        float f = this.f4815m.f12141d;
        int i10 = this.r;
        int round = Math.round(f * i10);
        int round2 = Math.round(this.f4816n.f12141d * i10);
        int round3 = Math.round(this.f4813k.f12141d * i10);
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
