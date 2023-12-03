package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p8 */
/* loaded from: classes.dex */
public final class p8 extends e1 implements c2 {
    private static final p8 zzb;
    private u8 zzd;
    private ma zze;

    static {
        p8 p8Var = new p8();
        zzb = p8Var;
        e1.f(p8.class, p8Var);
    }

    public static o8 v() {
        return (o8) zzb.o();
    }

    public static p8 x(h0 h0Var, r0 r0Var) {
        return (p8) e1.t(zzb, h0Var, r0Var);
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
                    return new o8(0);
                }
                return new p8();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final u8 y() {
        u8 u8Var = this.zzd;
        if (u8Var == null) {
            return u8.y();
        }
        return u8Var;
    }

    public final ma z() {
        ma maVar = this.zze;
        if (maVar == null) {
            return ma.y();
        }
        return maVar;
    }
}
