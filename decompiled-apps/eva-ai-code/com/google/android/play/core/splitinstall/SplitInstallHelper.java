package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(Context context, String str) throws UnsatisfiedLinkError {
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + RemoteSettings.FORWARD_SLASH_STRING + System.mapLibraryName(str);
                if (new File(str2).exists()) {
                    System.load(str2);
                } else {
                    throw e;
                }
            }
        }
    }

    public static void updateAppInfo(Context context) {
        if (Build.VERSION.SDK_INT <= 25 || Build.VERSION.SDK_INT >= 28) {
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = zza;
        zzuVar.zzd("Calling dispatchPackageBroadcast", new Object[0]);
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
            zzuVar.zzd("Called dispatchPackageBroadcast", new Object[0]);
        } catch (Exception e) {
            zza.zzc(e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
        }
    }
}
