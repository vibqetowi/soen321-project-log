package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a9 */
/* loaded from: classes.dex */
public final class a9 extends e1 implements c2 {
    private static final a9 zzb;
    private c9 zzd;
    private int zze;

    static {
        a9 a9Var = new a9();
        zzb = a9Var;
        e1.f(a9.class, a9Var);
    }

    public static z8 w() {
        return (z8) zzb.o();
    }

    public static a9 y(h0 h0Var, r0 r0Var) {
        return (a9) e1.t(zzb, h0Var, r0Var);
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
                    return new z8(0);
                }
                return new a9();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }

    public final c9 z() {
        c9 c9Var = this.zzd;
        if (c9Var == null) {
            return c9.y();
        }
        return c9Var;
    }
}
