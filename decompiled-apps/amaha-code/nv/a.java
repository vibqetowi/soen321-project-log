package nv;

import gv.n;
import is.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lv.c;
import lv.c0;
import lv.d;
import lv.d0;
import lv.e0;
import lv.o;
import lv.s;
import lv.t;
import lv.u;
import lv.y;
import lv.z;
import nv.d;
import nv.e;
import ta.v;
/* compiled from: CacheInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final lv.c f26846a;

    /* compiled from: CacheInterceptor.kt */
    /* renamed from: nv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0441a {
        public static final d0 a(d0 d0Var) {
            e0 e0Var;
            if (d0Var == null) {
                e0Var = null;
            } else {
                e0Var = d0Var.A;
            }
            if (e0Var != null) {
                d0Var.getClass();
                d0.a aVar = new d0.a(d0Var);
                aVar.f24594g = null;
                return aVar.a();
            }
            return d0Var;
        }

        public static boolean b(String str) {
            if (!n.A0("Connection", str, true) && !n.A0("Keep-Alive", str, true) && !n.A0("Proxy-Authenticate", str, true) && !n.A0("Proxy-Authorization", str, true) && !n.A0("TE", str, true) && !n.A0("Trailers", str, true) && !n.A0("Transfer-Encoding", str, true) && !n.A0("Upgrade", str, true)) {
                return true;
            }
            return false;
        }
    }

    static {
        new C0441a();
    }

    public a(lv.c cVar) {
        this.f26846a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0240, code lost:
        if (r4 > 0) goto L284;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    @Override // lv.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 a(qv.f fVar) {
        d0 d0Var;
        int i6;
        long j10;
        long j11;
        Date date;
        Date date2;
        Date date3;
        String str;
        String str2;
        String str3;
        d dVar;
        boolean z10;
        lv.d dVar2;
        String str4;
        long j12;
        String str5;
        String sb2;
        Long valueOf;
        long j13;
        long j14;
        Long valueOf2;
        long time;
        int i10;
        int i11;
        long j15;
        lv.d dVar3;
        String str6;
        String str7;
        String str8;
        String str9;
        Map<Class<?>, Object> map;
        LinkedHashMap z02;
        t tVar;
        Map unmodifiableMap;
        d dVar4;
        boolean z11;
        int i12;
        pv.d dVar5;
        z zVar;
        lv.c cVar;
        pv.d dVar6;
        Object obj;
        e0 e0Var;
        boolean z12;
        boolean z13;
        c.d dVar7;
        e.a aVar;
        boolean z14;
        e.a aVar2;
        boolean z15;
        boolean z16;
        e0 e0Var2;
        e.c h10;
        s headers;
        String str10;
        t url;
        boolean z17;
        boolean z18;
        pv.d call = fVar.f30146a;
        lv.c cVar2 = this.f26846a;
        if (cVar2 != null) {
            z request = fVar.f30150e;
            kotlin.jvm.internal.i.g(request, "request");
            t tVar2 = request.f24751a;
            try {
                h10 = cVar2.f24545u.h(c.b.a(tVar2));
            } catch (IOException unused) {
            }
            if (h10 != null) {
                try {
                    c.C0395c c0395c = new c.C0395c(h10.f26876w.get(0));
                    headers = c0395c.f24555b;
                    str10 = c0395c.f24556c;
                    url = c0395c.f24554a;
                    s sVar = c0395c.f24559g;
                    String g5 = sVar.g("Content-Type");
                    String g10 = sVar.g("Content-Length");
                    z.a aVar3 = new z.a();
                    kotlin.jvm.internal.i.g(url, "url");
                    aVar3.f24756a = url;
                    aVar3.c(str10, null);
                    kotlin.jvm.internal.i.g(headers, "headers");
                    aVar3.f24758c = headers.o();
                    z a10 = aVar3.a();
                    d0.a aVar4 = new d0.a();
                    aVar4.f24589a = a10;
                    y protocol = c0395c.f24557d;
                    kotlin.jvm.internal.i.g(protocol, "protocol");
                    aVar4.f24590b = protocol;
                    aVar4.f24591c = c0395c.f24558e;
                    String message = c0395c.f;
                    kotlin.jvm.internal.i.g(message, "message");
                    aVar4.f24592d = message;
                    aVar4.c(sVar);
                    aVar4.f24594g = new c.a(h10, g5, g10);
                    aVar4.f24593e = c0395c.f24560h;
                    aVar4.f24598k = c0395c.f24561i;
                    aVar4.f24599l = c0395c.f24562j;
                    d0Var = aVar4.a();
                } catch (IOException unused2) {
                    mv.b.d(h10);
                }
                if (kotlin.jvm.internal.i.b(url, tVar2) && kotlin.jvm.internal.i.b(str10, request.f24752b)) {
                    Set<String> c10 = c.b.c(d0Var.f24588z);
                    if (!c10.isEmpty()) {
                        for (String str11 : c10) {
                            if (!kotlin.jvm.internal.i.b(headers.r(str11), request.f24753c.r(str11))) {
                                z18 = false;
                                break;
                            }
                        }
                    }
                    z18 = true;
                    if (z18) {
                        z17 = true;
                        if (!z17) {
                            e0 e0Var3 = d0Var.A;
                            if (e0Var3 != null) {
                                mv.b.d(e0Var3);
                            }
                            d0Var = null;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        z request2 = fVar.f30150e;
                        kotlin.jvm.internal.i.g(request2, "request");
                        if (d0Var != null) {
                            j10 = d0Var.E;
                            j11 = d0Var.F;
                            s sVar2 = d0Var.f24588z;
                            int length = sVar2.f24683u.length / 2;
                            int i13 = 0;
                            i6 = -1;
                            date = null;
                            date2 = null;
                            date3 = null;
                            str = null;
                            str2 = null;
                            str3 = null;
                            while (i13 < length) {
                                int i14 = i13 + 1;
                                String m10 = sVar2.m(i13);
                                String q10 = sVar2.q(i13);
                                int i15 = i6;
                                long j16 = j10;
                                if (n.A0(m10, "Date", true)) {
                                    date = qv.c.a(q10);
                                    str3 = q10;
                                } else if (n.A0(m10, "Expires", true)) {
                                    date2 = qv.c.a(q10);
                                } else if (n.A0(m10, "Last-Modified", true)) {
                                    date3 = qv.c.a(q10);
                                    str2 = q10;
                                } else if (n.A0(m10, "ETag", true)) {
                                    str = q10;
                                } else if (n.A0(m10, "Age", true)) {
                                    i6 = mv.b.y(-1, q10);
                                    i13 = i14;
                                    j10 = j16;
                                }
                                i6 = i15;
                                i13 = i14;
                                j10 = j16;
                            }
                        } else {
                            i6 = -1;
                            j10 = 0;
                            j11 = 0;
                            date = null;
                            date2 = null;
                            date3 = null;
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        if (d0Var == null) {
                            dVar4 = new d(request2, null);
                        } else if (request2.f24751a.f24694j && d0Var.f24587y == null) {
                            dVar4 = new d(request2, null);
                        } else if (!d.a.a(request2, d0Var)) {
                            dVar4 = new d(request2, null);
                        } else {
                            lv.d dVar8 = request2.f;
                            if (dVar8 == null) {
                                int i16 = lv.d.f24570n;
                                dVar8 = d.b.b(request2.f24753c);
                                request2.f = dVar8;
                            }
                            if (!dVar8.f24571a) {
                                if (request2.f24753c.g("If-Modified-Since") == null && request2.f24753c.g("If-None-Match") == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    lv.d a11 = d0Var.a();
                                    if (date != null) {
                                        dVar2 = a11;
                                        str4 = "If-None-Match";
                                        j12 = Math.max(0L, j11 - date.getTime());
                                    } else {
                                        dVar2 = a11;
                                        str4 = "If-None-Match";
                                        j12 = 0;
                                    }
                                    if (i6 != -1) {
                                        str5 = "If-Modified-Since";
                                        j12 = Math.max(j12, TimeUnit.SECONDS.toMillis(i6));
                                    } else {
                                        str5 = "If-Modified-Since";
                                    }
                                    long j17 = j12 + (j11 - j10) + (currentTimeMillis - j11);
                                    int i17 = d0Var.a().f24573c;
                                    if (i17 != -1) {
                                        time = TimeUnit.SECONDS.toMillis(i17);
                                    } else {
                                        if (date2 != null) {
                                            if (date == null) {
                                                valueOf2 = null;
                                            } else {
                                                valueOf2 = Long.valueOf(date.getTime());
                                            }
                                            if (valueOf2 != null) {
                                                j11 = valueOf2.longValue();
                                            }
                                            time = date2.getTime() - j11;
                                        } else if (date3 != null) {
                                            List<String> list = d0Var.f24583u.f24751a.f24691g;
                                            if (list == null) {
                                                sb2 = null;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                t.b.f(sb3, list);
                                                sb2 = sb3.toString();
                                            }
                                            if (sb2 == null) {
                                                if (date == null) {
                                                    valueOf = null;
                                                } else {
                                                    valueOf = Long.valueOf(date.getTime());
                                                }
                                                if (valueOf != null) {
                                                    j10 = valueOf.longValue();
                                                }
                                                long time2 = j10 - date3.getTime();
                                                j13 = 0;
                                                if (time2 > 0) {
                                                    j14 = time2 / 10;
                                                    i10 = dVar8.f24573c;
                                                    if (i10 != -1) {
                                                        j14 = Math.min(j14, TimeUnit.SECONDS.toMillis(i10));
                                                    }
                                                    i11 = dVar8.f24578i;
                                                    if (i11 == -1) {
                                                        j15 = TimeUnit.SECONDS.toMillis(i11);
                                                    } else {
                                                        j15 = j13;
                                                    }
                                                    dVar3 = dVar2;
                                                    if (dVar3.f24576g && (i12 = dVar8.f24577h) != -1) {
                                                        str6 = str5;
                                                        j13 = TimeUnit.SECONDS.toMillis(i12);
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (!dVar3.f24571a) {
                                                        long j18 = j15 + j17;
                                                        if (j18 < j13 + j14) {
                                                            d0.a aVar5 = new d0.a(d0Var);
                                                            if (j18 >= j14) {
                                                                aVar5.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                            }
                                                            if (j17 > 86400000) {
                                                                if (d0Var.a().f24573c == -1 && date2 == null) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                if (z11) {
                                                                    aVar5.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                                }
                                                            }
                                                            dVar = new d(null, aVar5.a());
                                                            if (dVar.f26851a != null) {
                                                                lv.d dVar9 = request2.f;
                                                                if (dVar9 == null) {
                                                                    int i18 = lv.d.f24570n;
                                                                    dVar9 = d.b.b(request2.f24753c);
                                                                    request2.f = dVar9;
                                                                }
                                                                if (dVar9.f24579j) {
                                                                    dVar5 = null;
                                                                    dVar = new d(null, null);
                                                                    zVar = dVar.f26851a;
                                                                    d0 d0Var2 = dVar.f26852b;
                                                                    cVar = this.f26846a;
                                                                    if (cVar != null) {
                                                                        synchronized (cVar) {
                                                                            if (dVar.f26851a == null) {
                                                                                d0 d0Var3 = dVar.f26852b;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (call instanceof pv.d) {
                                                                        dVar6 = call;
                                                                    } else {
                                                                        dVar6 = dVar5;
                                                                    }
                                                                    if (dVar6 == null) {
                                                                        obj = dVar5;
                                                                    } else {
                                                                        obj = dVar6.f29052y;
                                                                    }
                                                                    if (obj == null) {
                                                                        obj = o.f24669a;
                                                                    }
                                                                    if (d0Var != null && d0Var2 == null && (e0Var2 = d0Var.A) != null) {
                                                                        mv.b.d(e0Var2);
                                                                    }
                                                                    if (zVar != null && d0Var2 == null) {
                                                                        d0.a aVar6 = new d0.a();
                                                                        z request3 = fVar.f30150e;
                                                                        kotlin.jvm.internal.i.g(request3, "request");
                                                                        aVar6.f24589a = request3;
                                                                        aVar6.f24590b = y.HTTP_1_1;
                                                                        aVar6.f24591c = 504;
                                                                        aVar6.f24592d = "Unsatisfiable Request (only-if-cached)";
                                                                        aVar6.f24594g = mv.b.f25757c;
                                                                        aVar6.f24598k = -1L;
                                                                        aVar6.f24599l = System.currentTimeMillis();
                                                                        d0 a12 = aVar6.a();
                                                                        obj.getClass();
                                                                        kotlin.jvm.internal.i.g(call, "call");
                                                                        return a12;
                                                                    } else if (zVar == null) {
                                                                        kotlin.jvm.internal.i.d(d0Var2);
                                                                        d0.a aVar7 = new d0.a(d0Var2);
                                                                        d0 a13 = C0441a.a(d0Var2);
                                                                        d0.a.b("cacheResponse", a13);
                                                                        aVar7.f24596i = a13;
                                                                        d0 a14 = aVar7.a();
                                                                        obj.getClass();
                                                                        kotlin.jvm.internal.i.g(call, "call");
                                                                        return a14;
                                                                    } else {
                                                                        if (d0Var2 != null) {
                                                                            obj.getClass();
                                                                            kotlin.jvm.internal.i.g(call, "call");
                                                                        } else if (this.f26846a != null) {
                                                                            obj.getClass();
                                                                            kotlin.jvm.internal.i.g(call, "call");
                                                                        }
                                                                        try {
                                                                            d0 c11 = fVar.c(zVar);
                                                                            if (d0Var2 != null) {
                                                                                if (c11.f24586x == 304) {
                                                                                    z14 = true;
                                                                                } else {
                                                                                    z14 = false;
                                                                                }
                                                                                if (z14) {
                                                                                    d0.a aVar8 = new d0.a(d0Var2);
                                                                                    s sVar3 = d0Var2.f24588z;
                                                                                    s sVar4 = c11.f24588z;
                                                                                    s.a aVar9 = new s.a();
                                                                                    int length2 = sVar3.f24683u.length / 2;
                                                                                    int i19 = 0;
                                                                                    while (i19 < length2) {
                                                                                        int i20 = i19 + 1;
                                                                                        String m11 = sVar3.m(i19);
                                                                                        String q11 = sVar3.q(i19);
                                                                                        if (!n.A0("Warning", m11, true) || !n.H0(q11, "1")) {
                                                                                            if (!n.A0("Content-Length", m11, true) && !n.A0("Content-Encoding", m11, true) && !n.A0("Content-Type", m11, true)) {
                                                                                                z16 = false;
                                                                                            } else {
                                                                                                z16 = true;
                                                                                            }
                                                                                            if (z16 || !C0441a.b(m11) || sVar4.g(m11) == null) {
                                                                                                aVar9.c(m11, q11);
                                                                                            }
                                                                                        }
                                                                                        i19 = i20;
                                                                                    }
                                                                                    int length3 = sVar4.f24683u.length / 2;
                                                                                    int i21 = 0;
                                                                                    while (i21 < length3) {
                                                                                        int i22 = i21 + 1;
                                                                                        String m12 = sVar4.m(i21);
                                                                                        if (!n.A0("Content-Length", m12, true) && !n.A0("Content-Encoding", m12, true) && !n.A0("Content-Type", m12, true)) {
                                                                                            z15 = false;
                                                                                        } else {
                                                                                            z15 = true;
                                                                                        }
                                                                                        if (!z15 && C0441a.b(m12)) {
                                                                                            aVar9.c(m12, sVar4.q(i21));
                                                                                        }
                                                                                        i21 = i22;
                                                                                    }
                                                                                    aVar8.c(aVar9.d());
                                                                                    aVar8.f24598k = c11.E;
                                                                                    aVar8.f24599l = c11.F;
                                                                                    d0 a15 = C0441a.a(d0Var2);
                                                                                    d0.a.b("cacheResponse", a15);
                                                                                    aVar8.f24596i = a15;
                                                                                    d0 a16 = C0441a.a(c11);
                                                                                    d0.a.b("networkResponse", a16);
                                                                                    aVar8.f24595h = a16;
                                                                                    d0 a17 = aVar8.a();
                                                                                    e0 e0Var4 = c11.A;
                                                                                    kotlin.jvm.internal.i.d(e0Var4);
                                                                                    e0Var4.close();
                                                                                    lv.c cVar3 = this.f26846a;
                                                                                    kotlin.jvm.internal.i.d(cVar3);
                                                                                    cVar3.g();
                                                                                    this.f26846a.getClass();
                                                                                    c.C0395c c0395c2 = new c.C0395c(a17);
                                                                                    e0 e0Var5 = d0Var2.A;
                                                                                    if (e0Var5 != null) {
                                                                                        e.c cVar4 = ((c.a) e0Var5).f24546v;
                                                                                        try {
                                                                                            aVar2 = cVar4.f26877x.g(cVar4.f26875v, cVar4.f26874u);
                                                                                            if (aVar2 != null) {
                                                                                                try {
                                                                                                    c0395c2.c(aVar2);
                                                                                                    aVar2.b();
                                                                                                } catch (IOException unused3) {
                                                                                                    if (aVar2 != 0) {
                                                                                                        try {
                                                                                                            aVar2.a();
                                                                                                        } catch (IOException unused4) {
                                                                                                        }
                                                                                                    }
                                                                                                    obj.getClass();
                                                                                                    kotlin.jvm.internal.i.g(call, "call");
                                                                                                    return a17;
                                                                                                }
                                                                                            }
                                                                                        } catch (IOException unused5) {
                                                                                            aVar2 = dVar5;
                                                                                        }
                                                                                        obj.getClass();
                                                                                        kotlin.jvm.internal.i.g(call, "call");
                                                                                        return a17;
                                                                                    }
                                                                                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                                                                                }
                                                                                z12 = true;
                                                                                e0 e0Var6 = d0Var2.A;
                                                                                if (e0Var6 != null) {
                                                                                    mv.b.d(e0Var6);
                                                                                }
                                                                            } else {
                                                                                z12 = true;
                                                                            }
                                                                            d0.a aVar10 = new d0.a(c11);
                                                                            d0 a18 = C0441a.a(d0Var2);
                                                                            d0.a.b("cacheResponse", a18);
                                                                            aVar10.f24596i = a18;
                                                                            d0 a19 = C0441a.a(c11);
                                                                            d0.a.b("networkResponse", a19);
                                                                            aVar10.f24595h = a19;
                                                                            d0 a20 = aVar10.a();
                                                                            if (this.f26846a != null) {
                                                                                if (qv.e.a(a20) && d.a.a(zVar, a20)) {
                                                                                    lv.c cVar5 = this.f26846a;
                                                                                    cVar5.getClass();
                                                                                    z zVar2 = a20.f24583u;
                                                                                    String method = zVar2.f24752b;
                                                                                    kotlin.jvm.internal.i.g(method, "method");
                                                                                    if (!kotlin.jvm.internal.i.b(method, "POST") && !kotlin.jvm.internal.i.b(method, "PATCH") && !kotlin.jvm.internal.i.b(method, "PUT") && !kotlin.jvm.internal.i.b(method, "DELETE") && !kotlin.jvm.internal.i.b(method, "MOVE")) {
                                                                                        z12 = false;
                                                                                    }
                                                                                    if (z12) {
                                                                                        cVar5.e(zVar2);
                                                                                    } else {
                                                                                        if (kotlin.jvm.internal.i.b(method, "GET") && !c.b.c(a20.f24588z).contains("*")) {
                                                                                            c.C0395c c0395c3 = new c.C0395c(a20);
                                                                                            try {
                                                                                                e eVar = cVar5.f24545u;
                                                                                                String a21 = c.b.a(zVar2.f24751a);
                                                                                                gv.e eVar2 = e.P;
                                                                                                aVar = eVar.g(-1L, a21);
                                                                                            } catch (IOException unused6) {
                                                                                                aVar = dVar5;
                                                                                            }
                                                                                            if (aVar != null) {
                                                                                                try {
                                                                                                    c0395c3.c(aVar);
                                                                                                    dVar7 = new c.d(aVar);
                                                                                                } catch (IOException unused7) {
                                                                                                    if (aVar != 0) {
                                                                                                        aVar.a();
                                                                                                    }
                                                                                                    dVar7 = dVar5;
                                                                                                    if (dVar7 != 0) {
                                                                                                    }
                                                                                                    if (d0Var2 != null) {
                                                                                                    }
                                                                                                    return a20;
                                                                                                }
                                                                                                if (dVar7 != 0) {
                                                                                                    c.d.a aVar11 = dVar7.f24565c;
                                                                                                    e0 e0Var7 = a20.A;
                                                                                                    kotlin.jvm.internal.i.d(e0Var7);
                                                                                                    b bVar = new b(e0Var7.g(), dVar7, v.h(aVar11));
                                                                                                    String e10 = d0.e(a20, "Content-Type");
                                                                                                    long a22 = a20.A.a();
                                                                                                    d0.a aVar12 = new d0.a(a20);
                                                                                                    aVar12.f24594g = new qv.g(e10, a22, v.j(bVar));
                                                                                                    a20 = aVar12.a();
                                                                                                }
                                                                                                if (d0Var2 != null) {
                                                                                                    obj.getClass();
                                                                                                    kotlin.jvm.internal.i.g(call, "call");
                                                                                                }
                                                                                                return a20;
                                                                                            }
                                                                                        }
                                                                                        dVar7 = dVar5;
                                                                                        if (dVar7 != 0) {
                                                                                        }
                                                                                        if (d0Var2 != null) {
                                                                                        }
                                                                                        return a20;
                                                                                    }
                                                                                    dVar7 = dVar5;
                                                                                    if (dVar7 != 0) {
                                                                                    }
                                                                                    if (d0Var2 != null) {
                                                                                    }
                                                                                    return a20;
                                                                                }
                                                                                String method2 = zVar.f24752b;
                                                                                kotlin.jvm.internal.i.g(method2, "method");
                                                                                if (!kotlin.jvm.internal.i.b(method2, "POST") && !kotlin.jvm.internal.i.b(method2, "PATCH") && !kotlin.jvm.internal.i.b(method2, "PUT") && !kotlin.jvm.internal.i.b(method2, "DELETE") && !kotlin.jvm.internal.i.b(method2, "MOVE")) {
                                                                                    z13 = false;
                                                                                } else {
                                                                                    z13 = true;
                                                                                }
                                                                                if (z13) {
                                                                                    try {
                                                                                        this.f26846a.e(zVar);
                                                                                    } catch (IOException unused8) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            return a20;
                                                                        } catch (Throwable th2) {
                                                                            if (d0Var != null && (e0Var = d0Var.A) != null) {
                                                                                mv.b.d(e0Var);
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            dVar5 = null;
                                                            zVar = dVar.f26851a;
                                                            d0 d0Var22 = dVar.f26852b;
                                                            cVar = this.f26846a;
                                                            if (cVar != null) {
                                                            }
                                                            if (call instanceof pv.d) {
                                                            }
                                                            if (dVar6 == null) {
                                                            }
                                                            if (obj == null) {
                                                            }
                                                            if (d0Var != null) {
                                                                mv.b.d(e0Var2);
                                                            }
                                                            if (zVar != null) {
                                                            }
                                                            if (zVar == null) {
                                                            }
                                                        }
                                                    }
                                                    if (str == null) {
                                                        str9 = str;
                                                        str8 = str4;
                                                    } else {
                                                        if (date3 != null) {
                                                            str7 = str2;
                                                        } else if (date != null) {
                                                            str7 = str3;
                                                        } else {
                                                            dVar = new d(request2, null);
                                                            if (dVar.f26851a != null) {
                                                            }
                                                            dVar5 = null;
                                                            zVar = dVar.f26851a;
                                                            d0 d0Var222 = dVar.f26852b;
                                                            cVar = this.f26846a;
                                                            if (cVar != null) {
                                                            }
                                                            if (call instanceof pv.d) {
                                                            }
                                                            if (dVar6 == null) {
                                                            }
                                                            if (obj == null) {
                                                            }
                                                            if (d0Var != null) {
                                                            }
                                                            if (zVar != null) {
                                                            }
                                                            if (zVar == null) {
                                                            }
                                                        }
                                                        str8 = str6;
                                                        str9 = str7;
                                                    }
                                                    s sVar5 = request2.f24753c;
                                                    s.a o10 = sVar5.o();
                                                    kotlin.jvm.internal.i.d(str9);
                                                    o10.c(str8, str9);
                                                    new LinkedHashMap();
                                                    String str12 = request2.f24752b;
                                                    c0 c0Var = request2.f24754d;
                                                    map = request2.f24755e;
                                                    if (!map.isEmpty()) {
                                                        z02 = new LinkedHashMap();
                                                    } else {
                                                        z02 = is.e0.z0(map);
                                                    }
                                                    sVar5.o();
                                                    s.a o11 = o10.d().o();
                                                    tVar = request2.f24751a;
                                                    if (tVar == null) {
                                                        s d10 = o11.d();
                                                        byte[] bArr = mv.b.f25755a;
                                                        if (z02.isEmpty()) {
                                                            unmodifiableMap = x.f20677u;
                                                        } else {
                                                            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(z02));
                                                            kotlin.jvm.internal.i.f(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                                                        }
                                                        dVar4 = new d(new z(tVar, str12, d10, c0Var, unmodifiableMap), d0Var);
                                                    } else {
                                                        throw new IllegalStateException("url == null".toString());
                                                    }
                                                }
                                                j14 = j13;
                                                i10 = dVar8.f24573c;
                                                if (i10 != -1) {
                                                }
                                                i11 = dVar8.f24578i;
                                                if (i11 == -1) {
                                                }
                                                dVar3 = dVar2;
                                                if (dVar3.f24576g) {
                                                }
                                                str6 = str5;
                                                if (!dVar3.f24571a) {
                                                }
                                                if (str == null) {
                                                }
                                                s sVar52 = request2.f24753c;
                                                s.a o102 = sVar52.o();
                                                kotlin.jvm.internal.i.d(str9);
                                                o102.c(str8, str9);
                                                new LinkedHashMap();
                                                String str122 = request2.f24752b;
                                                c0 c0Var2 = request2.f24754d;
                                                map = request2.f24755e;
                                                if (!map.isEmpty()) {
                                                }
                                                sVar52.o();
                                                s.a o112 = o102.d().o();
                                                tVar = request2.f24751a;
                                                if (tVar == null) {
                                                }
                                            }
                                        }
                                        j13 = 0;
                                        j14 = j13;
                                        i10 = dVar8.f24573c;
                                        if (i10 != -1) {
                                        }
                                        i11 = dVar8.f24578i;
                                        if (i11 == -1) {
                                        }
                                        dVar3 = dVar2;
                                        if (dVar3.f24576g) {
                                        }
                                        str6 = str5;
                                        if (!dVar3.f24571a) {
                                        }
                                        if (str == null) {
                                        }
                                        s sVar522 = request2.f24753c;
                                        s.a o1022 = sVar522.o();
                                        kotlin.jvm.internal.i.d(str9);
                                        o1022.c(str8, str9);
                                        new LinkedHashMap();
                                        String str1222 = request2.f24752b;
                                        c0 c0Var22 = request2.f24754d;
                                        map = request2.f24755e;
                                        if (!map.isEmpty()) {
                                        }
                                        sVar522.o();
                                        s.a o1122 = o1022.d().o();
                                        tVar = request2.f24751a;
                                        if (tVar == null) {
                                        }
                                    }
                                    j14 = time;
                                    j13 = 0;
                                    i10 = dVar8.f24573c;
                                    if (i10 != -1) {
                                    }
                                    i11 = dVar8.f24578i;
                                    if (i11 == -1) {
                                    }
                                    dVar3 = dVar2;
                                    if (dVar3.f24576g) {
                                    }
                                    str6 = str5;
                                    if (!dVar3.f24571a) {
                                    }
                                    if (str == null) {
                                    }
                                    s sVar5222 = request2.f24753c;
                                    s.a o10222 = sVar5222.o();
                                    kotlin.jvm.internal.i.d(str9);
                                    o10222.c(str8, str9);
                                    new LinkedHashMap();
                                    String str12222 = request2.f24752b;
                                    c0 c0Var222 = request2.f24754d;
                                    map = request2.f24755e;
                                    if (!map.isEmpty()) {
                                    }
                                    sVar5222.o();
                                    s.a o11222 = o10222.d().o();
                                    tVar = request2.f24751a;
                                    if (tVar == null) {
                                    }
                                }
                            }
                            dVar = new d(request2, null);
                            if (dVar.f26851a != null) {
                            }
                            dVar5 = null;
                            zVar = dVar.f26851a;
                            d0 d0Var2222 = dVar.f26852b;
                            cVar = this.f26846a;
                            if (cVar != null) {
                            }
                            if (call instanceof pv.d) {
                            }
                            if (dVar6 == null) {
                            }
                            if (obj == null) {
                            }
                            if (d0Var != null) {
                            }
                            if (zVar != null) {
                            }
                            if (zVar == null) {
                            }
                        }
                        dVar = dVar4;
                        if (dVar.f26851a != null) {
                        }
                        dVar5 = null;
                        zVar = dVar.f26851a;
                        d0 d0Var22222 = dVar.f26852b;
                        cVar = this.f26846a;
                        if (cVar != null) {
                        }
                        if (call instanceof pv.d) {
                        }
                        if (dVar6 == null) {
                        }
                        if (obj == null) {
                        }
                        if (d0Var != null) {
                        }
                        if (zVar != null) {
                        }
                        if (zVar == null) {
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                z request22 = fVar.f30150e;
                kotlin.jvm.internal.i.g(request22, "request");
                if (d0Var != null) {
                }
                if (d0Var == null) {
                }
                dVar = dVar4;
                if (dVar.f26851a != null) {
                }
                dVar5 = null;
                zVar = dVar.f26851a;
                d0 d0Var222222 = dVar.f26852b;
                cVar = this.f26846a;
                if (cVar != null) {
                }
                if (call instanceof pv.d) {
                }
                if (dVar6 == null) {
                }
                if (obj == null) {
                }
                if (d0Var != null) {
                }
                if (zVar != null) {
                }
                if (zVar == null) {
                }
            }
        }
        d0Var = null;
        long currentTimeMillis22 = System.currentTimeMillis();
        z request222 = fVar.f30150e;
        kotlin.jvm.internal.i.g(request222, "request");
        if (d0Var != null) {
        }
        if (d0Var == null) {
        }
        dVar = dVar4;
        if (dVar.f26851a != null) {
        }
        dVar5 = null;
        zVar = dVar.f26851a;
        d0 d0Var2222222 = dVar.f26852b;
        cVar = this.f26846a;
        if (cVar != null) {
        }
        if (call instanceof pv.d) {
        }
        if (dVar6 == null) {
        }
        if (obj == null) {
        }
        if (d0Var != null) {
        }
        if (zVar != null) {
        }
        if (zVar == null) {
        }
    }
}
