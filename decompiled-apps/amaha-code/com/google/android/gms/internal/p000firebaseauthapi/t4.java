package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t4  reason: invalid package */
/* loaded from: classes.dex */
public final class t4 extends o6 {
    public t4(s4 s4Var) {
        super(u8.class);
    }

    public static final s8 e(u8 u8Var) {
        r8 w10 = s8.w();
        w8 A = u8Var.A();
        w10.e();
        s8.D((s8) w10.f7723v, A);
        byte[] a10 = kc.a(u8Var.v());
        g0 J = h0.J(0, a10, a10.length);
        w10.e();
        ((s8) w10.f7723v).zzf = J;
        w10.e();
        ((s8) w10.f7723v).zzd = 0;
        return (s8) w10.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final /* bridge */ /* synthetic */ b2 a(b2 b2Var) {
        return e((u8) b2Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 b(h0 h0Var) {
        return u8.z(h0Var, r0.f8101b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final void d(b2 b2Var) {
        u8 u8Var = (u8) b2Var;
        mc.b(u8Var.v());
        w8 A = u8Var.A();
        if (A.v() >= 12 && A.v() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
