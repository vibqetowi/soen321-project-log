package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzx {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzm zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final com.google.android.play.core.appupdate.zzl zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.appupdate.internal.zzp
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzx.zzj(zzx.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "AppUpdateService";
    private final WeakReference zzj = new WeakReference(null);

    public zzx(Context context, zzm zzmVar, String str, Intent intent, com.google.android.play.core.appupdate.zzl zzlVar, zzs zzsVar) {
        this.zzb = context;
        this.zzc = zzmVar;
        this.zzi = intent;
        this.zzo = zzlVar;
    }

    public static /* synthetic */ void zzj(zzx zzxVar) {
        zzxVar.zzc.zzd("reportBinderDeath", new Object[0]);
        zzs zzsVar = (zzs) zzxVar.zzj.get();
        if (zzsVar == null) {
            zzxVar.zzc.zzd("%s : Binder has died.", zzxVar.zzd);
            for (zzn zznVar : zzxVar.zze) {
                zznVar.zzc(zzxVar.zzv());
            }
            zzxVar.zze.clear();
        } else {
            zzxVar.zzc.zzd("calling onBinderDied", new Object[0]);
            zzsVar.zza();
        }
        synchronized (zzxVar.zzg) {
            zzxVar.zzw();
        }
    }

    public static /* bridge */ /* synthetic */ void zzn(zzx zzxVar, final TaskCompletionSource taskCompletionSource) {
        zzxVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.appupdate.internal.zzo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzx.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzq(zzx zzxVar) {
        zzxVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzxVar.zzn.asBinder().linkToDeath(zzxVar.zzk, 0);
        } catch (RemoteException e) {
            zzxVar.zzc.zzc(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzx zzxVar) {
        zzxVar.zzc.zzd("unlinkToDeath", new Object[0]);
        zzxVar.zzn.asBinder().unlinkToDeath(zzxVar.zzk, 0);
    }

    public final void zzw() {
        for (TaskCompletionSource taskCompletionSource : this.zzf) {
            taskCompletionSource.trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzq(this, zznVar.zzb(), taskCompletionSource, zznVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzc().post(new zzr(this));
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public static /* bridge */ /* synthetic */ void zzp(zzx zzxVar, zzn zznVar) {
        if (zzxVar.zzn != null || zzxVar.zzh) {
            if (zzxVar.zzh) {
                zzxVar.zzc.zzd("Waiting to bind to the service.", new Object[0]);
                zzxVar.zze.add(zznVar);
                return;
            }
            zznVar.run();
            return;
        }
        zzxVar.zzc.zzd("Initiate binding to the service.", new Object[0]);
        zzxVar.zze.add(zznVar);
        zzw zzwVar = new zzw(zzxVar, null);
        zzxVar.zzm = zzwVar;
        zzxVar.zzh = true;
        if (zzxVar.zzb.bindService(zzxVar.zzi, zzwVar, 1)) {
            return;
        }
        zzxVar.zzc.zzd("Failed to bind to the service.", new Object[0]);
        zzxVar.zzh = false;
        for (zzn zznVar2 : zzxVar.zze) {
            zznVar2.zzc(new zzy());
        }
        zzxVar.zze.clear();
    }
}
