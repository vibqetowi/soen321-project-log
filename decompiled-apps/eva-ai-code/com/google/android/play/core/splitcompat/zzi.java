package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzi implements zzk {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ zzn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(zzn zznVar, Set set, zzt zztVar) {
        this.zzc = zznVar;
        this.zza = set;
        this.zzb = zztVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(ZipFile zipFile, Set set) throws IOException {
        this.zza.addAll(zzn.zza(this.zzc, set, this.zzb, zipFile));
    }
}
