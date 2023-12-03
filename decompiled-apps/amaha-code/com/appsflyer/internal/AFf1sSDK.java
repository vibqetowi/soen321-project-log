package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFf1sSDK {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFInAppEventType;
    public static int values;

    public static char[] AFKeystoreWrapper(long j10, char[] cArr, int i6) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i10 = 0;
        int i11 = 4;
        for (int i12 = 0; i12 < cArr.length; i12++) {
            if ((((j10 >>> i12) & 1) != i6 || i10 >= 4) && i11 < length) {
                cArr2[i11] = cArr[i12];
                i11++;
            } else {
                cArr2[i10] = cArr[i12];
                i10++;
            }
        }
        return cArr2;
    }
}
