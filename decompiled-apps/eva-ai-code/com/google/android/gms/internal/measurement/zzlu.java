package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzlu extends zzlw {
    private zzlu() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j) {
        ((zzli) zznu.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzb(Object obj, Object obj2, long j) {
        zzli zzliVar = (zzli) zznu.zzf(obj, j);
        zzli zzliVar2 = (zzli) zznu.zzf(obj2, j);
        int size = zzliVar.size();
        int size2 = zzliVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVar.zzc()) {
                zzliVar = zzliVar.zzd(size2 + size);
            }
            zzliVar.addAll(zzliVar2);
        }
        if (size > 0) {
            zzliVar2 = zzliVar;
        }
        zznu.zzs(obj, j, zzliVar2);
    }
}
