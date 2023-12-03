package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.RemoteException;
import android.os.storage.StorageManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
/* compiled from: ContextExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\"\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u001a&\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00020\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u0000H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0000H\u0001¨\u0006\u001e"}, d2 = {"Landroid/content/Context;", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/IntentFilter;", "filter", "Lcom/bugsnag/android/Logger;", "logger", "Landroid/content/Intent;", "registerReceiverSafe", "Lhs/k;", "unregisterReceiverSafe", "T", "", SessionManager.KEY_NAME, "safeGetSystemService", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/app/ActivityManager;", "getActivityManagerFrom", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "getActivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManagerFrom", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "getConnectivityManager", "Landroid/os/storage/StorageManager;", "getStorageManagerFrom", "(Landroid/content/Context;)Landroid/os/storage/StorageManager;", "getStorageManager", "Landroid/location/LocationManager;", "getLocationManager", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ContextExtensionsKt {
    public static final ActivityManager getActivityManagerFrom(Context getActivityManager) {
        i.h(getActivityManager, "$this$getActivityManager");
        try {
            Object systemService = getActivityManager.getSystemService(Constants.SCREEN_ACTIVITY);
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final ConnectivityManager getConnectivityManagerFrom(Context getConnectivityManager) {
        i.h(getConnectivityManager, "$this$getConnectivityManager");
        try {
            Object systemService = getConnectivityManager.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final LocationManager getLocationManager(Context getLocationManager) {
        i.h(getLocationManager, "$this$getLocationManager");
        try {
            Object systemService = getLocationManager.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final StorageManager getStorageManagerFrom(Context getStorageManager) {
        i.h(getStorageManager, "$this$getStorageManager");
        try {
            Object systemService = getStorageManager.getSystemService("storage");
            if (!(systemService instanceof StorageManager)) {
                systemService = null;
            }
            return (StorageManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final Intent registerReceiverSafe(Context registerReceiverSafe, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Logger logger) {
        i.h(registerReceiverSafe, "$this$registerReceiverSafe");
        try {
            return registerReceiverSafe.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e10) {
            if (logger != null) {
                logger.w("Failed to register receiver", e10);
                return null;
            }
            return null;
        } catch (IllegalArgumentException e11) {
            if (logger != null) {
                logger.w("Failed to register receiver", e11);
                return null;
            }
            return null;
        } catch (SecurityException e12) {
            if (logger != null) {
                logger.w("Failed to register receiver", e12);
                return null;
            }
            return null;
        }
    }

    public static /* synthetic */ Intent registerReceiverSafe$default(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Logger logger, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            logger = null;
        }
        return registerReceiverSafe(context, broadcastReceiver, intentFilter, logger);
    }

    private static final <T> T safeGetSystemService(Context context, String str) {
        try {
            context.getSystemService(str);
            i.p();
            throw null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final void unregisterReceiverSafe(Context unregisterReceiverSafe, BroadcastReceiver broadcastReceiver, Logger logger) {
        i.h(unregisterReceiverSafe, "$this$unregisterReceiverSafe");
        try {
            unregisterReceiverSafe.unregisterReceiver(broadcastReceiver);
        } catch (RemoteException e10) {
            if (logger != null) {
                logger.w("Failed to register receiver", e10);
            }
        } catch (IllegalArgumentException e11) {
            if (logger != null) {
                logger.w("Failed to register receiver", e11);
            }
        } catch (SecurityException e12) {
            if (logger != null) {
                logger.w("Failed to register receiver", e12);
            }
        }
    }

    public static /* synthetic */ void unregisterReceiverSafe$default(Context context, BroadcastReceiver broadcastReceiver, Logger logger, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            logger = null;
        }
        unregisterReceiverSafe(context, broadcastReceiver, logger);
    }
}
