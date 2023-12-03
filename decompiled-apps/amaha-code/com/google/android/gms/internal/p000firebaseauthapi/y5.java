package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y5  reason: invalid package */
/* loaded from: classes.dex */
public final class y5 extends b7 {
    public y5() {
        super(ua.class, new q4(12, o3.class));
    }

    public static n6 i(int i6, int i10, int i11, int i12) {
        ra v10 = sa.v();
        v10.e();
        ((sa) v10.f7723v).zzd = i6 - 2;
        v10.e();
        ((sa) v10.f7723v).zze = i10 - 2;
        v10.e();
        ((sa) v10.f7723v).zzf = i11 - 2;
        pa v11 = qa.v();
        v11.e();
        ((qa) v11.f7723v).zzd = (sa) v10.c();
        return new n6(i12, (qa) v11.c());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final o6 a() {
        return new r4(qa.class, 9);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final int b() {
        return 3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final b2 c(h0 h0Var) {
        return ua.y(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final void e(b2 b2Var) {
        boolean z10;
        ua uaVar = (ua) b2Var;
        if (uaVar.A().m() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (uaVar.E()) {
                mc.c(uaVar.v());
                z5.a(uaVar.z().w());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b7
    public final /* synthetic */ b2 h(b2 b2Var) {
        return ((ua) b2Var).z();
    }
}
