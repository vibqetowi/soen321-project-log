package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l7  reason: invalid package */
/* loaded from: classes.dex */
public final class l7 extends o6 {
    public l7() {
        super(j8.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 a(b2 b2Var) {
        j8 j8Var = (j8) b2Var;
        g8 w10 = h8.w();
        w10.e();
        ((h8) w10.f7723v).zzd = 0;
        byte[] a10 = kc.a(j8Var.v());
        g0 J = h0.J(0, a10, a10.length);
        w10.e();
        ((h8) w10.f7723v).zze = J;
        l8 z10 = j8Var.z();
        w10.e();
        h8.D((h8) w10.f7723v, z10);
        return (h8) w10.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 b(h0 h0Var) {
        return j8.y(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final Map c() {
        HashMap hashMap = new HashMap();
        i8 w10 = j8.w();
        w10.e();
        ((j8) w10.f7723v).zzd = 32;
        k8 w11 = l8.w();
        w11.e();
        ((l8) w11.f7723v).zzd = 16;
        w10.e();
        ((j8) w10.f7723v).zze = (l8) w11.c();
        hashMap.put("AES_CMAC", new n6(1, (j8) w10.c()));
        i8 w12 = j8.w();
        w12.e();
        ((j8) w12.f7723v).zzd = 32;
        k8 w13 = l8.w();
        w13.e();
        ((l8) w13.f7723v).zzd = 16;
        w12.e();
        ((j8) w12.f7723v).zze = (l8) w13.c();
        hashMap.put("AES256_CMAC", new n6(1, (j8) w12.c()));
        i8 w14 = j8.w();
        w14.e();
        ((j8) w14.f7723v).zzd = 32;
        k8 w15 = l8.w();
        w15.e();
        ((l8) w15.f7723v).zzd = 16;
        w14.e();
        ((j8) w14.f7723v).zze = (l8) w15.c();
        hashMap.put("AES256_CMAC_RAW", new n6(3, (j8) w14.c()));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final void d(b2 b2Var) {
        j8 j8Var = (j8) b2Var;
        s4.n(j8Var.z());
        if (j8Var.v() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
