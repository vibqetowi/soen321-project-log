package com.appsflyer.internal;

import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFb1rSDK {
    private static String AFInAppEventType;
    private static String AFKeystoreWrapper;
    final long AFInAppEventParameterName;
    private final boolean valueOf;
    final String values;

    public AFb1rSDK() {
    }

    public AFb1rSDK(String str, long j10, boolean z10) {
        this.values = str;
        this.AFInAppEventParameterName = j10;
        this.valueOf = z10;
    }

    public static void AFInAppEventType(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (i6 != 0 && i6 != str.length() - 1) {
                sb2.append("*");
            } else {
                sb2.append(str.charAt(i6));
            }
        }
        AFInAppEventType = sb2.toString();
    }

    public static void valueOf(String str) {
        if (AFKeystoreWrapper == null) {
            AFInAppEventType(AFb1xSDK.AFKeystoreWrapper().values().AFVersionDeclaration().values);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventType));
        }
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
