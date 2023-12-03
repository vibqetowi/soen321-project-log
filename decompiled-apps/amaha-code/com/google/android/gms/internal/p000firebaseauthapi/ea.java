package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ea */
/* loaded from: classes.dex */
public final class ea extends e1 implements c2 {
    private static final ea zzb;
    private int zzd;
    private aa zze;
    private h0 zzf;
    private h0 zzg;

    static {
        ea eaVar = new ea();
        zzb = eaVar;
        e1.f(ea.class, eaVar);
    }

    public ea() {
        g0 g0Var = h0.f7869v;
        this.zzf = g0Var;
        this.zzg = g0Var;
    }

    public static ea A(h0 h0Var, r0 r0Var) {
        return (ea) e1.t(zzb, h0Var, r0Var);
    }

    public static /* synthetic */ void E(ea eaVar, aa aaVar) {
        aaVar.getClass();
        eaVar.zze = aaVar;
    }

    public static da x() {
        return (da) zzb.o();
    }

    public static ea z() {
        return zzb;
    }

    public final h0 B() {
        return this.zzf;
    }

    public final h0 C() {
        return this.zzg;
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
                    return new da(0);
                }
                return new ea();
            }
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final aa w() {
        aa aaVar = this.zze;
        if (aaVar == null) {
            return aa.y();
        }
        return aaVar;
    }
}
