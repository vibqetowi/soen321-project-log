package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wa */
/* loaded from: classes.dex */
public final class wa extends e1 implements c2 {
    private static final wa zzb;
    private int zzd;
    private sa zze;
    private h0 zzf = h0.f7869v;

    static {
        wa waVar = new wa();
        zzb = waVar;
        e1.f(wa.class, waVar);
    }

    public static wa A(h0 h0Var, r0 r0Var) {
        return (wa) e1.t(zzb, h0Var, r0Var);
    }

    public static /* synthetic */ void D(wa waVar, sa saVar) {
        saVar.getClass();
        waVar.zze = saVar;
    }

    public static va x() {
        return (va) zzb.o();
    }

    public static wa z() {
        return zzb;
    }

    public final h0 B() {
        return this.zzf;
    }

    public final boolean F() {
        if (this.zze != null) {
            return true;
        }
        return false;
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
                    return new va(0);
                }
                return new wa();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final sa w() {
        sa saVar = this.zze;
        if (saVar == null) {
            return sa.x();
        }
        return saVar;
    }
}
