package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ka */
/* loaded from: classes.dex */
public final class ka extends e1 implements c2 {
    private static final ka zzb;
    private int zzd;
    private oa zze;
    private h0 zzf = h0.f7869v;

    static {
        ka kaVar = new ka();
        zzb = kaVar;
        e1.f(ka.class, kaVar);
    }

    public static /* synthetic */ void D(ka kaVar, oa oaVar) {
        oaVar.getClass();
        kaVar.zze = oaVar;
    }

    public static ja w() {
        return (ja) zzb.o();
    }

    public static ka y() {
        return zzb;
    }

    public static ka z(h0 h0Var, r0 r0Var) {
        return (ka) e1.t(zzb, h0Var, r0Var);
    }

    public final oa A() {
        oa oaVar = this.zze;
        if (oaVar == null) {
            return oa.y();
        }
        return oaVar;
    }

    public final h0 B() {
        return this.zzf;
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
                    return new ja(0);
                }
                return new ka();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
