package com.google.android.gms.internal.p000firebaseauthapi;

import ca.a;
import com.google.android.gms.common.api.Status;
import fd.b;
import gd.a0;
import gd.f0;
import gd.k0;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.td  reason: invalid package */
/* loaded from: classes.dex */
public final class td extends pe {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f8156n;

    /* renamed from: o  reason: collision with root package name */
    public final zc f8157o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(b bVar, String str, int i6) {
        super(2);
        this.f8156n = i6;
        if (i6 != 1) {
            if (bVar != null) {
                j F1 = a.F1(bVar, str);
                F1.D = false;
                this.f8157o = new zc(F1);
                return;
            }
            throw new NullPointerException("credential cannot be null");
        }
        super(2);
        if (bVar != null) {
            this.f8157o = new zc(a.F1(bVar, str));
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final String a() {
        switch (this.f8156n) {
            case 0:
                return "reauthenticateWithCredentialWithData";
            default:
                return "signInWithCredential";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void b() {
        switch (this.f8156n) {
            case 0:
                k0 b10 = xd.b(this.f8060c, this.f8064h);
                if (this.f8061d.j0().equalsIgnoreCase(b10.f16426v.f16415u)) {
                    ((a0) this.f8062e).a(this.f8063g, b10);
                    h(new f0(b10));
                    return;
                }
                g(new Status(17024, null));
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
        int i6 = this.f8156n;
        oe oeVar = this.f8059b;
        zc zcVar = this.f8157o;
        switch (i6) {
            case 0:
                this.f8069m = new p2(this, iVar);
                aeVar.a(zcVar, oeVar);
                return;
            default:
                this.f8069m = new p2(this, iVar);
                aeVar.a(zcVar, oeVar);
                return;
        }
    }
}
