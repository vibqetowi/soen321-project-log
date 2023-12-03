package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d5  reason: invalid package */
/* loaded from: classes.dex */
public final class d5 extends o6 {
    public d5() {
        super(p9.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 a(b2 b2Var) {
        m9 w10 = n9.w();
        byte[] a10 = kc.a(((p9) b2Var).v());
        g0 J = h0.J(0, a10, a10.length);
        w10.e();
        ((n9) w10.f7723v).zze = J;
        w10.e();
        ((n9) w10.f7723v).zzd = 0;
        return (n9) w10.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 b(h0 h0Var) {
        return p9.y(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final Map c() {
        HashMap hashMap = new HashMap();
        o9 w10 = p9.w();
        w10.e();
        ((p9) w10.f7723v).zzd = 64;
        hashMap.put("AES256_SIV", new n6(1, (p9) w10.c()));
        o9 w11 = p9.w();
        w11.e();
        ((p9) w11.f7723v).zzd = 64;
        hashMap.put("AES256_SIV_RAW", new n6(3, (p9) w11.c()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final /* bridge */ /* synthetic */ void d(b2 b2Var) {
        p9 p9Var = (p9) b2Var;
        if (p9Var.v() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException(c.q("invalid key size: ", p9Var.v(), ". Valid keys must have 64 bytes."));
    }
}
