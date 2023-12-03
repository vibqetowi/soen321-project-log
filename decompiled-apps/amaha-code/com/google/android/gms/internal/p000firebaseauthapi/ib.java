package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ib */
/* loaded from: classes.dex */
public final class ib extends e1 implements c2 {
    private static final ib zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ib ibVar = new ib();
        zzb = ibVar;
        e1.f(ib.class, ibVar);
    }

    public static void B(ib ibVar, int i6) {
        if (i6 != 1) {
            ibVar.zze = i6 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static hb w() {
        return (hb) zzb.o();
    }

    public static /* synthetic */ void y(ib ibVar, String str) {
        str.getClass();
        ibVar.zzd = str;
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
                    return new hb(0);
                }
                return new ib();
            }
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf;
    }
}
