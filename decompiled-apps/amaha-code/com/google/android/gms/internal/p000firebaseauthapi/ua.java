package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ua */
/* loaded from: classes.dex */
public final class ua extends e1 implements c2 {
    private static final ua zzb;
    private int zzd;
    private wa zze;
    private h0 zzf = h0.f7869v;

    static {
        ua uaVar = new ua();
        zzb = uaVar;
        e1.f(ua.class, uaVar);
    }

    public static ta w() {
        return (ta) zzb.o();
    }

    public static ua y(h0 h0Var, r0 r0Var) {
        return (ua) e1.t(zzb, h0Var, r0Var);
    }

    public final h0 A() {
        return this.zzf;
    }

    public final boolean E() {
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
                    return new ta(0);
                }
                return new ua();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final wa z() {
        wa waVar = this.zze;
        if (waVar == null) {
            return wa.z();
        }
        return waVar;
    }
}
