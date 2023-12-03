package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j9 */
/* loaded from: classes.dex */
public final class j9 extends e1 implements c2 {
    private static final j9 zzb;
    private int zzd;
    private h0 zze = h0.f7869v;

    static {
        j9 j9Var = new j9();
        zzb = j9Var;
        e1.f(j9.class, j9Var);
    }

    public static h9 w() {
        return (h9) zzb.o();
    }

    public static j9 y(h0 h0Var, r0 r0Var) {
        return (j9) e1.t(zzb, h0Var, r0Var);
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
                    return new h9(0);
                }
                return new j9();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final h0 z() {
        return this.zze;
    }
}
