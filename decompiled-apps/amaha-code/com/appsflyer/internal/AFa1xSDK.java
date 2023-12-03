package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
final class AFa1xSDK {
    private IntentFilter valueOf = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* loaded from: classes.dex */
    public static final class AFa1ySDK {
        static final AFa1xSDK valueOf = new AFa1xSDK();
    }

    /* loaded from: classes.dex */
    public static final class AFa1zSDK {
        final float AFKeystoreWrapper;
        final String values;

        public AFa1zSDK(float f, String str) {
            this.AFKeystoreWrapper = f;
            this.values = str;
        }
    }

    public final AFa1zSDK AFInAppEventType(Context context) {
        boolean z10;
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.valueOf);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                str = "other";
                            } else {
                                str = "wireless";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = "ac";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new AFa1zSDK(f, str);
    }
}
