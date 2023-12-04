package com.google.android.gms.internal.measurement;

import java.util.List;
import org.apache.commons.logging.LogFactory;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.zzd, 3, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzb instanceof zzao)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzap zzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzb2 instanceof zzam)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzam zzamVar = (zzam) zzb2;
        if (!zzamVar.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(zzi, zzamVar.zzt(LogFactory.PRIORITY_KEY) ? zzh.zzb(zzamVar.zzf(LogFactory.PRIORITY_KEY).zzh().doubleValue()) : 1000, (zzao) zzb, zzamVar.zzf("type").zzi());
        return zzap.zzf;
    }
}
