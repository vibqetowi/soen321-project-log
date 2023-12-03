package i3;

import a3.j;
import a3.o;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import d3.k;
import d3.m;
import h3.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import s1.s;
import tr.r;
/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public final class i extends i3.b {
    public final HashMap A;
    public final t.e<String> B;
    public final k C;
    public final j D;
    public final a3.c E;
    public d3.a<Integer, Integer> F;
    public d3.a<Integer, Integer> G;
    public d3.a<Float, Float> H;
    public d3.a<Float, Float> I;
    public m J;

    /* renamed from: v  reason: collision with root package name */
    public final StringBuilder f19797v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f19798w;

    /* renamed from: x  reason: collision with root package name */
    public final Matrix f19799x;

    /* renamed from: y  reason: collision with root package name */
    public final a f19800y;

    /* renamed from: z  reason: collision with root package name */
    public final b f19801z;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public i(j jVar, e eVar) {
        super(jVar, eVar);
        g3.b bVar;
        g3.b bVar2;
        g3.a aVar;
        g3.a aVar2;
        this.f19797v = new StringBuilder(2);
        this.f19798w = new RectF();
        this.f19799x = new Matrix();
        this.f19800y = new a();
        this.f19801z = new b();
        this.A = new HashMap();
        this.B = new t.e<>();
        this.D = jVar;
        this.E = eVar.f19772b;
        k kVar = new k((List) eVar.f19786q.f16181b);
        this.C = kVar;
        kVar.a(this);
        f(kVar);
        v.c cVar = eVar.r;
        if (cVar != null && (aVar2 = (g3.a) cVar.f34631v) != null) {
            d3.a<Integer, Integer> k10 = aVar2.k();
            this.F = k10;
            k10.a(this);
            f(this.F);
        }
        if (cVar != null && (aVar = (g3.a) cVar.f34632w) != null) {
            d3.a<Integer, Integer> k11 = aVar.k();
            this.G = k11;
            k11.a(this);
            f(this.G);
        }
        if (cVar != null && (bVar2 = (g3.b) cVar.f34633x) != null) {
            d3.a<Float, Float> k12 = bVar2.k();
            this.H = k12;
            k12.a(this);
            f(this.H);
        }
        if (cVar != null && (bVar = (g3.b) cVar.f34634y) != null) {
            d3.a<Float, Float> k13 = bVar.k();
            this.I = k13;
            k13.a(this);
            f(this.I);
        }
    }

    public static void p(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // i3.b, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        if (obj == o.f244a) {
            d3.a<Integer, Integer> aVar = this.F;
            if (aVar != null) {
                aVar.j(sVar);
            } else if (sVar == null) {
                if (aVar != null) {
                    m(aVar);
                }
                this.F = null;
            } else {
                m mVar = new m(sVar, null);
                this.F = mVar;
                mVar.a(this);
                f(this.F);
            }
        } else if (obj == o.f245b) {
            d3.a<Integer, Integer> aVar2 = this.G;
            if (aVar2 != null) {
                aVar2.j(sVar);
            } else if (sVar == null) {
                if (aVar2 != null) {
                    m(aVar2);
                }
                this.G = null;
            } else {
                m mVar2 = new m(sVar, null);
                this.G = mVar2;
                mVar2.a(this);
                f(this.G);
            }
        } else if (obj == o.f257o) {
            d3.a<Float, Float> aVar3 = this.H;
            if (aVar3 != null) {
                aVar3.j(sVar);
            } else if (sVar == null) {
                if (aVar3 != null) {
                    m(aVar3);
                }
                this.H = null;
            } else {
                m mVar3 = new m(sVar, null);
                this.H = mVar3;
                mVar3.a(this);
                f(this.H);
            }
        } else if (obj == o.f258p) {
            d3.a<Float, Float> aVar4 = this.I;
            if (aVar4 != null) {
                aVar4.j(sVar);
            } else if (sVar == null) {
                if (aVar4 != null) {
                    m(aVar4);
                }
                this.I = null;
            } else {
                m mVar4 = new m(sVar, null);
                this.I = mVar4;
                mVar4.a(this);
                f(this.I);
            }
        } else if (obj == o.B) {
            if (sVar == null) {
                m mVar5 = this.J;
                if (mVar5 != null) {
                    m(mVar5);
                }
                this.J = null;
                return;
            }
            m mVar6 = new m(sVar, null);
            this.J = mVar6;
            mVar6.a(this);
            f(this.J);
        }
    }

    @Override // i3.b, c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        a3.c cVar = this.E;
        rectF.set(0.0f, 0.0f, cVar.f184j.width(), cVar.f184j.height());
    }

    @Override // i3.b
    public final void j(Canvas canvas, Matrix matrix, int i6) {
        boolean z10;
        int intValue;
        boolean z11;
        float f;
        e3.a aVar;
        int i10;
        int i11;
        Typeface typeface;
        float floatValue;
        Canvas canvas2;
        boolean z12;
        float f2;
        String str;
        boolean z13;
        int i12;
        int i13;
        String str2;
        j jVar;
        List list;
        b bVar;
        a aVar2;
        int i14;
        b bVar2;
        a aVar3;
        int i15;
        String str3;
        a3.c cVar;
        canvas.save();
        j jVar2 = this.D;
        if (jVar2.f207v.f181g.f() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            canvas.setMatrix(matrix);
        }
        f3.b f10 = this.C.f();
        a3.c cVar2 = this.E;
        f3.c cVar3 = cVar2.f180e.get(f10.f14759b);
        if (cVar3 == null) {
            canvas.restore();
            return;
        }
        d3.a<Integer, Integer> aVar4 = this.F;
        a aVar5 = this.f19800y;
        if (aVar4 != null) {
            aVar5.setColor(aVar4.f().intValue());
        } else {
            aVar5.setColor(f10.f14764h);
        }
        d3.a<Integer, Integer> aVar6 = this.G;
        b bVar3 = this.f19801z;
        if (aVar6 != null) {
            bVar3.setColor(aVar6.f().intValue());
        } else {
            bVar3.setColor(f10.f14765i);
        }
        d3.a<Integer, Integer> aVar7 = this.f19760t.f12172j;
        if (aVar7 == null) {
            intValue = 100;
        } else {
            intValue = aVar7.f().intValue();
        }
        int i16 = (intValue * 255) / 100;
        aVar5.setAlpha(i16);
        bVar3.setAlpha(i16);
        d3.a<Float, Float> aVar8 = this.H;
        if (aVar8 != null) {
            bVar3.setStrokeWidth(aVar8.f().floatValue());
        } else {
            bVar3.setStrokeWidth(m3.g.c() * f10.f14766j * m3.g.d(matrix));
        }
        if (jVar2.f207v.f181g.f() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i17 = f10.f14762e;
        boolean z14 = f10.f14767k;
        int i18 = f10.f14761d;
        float f11 = f10.f;
        int i19 = i17;
        float f12 = f10.f14760c;
        String str4 = f10.f14758a;
        b bVar4 = bVar3;
        String str5 = cVar3.f14769b;
        String str6 = cVar3.f14768a;
        if (z11) {
            m mVar = this.J;
            if (mVar != null) {
                f12 = ((Float) mVar.f()).floatValue();
            }
            float f13 = f12 / 100.0f;
            a aVar9 = aVar5;
            float d10 = m3.g.d(matrix);
            float c10 = m3.g.c() * f11;
            List asList = Arrays.asList(str4.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            int i20 = 0;
            while (i20 < size) {
                String str7 = (String) asList.get(i20);
                List list2 = asList;
                boolean z15 = z14;
                float f14 = 0.0f;
                int i21 = 0;
                while (i21 < str7.length()) {
                    f3.b bVar5 = f10;
                    j jVar3 = jVar2;
                    f3.d dVar = (f3.d) cVar2.f181g.d(f3.d.a(str7.charAt(i21), str6, str5), null);
                    if (dVar == null) {
                        cVar = cVar2;
                        i15 = i20;
                        str3 = str7;
                    } else {
                        i15 = i20;
                        str3 = str7;
                        cVar = cVar2;
                        f14 = (float) ((dVar.f14772c * f13 * m3.g.c() * d10) + f14);
                    }
                    i21++;
                    i20 = i15;
                    f10 = bVar5;
                    jVar2 = jVar3;
                    str7 = str3;
                    cVar2 = cVar;
                }
                j jVar4 = jVar2;
                f3.b bVar6 = f10;
                a3.c cVar4 = cVar2;
                int i22 = i20;
                String str8 = str7;
                canvas.save();
                if (i18 != 0) {
                    int i23 = i18 - 1;
                    if (i23 != 1) {
                        if (i23 == 2) {
                            canvas.translate((-f14) / 2.0f, 0.0f);
                        }
                    } else {
                        canvas.translate(-f14, 0.0f);
                    }
                    canvas.translate(0.0f, (i22 * c10) - (((size - 1) * c10) / 2.0f));
                    int i24 = 0;
                    while (i24 < str8.length()) {
                        String str9 = str8;
                        a3.c cVar5 = cVar4;
                        f3.d dVar2 = (f3.d) cVar5.f181g.d(f3.d.a(str9.charAt(i24), str6, str5), null);
                        if (dVar2 == null) {
                            cVar4 = cVar5;
                            i13 = size;
                            str2 = str9;
                            i14 = i19;
                            bVar = bVar4;
                            aVar2 = aVar9;
                            jVar = jVar4;
                        } else {
                            HashMap hashMap = this.A;
                            if (hashMap.containsKey(dVar2)) {
                                list = (List) hashMap.get(dVar2);
                                cVar4 = cVar5;
                                i13 = size;
                                str2 = str9;
                                jVar = jVar4;
                            } else {
                                List<l> list3 = dVar2.f14770a;
                                int size2 = list3.size();
                                cVar4 = cVar5;
                                ArrayList arrayList = new ArrayList(size2);
                                i13 = size;
                                int i25 = 0;
                                while (i25 < size2) {
                                    arrayList.add(new c3.c(jVar4, this, list3.get(i25)));
                                    i25++;
                                    list3 = list3;
                                    str9 = str9;
                                    size2 = size2;
                                }
                                str2 = str9;
                                jVar = jVar4;
                                hashMap.put(dVar2, arrayList);
                                list = arrayList;
                            }
                            int i26 = 0;
                            while (i26 < list.size()) {
                                Path path = ((c3.c) list.get(i26)).getPath();
                                path.computeBounds(this.f19798w, false);
                                Matrix matrix2 = this.f19799x;
                                matrix2.set(matrix);
                                List list4 = list;
                                f3.b bVar7 = bVar6;
                                bVar6 = bVar7;
                                matrix2.preTranslate(0.0f, (-bVar7.f14763g) * m3.g.c());
                                matrix2.preScale(f13, f13);
                                path.transform(matrix2);
                                if (z15) {
                                    aVar3 = aVar9;
                                    q(path, aVar3, canvas);
                                    bVar2 = bVar4;
                                    q(path, bVar2, canvas);
                                } else {
                                    bVar2 = bVar4;
                                    aVar3 = aVar9;
                                    q(path, bVar2, canvas);
                                    q(path, aVar3, canvas);
                                }
                                i26++;
                                aVar9 = aVar3;
                                bVar4 = bVar2;
                                list = list4;
                            }
                            bVar = bVar4;
                            aVar2 = aVar9;
                            float c11 = m3.g.c() * ((float) dVar2.f14772c) * f13 * d10;
                            i14 = i19;
                            float f15 = i14 / 10.0f;
                            d3.a<Float, Float> aVar10 = this.I;
                            if (aVar10 != null) {
                                f15 += aVar10.f().floatValue();
                            }
                            canvas.translate((f15 * d10) + c11, 0.0f);
                        }
                        i24++;
                        i19 = i14;
                        aVar9 = aVar2;
                        bVar4 = bVar;
                        jVar4 = jVar;
                        size = i13;
                        str8 = str2;
                    }
                    canvas.restore();
                    asList = list2;
                    f10 = bVar6;
                    cVar2 = cVar4;
                    i20 = i22 + 1;
                    jVar2 = jVar4;
                    z14 = z15;
                } else {
                    throw null;
                }
            }
        } else {
            float d11 = m3.g.d(matrix);
            if (jVar2.getCallback() == null) {
                f = d11;
                aVar = null;
            } else {
                if (jVar2.E == null) {
                    f = d11;
                    jVar2.E = new e3.a(jVar2.getCallback());
                } else {
                    f = d11;
                }
                aVar = jVar2.E;
            }
            if (aVar != null) {
                androidx.appcompat.widget.l lVar = aVar.f13729a;
                lVar.f1471v = str6;
                lVar.f1472w = str5;
                HashMap hashMap2 = aVar.f13730b;
                Typeface typeface2 = (Typeface) hashMap2.get(lVar);
                if (typeface2 != null) {
                    i10 = i18;
                    typeface = typeface2;
                    i11 = i19;
                } else {
                    i11 = i19;
                    HashMap hashMap3 = aVar.f13731c;
                    Typeface typeface3 = (Typeface) hashMap3.get(str6);
                    if (typeface3 != null) {
                        typeface = typeface3;
                        i10 = i18;
                    } else {
                        i10 = i18;
                        typeface = Typeface.createFromAsset(aVar.f13732d, "fonts/" + str6 + aVar.f13733e);
                        hashMap3.put(str6, typeface);
                    }
                    boolean contains = str5.contains("Italic");
                    boolean contains2 = str5.contains("Bold");
                    if (contains && contains2) {
                        i12 = 3;
                    } else if (contains) {
                        i12 = 2;
                    } else if (contains2) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    if (typeface.getStyle() != i12) {
                        typeface = Typeface.create(typeface, i12);
                    }
                    hashMap2.put(lVar, typeface);
                }
            } else {
                i10 = i18;
                i11 = i19;
                typeface = null;
            }
            if (typeface != null) {
                aVar5.setTypeface(typeface);
                m mVar2 = this.J;
                if (mVar2 == null) {
                    floatValue = f12;
                } else {
                    floatValue = ((Float) mVar2.f()).floatValue();
                }
                aVar5.setTextSize(m3.g.c() * floatValue);
                bVar4.setTypeface(aVar5.getTypeface());
                bVar4.setTextSize(aVar5.getTextSize());
                float c12 = m3.g.c() * f11;
                List asList2 = Arrays.asList(str4.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = asList2.size();
                int i27 = 0;
                while (i27 < size3) {
                    String str10 = (String) asList2.get(i27);
                    float measureText = bVar4.measureText(str10);
                    if (i10 != 0) {
                        int i28 = i10 - 1;
                        if (i28 != 1) {
                            if (i28 != 2) {
                                canvas2 = canvas;
                            } else {
                                canvas2 = canvas;
                                canvas2.translate((-measureText) / 2.0f, 0.0f);
                            }
                        } else {
                            canvas2 = canvas;
                            canvas2.translate(-measureText, 0.0f);
                        }
                        canvas2.translate(0.0f, (i27 * c12) - (((size3 - 1) * c12) / 2.0f));
                        int i29 = 0;
                        while (i29 < str10.length()) {
                            int codePointAt = str10.codePointAt(i29);
                            int charCount = Character.charCount(codePointAt) + i29;
                            while (charCount < str10.length()) {
                                int codePointAt2 = str10.codePointAt(charCount);
                                if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 19) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (!z13) {
                                    break;
                                }
                                charCount += Character.charCount(codePointAt2);
                                codePointAt = (codePointAt * 31) + codePointAt2;
                            }
                            long j10 = codePointAt;
                            t.e<String> eVar = this.B;
                            if (eVar.f32231u) {
                                eVar.d();
                            }
                            if (r.k(eVar.f32232v, eVar.f32234x, j10) >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                str = (String) eVar.e(j10, null);
                                f2 = c12;
                            } else {
                                StringBuilder sb2 = this.f19797v;
                                sb2.setLength(0);
                                int i30 = i29;
                                while (i30 < charCount) {
                                    float f16 = c12;
                                    int codePointAt3 = str10.codePointAt(i30);
                                    sb2.appendCodePoint(codePointAt3);
                                    i30 += Character.charCount(codePointAt3);
                                    c12 = f16;
                                }
                                f2 = c12;
                                String sb3 = sb2.toString();
                                eVar.h(j10, sb3);
                                str = sb3;
                            }
                            i29 += str.length();
                            if (z14) {
                                p(str, aVar5, canvas2);
                                p(str, bVar4, canvas2);
                            } else {
                                p(str, bVar4, canvas2);
                                p(str, aVar5, canvas2);
                            }
                            float measureText2 = aVar5.measureText(str, 0, 1);
                            int i31 = i11;
                            float f17 = i31 / 10.0f;
                            d3.a<Float, Float> aVar11 = this.I;
                            if (aVar11 != null) {
                                f17 += aVar11.f().floatValue();
                            }
                            canvas2.translate((f17 * f) + measureText2, 0.0f);
                            i11 = i31;
                            c12 = f2;
                        }
                        canvas.setMatrix(matrix);
                        i27++;
                        c12 = c12;
                    } else {
                        throw null;
                    }
                }
            }
        }
        canvas.restore();
    }
}
