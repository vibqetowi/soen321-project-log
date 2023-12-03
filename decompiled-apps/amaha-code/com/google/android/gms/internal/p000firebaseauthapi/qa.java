package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qa */
/* loaded from: classes.dex */
public final class qa extends e1 implements c2 {
    private static final qa zzb;
    private sa zzd;

    static {
        qa qaVar = new qa();
        zzb = qaVar;
        e1.f(qa.class, qaVar);
    }

    public static pa v() {
        return (pa) zzb.o();
    }

    public static qa x(h0 h0Var, r0 r0Var) {
        return (qa) e1.t(zzb, h0Var, r0Var);
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
                    return new pa(0);
                }
                return new qa();
            }
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final sa y() {
        sa saVar = this.zzd;
        if (saVar == null) {
            return sa.x();
        }
        return saVar;
    }
}
