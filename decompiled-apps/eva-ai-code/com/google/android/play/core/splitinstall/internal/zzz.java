package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzz extends zzv {
    final /* synthetic */ zzaf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(zzaf zzafVar) {
        this.zza = zzafVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        IInterface iInterface;
        zzu zzuVar;
        Context context;
        ServiceConnection serviceConnection;
        zzaf zzafVar = this.zza;
        iInterface = zzafVar.zzn;
        if (iInterface != null) {
            zzuVar = zzafVar.zzc;
            zzuVar.zzd("Unbind from service.", new Object[0]);
            zzaf zzafVar2 = this.zza;
            context = zzafVar2.zzb;
            serviceConnection = zzafVar2.zzm;
            context.unbindService(serviceConnection);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
