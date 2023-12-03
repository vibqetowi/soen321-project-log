package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pb */
/* loaded from: classes.dex */
public final class pb extends e1 implements c2 {
    private static final pb zzb;
    private String zzd = "";
    private ab zze;

    static {
        pb pbVar = new pb();
        zzb = pbVar;
        e1.f(pb.class, pbVar);
    }

    public static /* synthetic */ pb w() {
        return zzb;
    }

    public static pb x() {
        return zzb;
    }

    public static pb y(h0 h0Var, r0 r0Var) {
        return (pb) e1.t(zzb, h0Var, r0Var);
    }

    public final boolean A() {
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
                    return new s9((c) null);
                }
                return new pb();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final ab v() {
        ab abVar = this.zze;
        if (abVar == null) {
            return ab.x();
        }
        return abVar;
    }

    public final String z() {
        return this.zzd;
    }
}
