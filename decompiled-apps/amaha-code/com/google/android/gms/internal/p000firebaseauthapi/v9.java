package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v9 */
/* loaded from: classes.dex */
public final class v9 extends e1 implements c2 {
    private static final v9 zzb;
    private ab zzd;

    static {
        v9 v9Var = new v9();
        zzb = v9Var;
        e1.f(v9.class, v9Var);
    }

    public static u9 v() {
        return (u9) zzb.o();
    }

    public static v9 x() {
        return zzb;
    }

    public static /* synthetic */ void z(v9 v9Var, ab abVar) {
        abVar.getClass();
        v9Var.zzd = abVar;
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
                    return new u9(0);
                }
                return new v9();
            }
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final ab y() {
        ab abVar = this.zzd;
        if (abVar == null) {
            return ab.x();
        }
        return abVar;
    }
}
