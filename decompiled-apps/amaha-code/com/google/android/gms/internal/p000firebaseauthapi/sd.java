package com.google.android.gms.internal.p000firebaseauthapi;

import fd.d;
import fd.f;
import g.x;
import gd.a0;
import gd.f0;
import gd.k0;
import v.c;
import v9.o;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sd  reason: invalid package */
/* loaded from: classes.dex */
public final class sd extends pe {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f8136n;

    /* renamed from: o  reason: collision with root package name */
    public final d f8137o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(d dVar, int i6) {
        super(2);
        this.f8136n = i6;
        if (i6 != 1) {
            this.f8137o = dVar;
            o.f("email cannot be null", dVar.f14948u);
            o.f("password cannot be null", dVar.f14949v);
            return;
        }
        super(2);
        this.f8137o = dVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final String a() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void b() {
        switch (this.f8136n) {
            case 0:
                k0 b10 = xd.b(this.f8060c, this.f8064h);
                ((a0) this.f8062e).a(this.f8063g, b10);
                h(new f0(b10));
                return;
            default:
                k0 b11 = xd.b(this.f8060c, this.f8064h);
                ((a0) this.f8062e).a(this.f8063g, b11);
                h(new f0(b11));
                return;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void c(i iVar, ae aeVar) {
        int i6 = this.f8136n;
        oe oeVar = this.f8059b;
        d dVar = this.f8137o;
        switch (i6) {
            case 0:
                this.f8069m = new p2(this, iVar);
                String str = dVar.f14948u;
                String str2 = dVar.f14949v;
                o.e(str2);
                sc scVar = new sc(str, str2, this.f8061d.r0());
                aeVar.getClass();
                String str3 = scVar.f8133u;
                o.e(str3);
                String str4 = scVar.f8134v;
                o.e(str4);
                String str5 = scVar.f8135w;
                o.e(str5);
                o.h(oeVar);
                p2 p2Var = new p2(oeVar, ae.f7715b);
                x xVar = aeVar.f7716a;
                xVar.getClass();
                o.e(str3);
                o.e(str4);
                o.e(str5);
                xVar.y(str5, new c(xVar, str3, str4, p2Var));
                return;
            default:
                this.f8069m = new p2(this, iVar);
                f fVar = this.f8061d;
                dVar.getClass();
                dVar.f14951x = fVar.r0();
                dVar.f14952y = true;
                aeVar.c(new fd(dVar), oeVar);
                return;
        }
    }
}
