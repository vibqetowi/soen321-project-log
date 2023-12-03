package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.appsflyer.R;
/* loaded from: classes.dex */
public final class AFd1nSDK {
    private static int AFInAppEventParameterName = 1;
    private static long AFInAppEventType = 8995702351891180356L;
    private static int AFKeystoreWrapper;
    private static int valueOf;
    private static char values;

    private static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
        char c10;
        char c11;
        int i6 = AFInAppEventParameterName + 77;
        valueOf = i6 % 128;
        int i10 = i6 % 2;
        String AFInAppEventType2 = AFb1tSDK.AFInAppEventType(AFb1tSDK.AFInAppEventType(str2, str3, str4, str5, ""), str);
        if (AFInAppEventType2.length() < 12) {
            c10 = 'F';
        } else {
            c10 = 'A';
        }
        if (c10 != 'F') {
            return AFInAppEventType2.substring(0, 12);
        }
        int i11 = valueOf + 39;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 == 0) {
            c11 = '\n';
        } else {
            c11 = ':';
        }
        if (c11 == ':') {
            return AFInAppEventType2;
        }
        throw null;
    }

    private static AFb1nSDK AFKeystoreWrapper(AFb1sSDK aFb1sSDK, String str, String str2, String str3) {
        if (str == null) {
            return new AFb1nSDK(aFb1sSDK.values == AFe1mSDK.DEFAULT, AFe1lSDK.NA);
        }
        String str4 = "";
        String intern = AFKeystoreWrapper("ꭄ떞➠糗", (char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) + 1, "킕揙魬彩ｊ쒣ꃗ\ue558ꊝ䊨뇖끳\udb5e\uf576鋳\uf60d琳㉬ユ\udbc2㠶\uf2a5\uaacf翌玞\ud860ꟙꖰ苈틪줘徧ꠐ☁亝⋝ଓ❤賡䒛㒭ʰ䧻ć貘⪃\ude44鉑飅䄊ᾃ醻溳럳밮뛤㇡琵緜茿䶾恕༦愬", "붦貳䐬אַ").intern();
        if (aFb1sSDK.values == AFe1mSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = intern;
        }
        boolean equals = AFInAppEventType(new StringBuilder(str3).reverse().toString(), aFb1sSDK.AFInAppEventParameterName, "android", "v1", str4).equals(str);
        return new AFb1nSDK(equals, equals ? AFe1lSDK.SUCCESS : AFe1lSDK.FAILURE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFb1nSDK values(AFb1sSDK aFb1sSDK, String str, String str2, String str3) {
        char c10;
        boolean z10;
        boolean z11;
        if (aFb1sSDK != null) {
            c10 = '.';
        } else {
            c10 = 'Z';
        }
        if (c10 == '.' && str2 != null) {
            int i6 = valueOf + R.styleable.AppCompatTheme_textAppearanceListItemSmall;
            int i10 = i6 % 128;
            AFInAppEventParameterName = i10;
            int i11 = i6 % 2;
            z10 = true;
            if (str3 != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                int i12 = i10 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                valueOf = i12 % 128;
                int i13 = i12 % 2;
                if (z10) {
                    return new AFb1nSDK(false, AFe1lSDK.INTERNAL_ERROR);
                }
                return AFKeystoreWrapper(aFb1sSDK, str, str2, str3);
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str, char c10, int i6, String str2, String str3) {
        char[] cArr;
        String str4;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (AFf1uSDK.AFInAppEventType) {
            char[] cArr7 = (char[]) cArr2.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c10 ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i6));
            int length = cArr4.length;
            char[] cArr9 = new char[length];
            AFf1uSDK.values = 0;
            while (true) {
                int i10 = AFf1uSDK.values;
                if (i10 < length) {
                    int i11 = (i10 + 3) % 4;
                    char c11 = cArr8[(i10 + 2) % 4];
                    char c12 = (char) (((cArr7[i10 % 4] * 32718) + c11) % 65535);
                    AFf1uSDK.AFInAppEventParameterName = c12;
                    cArr8[i11] = (char) (((cArr7[i11] * 32718) + c11) / 65535);
                    cArr7[i11] = c12;
                    int i12 = AFf1uSDK.values;
                    cArr9[i12] = (char) ((((c12 ^ cArr4[i12]) ^ AFInAppEventType) ^ AFKeystoreWrapper) ^ values);
                    AFf1uSDK.values = i12 + 1;
                } else {
                    str4 = new String(cArr9);
                }
            }
        }
        return str4;
    }
}
