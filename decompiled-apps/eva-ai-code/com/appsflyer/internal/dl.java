package com.appsflyer.internal;
/* loaded from: classes2.dex */
public final class dl {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFKeystoreWrapper;
    public static int values;

    public static char[] AFInAppEventType(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if ((((j >>> i4) & 1) != i || i2 >= 4) && i3 < length) {
                cArr2[i3] = cArr[i4];
                i3++;
            } else {
                cArr2[i2] = cArr[i4];
                i2++;
            }
        }
        return cArr2;
    }
}
