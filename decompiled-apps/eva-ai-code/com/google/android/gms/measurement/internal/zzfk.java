package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfk implements ServiceConnection {
    final /* synthetic */ zzfl zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfk(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaB().zzp(new zzfj(this, zzb, this));
                return;
            } catch (RuntimeException e) {
                this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.zza.zza.zzaA().zzk().zza("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaA().zzj().zza("Install Referrer Service disconnected");
    }
}
