package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setProxyNotificationsInitialized(Context context, boolean z) {
        SharedPreferences.Editor edit = getPreference(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }
}
