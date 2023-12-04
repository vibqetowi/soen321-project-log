package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        int i2;
        zzr zzrVar;
        zzr zzrVar2;
        zzr zzrVar3;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar3 = this.zzc.zza;
            zzrVar3.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (zzb != 2) {
            i = 3;
            if (zzb == 3) {
                i2 = 1;
            } else if (zzb == 5) {
                i2 = 5;
            } else if (zzb == 6) {
                i2 = 2;
            }
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() != 2) {
                zzrVar2 = this.zzc.zza;
                zzrVar2.zza(i2, zzi, Collections.emptyList(), this.zza, this.zzb);
                return zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i3)).zzi());
            }
            zzrVar = this.zzc.zza;
            zzrVar.zza(i2, zzi, arrayList, this.zza, this.zzb);
            return zzf;
        }
        i = 4;
        i2 = i;
        String zzi2 = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() != 2) {
        }
    }
}
