package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lb */
/* loaded from: classes.dex */
public final class lb extends e1 implements c2 {
    private static final lb zzb;
    private int zzd;
    private mb zze;

    static {
        lb lbVar = new lb();
        zzb = lbVar;
        e1.f(lb.class, lbVar);
    }

    public static /* synthetic */ void B(lb lbVar, mb mbVar) {
        mbVar.getClass();
        lbVar.zze = mbVar;
    }

    public static kb w() {
        return (kb) zzb.o();
    }

    public static lb y(h0 h0Var, r0 r0Var) {
        return (lb) e1.t(zzb, h0Var, r0Var);
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
                    return new kb(0);
                }
                return new lb();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final mb z() {
        mb mbVar = this.zze;
        if (mbVar == null) {
            return mb.w();
        }
        return mbVar;
    }
}
