package k3;

import android.graphics.Color;
import java.util.ArrayList;
import l3.c;
/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22798a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f22799b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f22800c = c.a.a("nm");

    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i3.e a(l3.d dVar, a3.c cVar) {
        ArrayList arrayList;
        String str;
        String str2;
        l3.d dVar2;
        long j10;
        l3.d dVar3;
        String str3;
        long j11;
        l3.d dVar4;
        char c10;
        char c11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        dVar.e();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean z10 = false;
        l3.d dVar5 = dVar;
        long j12 = -1;
        int i6 = 0;
        String str4 = null;
        g3.d dVar6 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        float f = 1.0f;
        float f2 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        g3.a aVar = null;
        v.c cVar2 = null;
        int i15 = 1;
        g3.b bVar = null;
        boolean z11 = false;
        String str5 = "UNSET";
        long j13 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        String str6 = null;
        while (dVar.m()) {
            switch (dVar5.R(f22798a)) {
                case 0:
                    str2 = str6;
                    dVar2 = dVar;
                    str5 = dVar.I();
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 1:
                    str2 = str6;
                    dVar2 = dVar;
                    j13 = dVar.G();
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 2:
                    str2 = str6;
                    dVar2 = dVar;
                    str4 = dVar.I();
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 3:
                    str2 = str6;
                    j10 = j13;
                    dVar3 = dVar;
                    int G = dVar.G();
                    if (G < 6) {
                        i6 = v.h.e(7)[G];
                    } else {
                        i6 = 7;
                    }
                    dVar5 = dVar3;
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
                case 4:
                    str2 = str6;
                    j10 = j13;
                    dVar5 = dVar;
                    j12 = dVar.G();
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
                case 5:
                    str3 = str6;
                    j11 = j13;
                    dVar4 = dVar;
                    i10 = (int) (m3.g.c() * dVar.G());
                    dVar5 = dVar4;
                    str6 = str3;
                    j13 = j11;
                    z10 = false;
                case 6:
                    str3 = str6;
                    j11 = j13;
                    dVar4 = dVar;
                    i11 = (int) (m3.g.c() * dVar.G());
                    dVar5 = dVar4;
                    str6 = str3;
                    j13 = j11;
                    z10 = false;
                case 7:
                    str2 = str6;
                    dVar2 = dVar;
                    i12 = Color.parseColor(dVar.I());
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 8:
                    str2 = str6;
                    dVar2 = dVar;
                    dVar6 = c.a(dVar, cVar);
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 9:
                    str2 = str6;
                    dVar2 = dVar;
                    i15 = v.h.e(4)[dVar.G()];
                    cVar.f189o++;
                    j13 = j13;
                    dVar5 = dVar2;
                    str6 = str2;
                    z10 = false;
                case 10:
                    dVar.a();
                    while (dVar.m()) {
                        dVar.e();
                        boolean z12 = false;
                        int i16 = 0;
                        g3.a aVar2 = null;
                        g3.a aVar3 = null;
                        while (dVar.m()) {
                            String q02 = dVar.q0();
                            q02.getClass();
                            String str7 = str6;
                            int hashCode = q02.hashCode();
                            long j14 = j13;
                            if (hashCode != 111) {
                                if (hashCode != 3588) {
                                    if (hashCode != 104433) {
                                        if (hashCode == 3357091 && q02.equals("mode")) {
                                            c10 = 3;
                                        }
                                        c10 = 65535;
                                    } else {
                                        if (q02.equals("inv")) {
                                            c10 = 2;
                                        }
                                        c10 = 65535;
                                    }
                                } else {
                                    if (q02.equals("pt")) {
                                        c10 = 1;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (q02.equals("o")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            }
                            if (c10 != 0) {
                                if (c10 != 1) {
                                    if (c10 != 2) {
                                        if (c10 != 3) {
                                            dVar.e0();
                                        } else {
                                            String I = dVar.I();
                                            I.getClass();
                                            int hashCode2 = I.hashCode();
                                            if (hashCode2 != 97) {
                                                if (hashCode2 != 105) {
                                                    if (hashCode2 != 110) {
                                                        if (hashCode2 == 115 && I.equals("s")) {
                                                            c11 = 3;
                                                            if (c11 != 0) {
                                                                if (c11 != 1) {
                                                                    if (c11 != 2) {
                                                                        if (c11 != 3) {
                                                                            m3.c.b("Unknown mask mode " + q02 + ". Defaulting to Add.");
                                                                        } else {
                                                                            i16 = 2;
                                                                        }
                                                                    } else {
                                                                        i16 = 4;
                                                                    }
                                                                } else {
                                                                    cVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                                    i16 = 3;
                                                                }
                                                            }
                                                            i16 = 1;
                                                        }
                                                        c11 = 65535;
                                                        if (c11 != 0) {
                                                        }
                                                        i16 = 1;
                                                    } else {
                                                        if (I.equals("n")) {
                                                            c11 = 2;
                                                            if (c11 != 0) {
                                                            }
                                                            i16 = 1;
                                                        }
                                                        c11 = 65535;
                                                        if (c11 != 0) {
                                                        }
                                                        i16 = 1;
                                                    }
                                                } else {
                                                    if (I.equals("i")) {
                                                        c11 = 1;
                                                        if (c11 != 0) {
                                                        }
                                                        i16 = 1;
                                                    }
                                                    c11 = 65535;
                                                    if (c11 != 0) {
                                                    }
                                                    i16 = 1;
                                                }
                                            } else {
                                                if (I.equals("a")) {
                                                    c11 = 0;
                                                    if (c11 != 0) {
                                                    }
                                                    i16 = 1;
                                                }
                                                c11 = 65535;
                                                if (c11 != 0) {
                                                }
                                                i16 = 1;
                                            }
                                        }
                                    } else {
                                        z12 = dVar.o();
                                    }
                                } else {
                                    aVar2 = new g3.a(5, n.a(m3.g.c(), cVar, u.f22809u, dVar));
                                }
                            } else {
                                aVar3 = sc.b.X(dVar, cVar);
                            }
                            str6 = str7;
                            j13 = j14;
                        }
                        dVar.h();
                        arrayList2.add(new h3.f(i16, aVar2, aVar3, z12));
                        str6 = str6;
                        j13 = j13;
                    }
                    str2 = str6;
                    j10 = j13;
                    dVar3 = dVar;
                    cVar.f189o += arrayList2.size();
                    dVar.g();
                    dVar5 = dVar3;
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
                    break;
                case 11:
                    dVar.a();
                    while (dVar.m()) {
                        h3.b a10 = e.a(dVar, cVar);
                        if (a10 != null) {
                            arrayList3.add(a10);
                        }
                    }
                    dVar.g();
                    str2 = str6;
                    j10 = j13;
                    dVar3 = dVar;
                    dVar5 = dVar3;
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
                case 12:
                    dVar.e();
                    while (dVar.m()) {
                        int R = dVar5.R(f22799b);
                        if (R != 0) {
                            if (R != 1) {
                                dVar.c0();
                                dVar.e0();
                            } else {
                                dVar.a();
                                if (dVar.m()) {
                                    c.a aVar4 = b.f22776a;
                                    dVar.e();
                                    v.c cVar3 = null;
                                    while (dVar.m()) {
                                        if (dVar5.R(b.f22776a) != 0) {
                                            dVar.c0();
                                            dVar.e0();
                                        } else {
                                            dVar.e();
                                            g3.a aVar5 = null;
                                            g3.a aVar6 = null;
                                            g3.b bVar2 = null;
                                            g3.b bVar3 = null;
                                            while (dVar.m()) {
                                                int R2 = dVar5.R(b.f22777b);
                                                if (R2 != 0) {
                                                    if (R2 != 1) {
                                                        if (R2 != 2) {
                                                            if (R2 != 3) {
                                                                dVar.c0();
                                                                dVar.e0();
                                                            } else {
                                                                bVar3 = sc.b.W(dVar5, cVar, true);
                                                            }
                                                        } else {
                                                            bVar2 = sc.b.W(dVar5, cVar, true);
                                                        }
                                                    } else {
                                                        aVar6 = sc.b.V(dVar, cVar);
                                                    }
                                                } else {
                                                    aVar5 = sc.b.V(dVar, cVar);
                                                }
                                            }
                                            dVar.h();
                                            cVar3 = new v.c(aVar5, aVar6, bVar2, bVar3, 4);
                                        }
                                    }
                                    dVar.h();
                                    if (cVar3 == null) {
                                        cVar3 = new v.c(null, null, null, null, 4);
                                    }
                                    cVar2 = cVar3;
                                }
                                while (dVar.m()) {
                                    dVar.e0();
                                }
                                dVar.g();
                            }
                        } else {
                            aVar = new g3.a(6, n.a(1.0f, cVar, f.f22782u, dVar5));
                        }
                    }
                    dVar.h();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 13:
                    dVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (dVar.m()) {
                        dVar.e();
                        while (dVar.m()) {
                            if (dVar5.R(f22800c) != 0) {
                                dVar.c0();
                                dVar.e0();
                            } else {
                                arrayList4.add(dVar.I());
                            }
                        }
                        dVar.h();
                    }
                    dVar.g();
                    cVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    str2 = str6;
                    j10 = j13;
                    dVar3 = dVar;
                    dVar5 = dVar3;
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
                case 14:
                    f = (float) dVar.s();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 15:
                    f2 = (float) dVar.s();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 16:
                    i13 = (int) (m3.g.c() * dVar.G());
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 17:
                    i14 = (int) (m3.g.c() * dVar.G());
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 18:
                    f10 = (float) dVar.s();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 19:
                    f11 = (float) dVar.s();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 20:
                    bVar = sc.b.W(dVar5, cVar, z10);
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                case 21:
                    str2 = dVar.I();
                    str6 = str2;
                    z10 = false;
                case 22:
                    z11 = dVar.o();
                    str2 = str6;
                    str6 = str2;
                    z10 = false;
                default:
                    str2 = str6;
                    j10 = j13;
                    dVar3 = dVar;
                    dVar.c0();
                    dVar.e0();
                    dVar5 = dVar3;
                    j13 = j10;
                    str6 = str2;
                    z10 = false;
            }
        }
        String str8 = str6;
        long j15 = j13;
        dVar.h();
        float f12 = f10 / f;
        float f13 = f11 / f;
        ArrayList arrayList5 = new ArrayList();
        if (f12 > 0.0f) {
            str = str8;
            arrayList = arrayList2;
            arrayList5.add(new n3.a(cVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f12)));
        } else {
            arrayList = arrayList2;
            str = str8;
        }
        if (f13 <= 0.0f) {
            f13 = cVar.f186l;
        }
        arrayList5.add(new n3.a(cVar, valueOf, valueOf, null, f12, Float.valueOf(f13)));
        arrayList5.add(new n3.a(cVar, valueOf2, valueOf2, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str5.endsWith(".ai") || "ai".equals(str)) {
            cVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new i3.e(arrayList3, cVar, str5, j15, i6, j12, str4, arrayList, dVar6, i10, i11, i12, f, f2, i13, i14, aVar, cVar2, arrayList5, i15, bVar, z11);
    }
}
