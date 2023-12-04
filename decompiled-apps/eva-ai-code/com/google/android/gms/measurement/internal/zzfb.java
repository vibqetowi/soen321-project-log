package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfb extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.measurement.internal.zzfb";
    private final zzlh zzb;
    private boolean zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfb(zzlh zzlhVar) {
        Preconditions.checkNotNull(zzlhVar);
        this.zzb = zzlhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzB();
        String action = intent.getAction();
        this.zzb.zzaA().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.zzb.zzaA().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zza2 = this.zzb.zzj().zza();
        if (this.zzd != zza2) {
            this.zzd = zza2;
            this.zzb.zzaB().zzp(new zzfa(this, zza2));
        }
    }

    public final void zzb() {
        this.zzb.zzB();
        this.zzb.zzaB().zzg();
        if (this.zzc) {
            return;
        }
        this.zzb.zzaw().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzj().zza();
        this.zzb.zzaA().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzc() {
        this.zzb.zzB();
        this.zzb.zzaB().zzg();
        this.zzb.zzaB().zzg();
        if (this.zzc) {
            this.zzb.zzaA().zzj().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzaw().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzb.zzaA().zzd().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
