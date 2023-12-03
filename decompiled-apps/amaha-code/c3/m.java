package c3;

import android.graphics.Path;
import android.graphics.PointF;
import d3.a;
import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public final class m implements l, a.InterfaceC0183a, j {

    /* renamed from: b  reason: collision with root package name */
    public final String f4836b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.j f4837c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4838d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4839e;
    public final d3.c f;

    /* renamed from: g  reason: collision with root package name */
    public final d3.a<?, PointF> f4840g;

    /* renamed from: h  reason: collision with root package name */
    public final d3.c f4841h;

    /* renamed from: i  reason: collision with root package name */
    public final d3.c f4842i;

    /* renamed from: j  reason: collision with root package name */
    public final d3.c f4843j;

    /* renamed from: k  reason: collision with root package name */
    public final d3.c f4844k;

    /* renamed from: l  reason: collision with root package name */
    public final d3.c f4845l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4847n;

    /* renamed from: a  reason: collision with root package name */
    public final Path f4835a = new Path();

    /* renamed from: m  reason: collision with root package name */
    public final k1.c f4846m = new k1.c(1);

    public m(a3.j jVar, i3.b bVar, h3.h hVar) {
        this.f4837c = jVar;
        this.f4836b = hVar.f17110a;
        int i6 = hVar.f17111b;
        this.f4838d = i6;
        this.f4839e = hVar.f17118j;
        d3.a<?, ?> k10 = hVar.f17112c.k();
        this.f = (d3.c) k10;
        d3.a<PointF, PointF> k11 = hVar.f17113d.k();
        this.f4840g = k11;
        d3.a<?, ?> k12 = hVar.f17114e.k();
        this.f4841h = (d3.c) k12;
        d3.a<?, ?> k13 = hVar.f17115g.k();
        this.f4843j = (d3.c) k13;
        d3.a<?, ?> k14 = hVar.f17117i.k();
        this.f4845l = (d3.c) k14;
        if (i6 == 1) {
            this.f4842i = (d3.c) hVar.f.k();
            this.f4844k = (d3.c) hVar.f17116h.k();
        } else {
            this.f4842i = null;
            this.f4844k = null;
        }
        bVar.f(k10);
        bVar.f(k11);
        bVar.f(k12);
        bVar.f(k13);
        bVar.f(k14);
        if (i6 == 1) {
            bVar.f(this.f4842i);
            bVar.f(this.f4844k);
        }
        k10.a(this);
        k11.a(this);
        k12.a(this);
        k13.a(this);
        k14.a(this);
        if (i6 == 1) {
            this.f4842i.a(this);
            this.f4844k.a(this);
        }
    }

    @Override // f3.f
    public final void a(f3.e eVar, int i6, ArrayList arrayList, f3.e eVar2) {
        m3.f.d(eVar, i6, arrayList, eVar2, this);
    }

    @Override // d3.a.InterfaceC0183a
    public final void b() {
        this.f4847n = false;
        this.f4837c.invalidateSelf();
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i6 < arrayList.size()) {
                b bVar = (b) arrayList.get(i6);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f4877c == 1) {
                        this.f4846m.f22768a.add(rVar);
                        rVar.a(this);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // f3.f
    public final void d(s sVar, Object obj) {
        d3.c cVar;
        d3.c cVar2;
        if (obj == a3.o.f260s) {
            this.f.j(sVar);
        } else if (obj == a3.o.f261t) {
            this.f4841h.j(sVar);
        } else if (obj == a3.o.f252j) {
            this.f4840g.j(sVar);
        } else if (obj == a3.o.f262u && (cVar2 = this.f4842i) != null) {
            cVar2.j(sVar);
        } else if (obj == a3.o.f263v) {
            this.f4843j.j(sVar);
        } else if (obj == a3.o.f264w && (cVar = this.f4844k) != null) {
            cVar.j(sVar);
        } else if (obj == a3.o.f265x) {
            this.f4845l.j(sVar);
        }
    }

    @Override // c3.b
    public final String getName() {
        return this.f4836b;
    }

    @Override // c3.l
    public final Path getPath() {
        double floatValue;
        float f;
        float f2;
        float f10;
        float cos;
        float f11;
        double d10;
        float f12;
        m mVar;
        Path path;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Path path2;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        double floatValue2;
        int i6;
        d3.a<?, PointF> aVar;
        double d11;
        double d12;
        float f26;
        double d13;
        boolean z10 = this.f4847n;
        Path path3 = this.f4835a;
        if (z10) {
            return path3;
        }
        path3.reset();
        if (this.f4839e) {
            this.f4847n = true;
            return path3;
        }
        int d14 = v.h.d(this.f4838d);
        d3.a<?, PointF> aVar2 = this.f4840g;
        d3.c cVar = this.f4845l;
        d3.c cVar2 = this.f4843j;
        d3.c cVar3 = this.f4841h;
        d3.c cVar4 = this.f;
        if (d14 != 0) {
            if (d14 == 1) {
                int floor = (int) Math.floor(cVar4.f().floatValue());
                if (cVar3 == null) {
                    floatValue2 = 0.0d;
                } else {
                    floatValue2 = cVar3.f().floatValue();
                }
                double radians = Math.toRadians(floatValue2 - 90.0d);
                double d15 = floor;
                float floatValue3 = cVar.f().floatValue() / 100.0f;
                float floatValue4 = cVar2.f().floatValue();
                double d16 = floatValue4;
                float cos2 = (float) (Math.cos(radians) * d16);
                float sin = (float) (Math.sin(radians) * d16);
                path3.moveTo(cos2, sin);
                double d17 = (float) (6.283185307179586d / d15);
                double d18 = radians + d17;
                double ceil = Math.ceil(d15);
                int i10 = 0;
                double d19 = d17;
                while (i10 < ceil) {
                    float cos3 = (float) (Math.cos(d18) * d16);
                    float sin2 = (float) (Math.sin(d18) * d16);
                    if (floatValue3 != 0.0f) {
                        double d20 = d16;
                        i6 = i10;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        aVar = aVar2;
                        d11 = d18;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f27 = floatValue4 * floatValue3 * 0.25f;
                        d12 = d19;
                        f26 = sin2;
                        d13 = d20;
                        path3.cubicTo(cos2 - (cos4 * f27), sin - (((float) Math.sin(atan2)) * f27), (((float) Math.cos(atan22)) * f27) + cos3, (f27 * ((float) Math.sin(atan22))) + sin2, cos3, f26);
                    } else {
                        i6 = i10;
                        aVar = aVar2;
                        d11 = d18;
                        d12 = d19;
                        f26 = sin2;
                        d13 = d16;
                        path3.lineTo(cos3, f26);
                    }
                    double d21 = d11 + d12;
                    sin = f26;
                    d16 = d13;
                    d19 = d12;
                    aVar2 = aVar;
                    d18 = d21;
                    cos2 = cos3;
                    i10 = i6 + 1;
                }
                PointF f28 = aVar2.f();
                path3.offset(f28.x, f28.y);
                path3.close();
            }
            mVar = this;
            path = path3;
        } else {
            d3.a<?, PointF> aVar3 = aVar2;
            float floatValue5 = cVar4.f().floatValue();
            if (cVar3 == null) {
                floatValue = 0.0d;
            } else {
                floatValue = cVar3.f().floatValue();
            }
            double radians2 = Math.toRadians(floatValue - 90.0d);
            double d22 = floatValue5;
            float f29 = (float) (6.283185307179586d / d22);
            float f30 = f29 / 2.0f;
            float f31 = floatValue5 - ((int) floatValue5);
            int i11 = (f31 > 0.0f ? 1 : (f31 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                radians2 += (1.0f - f31) * f30;
            }
            float floatValue6 = cVar2.f().floatValue();
            float floatValue7 = this.f4842i.f().floatValue();
            d3.c cVar5 = this.f4844k;
            if (cVar5 != null) {
                f = cVar5.f().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            if (cVar != null) {
                f2 = cVar.f().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            if (i11 != 0) {
                float e10 = defpackage.e.e(floatValue6, floatValue7, f31, floatValue7);
                double d23 = e10;
                f10 = floatValue7;
                cos = (float) (Math.cos(radians2) * d23);
                float sin3 = (float) (d23 * Math.sin(radians2));
                path3.moveTo(cos, sin3);
                f11 = sin3;
                d10 = radians2 + ((f29 * f31) / 2.0f);
                f12 = e10;
            } else {
                f10 = floatValue7;
                double d24 = floatValue6;
                cos = (float) (Math.cos(radians2) * d24);
                float sin4 = (float) (d24 * Math.sin(radians2));
                path3.moveTo(cos, sin4);
                f11 = sin4;
                d10 = radians2 + f30;
                f12 = 0.0f;
            }
            double ceil2 = Math.ceil(d22) * 2.0d;
            double d25 = 2.0d;
            int i12 = 0;
            double d26 = d10;
            boolean z11 = false;
            while (true) {
                double d27 = i12;
                if (d27 >= ceil2) {
                    break;
                }
                if (z11) {
                    f13 = floatValue6;
                } else {
                    f13 = f10;
                }
                int i13 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i13 != 0 && d27 == ceil2 - d25) {
                    f14 = f12;
                    f15 = (f29 * f31) / 2.0f;
                } else {
                    f14 = f12;
                    f15 = f30;
                }
                if (i13 != 0 && d27 == ceil2 - 1.0d) {
                    f16 = f29;
                    f17 = f30;
                    f13 = f14;
                } else {
                    f16 = f29;
                    f17 = f30;
                }
                double d28 = f13;
                d3.a<?, PointF> aVar4 = aVar3;
                float cos5 = (float) (Math.cos(d26) * d28);
                float sin5 = (float) (d28 * Math.sin(d26));
                if (f == 0.0f && f2 == 0.0f) {
                    path3.lineTo(cos5, sin5);
                    path2 = path3;
                    f25 = f15;
                    f18 = sin5;
                    f23 = f10;
                    f24 = floatValue6;
                } else {
                    float f32 = floatValue6;
                    float f33 = f11;
                    double atan23 = (float) (Math.atan2(f11, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    float f34 = f15;
                    f18 = sin5;
                    path2 = path3;
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z11) {
                        f19 = f;
                    } else {
                        f19 = f2;
                    }
                    if (z11) {
                        f20 = f2;
                    } else {
                        f20 = f;
                    }
                    if (z11) {
                        f21 = f10;
                    } else {
                        f21 = f32;
                    }
                    if (z11) {
                        f22 = f32;
                    } else {
                        f22 = f10;
                    }
                    float f35 = f21 * f19 * 0.47829f;
                    float f36 = cos6 * f35;
                    float f37 = f35 * sin6;
                    float f38 = f22 * f20 * 0.47829f;
                    float f39 = cos7 * f38;
                    float f40 = f38 * sin7;
                    if (i11 != 0) {
                        if (i12 == 0) {
                            f36 *= f31;
                            f37 *= f31;
                        } else if (d27 == ceil2 - 1.0d) {
                            f39 *= f31;
                            f40 *= f31;
                        }
                    }
                    f23 = f10;
                    f24 = f32;
                    path2.cubicTo(cos - f36, f33 - f37, cos5 + f39, f18 + f40, cos5, f18);
                    f25 = f34;
                }
                d26 += f25;
                z11 = !z11;
                i12++;
                d25 = 2.0d;
                cos = cos5;
                f10 = f23;
                floatValue6 = f24;
                f12 = f14;
                f29 = f16;
                f30 = f17;
                aVar3 = aVar4;
                f11 = f18;
                path3 = path2;
            }
            mVar = this;
            PointF f41 = aVar3.f();
            path = path3;
            path.offset(f41.x, f41.y);
            path.close();
        }
        path.close();
        mVar.f4846m.a(path);
        mVar.f4847n = true;
        return path;
    }
}
