package c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0183a, j, d {

    /* renamed from: e  reason: collision with root package name */
    public final a3.j f4767e;
    public final i3.b f;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4769h;

    /* renamed from: i  reason: collision with root package name */
    public final b3.a f4770i;

    /* renamed from: j  reason: collision with root package name */
    public final d3.c f4771j;

    /* renamed from: k  reason: collision with root package name */
    public final d3.a<?, Integer> f4772k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f4773l;

    /* renamed from: m  reason: collision with root package name */
    public final d3.c f4774m;

    /* renamed from: n  reason: collision with root package name */
    public d3.m f4775n;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f4763a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f4764b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f4765c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f4766d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4768g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f4776a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final r f4777b;

        public C0104a(r rVar) {
            this.f4777b = rVar;
        }
    }

    public a(a3.j jVar, i3.b bVar, Paint.Cap cap, Paint.Join join, float f, g3.a aVar, g3.b bVar2, List<g3.b> list, g3.b bVar3) {
        b3.a aVar2 = new b3.a(1);
        this.f4770i = aVar2;
        this.f4767e = jVar;
        this.f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f4772k = aVar.k();
        this.f4771j = (d3.c) bVar2.k();
        if (bVar3 == null) {
            this.f4774m = null;
        } else {
            this.f4774m = (d3.c) bVar3.k();
        }
        this.f4773l = new ArrayList(list.size());
        this.f4769h = new float[list.size()];
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f4773l.add(list.get(i6).k());
        }
        bVar.f(this.f4772k);
        bVar.f(this.f4771j);
        for (int i10 = 0; i10 < this.f4773l.size(); i10++) {
            bVar.f((d3.a) this.f4773l.get(i10));
        }
        d3.c cVar = this.f4774m;
        if (cVar != null) {
            bVar.f(cVar);
        }
        this.f4772k.a(this);
        this.f4771j.a(this);
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((d3.a) this.f4773l.get(i11)).a(this);
        }
        d3.c cVar2 = this.f4774m;
        if (cVar2 != null) {
            cVar2.a(this);
        }
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4767e.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0104a c0104a = null;
        r rVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList2.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.f4877c == 2) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f4768g;
            if (size2 < 0) {
                break;
            }
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof r) {
                r rVar3 = (r) bVar2;
                if (rVar3.f4877c == 2) {
                    if (c0104a != null) {
                        arrayList.add(c0104a);
                    }
                    C0104a c0104a2 = new C0104a(rVar3);
                    rVar3.a(this);
                    c0104a = c0104a2;
                }
            }
            if (bVar2 instanceof l) {
                if (c0104a == null) {
                    c0104a = new C0104a(rVar);
                }
                c0104a.f4776a.add((l) bVar2);
            }
        }
        if (c0104a != null) {
            arrayList.add(c0104a);
        }
    }

    @Override // f3.f
    public void d(s sVar, Object obj) {
        if (obj == a3.o.f247d) {
            this.f4772k.j(sVar);
        } else if (obj == a3.o.f257o) {
            this.f4771j.j(sVar);
        } else if (obj == a3.o.C) {
            if (sVar == null) {
                this.f4775n = null;
                return;
            }
            d3.m mVar = new d3.m(sVar, null);
            this.f4775n = mVar;
            mVar.a(this);
            this.f.f(this.f4775n);
        }
    }

    @Override // c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f4764b;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4768g;
            if (i6 < arrayList.size()) {
                C0104a c0104a = (C0104a) arrayList.get(i6);
                for (int i10 = 0; i10 < c0104a.f4776a.size(); i10++) {
                    path.addPath(((l) c0104a.f4776a.get(i10)).getPath(), matrix);
                }
                i6++;
            } else {
                RectF rectF2 = this.f4766d;
                path.computeBounds(rectF2, false);
                float k10 = this.f4771j.k() / 2.0f;
                rectF2.set(rectF2.left - k10, rectF2.top - k10, rectF2.right + k10, rectF2.bottom + k10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                hc.d.s();
                return;
            }
        }
    }

    @Override // c3.d
    public void g(Canvas canvas, Matrix matrix, int i6) {
        boolean z10;
        float[] fArr;
        float floatValue;
        float f;
        float f2;
        float f10;
        a aVar = this;
        float[] fArr2 = m3.g.f24802d;
        boolean z11 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            hc.d.s();
            return;
        }
        d3.e eVar = (d3.e) aVar.f4772k;
        float k10 = (i6 / 255.0f) * eVar.k(eVar.b(), eVar.d());
        float f11 = 100.0f;
        PointF pointF = m3.f.f24798a;
        int max = Math.max(0, Math.min(255, (int) ((k10 / 100.0f) * 255.0f)));
        b3.a aVar2 = aVar.f4770i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(m3.g.d(matrix) * aVar.f4771j.k());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            hc.d.s();
            return;
        }
        ArrayList arrayList = aVar.f4773l;
        if (arrayList.isEmpty()) {
            hc.d.s();
        } else {
            float d10 = m3.g.d(matrix);
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f4769h;
                if (i10 >= size) {
                    break;
                }
                float floatValue2 = ((Float) ((d3.a) arrayList.get(i10)).f()).floatValue();
                fArr[i10] = floatValue2;
                if (i10 % 2 == 0) {
                    if (floatValue2 < 1.0f) {
                        fArr[i10] = 1.0f;
                    }
                } else if (floatValue2 < 0.1f) {
                    fArr[i10] = 0.1f;
                }
                fArr[i10] = fArr[i10] * d10;
                i10++;
            }
            d3.c cVar = aVar.f4774m;
            if (cVar == null) {
                floatValue = 0.0f;
            } else {
                floatValue = cVar.f().floatValue() * d10;
            }
            aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
            hc.d.s();
        }
        d3.m mVar = aVar.f4775n;
        if (mVar != null) {
            aVar2.setColorFilter((ColorFilter) mVar.f());
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f4768g;
            if (i11 < arrayList2.size()) {
                C0104a c0104a = (C0104a) arrayList2.get(i11);
                r rVar = c0104a.f4777b;
                Path path = aVar.f4764b;
                ArrayList arrayList3 = c0104a.f4776a;
                if (rVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        path.addPath(((l) arrayList3.get(size2)).getPath(), matrix);
                    }
                    PathMeasure pathMeasure = aVar.f4763a;
                    pathMeasure.setPath(path, z11);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    r rVar2 = c0104a.f4777b;
                    float floatValue3 = (rVar2.f.f().floatValue() * length) / 360.0f;
                    float floatValue4 = ((rVar2.f4878d.f().floatValue() * length) / f11) + floatValue3;
                    float floatValue5 = ((rVar2.f4879e.f().floatValue() * length) / f11) + floatValue3;
                    int size3 = arrayList3.size() - 1;
                    float f12 = 0.0f;
                    while (size3 >= 0) {
                        Path path2 = aVar.f4765c;
                        path2.set(((l) arrayList3.get(size3)).getPath());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z11);
                        float length2 = pathMeasure.getLength();
                        if (floatValue5 > length) {
                            float f13 = floatValue5 - length;
                            if (f13 < f12 + length2 && f12 < f13) {
                                if (floatValue4 > length) {
                                    f10 = (floatValue4 - length) / length2;
                                } else {
                                    f10 = 0.0f;
                                }
                                m3.g.a(path2, f10, Math.min(f13 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar2);
                                f12 += length2;
                                size3--;
                                aVar = this;
                                z11 = false;
                            }
                        }
                        float f14 = f12 + length2;
                        if (f14 >= floatValue4 && f12 <= floatValue5) {
                            if (f14 <= floatValue5 && floatValue4 < f12) {
                                canvas.drawPath(path2, aVar2);
                            } else {
                                if (floatValue4 < f12) {
                                    f = 0.0f;
                                } else {
                                    f = (floatValue4 - f12) / length2;
                                }
                                if (floatValue5 > f14) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = (floatValue5 - f12) / length2;
                                }
                                m3.g.a(path2, f, f2, 0.0f);
                                canvas.drawPath(path2, aVar2);
                            }
                        }
                        f12 += length2;
                        size3--;
                        aVar = this;
                        z11 = false;
                    }
                    hc.d.s();
                } else {
                    path.reset();
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((l) arrayList3.get(size4)).getPath(), matrix);
                    }
                    hc.d.s();
                    canvas.drawPath(path, aVar2);
                    hc.d.s();
                }
                i11++;
                aVar = this;
                z11 = false;
                f11 = 100.0f;
            } else {
                hc.d.s();
                return;
            }
        }
    }
}
