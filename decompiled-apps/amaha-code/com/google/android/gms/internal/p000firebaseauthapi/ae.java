package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import fd.d;
import fd.m;
import g.x;
import sc.e;
import tr.r;
import v9.o;
import y9.a;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ae  reason: invalid package */
/* loaded from: classes.dex */
public final class ae {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7715b = new a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a  reason: collision with root package name */
    public final x f7716a;

    public ae(e eVar) {
        o.h(eVar);
        eVar.b();
        Context context = eVar.f31432a;
        o.h(context);
        this.f7716a = new x(new me(eVar, le.a()));
        new ve(context);
    }

    public final void a(zc zcVar, oe oeVar) {
        o.h(zcVar);
        j jVar = zcVar.f8294u;
        o.h(jVar);
        o.h(oeVar);
        p2 p2Var = new p2(oeVar, f7715b);
        x xVar = this.f7716a;
        xVar.getClass();
        jVar.I = true;
        ((com.android.volley.toolbox.a) xVar.f16143v).F(jVar, new od(xVar, p2Var, 4));
    }

    public final void b(dd ddVar, oe oeVar) {
        o.h(ddVar);
        String str = ddVar.f7786u;
        o.e(str);
        String str2 = ddVar.f7787v;
        o.e(str2);
        o.h(oeVar);
        p2 p2Var = new p2(oeVar, f7715b);
        x xVar = this.f7716a;
        xVar.getClass();
        o.e(str);
        o.e(str2);
        ((com.android.volley.toolbox.a) xVar.f16143v).H(new q(str, str2, ddVar.f7788w), new od(xVar, p2Var, 0));
    }

    public final void c(fd fdVar, oe oeVar) {
        o.h(fdVar);
        d dVar = fdVar.f7853u;
        o.h(dVar);
        o.h(oeVar);
        p2 p2Var = new p2(oeVar, f7715b);
        x xVar = this.f7716a;
        xVar.getClass();
        if (dVar.f14952y) {
            xVar.y(dVar.f14951x, new q(xVar, dVar, p2Var, 3));
            return;
        }
        ((com.android.volley.toolbox.a) xVar.f16143v).B(new af(dVar, null), new od(xVar, p2Var, 1));
    }

    public final void d(hd hdVar, oe oeVar) {
        o.h(oeVar);
        o.h(hdVar);
        m mVar = hdVar.f7879u;
        o.h(mVar);
        s x10 = r.x(mVar);
        p2 p2Var = new p2(oeVar, f7715b);
        x xVar = this.f7716a;
        xVar.getClass();
        ((com.android.volley.toolbox.a) xVar.f16143v).I(x10, new od(xVar, p2Var, 2));
    }
}
