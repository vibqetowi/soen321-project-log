package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n9 */
/* loaded from: classes.dex */
public final class n9 extends e1 implements c2 {
    private static final n9 zzb;
    private int zzd;
    private h0 zze = h0.f7869v;

    static {
        n9 n9Var = new n9();
        zzb = n9Var;
        e1.f(n9.class, n9Var);
    }

    public static m9 w() {
        return (m9) zzb.o();
    }

    public static n9 y(h0 h0Var, r0 r0Var) {
        return (n9) e1.t(zzb, h0Var, r0Var);
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
                    return new m9(0);
                }
                return new n9();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
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
