package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ob */
/* loaded from: classes.dex */
public final class ob extends e1 implements c2 {
    private static final ob zzb;
    private int zzd;
    private pb zze;

    static {
        ob obVar = new ob();
        zzb = obVar;
        e1.f(ob.class, obVar);
    }

    public static /* synthetic */ void B(ob obVar, pb pbVar) {
        pbVar.getClass();
        obVar.zze = pbVar;
    }

    public static nb w() {
        return (nb) zzb.o();
    }

    public static ob y(h0 h0Var, r0 r0Var) {
        return (ob) e1.t(zzb, h0Var, r0Var);
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
                    return new nb(0);
                }
                return new ob();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final pb z() {
        pb pbVar = this.zze;
        if (pbVar == null) {
            return pb.x();
        }
        return pbVar;
    }
}
