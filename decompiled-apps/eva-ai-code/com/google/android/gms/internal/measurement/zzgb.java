package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgb extends zzlb implements zzmj {
    private static final zzgb zza;
    private zzli zzd = zzbH();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzlb.zzbO(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static zzga zza() {
        return (zzga) zza.zzbA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzgb zzgbVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzli zzliVar = zzgbVar.zzd;
        if (!zzliVar.zzc()) {
            zzgbVar.zzd = zzlb.zzbI(zzliVar);
        }
        zzgbVar.zzd.add(zzgdVar);
    }

    public final zzgd zzc(int i) {
        return (zzgd) this.zzd.get(0);
    }

    public final List zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzga(null);
                }
                return new zzgb();
            }
            return zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgd.class});
        }
        return (byte) 1;
    }
}
