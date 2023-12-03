package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ia */
/* loaded from: classes.dex */
public final class ia extends e1 implements c2 {
    private static final ia zzb;
    private h0 zzd = h0.f7869v;
    private jb zze;

    static {
        ia iaVar = new ia();
        zzb = iaVar;
        e1.f(ia.class, iaVar);
    }

    public static ha v() {
        return (ha) zzb.o();
    }

    public static ia x(byte[] bArr, r0 r0Var) {
        return (ia) e1.u(zzb, bArr, r0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e1
    public final Object m(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ha(0);
                }
                return new ia();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final h0 y() {
        return this.zzd;
    }
}
