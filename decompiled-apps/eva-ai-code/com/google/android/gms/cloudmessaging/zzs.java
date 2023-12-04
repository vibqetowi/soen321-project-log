package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final class zzs {
    private static zzs zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzm zzd = new zzm(this, null);
    private int zze = 1;

    zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context zza(zzs zzsVar) {
        return zzsVar.zzb;
    }

    public static synchronized zzs zzb(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            if (zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                zza = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            zzsVar = zza;
        }
        return zzsVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService zze(zzs zzsVar) {
        return zzsVar.zzc;
    }

    private final synchronized int zzf() {
        int i;
        i = this.zze;
        this.zze = i + 1;
        return i;
    }

    private final synchronized <T> Task<T> zzg(zzp<T> zzpVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzpVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.zzd.zzg(zzpVar)) {
            zzm zzmVar = new zzm(this, null);
            this.zzd = zzmVar;
            zzmVar.zzg(zzpVar);
        }
        return zzpVar.zzb.getTask();
    }

    public final Task<Void> zzc(int i, Bundle bundle) {
        return zzg(new zzo(zzf(), 2, bundle));
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        return zzg(new zzr(zzf(), 1, bundle));
    }
}
