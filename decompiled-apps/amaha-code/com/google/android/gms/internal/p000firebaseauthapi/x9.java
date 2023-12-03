package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x9 */
/* loaded from: classes.dex */
public final class x9 extends e1 implements c2 {
    private static final x9 zzb;
    private aa zzd;

    static {
        x9 x9Var = new x9();
        zzb = x9Var;
        e1.f(x9.class, x9Var);
    }

    public static w9 v() {
        return (w9) zzb.o();
    }

    public static x9 x(h0 h0Var, r0 r0Var) {
        return (x9) e1.t(zzb, h0Var, r0Var);
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
                    return new w9(0);
                }
                return new x9();
            }
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final aa y() {
        aa aaVar = this.zzd;
        if (aaVar == null) {
            return aa.y();
        }
        return aaVar;
    }
}
