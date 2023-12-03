package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import ca.a;
import fd.b;
import fd.m;
import g.x;
import gd.a0;
import gd.f0;
import gd.k0;
import tr.r;
import v9.o;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rd  reason: invalid package */
/* loaded from: classes.dex */
public final class rd extends pe {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f8110n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f8111o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(b bVar) {
        super(2);
        this.f8110n = 1;
        this.f8111o = a.F1(bVar, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final String a() {
        switch (this.f8110n) {
            case 0:
                return "getAccessToken";
            case 1:
                return "linkFederatedCredential";
            case 2:
                return "linkPhoneAuthCredential";
            case 3:
                return "signInWithCustomToken";
            default:
                return "updateEmail";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void b() {
        switch (this.f8110n) {
            case 0:
                if (TextUtils.isEmpty(this.f8063g.f7922u)) {
                    jf jfVar = this.f8063g;
                    String str = ((qc) this.f8111o).f8086u;
                    jfVar.getClass();
                    o.e(str);
                    jfVar.f7922u = str;
                }
                ((a0) this.f8062e).a(this.f8063g, this.f8061d);
                h(gd.o.a(this.f8063g.f7923v));
                return;
            case 1:
                k0 b10 = xd.b(this.f8060c, this.f8064h);
                ((a0) this.f8062e).a(this.f8063g, b10);
                h(new f0(b10));
                return;
            case 2:
                k0 b11 = xd.b(this.f8060c, this.f8064h);
                ((a0) this.f8062e).a(this.f8063g, b11);
                h(new f0(b11));
                return;
            case 3:
                k0 b12 = xd.b(this.f8060c, this.f8064h);
                ((a0) this.f8062e).a(this.f8063g, b12);
                h(new f0(b12));
                return;
            default:
                ((a0) this.f8062e).a(this.f8063g, xd.b(this.f8060c, this.f8064h));
                h(null);
                return;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void c(i iVar, ae aeVar) {
        int i6 = this.f8110n;
        oe oeVar = this.f8059b;
        Object obj = this.f8111o;
        switch (i6) {
            case 0:
                this.f8069m = new p2(this, iVar);
                qc qcVar = (qc) obj;
                aeVar.getClass();
                o.h(qcVar);
                o.h(oeVar);
                String str = qcVar.f8086u;
                o.e(str);
                p2 p2Var = new p2(oeVar, ae.f7715b);
                x xVar = aeVar.f7716a;
                xVar.getClass();
                o.e(str);
                ((com.android.volley.toolbox.a) xVar.f16143v).C(new n(str), new x(21, p2Var, 0));
                return;
            case 1:
                this.f8069m = new p2(this, iVar);
                uc ucVar = new uc(this.f8061d.r0(), (j) obj);
                aeVar.getClass();
                String str2 = ucVar.f8183u;
                o.e(str2);
                j jVar = ucVar.f8184v;
                o.h(jVar);
                o.h(oeVar);
                p2 p2Var2 = new p2(oeVar, ae.f7715b);
                x xVar2 = aeVar.f7716a;
                xVar2.getClass();
                o.e(str2);
                xVar2.y(str2, new q(xVar2, jVar, p2Var2, 5));
                return;
            case 2:
                this.f8069m = new p2(this, iVar);
                wc wcVar = new wc((m) obj, this.f8061d.r0());
                aeVar.getClass();
                o.h(oeVar);
                m mVar = wcVar.f8230v;
                o.h(mVar);
                String str3 = wcVar.f8229u;
                o.e(str3);
                s x10 = r.x(mVar);
                p2 p2Var3 = new p2(oeVar, ae.f7715b);
                x xVar3 = aeVar.f7716a;
                xVar3.getClass();
                o.e(str3);
                xVar3.y(str3, new q(xVar3, x10, p2Var3, 4));
                return;
            case 3:
                this.f8069m = new p2(this, iVar);
                bd bdVar = (bd) obj;
                aeVar.getClass();
                o.h(bdVar);
                String str4 = bdVar.f7731u;
                o.e(str4);
                o.h(oeVar);
                n nVar = new n(str4, bdVar.f7732v);
                p2 p2Var4 = new p2(oeVar, ae.f7715b);
                x xVar4 = aeVar.f7716a;
                xVar4.getClass();
                ((com.android.volley.toolbox.a) xVar4.f16143v).G(nVar, new od(xVar4, p2Var4, 3));
                return;
            default:
                this.f8069m = new p2(this, iVar);
                oc ocVar = new oc(this.f8061d.r0(), (String) obj);
                aeVar.getClass();
                String str5 = ocVar.f8027u;
                o.e(str5);
                String str6 = ocVar.f8028v;
                o.e(str6);
                o.h(oeVar);
                p2 p2Var5 = new p2(oeVar, ae.f7715b);
                x xVar5 = aeVar.f7716a;
                xVar5.getClass();
                o.e(str5);
                o.e(str6);
                xVar5.y(str5, new q(xVar5, str6, p2Var5, 6));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(m mVar) {
        super(2);
        this.f8110n = 2;
        this.f8111o = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(String str, int i6) {
        super(1);
        this.f8110n = i6;
        if (i6 != 4) {
            o.f("refresh token cannot be null", str);
            this.f8111o = new qc(str);
            return;
        }
        super(2);
        o.f("email cannot be null or empty", str);
        this.f8111o = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(String str, String str2) {
        super(2);
        this.f8110n = 3;
        o.f("token cannot be null or empty", str);
        this.f8111o = new bd(str, str2);
    }
}
