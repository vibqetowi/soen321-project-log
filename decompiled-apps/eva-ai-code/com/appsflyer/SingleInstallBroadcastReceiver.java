package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.ac;
/* loaded from: classes2.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.valueOf("error in BroadcastReceiver ", th);
            str = null;
        }
        if (str != null && ac.AFInAppEventType(context).getString("referrer", null) != null) {
            ac.AFInAppEventParameterName().valueOf(context, str);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
            AFLogger.values("SingleInstallBroadcastReceiver called");
            ac.AFInAppEventParameterName().AFKeystoreWrapper(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
