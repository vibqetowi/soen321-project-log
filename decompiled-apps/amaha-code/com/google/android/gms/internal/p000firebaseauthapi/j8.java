package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j8 */
/* loaded from: classes.dex */
public final class j8 extends e1 implements c2 {
    private static final j8 zzb;
    private int zzd;
    private l8 zze;

    static {
        j8 j8Var = new j8();
        zzb = j8Var;
        e1.f(j8.class, j8Var);
    }

    public static i8 w() {
        return (i8) zzb.o();
    }

    public static j8 y(h0 h0Var, r0 r0Var) {
        return (j8) e1.t(zzb, h0Var, r0Var);
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
                    return new i8(0);
                }
                return new j8();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final l8 z() {
        l8 l8Var = this.zze;
        if (l8Var == null) {
            return l8.y();
        }
        return l8Var;
    }
}
