package k3;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import l3.c;
/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22801a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f22802b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f22803c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    public static final c.a f22804d = c.a.a("cm", "tm", "dr");

    public static a3.c a(l3.d dVar) {
        float f;
        HashMap hashMap;
        ArrayList arrayList;
        t.i<f3.d> iVar;
        int i6;
        t.e<i3.e> eVar;
        float f2;
        float f10;
        boolean z10;
        int i10;
        float f11;
        t.e<i3.e> eVar2;
        float f12;
        float f13;
        float f14;
        HashMap hashMap2;
        ArrayList arrayList2;
        t.i<f3.d> iVar2;
        float f15;
        float f16;
        t.e<i3.e> eVar3;
        float c10 = m3.g.c();
        t.e<i3.e> eVar4 = new t.e<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        t.i<f3.d> iVar3 = new t.i<>();
        a3.c cVar = new a3.c();
        dVar.e();
        int i11 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        int i12 = 0;
        while (dVar.m()) {
            float f20 = f17;
            switch (dVar.R(f22801a)) {
                case 0:
                    f14 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    iVar2 = iVar3;
                    f15 = f18;
                    f16 = f19;
                    eVar3 = eVar4;
                    i12 = dVar.G();
                    eVar4 = eVar3;
                    f17 = f20;
                    c10 = f14;
                    f18 = f15;
                    arrayList4 = arrayList2;
                    f19 = f16;
                    hashMap5 = hashMap2;
                    iVar3 = iVar2;
                case 1:
                    f14 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    iVar2 = iVar3;
                    f15 = f18;
                    f16 = f19;
                    eVar3 = eVar4;
                    i11 = dVar.G();
                    eVar4 = eVar3;
                    f17 = f20;
                    c10 = f14;
                    f18 = f15;
                    arrayList4 = arrayList2;
                    f19 = f16;
                    hashMap5 = hashMap2;
                    iVar3 = iVar2;
                case 2:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f18 = (float) dVar.s();
                    f17 = f20;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 3:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f19 = ((float) dVar.s()) - 0.01f;
                    f17 = f20;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 4:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f17 = (float) dVar.s();
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 5:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    f2 = f18;
                    f10 = f19;
                    eVar = eVar4;
                    String[] split = dVar.I().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || parseInt3 >= 0)))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        cVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 6:
                    f = c10;
                    t.e<i3.e> eVar5 = eVar4;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    f2 = f18;
                    f10 = f19;
                    dVar.a();
                    int i13 = 0;
                    while (dVar.m()) {
                        i3.e a10 = o.a(dVar, cVar);
                        if (a10.f19775e == 3) {
                            i13++;
                        }
                        arrayList3.add(a10);
                        t.e<i3.e> eVar6 = eVar5;
                        eVar6.h(a10.f19774d, a10);
                        if (i13 > 4) {
                            m3.c.b("You have " + i13 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        eVar5 = eVar6;
                    }
                    eVar = eVar5;
                    dVar.g();
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 7:
                    arrayList = arrayList4;
                    f2 = f18;
                    f10 = f19;
                    dVar.a();
                    while (dVar.m()) {
                        ArrayList arrayList5 = new ArrayList();
                        t.e eVar7 = new t.e();
                        dVar.e();
                        HashMap hashMap6 = hashMap5;
                        String str = null;
                        String str2 = null;
                        int i14 = 0;
                        int i15 = 0;
                        while (dVar.m()) {
                            t.i<f3.d> iVar4 = iVar3;
                            int R = dVar.R(f22802b);
                            if (R != 0) {
                                i10 = i11;
                                if (R != 1) {
                                    if (R != 2) {
                                        if (R != 3) {
                                            if (R != 4) {
                                                if (R != 5) {
                                                    dVar.c0();
                                                    dVar.e0();
                                                    f11 = c10;
                                                    eVar2 = eVar4;
                                                } else {
                                                    dVar.I();
                                                }
                                            } else {
                                                str2 = dVar.I();
                                            }
                                        } else {
                                            i15 = dVar.G();
                                        }
                                    } else {
                                        i14 = dVar.G();
                                    }
                                } else {
                                    dVar.a();
                                    while (dVar.m()) {
                                        i3.e a11 = o.a(dVar, cVar);
                                        eVar7.h(a11.f19774d, a11);
                                        arrayList5.add(a11);
                                        c10 = c10;
                                        eVar4 = eVar4;
                                    }
                                    f11 = c10;
                                    eVar2 = eVar4;
                                    dVar.g();
                                }
                                c10 = f11;
                                iVar3 = iVar4;
                                i11 = i10;
                                eVar4 = eVar2;
                            } else {
                                i10 = i11;
                                str = dVar.I();
                            }
                            iVar3 = iVar4;
                            i11 = i10;
                        }
                        float f21 = c10;
                        t.e<i3.e> eVar8 = eVar4;
                        t.i<f3.d> iVar5 = iVar3;
                        int i16 = i11;
                        dVar.h();
                        if (str2 != null) {
                            hashMap4.put(str, new a3.l(i14, i15, str, str2));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        c10 = f21;
                        hashMap5 = hashMap6;
                        iVar3 = iVar5;
                        i11 = i16;
                        eVar4 = eVar8;
                    }
                    f = c10;
                    hashMap = hashMap5;
                    iVar = iVar3;
                    i6 = i11;
                    dVar.g();
                    eVar = eVar4;
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 8:
                    f2 = f18;
                    f10 = f19;
                    dVar.e();
                    while (dVar.m()) {
                        if (dVar.R(f22803c) != 0) {
                            dVar.c0();
                            dVar.e0();
                        } else {
                            dVar.a();
                            while (dVar.m()) {
                                c.a aVar = h.f22786a;
                                dVar.e();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (dVar.m()) {
                                    int R2 = dVar.R(h.f22786a);
                                    if (R2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (R2 != 1) {
                                            if (R2 != 2) {
                                                if (R2 != 3) {
                                                    dVar.c0();
                                                    dVar.e0();
                                                } else {
                                                    dVar.s();
                                                }
                                            } else {
                                                str5 = dVar.I();
                                            }
                                        } else {
                                            str4 = dVar.I();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str3 = dVar.I();
                                    }
                                }
                                dVar.h();
                                hashMap5.put(str4, new f3.c(str3, str4, str5));
                                arrayList4 = arrayList4;
                            }
                            dVar.g();
                        }
                    }
                    arrayList = arrayList4;
                    dVar.h();
                    f = c10;
                    hashMap = hashMap5;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 9:
                    f2 = f18;
                    f10 = f19;
                    dVar.a();
                    while (dVar.m()) {
                        c.a aVar2 = g.f22784a;
                        ArrayList arrayList7 = new ArrayList();
                        dVar.e();
                        double d10 = 0.0d;
                        String str6 = null;
                        String str7 = null;
                        char c11 = 0;
                        while (dVar.m()) {
                            int R3 = dVar.R(g.f22784a);
                            if (R3 != 0) {
                                if (R3 != 1) {
                                    if (R3 != 2) {
                                        if (R3 != 3) {
                                            if (R3 != 4) {
                                                if (R3 != 5) {
                                                    dVar.c0();
                                                    dVar.e0();
                                                } else {
                                                    dVar.e();
                                                    while (dVar.m()) {
                                                        if (dVar.R(g.f22785b) != 0) {
                                                            dVar.c0();
                                                            dVar.e0();
                                                        } else {
                                                            dVar.a();
                                                            while (dVar.m()) {
                                                                arrayList7.add((h3.l) e.a(dVar, cVar));
                                                            }
                                                            dVar.g();
                                                        }
                                                    }
                                                    dVar.h();
                                                }
                                            } else {
                                                str7 = dVar.I();
                                            }
                                        } else {
                                            str6 = dVar.I();
                                        }
                                    } else {
                                        d10 = dVar.s();
                                    }
                                } else {
                                    dVar.s();
                                }
                            } else {
                                c11 = dVar.I().charAt(0);
                            }
                        }
                        dVar.h();
                        f3.d dVar2 = new f3.d(arrayList7, c11, d10, str6, str7);
                        iVar3.e(dVar2.hashCode(), dVar2);
                    }
                    dVar.g();
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                case 10:
                    dVar.a();
                    while (dVar.m()) {
                        dVar.e();
                        String str8 = null;
                        float f22 = 0.0f;
                        float f23 = 0.0f;
                        while (dVar.m()) {
                            int R4 = dVar.R(f22804d);
                            if (R4 != 0) {
                                f12 = f19;
                                if (R4 != 1) {
                                    if (R4 != 2) {
                                        dVar.c0();
                                        dVar.e0();
                                    } else {
                                        f13 = f18;
                                        f23 = (float) dVar.s();
                                    }
                                } else {
                                    f13 = f18;
                                    f22 = (float) dVar.s();
                                }
                                f18 = f13;
                            } else {
                                f12 = f19;
                                str8 = dVar.I();
                            }
                            f19 = f12;
                        }
                        dVar.h();
                        arrayList4.add(new f3.h(str8, f22, f23));
                        f18 = f18;
                        f19 = f19;
                    }
                    f2 = f18;
                    f10 = f19;
                    dVar.g();
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    eVar = eVar4;
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
                default:
                    f = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i6 = i11;
                    f2 = f18;
                    f10 = f19;
                    eVar = eVar4;
                    dVar.c0();
                    dVar.e0();
                    f17 = f20;
                    f18 = f2;
                    f19 = f10;
                    eVar4 = eVar;
                    c10 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i11 = i6;
            }
        }
        float f24 = c10;
        cVar.f184j = new Rect(0, 0, (int) (i12 * f24), (int) (i11 * f24));
        cVar.f185k = f18;
        cVar.f186l = f19;
        cVar.f187m = f17;
        cVar.f183i = arrayList3;
        cVar.f182h = eVar4;
        cVar.f178c = hashMap3;
        cVar.f179d = hashMap4;
        cVar.f181g = iVar3;
        cVar.f180e = hashMap5;
        cVar.f = arrayList4;
        return cVar;
    }
}
