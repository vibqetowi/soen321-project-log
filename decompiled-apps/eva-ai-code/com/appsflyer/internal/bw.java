package com.appsflyer.internal;

import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
/* loaded from: classes2.dex */
public final class bw {
    private static int AFInAppEventParameterName = 1;
    private static int valueOf;
    private static char[] AFInAppEventType = {'3', 39097, 12579, 51629, 25115, 64132, 37643, 11248, 50275, 23779, 62803, 36311, 9802, 48950, 22456, 61476, 34962, 8476, 47488, 21003, 60154, 33643, 7144, 46174, 19652, 58698, 32304, 5834, 44846, 18321, 57369, 30855, 4470, 43516, 16993, 56042, 29534, 2995, 42057, 15665, 54694, 28255, 1681, 40815, 14223, 53363, 26879, 354, 39383, 12894, 51911, 25417, 64575, 38053, 11566, 50583, 24071, 63227, 36726, 10235, 49260, 22737, 61790, 35255};
    private static long values = -3780520048646514550L;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ay AFKeystoreWrapper(ao aoVar, String str, String str2, String str3) {
        int i = AFInAppEventParameterName + 55;
        int i2 = i % 128;
        valueOf = i2;
        int i3 = i % 2;
        boolean z = true;
        if (!(aoVar == null)) {
            int i4 = i2 + 27;
            AFInAppEventParameterName = i4 % 128;
            int i5 = i4 % 2;
            if (str2 != null) {
                if ((str3 != null ? 'Y' : '%') == 'Y') {
                    int i6 = i2 + 1;
                    AFInAppEventParameterName = i6 % 128;
                    int i7 = i6 % 2;
                    if (z) {
                        return new ay(false, cw.INTERNAL_ERROR);
                    }
                    return AFInAppEventType(aoVar, str, str2, str3);
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    private static ay AFInAppEventType(ao aoVar, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new ay(aoVar.AFKeystoreWrapper == cs.DEFAULT, cw.NA);
        }
        String intern = values((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64, ExpandableListView.getPackedPositionType(0L)).intern();
        if (aoVar.AFKeystoreWrapper == cs.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = valueOf(new StringBuilder(str3).reverse().toString(), aoVar.AFInAppEventParameterName, "android", "v1", str4).equals(str);
        return new ay(equals, equals ? cw.SUCCESS : cw.FAILURE);
    }

    private static String valueOf(String str, String str2, String str3, String str4, String str5) {
        int i = AFInAppEventParameterName + 93;
        valueOf = i % 128;
        int i2 = i % 2;
        String valueOf2 = ag.valueOf(ag.AFInAppEventParameterName(str2, str3, str4, str5, ""), str);
        if (!(valueOf2.length() >= 12)) {
            int i3 = valueOf + 123;
            AFInAppEventParameterName = i3 % 128;
            int i4 = i3 % 2;
            return valueOf2;
        }
        return valueOf2.substring(0, 12);
    }

    private static String values(char c, int i, int i2) {
        String str;
        synchronized (dh.AFInAppEventParameterName) {
            char[] cArr = new char[i];
            dh.values = 0;
            while (dh.values < i) {
                cArr[dh.values] = (char) ((AFInAppEventType[dh.values + i2] ^ (dh.values * values)) ^ c);
                dh.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
