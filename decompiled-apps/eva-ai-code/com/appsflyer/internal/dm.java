package com.appsflyer.internal;
/* loaded from: classes2.dex */
public final class dm {
    public static int AFInAppEventParameterName;
    public static int AFKeystoreWrapper;
    public static final Object valueOf = new Object();
    public static int values;

    public static void values(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AFInAppEventParameterName(int i) {
        dj djVar = dj.valueOf;
        return ((djVar.AFInAppEventType[0][i >>> 24] + djVar.AFInAppEventType[1][(i >>> 16) & 255]) ^ djVar.AFInAppEventType[2][(i >>> 8) & 255]) + djVar.AFInAppEventType[3][i & 255];
    }
}
