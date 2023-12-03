package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class AFa1dSDK {
    public String AFInAppEventParameterName;
    public AFc1kSDK AFInAppEventType;
    String AFKeystoreWrapper;
    private byte[] valueOf;
    public String values;

    public AFa1dSDK() {
    }

    public AFa1dSDK(String str, byte[] bArr, String str2, AFc1kSDK aFc1kSDK) {
        this.values = str;
        this.valueOf = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = aFc1kSDK;
    }

    public static Map<String, String> AFKeystoreWrapper(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th2);
        }
        return hashMap;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFa1dSDK.class == obj.getClass()) {
            AFa1dSDK aFa1dSDK = (AFa1dSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFa1dSDK.AFKeystoreWrapper != null : !str.equals(aFa1dSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.valueOf, aFa1dSDK.valueOf)) {
                return false;
            }
            String str2 = this.values;
            if (str2 == null ? aFa1dSDK.values != null : !str2.equals(aFa1dSDK.values)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? aFa1dSDK.AFInAppEventParameterName != null : !str3.equals(aFa1dSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (this.AFInAppEventType == aFa1dSDK.AFInAppEventType) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        String str = this.AFKeystoreWrapper;
        int i12 = 0;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode = (Arrays.hashCode(this.valueOf) + (i6 * 31)) * 31;
        String str2 = this.values;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        String str3 = this.AFInAppEventParameterName;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        AFc1kSDK aFc1kSDK = this.AFInAppEventType;
        if (aFc1kSDK != null) {
            i12 = aFc1kSDK.hashCode();
        }
        return i14 + i12;
    }

    public AFa1dSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i6 = 0;
        int i10 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.values = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i6 = Integer.parseInt(matcher.group(1));
                    i10 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.valueOf = (i6 > 4 || i10 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.AFInAppEventType = AFc1kSDK.valueOf(trim2);
                } catch (Exception e10) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e10);
                }
            }
        }
        scanner.close();
    }
}
