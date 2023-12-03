package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ma */
/* loaded from: classes.dex */
public final class ma extends e1 implements c2 {
    private static final ma zzb;
    private oa zzd;
    private int zze;
    private int zzf;

    static {
        ma maVar = new ma();
        zzb = maVar;
        e1.f(ma.class, maVar);
    }

    public static la w() {
        return (la) zzb.o();
    }

    public static ma y() {
        return zzb;
    }

    public static ma z(h0 h0Var, r0 r0Var) {
        return (ma) e1.t(zzb, h0Var, r0Var);
    }

    public final oa A() {
        oa oaVar = this.zzd;
        if (oaVar == null) {
            return oa.y();
        }
        return oaVar;
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
                    return new la(0);
                }
                return new ma();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }
}
