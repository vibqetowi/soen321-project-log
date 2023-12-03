package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.appsflyer.internal.AFc1mSDK;
import com.theinnerhour.b2b.utils.SessionManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1qSDK {
    private static int afDebugLog = 0;
    private static long afInfoLog = 1917046310396013320L;
    private static int getLevel = 1;
    private static AFb1qSDK valueOf;
    private List<String> AFInAppEventParameterName = new ArrayList();
    private boolean values = true;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private String AFLogger = "-1";
    private boolean afErrorLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFKeystoreWrapper = 0;
    private boolean afRDLog = false;

    private AFb1qSDK() {
    }

    @Deprecated
    public static AFb1qSDK AFInAppEventParameterName() {
        int i6 = getLevel + 87;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        if (valueOf == null) {
            valueOf = new AFb1qSDK();
            int i11 = afDebugLog + 33;
            getLevel = i11 % 128;
            int i12 = i11 % 2;
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if ((r7.length() > 0) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        try {
            this.AFInAppEventType.put(valueOf("㼾\u05feꑁ㽜㦘꺄\uf230㣮鍺", Color.alpha(0)).intern(), Build.BRAND);
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    int i6 = afDebugLog + 99;
                    getLevel = i6 % 128;
                    if ((i6 % 2 == 0 ? (char) 2 : (char) 26) != 2) {
                        if (str.length() > 0) {
                            int i10 = afDebugLog + 77;
                            getLevel = i10 % 128;
                            int i11 = i10 % 2;
                            this.AFInAppEventType.put("advertiserId", str);
                        }
                    } else {
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str2 != null) {
                if ((str2.length() > 0 ? 'W' : (char) 23) == 'W') {
                    this.AFInAppEventType.put("imei", str2);
                    int i12 = afDebugLog + 9;
                    getLevel = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            if (str3 != null) {
                int i14 = getLevel + 81;
                afDebugLog = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 50 / 0;
                    if (str3.length() > 0) {
                        this.AFInAppEventType.put("android_id", str3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFLogger() {
        char c10;
        this.AFInAppEventParameterName = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i6 = afDebugLog + 69;
        getLevel = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = '\r';
        } else {
            c10 = '8';
        }
        if (c10 != '8') {
            throw null;
        }
    }

    private synchronized Map<String, Object> afDebugLog() {
        char c10;
        Map<String, Object> map;
        int i6 = afDebugLog + 65;
        getLevel = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = 31;
        } else {
            c10 = 'J';
        }
        if (c10 != 'J') {
            this.AFInAppEventType.put("data", this.AFInAppEventParameterName);
            AFLogger();
            map = this.AFInAppEventType;
            int i10 = 44 / 0;
        } else {
            this.AFInAppEventType.put("data", this.AFInAppEventParameterName);
            AFLogger();
            map = this.AFInAppEventType;
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        if (r5.values == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r5.afRDLog == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0 = 'A';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        r0 = '2';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        if (r0 == 'A') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        r2 = r2 + 15;
        com.appsflyer.internal.AFb1qSDK.getLevel = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean afRDLog() {
        boolean z10;
        if (this.afErrorLog) {
            int i6 = getLevel + 11;
            int i10 = i6 % 128;
            afDebugLog = i10;
            if (i6 % 2 != 0) {
                int i11 = 28 / 0;
                if (!this.values) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
        }
        return false;
    }

    public final synchronized void AFKeystoreWrapper(String str) {
        int i6 = getLevel;
        int i10 = i6 + R.styleable.AppCompatTheme_textAppearanceListItem;
        afDebugLog = i10 % 128;
        if ((i10 % 2 != 0 ? 'O' : (char) 30) != 'O') {
            this.AFLogger = str;
        } else {
            this.AFLogger = str;
            int i11 = 32 / 0;
        }
        int i12 = i6 + 77;
        afDebugLog = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final boolean afErrorLog() {
        boolean z10;
        int i6 = afDebugLog + 65;
        int i10 = i6 % 128;
        getLevel = i10;
        if (i6 % 2 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            boolean z11 = this.afRDLog;
            int i11 = i10 + R.styleable.AppCompatTheme_textAppearanceListItem;
            afDebugLog = i11 % 128;
            int i12 = i11 % 2;
            return z11;
        }
        throw null;
    }

    public final void afInfoLog() {
        boolean z10;
        int i6 = afDebugLog + 59;
        getLevel = i6 % 128;
        if (i6 % 2 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.afErrorLog = false;
        } else {
            this.afErrorLog = true;
        }
    }

    public final synchronized void valueOf() {
        int i6 = getLevel + 11;
        afDebugLog = i6 % 128;
        if (i6 % 2 == 0) {
            this.AFInAppEventType.clear();
            valueOf = null;
        } else {
            this.AFInAppEventType.clear();
            valueOf = null;
            int i10 = 17 / 0;
        }
    }

    public final synchronized void values() {
        this.afRDLog = true;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i6 = afDebugLog + 33;
        getLevel = i6 % 128;
        if ((i6 % 2 == 0 ? (char) 27 : '\"') != 27) {
            return;
        }
        int i10 = 45 / 0;
    }

    public final synchronized void AFKeystoreWrapper() {
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.afRDLog = false;
        this.values = false;
        int i6 = getLevel + 7;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        int i6 = getLevel + R.styleable.AppCompatTheme_textColorSearchUrl;
        int i10 = i6 % 128;
        afDebugLog = i10;
        int i11 = i6 % 2;
        try {
            if (str != null) {
                int i12 = i10 + 53;
                getLevel = i12 % 128;
                if ((i12 % 2 == 0 ? '4' : 'E') != '4') {
                    if (str.length() > 0) {
                        this.AFInAppEventType.put("app_id", str);
                    }
                } else {
                    throw null;
                }
            }
            if (str2 != null) {
                int i13 = afDebugLog + R.styleable.AppCompatTheme_windowActionModeOverlay;
                getLevel = i13 % 128;
                if (i13 % 2 != 0) {
                    if (str2.length() > 0) {
                        this.AFInAppEventType.put("app_version", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (!(str3 == null)) {
                if (str3.length() > 0) {
                    int i14 = getLevel + R.styleable.AppCompatTheme_textAppearanceListItem;
                    afDebugLog = i14 % 128;
                    int i15 = i14 % 2;
                    this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, str3);
                }
            }
            if (str4 != null) {
                int i16 = getLevel + 39;
                afDebugLog = i16 % 128;
                int i17 = i16 % 2;
                if ((str4.length() > 0 ? 'B' : (char) 14) == 'B') {
                    this.AFInAppEventType.put("preInstall", str4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        int i6 = afDebugLog + 49;
        getLevel = i6 % 128;
        int i10 = i6 % 2;
        AFInAppEventParameterName(null, str, str2);
        int i11 = afDebugLog + 77;
        getLevel = i11 % 128;
        if ((i11 % 2 == 0 ? '4' : 'K') != '4') {
            return;
        }
        throw null;
    }

    public final void AFKeystoreWrapper(String str, int i6, String str2) {
        int i10 = getLevel + 73;
        afDebugLog = i10 % 128;
        if ((i10 % 2 != 0 ? 'R' : ' ') != 'R') {
            AFInAppEventParameterName("server_response", str, String.valueOf(i6), str2);
        } else {
            String[] strArr = new String[5];
            strArr[0] = String.valueOf(i6);
            strArr[1] = str2;
            AFInAppEventParameterName("server_response", str, strArr);
        }
        int i11 = afDebugLog + 13;
        getLevel = i11 % 128;
        int i12 = i11 % 2;
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String obj;
        int i6 = afDebugLog + 7;
        getLevel = i6 % 128;
        if (!(i6 % 2 == 0)) {
            if ((afRDLog()) && this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.9.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.9.1 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    this.AFInAppEventParameterName.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    int i10 = getLevel + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    afDebugLog = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        afRDLog();
        throw null;
    }

    public final void valueOf(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        try {
            AFInAppEventType(str, packageManager, aFc1zSDK.AFVersionDeclaration());
            AFd1pSDK aFd1pSDK = new AFd1pSDK(afDebugLog(), aFc1zSDK);
            AFc1mSDK afErrorLog = aFc1zSDK.afErrorLog();
            afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1pSDK));
            int i6 = afDebugLog + 59;
            getLevel = i6 % 128;
            if ((i6 % 2 == 0 ? 'Z' : (char) 2) == 2) {
                return;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2);
        }
    }

    public final void valueOf(String str, String str2) {
        int i6 = afDebugLog + 69;
        getLevel = i6 % 128;
        if ((i6 % 2 == 0 ? '5' : (char) 0) != '5') {
            AFInAppEventParameterName("server_request", str, str2);
        } else {
            String[] strArr = new String[1];
            strArr[1] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        }
        int i10 = afDebugLog + 65;
        getLevel = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(String str, int i6) {
        char[] cArr;
        String str2;
        int i10;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1sSDK.AFInAppEventParameterName) {
            char[] AFKeystoreWrapper = AFf1sSDK.AFKeystoreWrapper(afInfoLog, cArr2, i6);
            AFf1sSDK.values = 4;
            while (true) {
                int i11 = AFf1sSDK.values;
                if (i11 < AFKeystoreWrapper.length) {
                    AFf1sSDK.AFInAppEventType = i11 - 4;
                    AFKeystoreWrapper[AFf1sSDK.values] = (char) ((AFKeystoreWrapper[i10] ^ AFKeystoreWrapper[i10 % 4]) ^ (AFf1sSDK.AFInAppEventType * afInfoLog));
                    AFf1sSDK.values++;
                } else {
                    str2 = new String(AFKeystoreWrapper, 4, AFKeystoreWrapper.length - 4);
                }
            }
        }
        return str2;
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        int i6 = getLevel + 45;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        try {
            this.AFInAppEventType.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventType.put("devkey", str2);
                int i11 = getLevel + 79;
                afDebugLog = i11 % 128;
                int i12 = i11 % 2;
            }
            if (str3 != null) {
                if (str3.length() > 0) {
                    this.AFInAppEventType.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null) {
                int i13 = afDebugLog + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                getLevel = i13 % 128;
                if (i13 % 2 != 0) {
                    if ((str4.length() > 0 ? '^' : (char) 18) != 18) {
                        this.AFInAppEventType.put(SessionManager.KEY_UID, str4);
                    }
                } else {
                    str4.length();
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void values(Throwable th2) {
        StackTraceElement[] stackTrace;
        int i6 = getLevel + 29;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        String message = !(cause == null) ? cause.getMessage() : th2.getMessage();
        if ((cause == null ? (char) 15 : (char) 3) != 3) {
            int i11 = getLevel + 81;
            afDebugLog = i11 % 128;
            int i12 = i11 % 2;
            stackTrace = th2.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
        }
        AFInAppEventParameterName("exception", simpleName, AFInAppEventType(message, stackTrace));
        int i13 = getLevel + 33;
        afDebugLog = i13 % 128;
        int i14 = i13 % 2;
    }

    public final void AFInAppEventType(String str, String... strArr) {
        int i6 = afDebugLog + 57;
        getLevel = i6 % 128;
        boolean z10 = i6 % 2 != 0;
        AFInAppEventParameterName("public_api_call", str, strArr);
        if (!z10) {
            int i10 = 82 / 0;
        }
        int i11 = getLevel + 51;
        afDebugLog = i11 % 128;
        int i12 = i11 % 2;
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager, AFd1gSDK aFd1gSDK) {
        int i6 = afDebugLog + 95;
        getLevel = i6 % 128;
        if ((i6 % 2 == 0 ? (char) 21 : '-') == '-') {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.AFInAppEventType.clear();
            if (string != null) {
                try {
                    this.AFInAppEventType.putAll(AFa1pSDK.AFInAppEventType(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                AFb1xSDK AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper();
                AFInAppEventType(appsFlyerProperties.getString("advertiserId"), aFd1gSDK.AFInAppEventType, AFKeystoreWrapper.afRDLog);
                StringBuilder sb2 = new StringBuilder("6.9.1.");
                sb2.append(AFb1xSDK.AFKeystoreWrapper);
                AFInAppEventType(sb2.toString(), AFKeystoreWrapper.values().AFVersionDeclaration().values, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString(SessionManager.KEY_UID));
                try {
                    values(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFInAppEventType).toString());
                int i10 = getLevel + R.styleable.AppCompatTheme_tooltipFrameBackground;
                afDebugLog = i10 % 128;
                if (i10 % 2 != 0) {
                }
            }
            this.AFInAppEventType.put("launch_counter", this.AFLogger);
        } else {
            AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
            this.AFInAppEventType.clear();
            throw null;
        }
    }

    private static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        int i6 = 1;
        while (true) {
            if (!(i6 < stackTraceElementArr.length)) {
                int i10 = afDebugLog + 41;
                getLevel = i10 % 128;
                int i11 = i10 % 2;
                return strArr;
            }
            int i12 = afDebugLog + 79;
            getLevel = i12 % 128;
            if (i12 % 2 != 0) {
                strArr[i6] = stackTraceElementArr[i6].toString();
                i6++;
            } else {
                strArr[i6] = stackTraceElementArr[i6].toString();
                i6 += 21;
            }
        }
    }

    public final synchronized void AFInAppEventType() {
        int i6 = afDebugLog + 51;
        getLevel = i6 % 128;
        if (i6 % 2 == 0) {
            this.values = true;
        } else {
            this.values = false;
        }
        AFLogger();
    }
}
