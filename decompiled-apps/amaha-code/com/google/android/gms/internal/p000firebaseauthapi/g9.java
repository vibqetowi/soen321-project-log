package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g9 */
/* loaded from: classes.dex */
public final class g9 extends e1 implements c2 {
    private static final g9 zzb;
    private int zzd;
    private int zze;

    static {
        g9 g9Var = new g9();
        zzb = g9Var;
        e1.f(g9.class, g9Var);
    }

    public static f9 w() {
        return (f9) zzb.o();
    }

    public static g9 y(h0 h0Var, r0 r0Var) {
        return (g9) e1.t(zzb, h0Var, r0Var);
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
                    return new f9(0);
                }
                return new g9();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
