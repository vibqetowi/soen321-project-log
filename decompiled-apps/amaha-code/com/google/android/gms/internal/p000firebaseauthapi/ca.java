package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ca */
/* loaded from: classes.dex */
public final class ca extends e1 implements c2 {
    private static final ca zzb;
    private int zzd;
    private ea zze;
    private h0 zzf = h0.f7869v;

    static {
        ca caVar = new ca();
        zzb = caVar;
        e1.f(ca.class, caVar);
    }

    public static ba w() {
        return (ba) zzb.o();
    }

    public static ca y(h0 h0Var, r0 r0Var) {
        return (ca) e1.t(zzb, h0Var, r0Var);
    }

    public final h0 A() {
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
                    return new ba(0);
                }
                return new ca();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final ea z() {
        ea eaVar = this.zze;
        if (eaVar == null) {
            return ea.z();
        }
        return eaVar;
    }
}
