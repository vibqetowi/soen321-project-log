package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.bl;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ak {
    private static char AppsFlyer2dXConversionCallback = 44563;
    private static char init = 63252;
    private static char onAppOpenAttributionNative = 15493;
    private static int onDeepLinkingNative = 0;
    private static int onInstallConversionDataLoadedNative = 1;
    private static char onInstallConversionFailureNative = 10154;
    private static ak values;
    private Map<String, Object> valueOf;
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFKeystoreWrapper = true;
    private String getLevel = "-1";
    private boolean AFLogger$LogLevel = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFInAppEventParameterName = 0;
    private boolean AFVersionDeclaration = false;

    private ak() {
    }

    @Deprecated
    public static ak AFInAppEventType() {
        int i = onInstallConversionDataLoadedNative + 19;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
        if (values == null) {
            values = new ak();
        }
        ak akVar = values;
        int i3 = onDeepLinkingNative + 13;
        onInstallConversionDataLoadedNative = i3 % 128;
        if (i3 % 2 != 0) {
            return akVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void values(String str) {
        int i = onInstallConversionDataLoadedNative;
        int i2 = i + 97;
        onDeepLinkingNative = i2 % 128;
        int i3 = i2 % 2;
        this.getLevel = str;
        int i4 = i + 35;
        onDeepLinkingNative = i4 % 128;
        if (!(i4 % 2 == 0)) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFKeystoreWrapper() {
        this.AFVersionDeclaration = true;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i = onInstallConversionDataLoadedNative + 27;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void AFInAppEventParameterName() {
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFVersionDeclaration = false;
        this.AFKeystoreWrapper = false;
        int i = onDeepLinkingNative + 43;
        onInstallConversionDataLoadedNative = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 2 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void values() {
        int i = onDeepLinkingNative + 23;
        onInstallConversionDataLoadedNative = i % 128;
        if (!(i % 2 == 0)) {
            this.valueOf = null;
            values = null;
        } else {
            this.valueOf = null;
            values = null;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType(String str, PackageManager packageManager) {
        int i = onDeepLinkingNative + 117;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        try {
            AFInAppEventParameterName(str, packageManager);
            bl<String> AFKeystoreWrapper = ac.AFInAppEventParameterName().values().valueOf().AFKeystoreWrapper(AFLogger$LogLevel());
            if (!AFKeystoreWrapper.valueOf.getAndSet(true)) {
                AFKeystoreWrapper.AFKeystoreWrapper.submit(new bl.AnonymousClass3(null));
                int i3 = onInstallConversionDataLoadedNative + 125;
                onDeepLinkingNative = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            throw new IllegalStateException("Http call is already executed");
        } catch (Throwable th) {
            AFLogger.values(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if ((!r4.AFVersionDeclaration) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean AppsFlyer2dXConversionCallback() {
        int i = onInstallConversionDataLoadedNative + 61;
        int i2 = i % 128;
        onDeepLinkingNative = i2;
        if ((i % 2 != 0 ? (char) 16 : (char) 14) != 14) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if ((this.AFLogger$LogLevel ? '\\' : 'S') == '\\') {
            if (!this.AFKeystoreWrapper) {
                int i3 = i2 + 85;
                onInstallConversionDataLoadedNative = i3 % 128;
                int i4 = i3 % 2;
            }
            return true;
        }
        int i5 = onInstallConversionDataLoadedNative + 43;
        onDeepLinkingNative = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3) {
        try {
            this.valueOf.put(AFInAppEventParameterName("쉝鏭碻壨\uf0c3﮻", 5 - View.combineMeasuredStates(0, 0)).intern(), Build.BRAND);
            this.valueOf.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            this.valueOf.put("platform", "Android");
            this.valueOf.put("platform_version", Build.VERSION.RELEASE);
            if ((str != null) && str.length() > 0) {
                this.valueOf.put("advertiserId", str);
            }
            if ((str2 != null ? ')' : '@') == ')') {
                int i = onDeepLinkingNative + 115;
                onInstallConversionDataLoadedNative = i % 128;
                int i2 = i % 2;
                if ((str2.length() > 0 ? 'F' : '7') == 'F') {
                    this.valueOf.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i3 = onInstallConversionDataLoadedNative + 17;
                onDeepLinkingNative = i3 % 128;
                int i4 = i3 % 2;
                this.valueOf.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        try {
            this.valueOf.put("sdk_version", str);
            if ((str2 != null ? '5' : '7') != '7') {
                if (str2.length() > 0) {
                    this.valueOf.put("devkey", str2);
                }
            }
            if (str3 != null) {
                try {
                    int i = onInstallConversionDataLoadedNative + 17;
                    onDeepLinkingNative = i % 128;
                    if (i % 2 != 0) {
                        str3.length();
                        throw null;
                    }
                    if ((str3.length() > 0 ? '+' : 'S') != 'S') {
                        int i2 = onInstallConversionDataLoadedNative + 97;
                        onDeepLinkingNative = i2 % 128;
                        if (!(i2 % 2 != 0)) {
                            this.valueOf.put("originalAppsFlyerId", str3);
                        } else {
                            this.valueOf.put("originalAppsFlyerId", str3);
                            int i3 = 56 / 0;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if ((str4 != null ? (char) 16 : '\\') == 16 && str4.length() > 0) {
                int i4 = onInstallConversionDataLoadedNative + 75;
                onDeepLinkingNative = i4 % 128;
                if (i4 % 2 != 0) {
                    this.valueOf.put("uid", str4);
                    int i5 = 63 / 0;
                } else {
                    this.valueOf.put("uid", str4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        int i = onDeepLinkingNative + 55;
        onInstallConversionDataLoadedNative = i % 128;
        try {
            if (i % 2 != 0) {
                if ((str != null ? (char) 16 : 'C') == 16 && str.length() > 0) {
                    int i2 = onInstallConversionDataLoadedNative + 85;
                    onDeepLinkingNative = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.valueOf.put("app_id", str);
                        throw null;
                    }
                    this.valueOf.put("app_id", str);
                }
                if ((str2 != null ? (char) 7 : AbstractJsonLexerKt.BEGIN_LIST) == 7) {
                    if (str2.length() > 0) {
                        int i3 = onDeepLinkingNative + 69;
                        onInstallConversionDataLoadedNative = i3 % 128;
                        int i4 = i3 % 2;
                        this.valueOf.put("app_version", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.valueOf.put(AppsFlyerProperties.CHANNEL, str3);
                }
                if ((str4 != null ? 'G' : 'A') == 'G') {
                    if (str4.length() > 0) {
                        int i5 = onDeepLinkingNative + 113;
                        onInstallConversionDataLoadedNative = i5 % 128;
                        int i6 = i5 % 2;
                        this.valueOf.put("preInstall", str4);
                    }
                }
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(String str, String... strArr) {
        int i = onInstallConversionDataLoadedNative + 77;
        onDeepLinkingNative = i % 128;
        char c = i % 2 != 0 ? 'b' : '%';
        AFInAppEventParameterName("public_api_call", str, strArr);
        if (c != '%') {
            throw null;
        }
        int i2 = onInstallConversionDataLoadedNative + 89;
        onDeepLinkingNative = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void valueOf(Throwable th) {
        StackTraceElement[] stackTrace;
        int i = onDeepLinkingNative + 117;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = (cause == null ? ClassUtils.PACKAGE_SEPARATOR_CHAR : '?') != '?' ? th.getMessage() : cause.getMessage();
        if (!(cause != null)) {
            int i3 = onDeepLinkingNative + 87;
            onInstallConversionDataLoadedNative = i3 % 128;
            int i4 = i3 % 2;
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            int i5 = onDeepLinkingNative + 51;
            onInstallConversionDataLoadedNative = i5 % 128;
            int i6 = i5 % 2;
        }
        AFInAppEventParameterName("exception", simpleName, values(message, stackTrace));
    }

    public final void AFInAppEventType(String str, String str2) {
        int i = onDeepLinkingNative + 105;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName("server_request", str, str2);
        int i3 = onDeepLinkingNative + 43;
        onInstallConversionDataLoadedNative = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 18 : 'Y') == 'Y') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final void values(String str, int i, String str2) {
        int i2 = onInstallConversionDataLoadedNative + 59;
        onDeepLinkingNative = i2 % 128;
        if (i2 % 2 == 0) {
            AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
            return;
        }
        String[] strArr = new String[3];
        strArr[1] = String.valueOf(i);
        strArr[1] = str2;
        AFInAppEventParameterName("server_response", str, strArr);
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        int i = onDeepLinkingNative + 123;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName((String) null, str, str2);
        int i3 = onInstallConversionDataLoadedNative + 23;
        onDeepLinkingNative = i3 % 128;
        int i4 = i3 % 2;
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        int i = onDeepLinkingNative + 85;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        if ((AppsFlyer2dXConversionCallback() ? 'R' : '\r') == '\r' || this.AFInAppEventParameterName >= 98304) {
            int i3 = onInstallConversionDataLoadedNative + 103;
            onDeepLinkingNative = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String join = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(currentTimeMillis);
                sb.append(" ");
                sb.append(Thread.currentThread().getId());
                sb.append(" _/AppsFlyer_6.5.4 [");
                sb.append(str);
                sb.append("] ");
                sb.append(str2);
                sb.append(" ");
                sb.append(join);
                obj = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currentTimeMillis);
                sb2.append(" ");
                sb2.append(Thread.currentThread().getId());
                sb2.append(" ");
                sb2.append(str2);
                sb2.append("/AppsFlyer_6.5.4 ");
                sb2.append(join);
                obj = sb2.toString();
            }
            this.AFInAppEventType.add(obj);
            this.AFInAppEventParameterName += obj.length() << 1;
            int i5 = onInstallConversionDataLoadedNative + 31;
            onDeepLinkingNative = i5 % 128;
            if ((i5 % 2 != 0 ? (char) 17 : 'Y') != 'Y') {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized Map<String, Object> AFLogger$LogLevel() {
        Map<String, Object> map;
        int i = onDeepLinkingNative + 47;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        this.valueOf.put("data", this.AFInAppEventType);
        init();
        map = this.valueOf;
        int i3 = onDeepLinkingNative + 115;
        onInstallConversionDataLoadedNative = i3 % 128;
        if ((i3 % 2 == 0 ? 'Z' : '0') != '0') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r4 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void AFInAppEventParameterName(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties;
        String str2;
        String string;
        int i = onInstallConversionDataLoadedNative + 67;
        onDeepLinkingNative = i % 128;
        if (!(i % 2 != 0)) {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            str2 = "remote_debug_static_data";
            string = appsFlyerProperties.getString("remote_debug_static_data");
            if (string != null) {
                try {
                    this.valueOf = n.valueOf(new JSONObject(string));
                } catch (Throwable unused) {
                }
            }
            this.valueOf = new HashMap();
            ac AFInAppEventParameterName = ac.AFInAppEventParameterName();
            AFInAppEventParameterName(appsFlyerProperties.getString("advertiserId"), AFInAppEventParameterName.AppsFlyer2dXConversionCallback, AFInAppEventParameterName.init);
            StringBuilder sb = new StringBuilder("6.5.4.");
            sb.append(ac.valueOf);
            AFInAppEventType(sb.toString(), appsFlyerProperties.getDevKey(), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                valueOf(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set(str2, new JSONObject((Map<?, ?>) this.valueOf).toString());
            int i2 = onDeepLinkingNative + 97;
            onInstallConversionDataLoadedNative = i2 % 128;
            if (i2 % 2 == 0) {
            }
            this.valueOf.put("launch_counter", this.getLevel);
        } else {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            str2 = "remote_debug_static_data";
            string = appsFlyerProperties.getString("remote_debug_static_data");
            int i3 = 94 / 0;
        }
    }

    private static String[] values(String str, StackTraceElement[] stackTraceElementArr) {
        int i = onDeepLinkingNative + 123;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
        if ((stackTraceElementArr == null ? (char) 29 : '1') == 29) {
            return new String[]{str};
        }
        int i3 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (true) {
            if ((i3 < stackTraceElementArr.length ? '\t' : '<') == '<') {
                break;
            }
            strArr[i3] = stackTraceElementArr[i3].toString();
            i3++;
        }
        int i4 = onInstallConversionDataLoadedNative + 31;
        onDeepLinkingNative = i4 % 128;
        if ((i4 % 2 != 0 ? '/' : '=') != '=') {
            int i5 = 40 / 0;
        }
        return strArr;
    }

    private synchronized void init() {
        this.AFInAppEventType = new ArrayList();
        this.AFInAppEventParameterName = 0;
        int i = onDeepLinkingNative + 73;
        onInstallConversionDataLoadedNative = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void valueOf() {
        int i = onInstallConversionDataLoadedNative + 91;
        onDeepLinkingNative = i % 128;
        if ((i % 2 != 0 ? '(' : (char) 20) != 20) {
            this.AFKeystoreWrapper = false;
        } else {
            this.AFKeystoreWrapper = false;
        }
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getLevel() {
        int i = onDeepLinkingNative;
        int i2 = i + 29;
        onInstallConversionDataLoadedNative = i2 % 128;
        this.AFLogger$LogLevel = (i2 % 2 == 0 ? 'O' : 'W') != 'W';
        int i3 = i + 45;
        onInstallConversionDataLoadedNative = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean AFVersionDeclaration() {
        int i = onDeepLinkingNative + 21;
        int i2 = i % 128;
        onInstallConversionDataLoadedNative = i2;
        int i3 = i % 2;
        boolean z = this.AFVersionDeclaration;
        int i4 = i2 + 49;
        onDeepLinkingNative = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 3 : '7') == '7') {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r13 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventParameterName(String str, int i) {
        char[] cArr;
        String str2;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (dt.valueOf) {
            char[] cArr3 = new char[cArr2.length];
            dt.AFInAppEventType = 0;
            char[] cArr4 = new char[2];
            while (dt.AFInAppEventType < cArr2.length) {
                cArr4[0] = cArr2[dt.AFInAppEventType];
                cArr4[1] = cArr2[dt.AFInAppEventType + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + onInstallConversionFailureNative)) ^ ((c2 >>> 5) + onAppOpenAttributionNative)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + AppsFlyer2dXConversionCallback) ^ ((c3 + i2) ^ ((c3 << 4) + init))));
                    i2 -= 40503;
                }
                cArr3[dt.AFInAppEventType] = cArr4[0];
                cArr3[dt.AFInAppEventType + 1] = cArr4[1];
                dt.AFInAppEventType += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
