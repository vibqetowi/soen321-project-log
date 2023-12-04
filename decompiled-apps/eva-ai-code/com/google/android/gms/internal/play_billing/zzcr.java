package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
final class zzcr extends zzct {
    private zzcr() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcr(zzcq zzcqVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zza(Object obj, long j) {
        ((zzcf) zzeq.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zzb(Object obj, Object obj2, long j) {
        zzcf zzcfVar = (zzcf) zzeq.zzf(obj, j);
        zzcf zzcfVar2 = (zzcf) zzeq.zzf(obj2, j);
        int size = zzcfVar.size();
        int size2 = zzcfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzcfVar.zzc()) {
                zzcfVar = zzcfVar.zzd(size2 + size);
            }
            zzcfVar.addAll(zzcfVar2);
        }
        if (size > 0) {
            zzcfVar2 = zzcfVar;
        }
        zzeq.zzs(obj, j, zzcfVar2);
    }
}
