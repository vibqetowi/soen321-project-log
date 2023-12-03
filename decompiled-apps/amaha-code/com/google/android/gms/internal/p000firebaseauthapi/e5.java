package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e5  reason: invalid package */
/* loaded from: classes.dex */
public final class e5 extends p6 {
    public e5() {
        super(n9.class, new q4(9, n3.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final o6 a() {
        return new d5();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final b2 c(h0 h0Var) {
        return n9.y(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final /* bridge */ /* synthetic */ void e(b2 b2Var) {
        n9 n9Var = (n9) b2Var;
        mc.c(n9Var.v());
        if (n9Var.z().m() == 64) {
            return;
        }
        throw new InvalidKeyException(c.q("invalid key size: ", n9Var.z().m(), ". Valid keys must have 64 bytes."));
    }
}
