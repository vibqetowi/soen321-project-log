package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l9 */
/* loaded from: classes.dex */
public final class l9 extends e1 implements c2 {
    private static final l9 zzb;
    private int zzd;
    private int zze;

    static {
        l9 l9Var = new l9();
        zzb = l9Var;
        e1.f(l9.class, l9Var);
    }

    public static k9 w() {
        return (k9) zzb.o();
    }

    public static l9 y(h0 h0Var, r0 r0Var) {
        return (l9) e1.t(zzb, h0Var, r0Var);
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
                    return new k9(0);
                }
                return new l9();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
