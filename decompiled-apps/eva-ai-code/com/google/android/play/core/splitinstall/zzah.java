package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzca;
import com.google.android.play.core.splitinstall.internal.zzcb;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzah implements zzcb {
    private final zzac zza;
    private final zzcb zzb;

    public zzah(zzac zzacVar, zzcb zzcbVar) {
        this.zza = zzacVar;
        this.zzb = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        zzl zzlVar = (zzl) this.zzb.zza();
        zzca.zza(zzlVar);
        return zzlVar;
    }
}
