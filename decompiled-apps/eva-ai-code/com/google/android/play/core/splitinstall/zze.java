package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zze implements zzp {
    private final zze zza = this;
    private final zzcb zzb;
    private final zzcb zzc;
    private final zzcb zzd;
    private final zzcb zze;
    private final zzcb zzf;
    private final zzcb zzg;
    private final zzcb zzh;
    private final zzcb zzi;
    private final zzcb zzj;
    private final zzcb zzk;
    private final zzcb zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zze(zzac zzacVar, zzd zzdVar) {
        zzad zzadVar = new zzad(zzacVar);
        this.zzb = zzadVar;
        zzcb zzc = zzbz.zzc(new zzbd(zzadVar));
        this.zzc = zzc;
        zzcb zzc2 = zzbz.zzc(new zzag(zzacVar));
        this.zzd = zzc2;
        zzcb zzc3 = zzbz.zzc(new zzt(zzadVar));
        this.zze = zzc3;
        zzcb zzc4 = zzbz.zzc(new zzbf(zzadVar));
        this.zzf = zzc4;
        zzcb zzc5 = zzbz.zzc(new zzab(zzc, zzc2, zzc3, zzc4));
        this.zzg = zzc5;
        zzcb zzc6 = zzbz.zzc(new zzaf(zzadVar));
        this.zzh = zzc6;
        zzae zzaeVar = new zzae(zzc6);
        this.zzi = zzaeVar;
        zzcb zzc7 = zzbz.zzc(new com.google.android.play.core.splitinstall.testing.zzt(zzadVar, zzc6, zzc3, zzaeVar));
        this.zzj = zzc7;
        zzcb zzc8 = zzbz.zzc(new zzm(zzc5, zzc7, zzc6));
        this.zzk = zzc8;
        this.zzl = zzbz.zzc(new zzah(zzacVar, zzc8));
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final SplitInstallManager zza() {
        return (SplitInstallManager) this.zzl.zza();
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final File zzb() {
        return (File) this.zzh.zza();
    }
}
