package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import gd.a0;
import gd.f0;
import gd.k0;
import v9.o;
import ya.i;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vd  reason: invalid package */
/* loaded from: classes.dex */
public final class vd extends pe {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f8213n;

    /* renamed from: o  reason: collision with root package name */
    public final dd f8214o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(String str, String str2, String str3, int i6) {
        super(2);
        this.f8213n = i6;
        if (i6 != 1) {
            o.f("email cannot be null or empty", str);
            o.f("password cannot be null or empty", str2);
            this.f8214o = new dd(str, str2, str3);
            return;
        }
        super(2);
        o.f("email cannot be null or empty", str);
        o.f("password cannot be null or empty", str2);
        this.f8214o = new dd(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final String a() {
        switch (this.f8213n) {
            case 0:
                return "reauthenticateWithEmailPasswordWithData";
            default:
                return "signInWithEmailAndPassword";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pe
    public final void b() {
        switch (this.f8213n) {
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
        int i6 = this.f8213n;
        oe oeVar = this.f8059b;
        dd ddVar = this.f8214o;
        switch (i6) {
            case 0:
                this.f8069m = new p2(this, iVar);
                aeVar.b(ddVar, oeVar);
                return;
            default:
                this.f8069m = new p2(this, iVar);
                aeVar.b(ddVar, oeVar);
                return;
        }
    }
}
