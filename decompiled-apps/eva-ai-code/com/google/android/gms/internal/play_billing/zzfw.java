package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class zzfw extends zzcb implements zzdg {
    private static final zzfw zzb;
    private int zzd;
    private int zze;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzcb.zzp(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfu zzv() {
        return (zzfu) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzfw zzfwVar, int i) {
        zzfwVar.zze = i - 1;
        zzfwVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfu(null);
                }
                return new zzfw();
            }
            return zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzfv.zza});
        }
        return (byte) 1;
    }
}
