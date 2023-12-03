package i3;

import a3.j;
import a3.o;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import d3.m;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: v  reason: collision with root package name */
    public d3.a<Float, Float> f19762v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f19763w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f19764x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f19765y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f19766z;

    public c(j jVar, e eVar, List<e> list, a3.c cVar) {
        super(jVar, eVar);
        int i6;
        b bVar;
        b cVar2;
        this.f19763w = new ArrayList();
        this.f19764x = new RectF();
        this.f19765y = new RectF();
        this.f19766z = new Paint();
        g3.b bVar2 = eVar.f19787s;
        if (bVar2 != null) {
            d3.a<Float, Float> k10 = bVar2.k();
            this.f19762v = k10;
            f(k10);
            this.f19762v.a(this);
        } else {
            this.f19762v = null;
        }
        t.e eVar2 = new t.e(cVar.f183i.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = list.get(size);
            int d10 = v.h.d(eVar3.f19775e);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2) {
                        if (d10 != 3) {
                            if (d10 != 4) {
                                if (d10 != 5) {
                                    m3.c.b("Unknown layer type ".concat(defpackage.b.C(eVar3.f19775e)));
                                    cVar2 = null;
                                } else {
                                    cVar2 = new i(jVar, eVar3);
                                }
                            } else {
                                cVar2 = new g(jVar, eVar3);
                            }
                        } else {
                            cVar2 = new f(jVar, eVar3);
                        }
                    } else {
                        cVar2 = new d(jVar, eVar3);
                    }
                } else {
                    cVar2 = new h(jVar, eVar3);
                }
            } else {
                cVar2 = new c(jVar, eVar3, cVar.f178c.get(eVar3.f19776g), cVar);
            }
            if (cVar2 != null) {
                eVar2.h(cVar2.f19755n.f19774d, cVar2);
                if (bVar3 != null) {
                    bVar3.f19757p = cVar2;
                    bVar3 = null;
                } else {
                    this.f19763w.add(0, cVar2);
                    int d11 = v.h.d(eVar3.f19789u);
                    if (d11 == 1 || d11 == 2) {
                        bVar3 = cVar2;
                    }
                }
            }
            size--;
        }
        for (i6 = 0; i6 < eVar2.j(); i6++) {
            b bVar4 = (b) eVar2.e(eVar2.f(i6), null);
            if (bVar4 != null && (bVar = (b) eVar2.e(bVar4.f19755n.f, null)) != null) {
                bVar4.f19758q = bVar;
            }
        }
    }

    @Override // i3.b, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        if (obj == o.A) {
            if (sVar == null) {
                this.f19762v = null;
                return;
            }
            m mVar = new m(sVar, null);
            this.f19762v = mVar;
            f(mVar);
        }
    }

    @Override // i3.b, c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        ArrayList arrayList = this.f19763w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f19764x;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).e(rectF2, this.f19753l, true);
            rectF.union(rectF2);
        }
    }

    @Override // i3.b
    public final void j(Canvas canvas, Matrix matrix, int i6) {
        boolean z10;
        boolean z11;
        RectF rectF = this.f19765y;
        e eVar = this.f19755n;
        rectF.set(0.0f, 0.0f, eVar.f19784o, eVar.f19785p);
        matrix.mapRect(rectF);
        boolean z12 = this.f19754m.J;
        ArrayList arrayList = this.f19763w;
        if (z12 && arrayList.size() > 1 && i6 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.f19766z;
            paint.setAlpha(i6);
            m3.g.e(canvas, rectF, paint, 31);
        } else {
            canvas.save();
        }
        if (z10) {
            i6 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty()) {
                z11 = canvas.clipRect(rectF);
            } else {
                z11 = true;
            }
            if (z11) {
                ((b) arrayList.get(size)).g(canvas, matrix, i6);
            }
        }
        canvas.restore();
        hc.d.s();
    }

    @Override // i3.b
    public final void n(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f19763w;
            if (i10 < arrayList2.size()) {
                ((b) arrayList2.get(i10)).a(eVar, i6, arrayList, eVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // i3.b
    public final void o(float f) {
        super.o(f);
        d3.a<Float, Float> aVar = this.f19762v;
        e eVar = this.f19755n;
        if (aVar != null) {
            a3.c cVar = this.f19754m.f207v;
            f = ((aVar.f().floatValue() * eVar.f19772b.f187m) - eVar.f19772b.f185k) / ((cVar.f186l - cVar.f185k) + 0.01f);
        }
        float f2 = eVar.f19782m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (this.f19762v == null) {
            a3.c cVar2 = eVar.f19772b;
            f -= eVar.f19783n / (cVar2.f186l - cVar2.f185k);
        }
        ArrayList arrayList = this.f19763w;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).o(f);
            } else {
                return;
            }
        }
    }
}
