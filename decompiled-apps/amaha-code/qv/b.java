package qv;

import gv.n;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.b0;
import lv.c0;
import lv.d0;
import lv.e0;
import lv.o;
import lv.u;
import lv.z;
import pv.b;
import ta.v;
import zv.s;
/* compiled from: CallServerInterceptor.kt */
/* loaded from: classes2.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30142a;

    public b(boolean z10) {
        this.f30142a = z10;
    }

    @Override // lv.u
    public final d0 a(f fVar) {
        d0.a aVar;
        boolean z10;
        boolean z11;
        Long l2;
        d0 a10;
        long a11;
        boolean z12;
        pv.b bVar = fVar.f30149d;
        kotlin.jvm.internal.i.d(bVar);
        d dVar = bVar.f29027d;
        o oVar = bVar.f29025b;
        pv.d call = bVar.f29024a;
        z zVar = fVar.f30150e;
        c0 c0Var = zVar.f24754d;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            oVar.getClass();
            kotlin.jvm.internal.i.g(call, "call");
            dVar.a(zVar);
            boolean p10 = b0.p(zVar.f24752b);
            pv.e eVar = bVar.f;
            if (p10 && c0Var != null) {
                if (n.A0("100-continue", zVar.f24753c.g("Expect"), true)) {
                    try {
                        dVar.g();
                        aVar = bVar.b(true);
                        oVar.getClass();
                        kotlin.jvm.internal.i.g(call, "call");
                        z11 = false;
                    } catch (IOException e10) {
                        oVar.getClass();
                        kotlin.jvm.internal.i.g(call, "call");
                        bVar.c(e10);
                        throw e10;
                    }
                } else {
                    aVar = null;
                    z11 = true;
                }
                if (aVar == null) {
                    bVar.f29028e = false;
                    c0 c0Var2 = zVar.f24754d;
                    kotlin.jvm.internal.i.d(c0Var2);
                    long a12 = c0Var2.a();
                    oVar.getClass();
                    kotlin.jvm.internal.i.g(call, "call");
                    s h10 = v.h(new b.a(bVar, dVar.e(zVar, a12), a12));
                    c0Var.c(h10);
                    h10.close();
                } else {
                    call.f(bVar, true, false, null);
                    if (eVar.f29063g != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        dVar.d().l();
                    }
                }
                l2 = null;
                z10 = false;
            } else {
                aVar = null;
                z10 = false;
                call.f(bVar, true, false, null);
                z11 = true;
                l2 = null;
            }
            try {
                dVar.b();
                if (aVar == null) {
                    aVar = bVar.b(z10);
                    kotlin.jvm.internal.i.d(aVar);
                    if (z11) {
                        oVar.getClass();
                        kotlin.jvm.internal.i.g(call, "call");
                        z11 = false;
                    }
                }
                aVar.f24589a = zVar;
                aVar.f24593e = eVar.f29062e;
                aVar.f24598k = currentTimeMillis;
                aVar.f24599l = System.currentTimeMillis();
                d0 a13 = aVar.a();
                int i6 = a13.f24586x;
                if (i6 == 100) {
                    d0.a b10 = bVar.b(false);
                    kotlin.jvm.internal.i.d(b10);
                    if (z11) {
                        oVar.getClass();
                        kotlin.jvm.internal.i.g(call, "call");
                    }
                    b10.f24589a = zVar;
                    b10.f24593e = eVar.f29062e;
                    b10.f24598k = currentTimeMillis;
                    b10.f24599l = System.currentTimeMillis();
                    a13 = b10.a();
                    i6 = a13.f24586x;
                }
                if (this.f30142a && i6 == 101) {
                    d0.a aVar2 = new d0.a(a13);
                    aVar2.f24594g = mv.b.f25757c;
                    a10 = aVar2.a();
                } else {
                    d0.a aVar3 = new d0.a(a13);
                    try {
                        String e11 = d0.e(a13, "Content-Type");
                        long f = dVar.f(a13);
                        aVar3.f24594g = new g(e11, f, v.j(new b.C0491b(bVar, dVar.h(a13), f)));
                        a10 = aVar3.a();
                    } catch (IOException e12) {
                        bVar.c(e12);
                        throw e12;
                    }
                }
                if (n.A0("close", a10.f24583u.f24753c.g("Connection"), true) || n.A0("close", d0.e(a10, "Connection"), true)) {
                    dVar.d().l();
                }
                if (i6 == 204 || i6 == 205) {
                    e0 e0Var = a10.A;
                    if (e0Var == null) {
                        a11 = -1;
                    } else {
                        a11 = e0Var.a();
                    }
                    if (a11 > 0) {
                        StringBuilder u10 = defpackage.c.u("HTTP ", i6, " had non-zero Content-Length: ");
                        if (e0Var != null) {
                            l2 = Long.valueOf(e0Var.a());
                        }
                        u10.append(l2);
                        throw new ProtocolException(u10.toString());
                    }
                }
                return a10;
            } catch (IOException e13) {
                bVar.c(e13);
                throw e13;
            }
        } catch (IOException e14) {
            oVar.getClass();
            kotlin.jvm.internal.i.g(call, "call");
            bVar.c(e14);
            throw e14;
        }
    }
}
