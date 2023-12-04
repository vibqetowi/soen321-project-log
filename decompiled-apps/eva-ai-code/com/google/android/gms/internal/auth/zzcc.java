package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        boolean z;
        boolean isUserUnlocked;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                if (!zzb) {
                    int i = 1;
                    while (true) {
                        if (i > 2) {
                            break;
                        }
                        if (zza == null) {
                            zza = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = zza;
                        if (userManager == null) {
                            z = true;
                            break;
                        }
                        try {
                            isUserUnlocked = userManager.isUserUnlocked();
                            if (isUserUnlocked) {
                                break;
                            }
                        } catch (NullPointerException e) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            zza = null;
                            i++;
                        }
                    }
                    z = false;
                    if (z) {
                        zza = null;
                    }
                    if (z) {
                        zzb = true;
                    }
                    if (!z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
