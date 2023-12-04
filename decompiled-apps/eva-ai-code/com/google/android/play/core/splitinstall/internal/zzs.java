package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class zzs {
    protected final zzu zza;
    private final IntentFilter zzc;
    private final Context zzd;
    protected final Set zzb = new HashSet();
    private zzr zze = null;
    private volatile boolean zzf = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzs(zzu zzuVar, IntentFilter intentFilter, Context context) {
        this.zza = zzuVar;
        this.zzc = intentFilter;
        this.zzd = zzbr.zza(context);
    }

    private final void zzf() {
        zzr zzrVar;
        if ((this.zzf || !this.zzb.isEmpty()) && this.zze == null) {
            this.zze = new zzr(this, null);
            if (Build.VERSION.SDK_INT >= 33) {
                this.zzd.registerReceiver(this.zze, this.zzc, 2);
            }
            this.zzd.registerReceiver(this.zze, this.zzc);
        }
        if (this.zzf || !this.zzb.isEmpty() || (zzrVar = this.zze) == null) {
            return;
        }
        this.zzd.unregisterReceiver(zzrVar);
        this.zze = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(Context context, Intent intent);

    public final synchronized void zzb(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("registerListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.zzb.add(stateUpdatedListener);
        zzf();
    }

    public final synchronized void zzc(boolean z) {
        this.zzf = true;
        zzf();
    }

    public final synchronized void zzd(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("unregisterListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.zzb.remove(stateUpdatedListener);
        zzf();
    }

    public final synchronized void zze(Object obj) {
        Iterator it = new HashSet(this.zzb).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }
}
