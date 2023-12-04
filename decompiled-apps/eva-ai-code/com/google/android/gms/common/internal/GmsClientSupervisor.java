package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static int zzb = 4225;
    private static final Object zzc = new Object();
    private static zzr zzd = null;
    private static boolean zze = false;

    public static int getDefaultBindFlags() {
        return zzb;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        Looper mainLooper;
        synchronized (zzc) {
            if (zzd == null) {
                Context applicationContext = context.getApplicationContext();
                if (zze) {
                    mainLooper = getOrStartHandlerThread().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                zzd = new zzr(applicationContext, mainLooper);
            }
        }
        return zzd;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzc) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzc) {
            zzr zzrVar = zzd;
            if (zzrVar != null && !zze) {
                zzrVar.zzi(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zzc(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zza(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    protected abstract void zza(zzn zznVar, ServiceConnection serviceConnection, String str);

    public final void zzb(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        zza(new zzn(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor);

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zzc(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zza(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2);
    }
}
