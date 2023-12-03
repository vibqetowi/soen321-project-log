package c3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import s1.s;
/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public final class q extends a {

    /* renamed from: o  reason: collision with root package name */
    public final i3.b f4871o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4872p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f4873q;
    public final d3.a<Integer, Integer> r;

    /* renamed from: s  reason: collision with root package name */
    public d3.m f4874s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(a3.j jVar, i3.b bVar, h3.n nVar) {
        super(jVar, bVar, r3, r4, nVar.f17146i, nVar.f17143e, nVar.f, nVar.f17141c, nVar.f17140b);
        Paint.Cap cap;
        Paint.Join join;
        Paint.Join join2;
        int i6 = nVar.f17144g;
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
            int i11 = nVar.f17145h;
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            join2 = null;
                            this.f4871o = bVar;
                            this.f4872p = nVar.f17139a;
                            this.f4873q = nVar.f17147j;
                            d3.a<Integer, Integer> k10 = nVar.f17142d.k();
                            this.r = k10;
                            k10.a(this);
                            bVar.f(k10);
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
                this.f4871o = bVar;
                this.f4872p = nVar.f17139a;
                this.f4873q = nVar.f17147j;
                d3.a<Integer, Integer> k102 = nVar.f17142d.k();
                this.r = k102;
                k102.a(this);
                bVar.f(k102);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // c3.a, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        Integer num = a3.o.f245b;
        d3.a<Integer, Integer> aVar = this.r;
        if (obj == num) {
            aVar.j(sVar);
        } else if (obj == a3.o.C) {
            if (sVar == null) {
                this.f4874s = null;
                return;
            }
            d3.m mVar = new d3.m(sVar, null);
            this.f4874s = mVar;
            mVar.a(this);
            this.f4871o.f(aVar);
        }
    }

    @Override // c3.a, c3.d
    public final void g(Canvas canvas, Matrix matrix, int i6) {
        if (this.f4873q) {
            return;
        }
        d3.b bVar = (d3.b) this.r;
        int k10 = bVar.k(bVar.b(), bVar.d());
        b3.a aVar = this.f4770i;
        aVar.setColor(k10);
        d3.m mVar = this.f4874s;
        if (mVar != null) {
            aVar.setColorFilter((ColorFilter) mVar.f());
        }
        super.g(canvas, matrix, i6);
    }

    @Override // c3.b
    public final String getName() {
        return this.f4872p;
    }
}
