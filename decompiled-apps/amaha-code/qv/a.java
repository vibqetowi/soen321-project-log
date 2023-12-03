package qv;

import gv.n;
import lv.c0;
import lv.d0;
import lv.e0;
import lv.l;
import lv.s;
import lv.t;
import lv.u;
import lv.v;
import lv.z;
import zv.m;
/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final l f30141a;

    public a(kotlin.jvm.internal.h cookieJar) {
        kotlin.jvm.internal.i.g(cookieJar, "cookieJar");
        this.f30141a = cookieJar;
    }

    @Override // lv.u
    public final d0 a(f fVar) {
        e0 e0Var;
        z zVar = fVar.f30150e;
        zVar.getClass();
        z.a aVar = new z.a(zVar);
        c0 c0Var = zVar.f24754d;
        if (c0Var != null) {
            v b10 = c0Var.b();
            if (b10 != null) {
                aVar.b("Content-Type", b10.f24704a);
            }
            long a10 = c0Var.a();
            if (a10 != -1) {
                aVar.b("Content-Length", String.valueOf(a10));
                aVar.f24758c.f("Transfer-Encoding");
            } else {
                aVar.b("Transfer-Encoding", "chunked");
                aVar.f24758c.f("Content-Length");
            }
        }
        s sVar = zVar.f24753c;
        String g5 = sVar.g("Host");
        boolean z10 = false;
        t tVar = zVar.f24751a;
        if (g5 == null) {
            aVar.b("Host", mv.b.w(tVar, false));
        }
        if (sVar.g("Connection") == null) {
            aVar.b("Connection", "Keep-Alive");
        }
        if (sVar.g("Accept-Encoding") == null && sVar.g("Range") == null) {
            aVar.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        l lVar = this.f30141a;
        lVar.a(tVar);
        if (sVar.g("User-Agent") == null) {
            aVar.b("User-Agent", "okhttp/4.10.0");
        }
        d0 c10 = fVar.c(aVar.a());
        s sVar2 = c10.f24588z;
        e.b(lVar, tVar, sVar2);
        d0.a aVar2 = new d0.a(c10);
        aVar2.f24589a = zVar;
        if (z10 && n.A0("gzip", d0.e(c10, "Content-Encoding"), true) && e.a(c10) && (e0Var = c10.A) != null) {
            m mVar = new m(e0Var.g());
            s.a o10 = sVar2.o();
            o10.f("Content-Encoding");
            o10.f("Content-Length");
            aVar2.c(o10.d());
            aVar2.f24594g = new g(d0.e(c10, "Content-Type"), -1L, ta.v.j(mVar));
        }
        return aVar2.a();
    }
}
