package x6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.appsflyer.R;
import java.util.List;
import q6.i;
/* compiled from: BarChartRenderer.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: g  reason: collision with root package name */
    public final u6.a f37615g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f37616h;

    /* renamed from: i  reason: collision with root package name */
    public o6.a[] f37617i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f37618j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f37619k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f37620l;

    public b(u6.a aVar, n6.a aVar2, y6.g gVar) {
        super(aVar2, gVar);
        this.f37616h = new RectF();
        this.f37620l = new RectF();
        this.f37615g = aVar;
        Paint paint = new Paint(1);
        this.f37623e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f37623e.setColor(Color.rgb(0, 0, 0));
        this.f37623e.setAlpha(R.styleable.AppCompatTheme_windowFixedHeightMajor);
        Paint paint2 = new Paint(1);
        this.f37618j = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f37619k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // x6.d
    public final void e(Canvas canvas) {
        r6.a barData = this.f37615g.getBarData();
        for (int i6 = 0; i6 < barData.c(); i6++) {
            v6.a aVar = (v6.a) barData.b(i6);
            if (aVar.isVisible()) {
                q(canvas, aVar, i6);
            }
        }
    }

    @Override // x6.d
    public final void g(Canvas canvas, t6.c[] cVarArr) {
        u6.a aVar = this.f37615g;
        r6.a barData = aVar.getBarData();
        for (t6.c cVar : cVarArr) {
            v6.a aVar2 = (v6.a) barData.b(cVar.f);
            if (aVar2 != null && aVar2.f0()) {
                r6.j jVar = (r6.c) aVar2.h0(cVar.f32419a, cVar.f32420b);
                if (o(jVar, aVar2)) {
                    y6.e c10 = aVar.c(aVar2.a0());
                    this.f37623e.setColor(aVar2.Z());
                    this.f37623e.setAlpha(aVar2.R());
                    if (cVar.f32424g >= 0) {
                        jVar.getClass();
                    }
                    r(jVar.f30521w, jVar.f30503u, barData.f30483j / 2.0f, c10);
                    RectF rectF = this.f37616h;
                    s(cVar, rectF);
                    canvas.drawRect(rectF, this.f37623e);
                }
            }
        }
    }

    @Override // x6.d
    public void i(Canvas canvas) {
        float f;
        float f2;
        y6.c cVar;
        boolean z10;
        v6.a aVar;
        int i6;
        float f10;
        boolean z11;
        int i10;
        Object obj;
        y6.c cVar2;
        o6.a aVar2;
        v6.a aVar3;
        float f11;
        b bVar = this;
        u6.a aVar4 = bVar.f37615g;
        if (bVar.n(aVar4)) {
            List<T> list = aVar4.getBarData().f30512i;
            float c10 = y6.f.c(4.5f);
            boolean b10 = aVar4.b();
            int i11 = 0;
            while (i11 < aVar4.getBarData().c()) {
                v6.a aVar5 = (v6.a) list.get(i11);
                if (c.p(aVar5)) {
                    bVar.d(aVar5);
                    aVar4.d(aVar5.a0());
                    float a10 = y6.f.a(bVar.f, "8");
                    if (b10) {
                        f = -c10;
                    } else {
                        f = a10 + c10;
                    }
                    float f12 = f;
                    if (b10) {
                        f2 = a10 + c10;
                    } else {
                        f2 = -c10;
                    }
                    float f13 = f2;
                    o6.a aVar6 = bVar.f37617i[i11];
                    bVar.f37621c.getClass();
                    y6.c c11 = y6.c.c(aVar5.d0());
                    c11.f38276b = y6.f.c(c11.f38276b);
                    c11.f38277c = y6.f.c(c11.f38277c);
                    boolean V = aVar5.V();
                    Object obj2 = bVar.f16181b;
                    if (!V) {
                        int i12 = 0;
                        while (true) {
                            float[] fArr = aVar6.f27174b;
                            if (i12 >= fArr.length * 1.0f) {
                                break;
                            }
                            float f14 = (fArr[i12] + fArr[i12 + 2]) / 2.0f;
                            y6.g gVar = (y6.g) obj2;
                            if (!gVar.f(f14)) {
                                break;
                            }
                            int i13 = i12 + 1;
                            float f15 = fArr[i13];
                            if (gVar.g(f15) && gVar.d(f15)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 && gVar.e(f14)) {
                                int i14 = i12 / 4;
                                r6.c cVar3 = (r6.c) aVar5.x(i14);
                                float f16 = cVar3.f30503u;
                                if (aVar5.W()) {
                                    s6.c u10 = aVar5.u();
                                    if (f16 >= 0.0f) {
                                        f11 = fArr[i13] + f12;
                                    } else {
                                        f11 = fArr[i12 + 3] + f13;
                                    }
                                    i10 = i12;
                                    obj = obj2;
                                    cVar2 = c11;
                                    aVar2 = aVar6;
                                    aVar3 = aVar5;
                                    h(canvas, u10, f16, cVar3, i11, f14, f11, aVar5.J(i14));
                                    i12 = i10 + 4;
                                    aVar6 = aVar2;
                                    obj2 = obj;
                                    aVar5 = aVar3;
                                    c11 = cVar2;
                                }
                            }
                            i10 = i12;
                            obj = obj2;
                            cVar2 = c11;
                            aVar2 = aVar6;
                            aVar3 = aVar5;
                            i12 = i10 + 4;
                            aVar6 = aVar2;
                            obj2 = obj;
                            aVar5 = aVar3;
                            c11 = cVar2;
                        }
                        cVar = c11;
                    } else {
                        cVar = c11;
                        v6.a aVar7 = aVar5;
                        aVar4.c(aVar7.a0());
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < aVar7.c0() * 1.0f) {
                            v6.a aVar8 = aVar7;
                            r6.c cVar4 = (r6.c) aVar8.x(i15);
                            cVar4.getClass();
                            float[] fArr2 = aVar6.f27174b;
                            float f17 = (fArr2[i16] + fArr2[i16 + 2]) / 2.0f;
                            int J = aVar8.J(i15);
                            y6.g gVar2 = (y6.g) obj2;
                            if (!gVar2.f(f17)) {
                                break;
                            }
                            int i17 = i16 + 1;
                            float[] fArr3 = aVar6.f27174b;
                            float f18 = fArr3[i17];
                            if (gVar2.g(f18) && gVar2.d(f18)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && gVar2.e(f17)) {
                                if (aVar8.W()) {
                                    s6.c u11 = aVar8.u();
                                    float f19 = cVar4.f30503u;
                                    float f20 = fArr3[i17];
                                    if (f19 >= 0.0f) {
                                        f10 = f12;
                                    } else {
                                        f10 = f13;
                                    }
                                    aVar = aVar8;
                                    i6 = i15;
                                    h(canvas, u11, f19, cVar4, i11, f17, f20 + f10, J);
                                } else {
                                    aVar = aVar8;
                                    i6 = i15;
                                }
                                i16 += 4;
                                i15 = i6 + 1;
                            } else {
                                aVar = aVar8;
                                i15 = i15;
                            }
                            aVar7 = aVar;
                        }
                    }
                    y6.c.d(cVar);
                }
                i11++;
                bVar = this;
            }
        }
    }

    @Override // x6.d
    public void m() {
        int i6;
        r6.a barData = this.f37615g.getBarData();
        this.f37617i = new o6.a[barData.c()];
        for (int i10 = 0; i10 < this.f37617i.length; i10++) {
            v6.a aVar = (v6.a) barData.b(i10);
            o6.a[] aVarArr = this.f37617i;
            int c0 = aVar.c0() * 4;
            if (aVar.V()) {
                i6 = aVar.N();
            } else {
                i6 = 1;
            }
            barData.c();
            aVarArr[i10] = new o6.a(c0 * i6, aVar.V());
        }
    }

    public void q(Canvas canvas, v6.a aVar, int i6) {
        i.a a02 = aVar.a0();
        u6.a aVar2 = this.f37615g;
        y6.e c10 = aVar2.c(a02);
        Paint paint = this.f37619k;
        paint.setColor(aVar.i());
        aVar.o();
        paint.setStrokeWidth(y6.f.c(0.0f));
        aVar.o();
        this.f37621c.getClass();
        boolean a10 = aVar2.a();
        Object obj = this.f16181b;
        if (a10) {
            Paint paint2 = this.f37618j;
            paint2.setColor(aVar.F());
            float f = aVar2.getBarData().f30483j / 2.0f;
            int min = Math.min((int) Math.ceil(aVar.c0() * 1.0f), aVar.c0());
            for (int i10 = 0; i10 < min; i10++) {
                float f2 = ((r6.c) aVar.x(i10)).f30521w;
                RectF rectF = this.f37620l;
                rectF.left = f2 - f;
                rectF.right = f2 + f;
                c10.f38285a.mapRect(rectF);
                c10.f38287c.f38299a.mapRect(rectF);
                c10.f38286b.mapRect(rectF);
                y6.g gVar = (y6.g) obj;
                if (gVar.e(rectF.right)) {
                    if (!gVar.f(rectF.left)) {
                        break;
                    }
                    RectF rectF2 = gVar.f38300b;
                    rectF.top = rectF2.top;
                    rectF.bottom = rectF2.bottom;
                    canvas.drawRect(rectF, paint2);
                }
            }
        }
        o6.a aVar3 = this.f37617i[i6];
        aVar3.f27175c = 1.0f;
        aVar3.f27176d = 1.0f;
        aVar2.d(aVar.a0());
        aVar3.f27177e = false;
        aVar3.f = aVar2.getBarData().f30483j;
        aVar3.a(aVar);
        float[] fArr = aVar3.f27174b;
        c10.e(fArr);
        boolean z10 = true;
        if (aVar.M().size() != 1) {
            z10 = false;
        }
        Paint paint3 = this.f37622d;
        if (z10) {
            paint3.setColor(aVar.e0());
        }
        for (int i11 = 0; i11 < fArr.length; i11 += 4) {
            y6.g gVar2 = (y6.g) obj;
            int i12 = i11 + 2;
            if (gVar2.e(fArr[i12])) {
                if (gVar2.f(fArr[i11])) {
                    if (!z10) {
                        paint3.setColor(aVar.B(i11 / 4));
                    }
                    canvas.drawRect(fArr[i11], fArr[i11 + 1], fArr[i12], fArr[i11 + 3], paint3);
                } else {
                    return;
                }
            }
        }
    }

    public void r(float f, float f2, float f10, y6.e eVar) {
        float f11 = f - f10;
        float f12 = f + f10;
        RectF rectF = this.f37616h;
        rectF.set(f11, f2, f12, 0.0f);
        this.f37621c.getClass();
        eVar.getClass();
        rectF.top *= 1.0f;
        rectF.bottom *= 1.0f;
        eVar.f38285a.mapRect(rectF);
        eVar.f38287c.f38299a.mapRect(rectF);
        eVar.f38286b.mapRect(rectF);
    }

    public void s(t6.c cVar, RectF rectF) {
        rectF.centerX();
    }

    @Override // x6.d
    public final void f(Canvas canvas) {
    }
}
