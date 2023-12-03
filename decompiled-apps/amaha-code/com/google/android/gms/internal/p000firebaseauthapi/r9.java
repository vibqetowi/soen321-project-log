package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r9 */
/* loaded from: classes.dex */
public final class r9 extends e1 implements c2 {
    private static final r9 zzb;
    private int zzd;
    private h0 zze = h0.f7869v;

    static {
        r9 r9Var = new r9();
        zzb = r9Var;
        e1.f(r9.class, r9Var);
    }

    public static q9 w() {
        return (q9) zzb.o();
    }

    public static r9 y(h0 h0Var, r0 r0Var) {
        return (r9) e1.t(zzb, h0Var, r0Var);
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
                    return new q9(0);
                }
                return new r9();
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
