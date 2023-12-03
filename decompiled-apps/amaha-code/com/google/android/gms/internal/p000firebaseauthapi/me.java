package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.android.volley.toolbox.a;
import g.x;
import j7.k;
import sc.e;
import t.b;
import tr.r;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.me  reason: invalid package */
/* loaded from: classes.dex */
public final class me extends a implements xe {
    public final String A;
    public ne B;

    /* renamed from: v  reason: collision with root package name */
    public ge f7986v;

    /* renamed from: w  reason: collision with root package name */
    public he f7987w;

    /* renamed from: x  reason: collision with root package name */
    public ge f7988x;

    /* renamed from: y  reason: collision with root package name */
    public final le f7989y;

    /* renamed from: z  reason: collision with root package name */
    public final e f7990z;

    public me(e eVar, le leVar) {
        we weVar;
        this.f7990z = eVar;
        eVar.b();
        String str = eVar.f31434c.f31444a;
        this.A = str;
        this.f7989y = leVar;
        this.f7988x = null;
        this.f7986v = null;
        this.f7987w = null;
        String B = r.B("firebear.secureToken");
        if (TextUtils.isEmpty(B)) {
            b bVar = ye.f8261a;
            synchronized (bVar) {
                weVar = (we) bVar.getOrDefault(str, null);
            }
            if (weVar == null) {
                B = "https://".concat("securetoken.googleapis.com/v1");
            } else {
                throw null;
            }
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(B)));
        }
        if (this.f7988x == null) {
            this.f7988x = new ge(B, J());
        }
        String B2 = r.B("firebear.identityToolkit");
        if (TextUtils.isEmpty(B2)) {
            B2 = ye.b(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(B2)));
        }
        if (this.f7986v == null) {
            this.f7986v = new ge(B2, J());
        }
        String B3 = r.B("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(B3)) {
            B3 = ye.c(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(B3)));
        }
        if (this.f7987w == null) {
            this.f7987w = new he(B3, J());
        }
        ye.d(str, this);
    }

    @Override // com.android.volley.toolbox.a
    public final void B(af afVar, od odVar) {
        ge geVar = this.f7986v;
        r.D(geVar.a("/emailLinkSignin", this.A), afVar, odVar, bf.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void C(n nVar, x xVar) {
        ge geVar = this.f7988x;
        r.D(geVar.a("/token", this.A), nVar, xVar, jf.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void D(s5 s5Var, se seVar) {
        ge geVar = this.f7986v;
        r.D(geVar.a("/getAccountInfo", this.A), s5Var, seVar, cf.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void E(k kVar, pd pdVar) {
        ge geVar = this.f7986v;
        r.D(geVar.a("/setAccountInfo", this.A), kVar, pdVar, g.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void F(j jVar, se seVar) {
        o.h(jVar);
        ge geVar = this.f7986v;
        r.D(geVar.a("/verifyAssertion", this.A), jVar, seVar, m.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void G(n nVar, od odVar) {
        ge geVar = this.f7986v;
        r.D(geVar.a("/verifyCustomToken", this.A), nVar, odVar, o.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void H(q qVar, od odVar) {
        ge geVar = this.f7986v;
        r.D(geVar.a("/verifyPassword", this.A), qVar, odVar, r.class, geVar.f7855b);
    }

    @Override // com.android.volley.toolbox.a
    public final void I(s sVar, se seVar) {
        o.h(sVar);
        ge geVar = this.f7986v;
        r.D(geVar.a("/verifyPhoneNumber", this.A), sVar, seVar, t.class, geVar.f7855b);
    }

    public final ne J() {
        if (this.B == null) {
            String format = String.format("X%s", Integer.toString(this.f7989y.f7969a));
            e eVar = this.f7990z;
            eVar.b();
            this.B = new ne(eVar.f31432a, eVar, format);
        }
        return this.B;
    }
}
