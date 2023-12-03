package yv;

import gv.n;
import hc.d;
import is.y;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import lv.c0;
import lv.d0;
import lv.e0;
import lv.s;
import lv.u;
import lv.v;
import lv.z;
import pv.e;
import qv.f;
import v.g;
import zv.h;
import zv.m;
/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes2.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final a f39095a = a.f39098a;

    /* renamed from: b  reason: collision with root package name */
    public volatile y f39096b = y.f20678u;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f39097c = 1;

    /* compiled from: HttpLoggingInterceptor.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final yv.a f39098a = new yv.a();

        void a(String str);
    }

    public b(int i6) {
    }

    public static boolean b(s sVar) {
        String g5 = sVar.g("Content-Encoding");
        if (g5 == null || n.A0(g5, "identity", true) || n.A0(g5, "gzip", true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    @Override // lv.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 a(f fVar) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        d0 c10;
        long a10;
        String str4;
        boolean z12;
        long j10;
        String r;
        String str5;
        Long l2;
        Charset UTF_8;
        Charset UTF_82;
        int i6 = this.f39097c;
        z zVar = fVar.f30150e;
        if (i6 == 1) {
            return fVar.c(zVar);
        }
        if (i6 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i6 != 3) {
            z11 = false;
        } else {
            z11 = true;
        }
        c0 c0Var = zVar.f24754d;
        e a11 = fVar.a();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(zVar.f24752b);
        sb2.append(' ');
        sb2.append(zVar.f24751a);
        if (a11 == null) {
            str = "";
        } else {
            lv.y yVar = a11.f;
            i.d(yVar);
            str = i.n(yVar, " ");
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (!z11 && c0Var != null) {
            StringBuilder d10 = g.d(sb3, " (");
            d10.append(c0Var.a());
            d10.append("-byte body)");
            sb3 = d10.toString();
        }
        this.f39095a.a(sb3);
        try {
            if (z11) {
                s sVar = zVar.f24753c;
                if (c0Var != null) {
                    v b10 = c0Var.b();
                    if (b10 != null && sVar.g("Content-Type") == null) {
                        this.f39095a.a(i.n(b10, "Content-Type: "));
                    }
                    if (c0Var.a() != -1 && sVar.g("Content-Length") == null) {
                        this.f39095a.a(i.n(Long.valueOf(c0Var.a()), "Content-Length: "));
                    }
                }
                int length = sVar.f24683u.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    c(sVar, i10);
                }
                if (!z10 || c0Var == null) {
                    str2 = " ";
                    str3 = "";
                    this.f39095a.a(i.n(zVar.f24752b, "--> END "));
                } else if (b(zVar.f24753c)) {
                    this.f39095a.a("--> END " + zVar.f24752b + " (encoded body omitted)");
                } else {
                    zv.e eVar = new zv.e();
                    c0Var.c(eVar);
                    v b11 = c0Var.b();
                    if (b11 == null) {
                        UTF_82 = null;
                    } else {
                        UTF_82 = b11.a(StandardCharsets.UTF_8);
                    }
                    if (UTF_82 == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        i.f(UTF_82, "UTF_8");
                    }
                    this.f39095a.a("");
                    if (d.T(eVar)) {
                        str2 = " ";
                        str3 = "";
                        this.f39095a.a(eVar.h0(eVar.f39885v, UTF_82));
                        this.f39095a.a("--> END " + zVar.f24752b + " (" + c0Var.a() + "-byte body)");
                    } else {
                        str2 = " ";
                        str3 = "";
                        this.f39095a.a("--> END " + zVar.f24752b + " (binary " + c0Var.a() + "-byte body omitted)");
                    }
                }
                long nanoTime = System.nanoTime();
                c10 = fVar.c(zVar);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                e0 e0Var = c10.A;
                i.d(e0Var);
                a10 = e0Var.a();
                if (a10 == -1) {
                    str4 = a10 + "-byte";
                } else {
                    str4 = "unknown-length";
                }
                a aVar = this.f39095a;
                StringBuilder sb4 = new StringBuilder("<-- ");
                sb4.append(c10.f24586x);
                if (c10.f24585w.length() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    j10 = a10;
                    r = str3;
                } else {
                    j10 = a10;
                    r = c.r(str2, c10.f24585w);
                }
                sb4.append(r);
                sb4.append(' ');
                sb4.append(c10.f24583u.f24751a);
                sb4.append(" (");
                sb4.append(millis);
                sb4.append("ms");
                if (z11) {
                    str5 = defpackage.b.m(", ", str4, " body");
                } else {
                    str5 = str3;
                }
                sb4.append(str5);
                sb4.append(')');
                aVar.a(sb4.toString());
                if (z11) {
                    s sVar2 = c10.f24588z;
                    int length2 = sVar2.f24683u.length / 2;
                    for (int i11 = 0; i11 < length2; i11++) {
                        c(sVar2, i11);
                    }
                    if (z10 && qv.e.a(c10)) {
                        if (b(c10.f24588z)) {
                            this.f39095a.a("<-- END HTTP (encoded body omitted)");
                        } else {
                            h g5 = e0Var.g();
                            g5.d0(Long.MAX_VALUE);
                            zv.e c11 = g5.c();
                            if (n.A0("gzip", sVar2.g("Content-Encoding"), true)) {
                                l2 = Long.valueOf(c11.f39885v);
                                m mVar = new m(c11.clone());
                                try {
                                    c11 = new zv.e();
                                    c11.K0(mVar);
                                    UTF_8 = null;
                                    ca.a.z(mVar, null);
                                } finally {
                                }
                            } else {
                                l2 = null;
                                UTF_8 = null;
                            }
                            v e10 = e0Var.e();
                            if (e10 != null) {
                                UTF_8 = e10.a(StandardCharsets.UTF_8);
                            }
                            if (UTF_8 == null) {
                                UTF_8 = StandardCharsets.UTF_8;
                                i.f(UTF_8, "UTF_8");
                            }
                            if (!d.T(c11)) {
                                this.f39095a.a(str3);
                                this.f39095a.a("<-- END HTTP (binary " + c11.f39885v + "-byte body omitted)");
                                return c10;
                            }
                            String str6 = str3;
                            if (j10 != 0) {
                                this.f39095a.a(str6);
                                a aVar2 = this.f39095a;
                                zv.e clone = c11.clone();
                                aVar2.a(clone.h0(clone.f39885v, UTF_8));
                            }
                            if (l2 != null) {
                                this.f39095a.a("<-- END HTTP (" + c11.f39885v + "-byte, " + l2 + "-gzipped-byte body)");
                            } else {
                                this.f39095a.a("<-- END HTTP (" + c11.f39885v + "-byte body)");
                            }
                        }
                    } else {
                        this.f39095a.a("<-- END HTTP");
                    }
                }
                return c10;
            }
            c10 = fVar.c(zVar);
            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            e0 e0Var2 = c10.A;
            i.d(e0Var2);
            a10 = e0Var2.a();
            if (a10 == -1) {
            }
            a aVar3 = this.f39095a;
            StringBuilder sb42 = new StringBuilder("<-- ");
            sb42.append(c10.f24586x);
            if (c10.f24585w.length() != 0) {
            }
            if (!z12) {
            }
            sb42.append(r);
            sb42.append(' ');
            sb42.append(c10.f24583u.f24751a);
            sb42.append(" (");
            sb42.append(millis2);
            sb42.append("ms");
            if (z11) {
            }
            sb42.append(str5);
            sb42.append(')');
            aVar3.a(sb42.toString());
            if (z11) {
            }
            return c10;
        } catch (Exception e11) {
            this.f39095a.a(i.n(e11, "<-- HTTP FAILED: "));
            throw e11;
        }
        str2 = " ";
        str3 = "";
        long nanoTime2 = System.nanoTime();
    }

    public final void c(s sVar, int i6) {
        this.f39096b.contains(sVar.m(i6));
        String q10 = sVar.q(i6);
        a aVar = this.f39095a;
        aVar.a(sVar.m(i6) + ": " + q10);
    }
}
