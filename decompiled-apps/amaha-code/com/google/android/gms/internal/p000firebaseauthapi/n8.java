package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n8 */
/* loaded from: classes.dex */
public final class n8 extends e1 implements c2 {
    private static final n8 zzb;
    private int zzd;
    private s8 zze;
    private ka zzf;

    static {
        n8 n8Var = new n8();
        zzb = n8Var;
        e1.f(n8.class, n8Var);
    }

    public static /* synthetic */ void D(n8 n8Var, ka kaVar) {
        kaVar.getClass();
        n8Var.zzf = kaVar;
    }

    public static m8 w() {
        return (m8) zzb.o();
    }

    public static n8 y(h0 h0Var, r0 r0Var) {
        return (n8) e1.t(zzb, h0Var, r0Var);
    }

    public final ka A() {
        ka kaVar = this.zzf;
        if (kaVar == null) {
            return ka.y();
        }
        return kaVar;
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
                    return new m8(0);
                }
                return new n8();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final s8 z() {
        s8 s8Var = this.zze;
        if (s8Var == null) {
            return s8.y();
        }
        return s8Var;
    }
}
