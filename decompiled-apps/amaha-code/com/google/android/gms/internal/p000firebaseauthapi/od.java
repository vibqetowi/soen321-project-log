package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import g.x;
import gd.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.od  reason: invalid package */
/* loaded from: classes.dex */
public final class od implements se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8029u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p2 f8030v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x f8031w;

    public /* synthetic */ od(x xVar, p2 p2Var, int i6) {
        this.f8029u = i6;
        this.f8031w = xVar;
        this.f8030v = p2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        int i6 = this.f8029u;
        p2 p2Var = this.f8030v;
        switch (i6) {
            case 0:
                p2Var.g(i.a(str));
                return;
            case 1:
                p2Var.g(i.a(str));
                return;
            case 2:
                p2Var.g(i.a(str));
                return;
            case 3:
                p2Var.g(i.a(str));
                return;
            default:
                p2Var.g(i.a(str));
                return;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        int i6 = this.f8029u;
        p2 p2Var = this.f8030v;
        switch (i6) {
            case 0:
                r rVar = (r) keVar;
                if (!TextUtils.isEmpty(rVar.f8100y)) {
                    p2Var.f(new md(rVar.f8100y, rVar.f8099x, null));
                    return;
                }
                this.f8031w.z(new jf(rVar.f8097v, rVar.f8096u, Long.valueOf(rVar.f8098w), "Bearer"), null, null, Boolean.FALSE, null, this.f8030v, this);
                return;
            case 1:
                bf bfVar = (bf) keVar;
                if (!TextUtils.isEmpty(bfVar.f7739z)) {
                    p2Var.f(new md(bfVar.f7739z, bfVar.f7738y, null));
                    return;
                }
                this.f8031w.z(new jf(bfVar.f7735v, bfVar.f7734u, Long.valueOf(bfVar.f7737x), "Bearer"), null, null, Boolean.valueOf(bfVar.f7736w), null, this.f8030v, this);
                return;
            case 2:
                t tVar = (t) keVar;
                this.f8031w.z(new jf(tVar.f8139v, tVar.f8138u, Long.valueOf(tVar.f8140w), "Bearer"), null, null, Boolean.valueOf(tVar.f8141x), null, this.f8030v, this);
                return;
            case 3:
                o oVar = (o) keVar;
                this.f8031w.z(new jf(oVar.f8018v, oVar.f8017u, Long.valueOf(oVar.f8019w), "Bearer"), null, null, Boolean.valueOf(oVar.f8020x), null, this.f8030v, this);
                return;
            default:
                m mVar = (m) keVar;
                if (!(!TextUtils.isEmpty(mVar.J))) {
                    x.D(this.f8031w, mVar, p2Var, this);
                    return;
                } else {
                    p2Var.f(new md(mVar.J, mVar.I, mVar.a()));
                    return;
                }
        }
    }
}
